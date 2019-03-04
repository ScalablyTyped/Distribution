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
  def apply(openAlgorithm: js.Function1[java.lang.String, KeyDerivationAlgorithmProvider]): IKeyDerivationAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = openAlgorithm)
  
    __obj.asInstanceOf[IKeyDerivationAlgorithmProviderStatics]
  }
}

