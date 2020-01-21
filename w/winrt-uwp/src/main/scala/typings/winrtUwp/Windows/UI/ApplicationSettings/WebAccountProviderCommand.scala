package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Associates a provider command with a WebAccountProvider in the account settings pane. */
@JSGlobal("Windows.UI.ApplicationSettings.WebAccountProviderCommand")
@js.native
class WebAccountProviderCommand protected () extends js.Object {
  /**
    * Initializes a new instance of the WebAccountProviderCommand class.
    * @param webAccountProvider The web account provider.
    * @param invoked The delegate that handles the provider command.
    */
  def this(webAccountProvider: WebAccountProvider, invoked: WebAccountProviderCommandInvokedHandler) = this()
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
  @JSName("invoked")
  var invoked_Original: WebAccountProviderCommandInvokedHandler = js.native
  /** Gets the web account provider that's associated with the current command. */
  var webAccountProvider: WebAccountProvider = js.native
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
  def invoked(command: WebAccountProviderCommand): Unit = js.native
}

