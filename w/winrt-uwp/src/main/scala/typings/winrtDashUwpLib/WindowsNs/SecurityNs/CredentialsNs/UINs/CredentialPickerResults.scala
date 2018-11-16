package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the results of the dialog box operation. */
@JSGlobal("Windows.Security.Credentials.UI.CredentialPickerResults")
@js.native
abstract class CredentialPickerResults () extends js.Object {
  /** Gets the opaque credential. */
  var credential: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the domain name portion of the unpacked credential. */
  var credentialDomainName: java.lang.String = js.native
  /** Gets the password portion of the unpacked credential. */
  var credentialPassword: java.lang.String = js.native
  /** Gets the state of the "Save Credentials" check box. */
  var credentialSaveOption: CredentialSaveOption = js.native
  /** Gets the status of the credential save operation. */
  var credentialSaved: scala.Boolean = js.native
  /** Gets the user name of the unpacked credential. */
  var credentialUserName: java.lang.String = js.native
  /** Gets the value of the error code. */
  var errorCode: scala.Double = js.native
}

