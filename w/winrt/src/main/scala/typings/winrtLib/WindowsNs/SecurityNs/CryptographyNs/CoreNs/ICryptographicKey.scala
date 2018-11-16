package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICryptographicKey extends js.Object {
  var keySize: scala.Double = js.native
  def export(): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def export(BlobType: CryptographicPrivateKeyBlobType): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def exportPublicKey(): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def exportPublicKey(BlobType: CryptographicPublicKeyBlobType): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

