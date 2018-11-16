package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
class PssAlgorithmParams ()
  extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.PssAlgorithmParams {
  def this(algorithm: xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.RsaPSSSignParams) = this()
}

@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
object PssAlgorithmParams extends js.Object {
  def FromAlgorithm(algorithm: xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.RsaPSSSignParams): xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.PssAlgorithmParams = js.native
}

