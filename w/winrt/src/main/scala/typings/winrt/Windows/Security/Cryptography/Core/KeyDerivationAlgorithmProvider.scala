package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyDerivationAlgorithmProvider extends IKeyDerivationAlgorithmProvider
object KeyDerivationAlgorithmProvider {
  
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): KeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey))
    __obj.asInstanceOf[KeyDerivationAlgorithmProvider]
  }
}
