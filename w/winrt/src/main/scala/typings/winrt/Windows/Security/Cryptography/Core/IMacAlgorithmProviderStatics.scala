package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMacAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): MacAlgorithmProvider
}

object IMacAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => MacAlgorithmProvider): IMacAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
  
    __obj.asInstanceOf[IMacAlgorithmProviderStatics]
  }
}

