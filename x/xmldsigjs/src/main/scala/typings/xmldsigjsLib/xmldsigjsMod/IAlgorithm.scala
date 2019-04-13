package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlgorithm extends js.Object {
  var algorithm: stdLib.Algorithm
  var namespaceURI: java.lang.String
  def getAlgorithmName(): java.lang.String
}

object IAlgorithm {
  @scala.inline
  def apply(
    algorithm: stdLib.Algorithm,
    getAlgorithmName: () => java.lang.String,
    namespaceURI: java.lang.String
  ): IAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, getAlgorithmName = js.Any.fromFunction0(getAlgorithmName), namespaceURI = namespaceURI)
  
    __obj.asInstanceOf[IAlgorithm]
  }
}

