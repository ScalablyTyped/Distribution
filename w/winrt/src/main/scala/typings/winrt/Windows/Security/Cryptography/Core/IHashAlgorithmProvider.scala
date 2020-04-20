package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashAlgorithmProvider extends js.Object {
  var algorithmName: String
  var hashLength: Double
  def createHash(): CryptographicHash
  def hashData(data: IBuffer): IBuffer
}

object IHashAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: String,
    createHash: () => CryptographicHash,
    hashData: IBuffer => IBuffer,
    hashLength: Double
  ): IHashAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction0(createHash), hashData = js.Any.fromFunction1(hashData), hashLength = hashLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHashAlgorithmProvider]
  }
}

