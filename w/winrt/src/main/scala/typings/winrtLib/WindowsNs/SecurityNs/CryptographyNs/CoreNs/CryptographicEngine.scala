package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

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
  def decrypt(
    key: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def decryptAndAuthenticate(
    key: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    nonce: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticationTag: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticatedData: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def deriveKeyMaterial(
    key: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    parameters: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.KeyDerivationParameters,
    desiredKeySize: scala.Double
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def encrypt(
    key: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    iv: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def encryptAndAuthenticate(
    key: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    nonce: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    authenticatedData: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.EncryptedAndAuthenticatedData = js.native
  def sign(
    key: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def verifySignature(
    key: winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicKey,
    data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    signature: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): scala.Boolean = js.native
}

