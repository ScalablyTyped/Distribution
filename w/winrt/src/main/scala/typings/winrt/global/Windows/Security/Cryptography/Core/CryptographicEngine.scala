package typings.winrt.global.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
@js.native
class CryptographicEngine ()
  extends typings.winrt.Windows.Security.Cryptography.Core.CryptographicEngine

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
@js.native
object CryptographicEngine extends js.Object {
  def decrypt(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = js.native
  def decryptAndAuthenticate(
    key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    data: IBuffer,
    nonce: IBuffer,
    authenticationTag: IBuffer,
    authenticatedData: IBuffer
  ): IBuffer = js.native
  def deriveKeyMaterial(
    key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    parameters: typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters,
    desiredKeySize: Double
  ): IBuffer = js.native
  def encrypt(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = js.native
  def encryptAndAuthenticate(
    key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    data: IBuffer,
    nonce: IBuffer,
    authenticatedData: IBuffer
  ): typings.winrt.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData = js.native
  def sign(key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer): IBuffer = js.native
  def verifySignature(
    key: typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    data: IBuffer,
    signature: IBuffer
  ): Boolean = js.native
}

