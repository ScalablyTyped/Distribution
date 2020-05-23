package typings.winrtUwp.Windows.Security.Credentials.UI

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the results of the dialog box operation. */
trait CredentialPickerResults extends js.Object {
  /** Gets the opaque credential. */
  var credential: IBuffer
  /** Gets the domain name portion of the unpacked credential. */
  var credentialDomainName: String
  /** Gets the password portion of the unpacked credential. */
  var credentialPassword: String
  /** Gets the state of the "Save Credentials" check box. */
  var credentialSaveOption: CredentialSaveOption
  /** Gets the status of the credential save operation. */
  var credentialSaved: Boolean
  /** Gets the user name of the unpacked credential. */
  var credentialUserName: String
  /** Gets the value of the error code. */
  var errorCode: Double
}

object CredentialPickerResults {
  @scala.inline
  def apply(
    credential: IBuffer,
    credentialDomainName: String,
    credentialPassword: String,
    credentialSaveOption: CredentialSaveOption,
    credentialSaved: Boolean,
    credentialUserName: String,
    errorCode: Double
  ): CredentialPickerResults = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialDomainName = credentialDomainName.asInstanceOf[js.Any], credentialPassword = credentialPassword.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], credentialSaved = credentialSaved.asInstanceOf[js.Any], credentialUserName = credentialUserName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialPickerResults]
  }
}

