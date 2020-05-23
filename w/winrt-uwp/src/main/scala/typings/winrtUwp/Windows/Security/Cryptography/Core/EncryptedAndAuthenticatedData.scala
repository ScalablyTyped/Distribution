package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains data that can be retrieved from encrypted and authenticated data. Authenticated encryption algorithms are opened by using the SymmetricKeyAlgorithmProvider class. */
trait EncryptedAndAuthenticatedData extends js.Object {
  /** Gets the authentication tag. */
  var authenticationTag: IBuffer
  /** Gets the encrypted data. */
  var encryptedData: IBuffer
}

object EncryptedAndAuthenticatedData {
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): EncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedAndAuthenticatedData]
  }
}

