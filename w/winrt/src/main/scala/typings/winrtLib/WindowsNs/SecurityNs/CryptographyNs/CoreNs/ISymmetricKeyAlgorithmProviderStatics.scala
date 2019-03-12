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
  def apply(openAlgorithm: java.lang.String => SymmetricKeyAlgorithmProvider): ISymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
  
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProviderStatics]
  }
}

