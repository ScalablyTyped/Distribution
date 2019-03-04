package typings
package xrmLib.XrmNs.AsyncNs

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
  var debugMessage: java.lang.String
}

object OfflineErrorCallbackObject {
  @scala.inline
  def apply(debugMessage: java.lang.String, errorCode: scala.Double, message: java.lang.String): OfflineErrorCallbackObject = {
    val __obj = js.Dynamic.literal(debugMessage = debugMessage, errorCode = errorCode, message = message)
  
    __obj.asInstanceOf[OfflineErrorCallbackObject]
  }
}

