package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Deprecated. Represents a command for changing web account credentials in the account settings pane. */
@js.native
trait CredentialCommand extends js.Object {
  /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
  @JSName("credentialDeleted")
  var credentialDeleted_Original: CredentialCommandCredentialDeletedHandler = js.native
  /** Gets the password credential that the current command applies to. */
  var passwordCredential: PasswordCredential = js.native
  /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
  def credentialDeleted(command: CredentialCommand): Unit = js.native
}

