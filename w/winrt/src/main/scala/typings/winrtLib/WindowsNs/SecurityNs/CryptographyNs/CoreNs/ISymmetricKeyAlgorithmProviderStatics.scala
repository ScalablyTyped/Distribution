package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISymmetricKeyAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): SymmetricKeyAlgorithmProvider
}

object ISymmetricKeyAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: js.Function1[java.lang.String, SymmetricKeyAlgorithmProvider]): ISymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = openAlgorithm)
  
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProviderStatics]
  }
}

