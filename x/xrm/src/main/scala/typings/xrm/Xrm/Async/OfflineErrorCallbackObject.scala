package typings.xrm.Xrm.Async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object passed to OfflineErrorCallbackDelegate.
  */
@js.native
trait OfflineErrorCallbackObject extends ErrorCallbackObject {
  
  /**
    * An internal error message that might contain additional details about the issue.
    */
  var debugMessage: String = js.native
}
object OfflineErrorCallbackObject {
  
  @scala.inline
  def apply(debugMessage: String, errorCode: Double, message: String): OfflineErrorCallbackObject = {
    val __obj = js.Dynamic.literal(debugMessage = debugMessage.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineErrorCallbackObject]
  }
  
  @scala.inline
  implicit class OfflineErrorCallbackObjectOps[Self <: OfflineErrorCallbackObject] (val x: Self) extends AnyVal {
    
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
    def setDebugMessage(value: String): Self = this.set("debugMessage", value.asInstanceOf[js.Any])
  }
}
