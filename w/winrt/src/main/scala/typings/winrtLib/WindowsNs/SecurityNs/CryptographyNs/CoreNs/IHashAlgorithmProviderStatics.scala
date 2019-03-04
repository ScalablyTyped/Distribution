package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: java.lang.String): HashAlgorithmProvider
}

object IHashAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: js.Function1[java.lang.String, HashAlgorithmProvider]): IHashAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = openAlgorithm)
  
    __obj.asInstanceOf[IHashAlgorithmProviderStatics]
  }
}

