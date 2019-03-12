package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMacAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): MacAlgorithmProvider
}

object IMacAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: java.lang.String => MacAlgorithmProvider): IMacAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
  
    __obj.asInstanceOf[IMacAlgorithmProviderStatics]
  }
}

