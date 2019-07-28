package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICryptographicKey extends js.Object {
  var keySize: Double = js.native
  def export(): IBuffer = js.native
  def export(BlobType: CryptographicPrivateKeyBlobType): IBuffer = js.native
  def exportPublicKey(): IBuffer = js.native
  def exportPublicKey(BlobType: CryptographicPublicKeyBlobType): IBuffer = js.native
}

