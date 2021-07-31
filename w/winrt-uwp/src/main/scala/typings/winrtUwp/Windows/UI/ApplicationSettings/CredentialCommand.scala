package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Deprecated. Represents a command for changing web account credentials in the account settings pane. */
trait CredentialCommand extends StObject {
  
  /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
  def credentialDeleted(command: CredentialCommand): Unit
  /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
  @JSName("credentialDeleted")
  var credentialDeleted_Original: CredentialCommandCredentialDeletedHandler
  
  /** Gets the password credential that the current command applies to. */
  var passwordCredential: PasswordCredential
}
object CredentialCommand {
  
  @scala.inline
  def apply(credentialDeleted: /* command */ CredentialCommand => Unit, passwordCredential: PasswordCredential): CredentialCommand = {
    val __obj = js.Dynamic.literal(credentialDeleted = js.Any.fromFunction1(credentialDeleted), passwordCredential = passwordCredential.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialCommand]
  }
  
  @scala.inline
  implicit class CredentialCommandMutableBuilder[Self <: CredentialCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialDeleted(value: /* command */ CredentialCommand => Unit): Self = StObject.set(x, "credentialDeleted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPasswordCredential(value: PasswordCredential): Self = StObject.set(x, "passwordCredential", value.asInstanceOf[js.Any])
  }
}
