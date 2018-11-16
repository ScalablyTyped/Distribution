package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
class MacAlgorithmProvider () extends IMacAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: java.lang.String = js.native
  /* CompleteClass */
  override var macLength: scala.Double = js.native
  /* CompleteClass */
  override def createKey(keyMaterial: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey = js.native
}

@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
object MacAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.MacAlgorithmProvider = js.native
}

