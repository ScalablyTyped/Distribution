package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentialPickerResults extends js.Object {
  var credential: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  var credentialDomainName: java.lang.String
  var credentialPassword: java.lang.String
  var credentialSaveOption: CredentialSaveOption
  var credentialSaved: scala.Boolean
  var credentialUserName: java.lang.String
  var errorCode: scala.Double
}

object ICredentialPickerResults {
  @scala.inline
  def apply(
    credential: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    credentialDomainName: java.lang.String,
    credentialPassword: java.lang.String,
    credentialSaveOption: CredentialSaveOption,
    credentialSaved: scala.Boolean,
    credentialUserName: java.lang.String,
    errorCode: scala.Double
  ): ICredentialPickerResults = {
    val __obj = js.Dynamic.literal(credential = credential, credentialDomainName = credentialDomainName, credentialPassword = credentialPassword, credentialSaveOption = credentialSaveOption, credentialSaved = credentialSaved, credentialUserName = credentialUserName, errorCode = errorCode)
  
    __obj.asInstanceOf[ICredentialPickerResults]
  }
}

