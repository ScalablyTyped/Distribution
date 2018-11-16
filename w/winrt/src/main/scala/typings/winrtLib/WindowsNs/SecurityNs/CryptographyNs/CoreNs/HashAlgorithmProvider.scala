package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
class HashAlgorithmProvider () extends IHashAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: java.lang.String = js.native
  /* CompleteClass */
  override var hashLength: scala.Double = js.native
  /* CompleteClass */
  override def createHash(): CryptographicHash = js.native
  /* CompleteClass */
  override def hashData(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
object HashAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.HashAlgorithmProvider = js.native
}

