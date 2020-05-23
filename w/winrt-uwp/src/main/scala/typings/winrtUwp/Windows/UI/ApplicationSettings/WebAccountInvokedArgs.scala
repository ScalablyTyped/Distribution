package typings.winrtUwp.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the WebAccountCommandInvokedHandler delegate. */
trait WebAccountInvokedArgs extends js.Object {
  /** Gets the action for the web account in the accounts pane. */
  var action: WebAccountAction
}

object WebAccountInvokedArgs {
  @scala.inline
  def apply(action: WebAccountAction): WebAccountInvokedArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountInvokedArgs]
  }
}

