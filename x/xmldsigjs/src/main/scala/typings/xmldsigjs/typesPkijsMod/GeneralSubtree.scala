package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "GeneralSubtree")
@js.native
class GeneralSubtree () extends js.Object {
  def this(params: js.Any) = this()
  var base: GeneralName = js.native
  var maximum: js.UndefOr[Double | Integer] = js.native
  var minimum: Double | Integer = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "GeneralSubtree")
@js.native
object GeneralSubtree extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

