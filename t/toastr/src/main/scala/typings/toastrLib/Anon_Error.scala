package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  /**
  		 * Icon to use on error toasts.
  		 * @default toast-error
  		 */
  var error: java.lang.String
  /**
  		 * Icon to use on info toasts.
  		 * @default toast-info
  		 */
  var info: java.lang.String
  /**
  		 * Icon to use on success toasts.
  		 * @default toast-success
  		 */
  var success: java.lang.String
  /**
  		 * Icon to use on warning toasts.
  		 * @default toast-warning
  		 */
  var warning: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(
    error: java.lang.String,
    info: java.lang.String,
    success: java.lang.String,
    warning: java.lang.String
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Error]
  }
}

