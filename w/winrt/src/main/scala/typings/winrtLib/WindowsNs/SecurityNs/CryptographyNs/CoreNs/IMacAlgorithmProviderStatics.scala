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
  def apply(openAlgorithm: js.Function1[java.lang.String, MacAlgorithmProvider]): IMacAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openAlgorithm")(openAlgorithm)
    __obj.asInstanceOf[IMacAlgorithmProviderStatics]
  }
}

