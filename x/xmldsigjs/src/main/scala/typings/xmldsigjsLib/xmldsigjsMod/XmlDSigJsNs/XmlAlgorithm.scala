package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlAlgorithm extends IAlgorithm

object XmlAlgorithm {
  @scala.inline
  def apply(
    algorithm: stdLib.Algorithm,
    getAlgorithmName: js.Function0[java.lang.String],
    namespaceURI: java.lang.String
  ): XmlAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, getAlgorithmName = getAlgorithmName, namespaceURI = namespaceURI)
  
    __obj.asInstanceOf[XmlAlgorithm]
  }
}

