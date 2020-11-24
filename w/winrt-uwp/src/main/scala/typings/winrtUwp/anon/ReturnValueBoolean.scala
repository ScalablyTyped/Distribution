package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValueBoolean extends js.Object {
  
  /** Returns true if the method succeeded, or false otherwise. */ var returnValue: Boolean = js.native
  
  /** The power line frequency. */ var value: PowerlineFrequency = js.native
}
object ReturnValueBoolean {
  
  @scala.inline
  def apply(returnValue: Boolean, value: PowerlineFrequency): ReturnValueBoolean = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueBoolean]
  }
  
  @scala.inline
  implicit class ReturnValueBooleanOps[Self <: ReturnValueBoolean] (val x: Self) extends AnyVal {
    
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
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: PowerlineFrequency): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
