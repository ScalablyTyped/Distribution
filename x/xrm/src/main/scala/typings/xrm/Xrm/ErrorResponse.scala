package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Promise error response arguments
  */
trait ErrorResponse extends js.Object {
  var errorCode: Double
  var message: String
}

object ErrorResponse {
  @scala.inline
  def apply(errorCode: Double, message: String): ErrorResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, message = message)
  
    __obj.asInstanceOf[ErrorResponse]
  }
}

