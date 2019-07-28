package typings.xmldsigjs.xmldsigjsMod

import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
class PssAlgorithmParams () extends XmlObject {
  def this(algorithm: RsaPSSSignParams) = this()
  var DigestMethod: typings.xmldsigjs.xmldsigjsMod.DigestMethod = js.native
  var MGF: MaskGenerationFunction = js.native
  var SaltLength: Double = js.native
  var TrailerField: Double = js.native
  def FromAlgorithm(algorithm: RsaPSSSignParams): Unit = js.native
}

/* static members */
@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
object PssAlgorithmParams extends js.Object {
  def FromAlgorithm(algorithm: RsaPSSSignParams): PssAlgorithmParams = js.native
}

