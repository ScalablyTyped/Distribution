package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Promise error response arguments
  */
trait ErrorResponse extends js.Object {
  var errorCode: scala.Double
  var message: java.lang.String
}

object ErrorResponse {
  @scala.inline
  def apply(errorCode: scala.Double, message: java.lang.String): ErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ErrorResponse]
  }
}

