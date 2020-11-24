package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectWrapper extends js.Object {
  
  var control: String = js.native
  
  var onError: String = js.native
  
  var other: String = js.native
  
  var root: String = js.native
  
  var selectWrapper: String = js.native
  
  var small: String = js.native
}
object SelectWrapper {
  
  @scala.inline
  def apply(
    control: String,
    onError: String,
    other: String,
    root: String,
    selectWrapper: String,
    small: String
  ): SelectWrapper = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectWrapper]
  }
  
  @scala.inline
  implicit class SelectWrapperOps[Self <: SelectWrapper] (val x: Self) extends AnyVal {
    
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
    def setControl(value: String): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(value: String): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectWrapper(value: String): Self = this.set("selectWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: String): Self = this.set("small", value.asInstanceOf[js.Any])
  }
}
