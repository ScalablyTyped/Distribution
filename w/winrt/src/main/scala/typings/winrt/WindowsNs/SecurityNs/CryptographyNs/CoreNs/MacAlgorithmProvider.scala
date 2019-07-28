package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
class MacAlgorithmProvider () extends IMacAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: String = js.native
  /* CompleteClass */
  override var macLength: Double = js.native
  /* CompleteClass */
  override def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
object MacAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: String): MacAlgorithmProvider = js.native
}

