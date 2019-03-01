package typings
package xrmLib.XrmNs.AsyncNs

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
  var errorCode: scala.Double
  /**
    * An error message describing the issue.
    */
  var message: java.lang.String
}

object ErrorCallbackObject {
  @scala.inline
  def apply(errorCode: scala.Double, message: java.lang.String): ErrorCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ErrorCallbackObject]
  }
}

