package typings.stylableCore.customValuesMod

import typings.stylableCore.anon.Delimiter
import typings.stylableCore.typesMod.ParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionApi[Value, Args] extends js.Object {
  
  def createValue(args: Args): Value = js.native
  
  var flattenValue: js.UndefOr[js.Function1[/* v */ Box_[String, Value], Delimiter]] = js.native
  
  def getValue(v: Value, key: String): String | (Box_[String, _]) = js.native
  
  def processArgs(fnNode: ParsedValue, customTypes: CustomTypes): Args = js.native
}
object ExtensionApi {
  
  @scala.inline
  def apply[Value, Args](
    createValue: Args => Value,
    getValue: (Value, String) => String | (Box_[String, _]),
    processArgs: (ParsedValue, CustomTypes) => Args
  ): ExtensionApi[Value, Args] = {
    val __obj = js.Dynamic.literal(createValue = js.Any.fromFunction1(createValue), getValue = js.Any.fromFunction2(getValue), processArgs = js.Any.fromFunction2(processArgs))
    __obj.asInstanceOf[ExtensionApi[Value, Args]]
  }
  
  @scala.inline
  implicit class ExtensionApiOps[Self <: ExtensionApi[_, _], Value, Args] (val x: Self with (ExtensionApi[Value, Args])) extends AnyVal {
    
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
    def setCreateValue(value: Args => Value): Self = this.set("createValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: (Value, String) => String | (Box_[String, _])): Self = this.set("getValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessArgs(value: (ParsedValue, CustomTypes) => Args): Self = this.set("processArgs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFlattenValue(value: /* v */ Box_[String, Value] => Delimiter): Self = this.set("flattenValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFlattenValue: Self = this.set("flattenValue", js.undefined)
  }
}
