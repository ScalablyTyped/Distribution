package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PssAlgorithmParams
  extends xmlDashCoreLib.xmlDashCoreMod.XmlObject {
  var DigestMethod: xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.DigestMethod = js.native
  var MGF: MaskGenerationFunction = js.native
  var SaltLength: scala.Double = js.native
  var TrailerField: scala.Double = js.native
  def FromAlgorithm(algorithm: RsaPSSSignParams): scala.Unit = js.native
}

