package typings.winrt.global.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
class HashAlgorithmProvider ()
  extends typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmProvider {
  /* CompleteClass */
  override var algorithmName: String = js.native
  /* CompleteClass */
  override var hashLength: Double = js.native
  /* CompleteClass */
  override def createHash(): typings.winrt.Windows.Security.Cryptography.Core.CryptographicHash = js.native
  /* CompleteClass */
  override def hashData(data: IBuffer): IBuffer = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
object HashAlgorithmProvider extends js.Object {
  def openAlgorithm(algorithm: String): typings.winrt.Windows.Security.Cryptography.Core.HashAlgorithmProvider = js.native
}

