package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptographicEngineStatics extends js.Object {
  def decrypt(key: CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer
  def decryptAndAuthenticate(
    key: CryptographicKey,
    data: IBuffer,
    nonce: IBuffer,
    authenticationTag: IBuffer,
    authenticatedData: IBuffer
  ): IBuffer
  def deriveKeyMaterial(key: CryptographicKey, parameters: KeyDerivationParameters, desiredKeySize: Double): IBuffer
  def encrypt(key: CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer
  def encryptAndAuthenticate(key: CryptographicKey, data: IBuffer, nonce: IBuffer, authenticatedData: IBuffer): EncryptedAndAuthenticatedData
  def sign(key: CryptographicKey, data: IBuffer): IBuffer
  def verifySignature(key: CryptographicKey, data: IBuffer, signature: IBuffer): Boolean
}

object ICryptographicEngineStatics {
  @scala.inline
  def apply(
    decrypt: (CryptographicKey, IBuffer, IBuffer) => IBuffer,
    decryptAndAuthenticate: (CryptographicKey, IBuffer, IBuffer, IBuffer, IBuffer) => IBuffer,
    deriveKeyMaterial: (CryptographicKey, KeyDerivationParameters, Double) => IBuffer,
    encrypt: (CryptographicKey, IBuffer, IBuffer) => IBuffer,
    encryptAndAuthenticate: (CryptographicKey, IBuffer, IBuffer, IBuffer) => EncryptedAndAuthenticatedData,
    sign: (CryptographicKey, IBuffer) => IBuffer,
    verifySignature: (CryptographicKey, IBuffer, IBuffer) => Boolean
  ): ICryptographicEngineStatics = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction3(decrypt), decryptAndAuthenticate = js.Any.fromFunction5(decryptAndAuthenticate), deriveKeyMaterial = js.Any.fromFunction3(deriveKeyMaterial), encrypt = js.Any.fromFunction3(encrypt), encryptAndAuthenticate = js.Any.fromFunction4(encryptAndAuthenticate), sign = js.Any.fromFunction2(sign), verifySignature = js.Any.fromFunction3(verifySignature))
  
    __obj.asInstanceOf[ICryptographicEngineStatics]
  }
}

