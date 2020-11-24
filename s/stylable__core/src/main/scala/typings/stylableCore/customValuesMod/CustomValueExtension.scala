package typings.stylableCore.customValuesMod

import org.scalablytyped.runtime.StringDictionary
import typings.stylableCore.typesMod.ParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomValueExtension[T] extends js.Object {
  
  def evalVarAst(valueAst: ParsedValue, customTypes: StringDictionary[CustomValueExtension[_]]): Box_[String, T] = js.native
  
  def getValue(path: js.Array[String], value: Box_[String, T], node: ParsedValue, customTypes: CustomTypes): String = js.native
}
object CustomValueExtension {
  
  @scala.inline
  def apply[T](
    evalVarAst: (ParsedValue, StringDictionary[CustomValueExtension[_]]) => Box_[String, T],
    getValue: (js.Array[String], Box_[String, T], ParsedValue, CustomTypes) => String
  ): CustomValueExtension[T] = {
    val __obj = js.Dynamic.literal(evalVarAst = js.Any.fromFunction2(evalVarAst), getValue = js.Any.fromFunction4(getValue))
    __obj.asInstanceOf[CustomValueExtension[T]]
  }
  
  @scala.inline
  implicit class CustomValueExtensionOps[Self <: CustomValueExtension[_], T] (val x: Self with CustomValueExtension[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvalVarAst(value: (ParsedValue, StringDictionary[CustomValueExtension[_]]) => Box_[String, T]): Self = this.set("evalVarAst", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetValue(value: (js.Array[String], Box_[String, T], ParsedValue, CustomTypes) => String): Self = this.set("getValue", js.Any.fromFunction4(value))
  }
}
