package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
class SymmetricKeyAlgorithmProvider () extends ISymmetricKeyAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: java.lang.String = js.native
  /* CompleteClass */
  override var blockLength: scala.Double = js.native
  /* CompleteClass */
  override def createSymmetricKey(keyMaterial: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey = js.native
}

@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
object SymmetricKeyAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.SymmetricKeyAlgorithmProvider = js.native
}

