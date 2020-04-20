package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISymmetricKeyAlgorithmProvider extends js.Object {
  var algorithmName: String
  var blockLength: Double
  def createSymmetricKey(keyMaterial: IBuffer): CryptographicKey
}

object ISymmetricKeyAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, blockLength: Double, createSymmetricKey: IBuffer => CryptographicKey): ISymmetricKeyAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], blockLength = blockLength.asInstanceOf[js.Any], createSymmetricKey = js.Any.fromFunction1(createSymmetricKey))
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProvider]
  }
}

