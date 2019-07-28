package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEncryptedAndAuthenticatedData extends js.Object {
  var authenticationTag: IBuffer
  var encryptedData: IBuffer
}

object IEncryptedAndAuthenticatedData {
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): IEncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag, encryptedData = encryptedData)
  
    __obj.asInstanceOf[IEncryptedAndAuthenticatedData]
  }
}

