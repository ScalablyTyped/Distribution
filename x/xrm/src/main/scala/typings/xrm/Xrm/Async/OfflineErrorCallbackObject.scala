package typings.xrm.Xrm.Async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to OfflineErrorCallbackDelegate.
  */
trait OfflineErrorCallbackObject extends ErrorCallbackObject {
  /**
    * An internal error message that might contain additional details about the issue.
    */
  var debugMessage: String
}

object OfflineErrorCallbackObject {
  @scala.inline
  def apply(debugMessage: String, errorCode: Double, message: String): OfflineErrorCallbackObject = {
    val __obj = js.Dynamic.literal(debugMessage = debugMessage.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineErrorCallbackObject]
  }
}

