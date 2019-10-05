package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsymmetricKeyAlgorithmProvider extends js.Object {
  var algorithmName: String = js.native
  def createKeyPair(keySize: Double): CryptographicKey = js.native
  def importKeyPair(keyBlob: IBuffer): CryptographicKey = js.native
  def importKeyPair(keyBlob: IBuffer, BlobType: CryptographicPrivateKeyBlobType): CryptographicKey = js.native
  def importPublicKey(keyBlob: IBuffer): CryptographicKey = js.native
  def importPublicKey(keyBlob: IBuffer, BlobType: CryptographicPublicKeyBlobType): CryptographicKey = js.native
}

