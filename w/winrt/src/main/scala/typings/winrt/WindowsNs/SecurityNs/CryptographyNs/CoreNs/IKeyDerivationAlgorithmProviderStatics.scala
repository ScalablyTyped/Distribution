package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): KeyDerivationAlgorithmProvider
}

object IKeyDerivationAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => KeyDerivationAlgorithmProvider): IKeyDerivationAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
  
    __obj.asInstanceOf[IKeyDerivationAlgorithmProviderStatics]
  }
}

