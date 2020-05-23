package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app navigation operation. */
trait WebUINavigatedOperation extends js.Object {
  /**
    * Requests that the completion of app navigation be delayed.
    * @return The navigated deferral object.
    */
  def getDeferral(): WebUINavigatedDeferral
}

object WebUINavigatedOperation {
  @scala.inline
  def apply(getDeferral: () => WebUINavigatedDeferral): WebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[WebUINavigatedOperation]
  }
}

