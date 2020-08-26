package typings.winrt.Windows.Security.Credentials.UI

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICredentialPickerResults extends js.Object {
  var credential: IBuffer = js.native
  var credentialDomainName: String = js.native
  var credentialPassword: String = js.native
  var credentialSaveOption: CredentialSaveOption = js.native
  var credentialSaved: Boolean = js.native
  var credentialUserName: String = js.native
  var errorCode: Double = js.native
}

object ICredentialPickerResults {
  @scala.inline
  def apply(
    credential: IBuffer,
    credentialDomainName: String,
    credentialPassword: String,
    credentialSaveOption: CredentialSaveOption,
    credentialSaved: Boolean,
    credentialUserName: String,
    errorCode: Double
  ): ICredentialPickerResults = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialDomainName = credentialDomainName.asInstanceOf[js.Any], credentialPassword = credentialPassword.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], credentialSaved = credentialSaved.asInstanceOf[js.Any], credentialUserName = credentialUserName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICredentialPickerResults]
  }
  @scala.inline
  implicit class ICredentialPickerResultsOps[Self <: ICredentialPickerResults] (val x: Self) extends AnyVal {
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

