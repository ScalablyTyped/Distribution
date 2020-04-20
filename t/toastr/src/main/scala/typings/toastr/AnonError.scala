package typings.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  /**
  		 * Icon to use on error toasts.
  		 * @default toast-error
  		 */
  var error: String
  /**
  		 * Icon to use on info toasts.
  		 * @default toast-info
  		 */
  var info: String
  /**
  		 * Icon to use on success toasts.
  		 * @default toast-success
  		 */
  var success: String
  /**
  		 * Icon to use on warning toasts.
  		 * @default toast-warning
  		 */
  var warning: String
}

object AnonError {
  @scala.inline
  def apply(error: String, info: String, success: String, warning: String): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

