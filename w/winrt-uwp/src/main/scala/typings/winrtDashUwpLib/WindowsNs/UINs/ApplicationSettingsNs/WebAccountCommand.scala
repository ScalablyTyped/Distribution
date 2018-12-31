package typings
package winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Associates a command with a WebAccount in the account settings pane.. */
@JSGlobal("Windows.UI.ApplicationSettings.WebAccountCommand")
@js.native
class WebAccountCommand protected () extends js.Object {
  /**
    * Initializes a new instance of the WebAccountCommand class.
    * @param webAccount The web account to associate with the current command.
    * @param invoked The delegate that handles the command.
    * @param actions A bitmask of web account actions.
    */
  def this(webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount, invoked: WebAccountCommandInvokedHandler, actions: SupportedWebAccountActions) = this()
  /** Gets the actions that the command performs on the web account in the accounts pane. */
  var actions: SupportedWebAccountActions = js.native
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
  @JSName("invoked")
  var invoked_Original: WebAccountCommandInvokedHandler = js.native
  /** Gets the web account that's associated with the current command. */
  var webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount = js.native
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
  def invoked(command: WebAccountCommand, args: WebAccountInvokedArgs): scala.Unit = js.native
}

