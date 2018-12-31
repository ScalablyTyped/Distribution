package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls the appearance and behavior of a credential prompt. */
@JSGlobal("Windows.Security.Credentials.UI.CredentialPickerOptions")
@js.native
/** Creates and initializes a new, empty instance of the CredentialPickerOptions object. */
class CredentialPickerOptions () extends js.Object {
  /** Gets or sets the option of whether the dialog box is displayed. */
  var alwaysDisplayDialog: scala.Boolean = js.native
  /** Gets or sets the authentication protocol. */
  var authenticationProtocol: AuthenticationProtocol = js.native
  /** Gets or sets whether the caller wants to save the credentials. */
  var callerSavesCredential: scala.Boolean = js.native
  /** Gets or sets the caption text that is displayed to the user. */
  var caption: java.lang.String = js.native
  /** Gets or sets the option on saving credentials. */
  var credentialSaveOption: CredentialSaveOption = js.native
  /** Gets or sets whether the authentication protocol is custom rather than a standard authentication protocol. */
  var customAuthenticationProtocol: java.lang.String = js.native
  /** Gets or sets the error code. */
  var errorCode: scala.Double = js.native
  /** Gets or sets the body of text that displays to the user. */
  var message: java.lang.String = js.native
  /** Gets or sets whether to fill dialog box fields with previous credentials. */
  var previousCredential: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets or sets the name of the target computer. */
  var targetName: java.lang.String = js.native
}

