package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacAlgorithmProvider extends IMacAlgorithmProvider

object MacAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey, macLength: Double): MacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey), macLength = macLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacAlgorithmProvider]
  }
}

