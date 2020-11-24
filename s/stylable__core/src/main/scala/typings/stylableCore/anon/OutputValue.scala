package typings.stylableCore.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputValue extends js.Object {
  
  var outputValue: String = js.native
  
  var topLevelType: js.Any = js.native
  
  var typeError: Error = js.native
}
object OutputValue {
  
  @scala.inline
  def apply(outputValue: String, topLevelType: js.Any, typeError: Error): OutputValue = {
    val __obj = js.Dynamic.literal(outputValue = outputValue.asInstanceOf[js.Any], topLevelType = topLevelType.asInstanceOf[js.Any], typeError = typeError.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValue]
  }
  
  @scala.inline
  implicit class OutputValueOps[Self <: OutputValue] (val x: Self) extends AnyVal {
    
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
    def setOutputValue(value: String): Self = this.set("outputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLevelType(value: js.Any): Self = this.set("topLevelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeError(value: Error): Self = this.set("typeError", value.asInstanceOf[js.Any])
  }
}
