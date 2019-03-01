package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app navigation event. */
trait IWebUINavigatedEventArgs extends js.Object {
  /** Gets the app navigation operation. */
  var navigatedOperation: WebUINavigatedOperation
}

object IWebUINavigatedEventArgs {
  @scala.inline
  def apply(navigatedOperation: WebUINavigatedOperation): IWebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("navigatedOperation")(navigatedOperation)
    __obj.asInstanceOf[IWebUINavigatedEventArgs]
  }
}

