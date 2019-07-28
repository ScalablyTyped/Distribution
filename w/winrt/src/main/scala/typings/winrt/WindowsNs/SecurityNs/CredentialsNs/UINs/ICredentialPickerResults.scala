package typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentialPickerResults extends js.Object {
  var credential: IBuffer
  var credentialDomainName: String
  var credentialPassword: String
  var credentialSaveOption: CredentialSaveOption
  var credentialSaved: Boolean
  var credentialUserName: String
  var errorCode: Double
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
    val __obj = js.Dynamic.literal(credential = credential, credentialDomainName = credentialDomainName, credentialPassword = credentialPassword, credentialSaveOption = credentialSaveOption, credentialSaved = credentialSaved, credentialUserName = credentialUserName, errorCode = errorCode)
  
    __obj.asInstanceOf[ICredentialPickerResults]
  }
}

