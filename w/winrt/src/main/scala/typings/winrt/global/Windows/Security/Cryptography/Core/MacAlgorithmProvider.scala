package typings.winrt.global.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
class MacAlgorithmProvider ()
  extends typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: String = js.native
  /* CompleteClass */
  override var macLength: Double = js.native
  /* CompleteClass */
  override def createKey(keyMaterial: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
object MacAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.MacAlgorithmProvider = js.native
}

