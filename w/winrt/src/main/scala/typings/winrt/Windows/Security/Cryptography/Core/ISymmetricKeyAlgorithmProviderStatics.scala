package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISymmetricKeyAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): SymmetricKeyAlgorithmProvider
}

object ISymmetricKeyAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => SymmetricKeyAlgorithmProvider): ISymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
  
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProviderStatics]
  }
}

