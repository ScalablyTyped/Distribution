package typings.xmldsigjs.xmldsigjsMod

import typings.std.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlgorithm extends js.Object {
  var algorithm: Algorithm
  var namespaceURI: String
  def getAlgorithmName(): String
}

object IAlgorithm {
  @scala.inline
  def apply(algorithm: Algorithm, getAlgorithmName: () => String, namespaceURI: String): IAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], getAlgorithmName = js.Any.fromFunction0(getAlgorithmName), namespaceURI = namespaceURI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAlgorithm]
  }
}

