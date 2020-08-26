package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.IMErrorType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched in case of instant messaging subsystem error
  */
@js.native
trait SystemError extends VoxImplantIMEvent {
  /**
    *    Error data object, contains the error details
    */
  var errorData: js.Object = js.native
  /**
    *    Error type
    */
  var errorType: IMErrorType = js.native
}

object SystemError {
  @scala.inline
  def apply(errorData: js.Object, errorType: IMErrorType): SystemError = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemError]
  }
  @scala.inline
  implicit class SystemErrorOps[Self <: SystemError] (val x: Self) extends AnyVal {
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
    def setErrorData(value: js.Object): Self = this.set("errorData", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorType(value: IMErrorType): Self = this.set("errorType", value.asInstanceOf[js.Any])
  }
  
}

