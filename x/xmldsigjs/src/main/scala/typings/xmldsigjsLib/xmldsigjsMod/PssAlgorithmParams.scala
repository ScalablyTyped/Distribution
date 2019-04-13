package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
class PssAlgorithmParams ()
  extends xmlDashCoreLib.xmlDashCoreMod.XmlObject {
  def this(algorithm: RsaPSSSignParams) = this()
  var DigestMethod: xmldsigjsLib.xmldsigjsMod.DigestMethod = js.native
  var MGF: MaskGenerationFunction = js.native
  var SaltLength: scala.Double = js.native
  var TrailerField: scala.Double = js.native
  def FromAlgorithm(algorithm: RsaPSSSignParams): scala.Unit = js.native
}

/* static members */
@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
object PssAlgorithmParams extends js.Object {
  def FromAlgorithm(algorithm: xmldsigjsLib.xmldsigjsMod.RsaPSSSignParams): xmldsigjsLib.xmldsigjsMod.PssAlgorithmParams = js.native
}

