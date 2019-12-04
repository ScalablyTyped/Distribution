package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "BasicConstraints")
@js.native
class BasicConstraints () extends js.Object {
  def this(params: js.Any) = this()
  var cA: Boolean = js.native
  var pathLenConstraint: Double | Integer = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "BasicConstraints")
@js.native
object BasicConstraints extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

