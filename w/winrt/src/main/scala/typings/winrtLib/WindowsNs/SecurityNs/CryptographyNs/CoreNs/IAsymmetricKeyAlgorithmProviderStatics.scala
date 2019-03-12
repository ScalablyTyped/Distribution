package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsymmetricKeyAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): AsymmetricKeyAlgorithmProvider
}

object IAsymmetricKeyAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: java.lang.String => AsymmetricKeyAlgorithmProvider): IAsymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
  
    __obj.asInstanceOf[IAsymmetricKeyAlgorithmProviderStatics]
  }
}

