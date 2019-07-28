package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
@js.native
class CryptographicEngine () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
@js.native
object CryptographicEngine extends js.Object {
  def decrypt(key: CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = js.native
  def decryptAndAuthenticate(
    key: CryptographicKey,
    data: IBuffer,
    nonce: IBuffer,
    authenticationTag: IBuffer,
    authenticatedData: IBuffer
  ): IBuffer = js.native
  def deriveKeyMaterial(key: CryptographicKey, parameters: KeyDerivationParameters, desiredKeySize: Double): IBuffer = js.native
  def encrypt(key: CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = js.native
  def encryptAndAuthenticate(key: CryptographicKey, data: IBuffer, nonce: IBuffer, authenticatedData: IBuffer): EncryptedAndAuthenticatedData = js.native
  def sign(key: CryptographicKey, data: IBuffer): IBuffer = js.native
  def verifySignature(key: CryptographicKey, data: IBuffer, signature: IBuffer): Boolean = js.native
}

