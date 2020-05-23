package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Associates a provider command with a WebAccountProvider in the account settings pane. */
@js.native
trait WebAccountProviderCommand extends js.Object {
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
  @JSName("invoked")
  var invoked_Original: WebAccountProviderCommandInvokedHandler = js.native
  /** Gets the web account provider that's associated with the current command. */
  var webAccountProvider: WebAccountProvider = js.native
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
  def invoked(command: WebAccountProviderCommand): Unit = js.native
}

