package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): HashAlgorithmProvider
}

object IHashAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => HashAlgorithmProvider): IHashAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IHashAlgorithmProviderStatics]
  }
}

