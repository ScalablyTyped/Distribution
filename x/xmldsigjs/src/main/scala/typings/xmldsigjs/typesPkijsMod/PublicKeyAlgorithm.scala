package typings.xmldsigjs.typesPkijsMod

import typings.xmldsigjs.Anon_AlgorithmUsages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyAlgorithm extends js.Object {
  var algorithm: Anon_AlgorithmUsages
}

object PublicKeyAlgorithm {
  @scala.inline
  def apply(algorithm: Anon_AlgorithmUsages): PublicKeyAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublicKeyAlgorithm]
  }
}

