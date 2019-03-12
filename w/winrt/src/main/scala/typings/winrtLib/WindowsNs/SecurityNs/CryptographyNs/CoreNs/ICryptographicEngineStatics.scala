package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptographicEngineStatics extends js.Object {
  def decrypt(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def decryptAndAuthenticate(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    nonce: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticationTag: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticatedData: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def deriveKeyMaterial(key: CryptographicKey, parameters: KeyDerivationParameters, desiredKeySize: scala.Double): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def encrypt(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def encryptAndAuthenticate(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    nonce: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticatedData: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): EncryptedAndAuthenticatedData
  def sign(key: CryptographicKey, data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def verifySignature(
    key: CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    signature: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): scala.Boolean
}

object ICryptographicEngineStatics {
  @scala.inline
  def apply(
    decrypt: (CryptographicKey, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer) => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    decryptAndAuthenticate: (CryptographicKey, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer) => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    deriveKeyMaterial: (CryptographicKey, KeyDerivationParameters, scala.Double) => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    encrypt: (CryptographicKey, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer) => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    encryptAndAuthenticate: (CryptographicKey, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer) => EncryptedAndAuthenticatedData,
    sign: (CryptographicKey, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer) => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    verifySignature: (CryptographicKey, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer) => scala.Boolean
  ): ICryptographicEngineStatics = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction3(decrypt), decryptAndAuthenticate = js.Any.fromFunction5(decryptAndAuthenticate), deriveKeyMaterial = js.Any.fromFunction3(deriveKeyMaterial), encrypt = js.Any.fromFunction3(encrypt), encryptAndAuthenticate = js.Any.fromFunction4(encryptAndAuthenticate), sign = js.Any.fromFunction2(sign), verifySignature = js.Any.fromFunction3(verifySignature))
  
    __obj.asInstanceOf[ICryptographicEngineStatics]
  }
}

