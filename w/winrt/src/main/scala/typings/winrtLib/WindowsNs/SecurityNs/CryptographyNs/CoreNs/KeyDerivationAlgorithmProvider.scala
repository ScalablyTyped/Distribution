package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
class KeyDerivationAlgorithmProvider () extends IKeyDerivationAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: java.lang.String = js.native
  /* CompleteClass */
  override def createKey(keyMaterial: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
object KeyDerivationAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.KeyDerivationAlgorithmProvider = js.native
}

