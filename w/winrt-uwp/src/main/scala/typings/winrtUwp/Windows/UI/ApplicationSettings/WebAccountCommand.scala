package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Associates a command with a WebAccount in the account settings pane.. */
@js.native
trait WebAccountCommand extends js.Object {
  
  /** Gets the actions that the command performs on the web account in the accounts pane. */
  var actions: SupportedWebAccountActions = js.native
  
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
  def invoked(command: WebAccountCommand, args: WebAccountInvokedArgs): Unit = js.native
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
  @JSName("invoked")
  var invoked_Original: WebAccountCommandInvokedHandler = js.native
  
  /** Gets the web account that's associated with the current command. */
  var webAccount: WebAccount = js.native
}
