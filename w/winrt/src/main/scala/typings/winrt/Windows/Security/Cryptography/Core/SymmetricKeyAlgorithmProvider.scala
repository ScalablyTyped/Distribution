package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
class SymmetricKeyAlgorithmProvider () extends ISymmetricKeyAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: String = js.native
  /* CompleteClass */
  override var blockLength: Double = js.native
  /* CompleteClass */
  override def createSymmetricKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
object SymmetricKeyAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: String): SymmetricKeyAlgorithmProvider = js.native
}

