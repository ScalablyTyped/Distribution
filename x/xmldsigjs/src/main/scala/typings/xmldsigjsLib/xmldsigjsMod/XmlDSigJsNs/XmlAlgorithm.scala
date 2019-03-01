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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("getAlgorithmName")(getAlgorithmName)
    __obj.updateDynamic("namespaceURI")(namespaceURI)
    __obj.asInstanceOf[XmlAlgorithm]
  }
}

