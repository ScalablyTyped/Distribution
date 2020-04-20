package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsymmetricKeyAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): AsymmetricKeyAlgorithmProvider
}

object IAsymmetricKeyAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => AsymmetricKeyAlgorithmProvider): IAsymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IAsymmetricKeyAlgorithmProviderStatics]
  }
}

