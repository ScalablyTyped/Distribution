package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValuesError extends js.Object {
  /**
    * The error message.
    */
  var message: java.lang.String
}

object InputValuesError {
  @scala.inline
  def apply(message: java.lang.String): InputValuesError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[InputValuesError]
  }
}

