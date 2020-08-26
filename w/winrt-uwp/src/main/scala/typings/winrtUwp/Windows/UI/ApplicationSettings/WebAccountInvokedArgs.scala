package typings.winrtUwp.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the WebAccountCommandInvokedHandler delegate. */
@js.native
trait WebAccountInvokedArgs extends js.Object {
  /** Gets the action for the web account in the accounts pane. */
  var action: WebAccountAction = js.native
}

object WebAccountInvokedArgs {
  @scala.inline
  def apply(action: WebAccountAction): WebAccountInvokedArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountInvokedArgs]
  }
  @scala.inline
  implicit class WebAccountInvokedArgsOps[Self <: WebAccountInvokedArgs] (val x: Self) extends AnyVal {
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
    def setAction(value: WebAccountAction): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

