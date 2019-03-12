package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): KeyDerivationAlgorithmProvider
}

object IKeyDerivationAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: java.lang.String => KeyDerivationAlgorithmProvider): IKeyDerivationAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
  
    __obj.asInstanceOf[IKeyDerivationAlgorithmProviderStatics]
  }
}

