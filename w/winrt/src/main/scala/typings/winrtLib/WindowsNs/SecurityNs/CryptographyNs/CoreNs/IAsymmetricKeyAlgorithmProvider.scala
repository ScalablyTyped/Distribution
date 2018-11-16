package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsymmetricKeyAlgorithmProvider extends js.Object {
  var algorithmName: java.lang.String = js.native
  def createKeyPair(keySize: scala.Double): CryptographicKey = js.native
  def importKeyPair(keyBlob: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey = js.native
  def importKeyPair(keyBlob: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, BlobType: CryptographicPrivateKeyBlobType): CryptographicKey = js.native
  def importPublicKey(keyBlob: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey = js.native
  def importPublicKey(keyBlob: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, BlobType: CryptographicPublicKeyBlobType): CryptographicKey = js.native
}

