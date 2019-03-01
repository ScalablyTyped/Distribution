package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

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
    getAlgorithmName: js.Function0[java.lang.String],
    namespaceURI: java.lang.String
  ): IAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("getAlgorithmName")(getAlgorithmName)
    __obj.updateDynamic("namespaceURI")(namespaceURI)
    __obj.asInstanceOf[IAlgorithm]
  }
}

