package typings.winrt.Windows.Security.Credentials.UI

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialPickerResults extends ICredentialPickerResults

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

