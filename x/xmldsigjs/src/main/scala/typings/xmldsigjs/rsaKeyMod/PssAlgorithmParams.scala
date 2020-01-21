package typings.xmldsigjs.rsaKeyMod

import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "PssAlgorithmParams")
@js.native
class PssAlgorithmParams () extends XmlObject {
  def this(algorithm: RsaPSSSignParams) = this()
  var DigestMethod: typings.xmldsigjs.digestMethodMod.DigestMethod = js.native
  var MGF: MaskGenerationFunction = js.native
  var SaltLength: Double = js.native
  var TrailerField: Double = js.native
  def FromAlgorithm(algorithm: RsaPSSSignParams): Unit = js.native
}

/* static members */
@JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "PssAlgorithmParams")
@js.native
object PssAlgorithmParams extends js.Object {
  def FromAlgorithm(algorithm: RsaPSSSignParams): PssAlgorithmParams = js.native
}

