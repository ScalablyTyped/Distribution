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

