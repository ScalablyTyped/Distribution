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
  def apply(openAlgorithm: js.Function1[java.lang.String, AsymmetricKeyAlgorithmProvider]): IAsymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = openAlgorithm)
  
    __obj.asInstanceOf[IAsymmetricKeyAlgorithmProviderStatics]
  }
}

