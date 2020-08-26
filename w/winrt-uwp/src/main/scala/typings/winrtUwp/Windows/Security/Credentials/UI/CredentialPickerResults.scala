package typings.winrtUwp.Windows.Security.Credentials.UI

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the results of the dialog box operation. */
@js.native
trait CredentialPickerResults extends js.Object {
  /** Gets the opaque credential. */
  var credential: IBuffer = js.native
  /** Gets the domain name portion of the unpacked credential. */
  var credentialDomainName: String = js.native
  /** Gets the password portion of the unpacked credential. */
  var credentialPassword: String = js.native
  /** Gets the state of the "Save Credentials" check box. */
  var credentialSaveOption: CredentialSaveOption = js.native
  /** Gets the status of the credential save operation. */
  var credentialSaved: Boolean = js.native
  /** Gets the user name of the unpacked credential. */
  var credentialUserName: String = js.native
  /** Gets the value of the error code. */
  var errorCode: Double = js.native
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
  @scala.inline
  implicit class CredentialPickerResultsOps[Self <: CredentialPickerResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCredential(value: IBuffer): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialDomainName(value: String): Self = this.set("credentialDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialPassword(value: String): Self = this.set("credentialPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialSaveOption(value: CredentialSaveOption): Self = this.set("credentialSaveOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialSaved(value: Boolean): Self = this.set("credentialSaved", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialUserName(value: String): Self = this.set("credentialUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
  }
  
}

