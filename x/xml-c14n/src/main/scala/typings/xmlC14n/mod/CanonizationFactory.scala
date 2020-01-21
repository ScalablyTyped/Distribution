package typings.xmlC14n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanonizationFactory extends js.Object {
  def createCanonicaliser(kind: String): Canonicalize = js.native
  def createCanonicaliser(kind: String, options: Options): Canonicalize = js.native
  def getAlgorithm(uri: String): js.Any = js.native
  def registerAlgorithm(uri: String, implementation: js.Any): js.Any = js.native
}

