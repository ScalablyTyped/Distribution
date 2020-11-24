package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICryptographicKey extends js.Object {
  
  def export(): IBuffer = js.native
  def export(BlobType: CryptographicPrivateKeyBlobType): IBuffer = js.native
  
  def exportPublicKey(): IBuffer = js.native
  def exportPublicKey(BlobType: CryptographicPublicKeyBlobType): IBuffer = js.native
  
  var keySize: Double = js.native
}
