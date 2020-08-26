package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app navigation operation. */
@js.native
trait WebUINavigatedOperation extends js.Object {
  /**
    * Requests that the completion of app navigation be delayed.
    * @return The navigated deferral object.
    */
  def getDeferral(): WebUINavigatedDeferral = js.native
}

object WebUINavigatedOperation {
  @scala.inline
  def apply(getDeferral: () => WebUINavigatedDeferral): WebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[WebUINavigatedOperation]
  }
  @scala.inline
  implicit class WebUINavigatedOperationOps[Self <: WebUINavigatedOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDeferral(value: () => WebUINavigatedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
  
}

