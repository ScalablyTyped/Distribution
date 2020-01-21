package typings.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValuesError extends js.Object {
  /**
    * The error message.
    */
  var message: String
}

object InputValuesError {
  @scala.inline
  def apply(message: String): InputValuesError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputValuesError]
  }
}

