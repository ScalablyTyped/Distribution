package typings.winrt.global.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
class KeyDerivationAlgorithmProvider ()
  extends typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: String = js.native
  /* CompleteClass */
  override def createKey(keyMaterial: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
object KeyDerivationAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider = js.native
}

