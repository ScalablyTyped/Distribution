package typings.winrt.global.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
class SymmetricKeyAlgorithmProvider ()
  extends typings.winrt.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: String = js.native
  /* CompleteClass */
  override var blockLength: Double = js.native
  /* CompleteClass */
  override def createSymmetricKey(keyMaterial: IBuffer): typings.winrt.Windows.Security.Cryptography.Core.CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
object SymmetricKeyAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider = js.native
}

