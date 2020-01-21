package typings.xmldsigjs.algorithmMod

import typings.std.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/algorithm", "XmlAlgorithm")
@js.native
abstract class XmlAlgorithm () extends IAlgorithm {
  /* CompleteClass */
  override var algorithm: Algorithm = js.native
  /* CompleteClass */
  override var namespaceURI: String = js.native
  /* CompleteClass */
  override def getAlgorithmName(): String = js.native
}

