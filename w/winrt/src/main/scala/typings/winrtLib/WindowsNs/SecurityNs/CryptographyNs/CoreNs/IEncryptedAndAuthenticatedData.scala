package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEncryptedAndAuthenticatedData extends js.Object {
  var authenticationTag: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  var encryptedData: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
}

object IEncryptedAndAuthenticatedData {
  @scala.inline
  def apply(
    authenticationTag: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    encryptedData: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): IEncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag, encryptedData = encryptedData)
  
    __obj.asInstanceOf[IEncryptedAndAuthenticatedData]
  }
}

