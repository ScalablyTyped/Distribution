package typings.xmldsigjs

import typings.std.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgorithmUsages extends js.Object {
  var algorithm: Algorithm
  var usages: js.Array[String]
}

object Anon_AlgorithmUsages {
  @scala.inline
  def apply(algorithm: Algorithm, usages: js.Array[String]): Anon_AlgorithmUsages = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlgorithmUsages]
  }
}

