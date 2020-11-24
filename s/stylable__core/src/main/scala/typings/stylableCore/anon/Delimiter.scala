package typings.stylableCore.anon

import typings.stylableCore.customValuesMod.Box_
import typings.stylableCore.stylableCoreStrings.Comma
import typings.stylableCore.stylableCoreStrings.Space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delimiter extends js.Object {
  
  var delimiter: Comma | Space = js.native
  
  var parts: js.Array[String | (Box_[String, _])] = js.native
}
object Delimiter {
  
  @scala.inline
  def apply(delimiter: Comma | Space, parts: js.Array[String | (Box_[String, _])]): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: Comma | Space): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsVarargs(value: (String | (Box_[String, js.Any]))*): Self = this.set("parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: js.Array[String | (Box_[String, _])]): Self = this.set("parts", value.asInstanceOf[js.Any])
  }
}
