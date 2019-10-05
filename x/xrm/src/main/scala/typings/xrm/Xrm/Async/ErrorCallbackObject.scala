package typings.xrm.Xrm.Async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to ErrorCallbackDelegate.
  */
trait ErrorCallbackObject extends js.Object {
  /**
    * The error code.
    */
  var errorCode: Double
  /**
    * An error message describing the issue.
    */
  var message: String
}

object ErrorCallbackObject {
  @scala.inline
  def apply(errorCode: Double, message: String): ErrorCallbackObject = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, message = message)
  
    __obj.asInstanceOf[ErrorCallbackObject]
  }
}

