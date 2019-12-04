package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "PolicyConstraints")
@js.native
class PolicyConstraints () extends js.Object {
  def this(params: js.Any) = this()
  var inhibitPolicyMapping: js.UndefOr[Double] = js.native
  var requireExplicitPolicy: js.UndefOr[Double] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "PolicyConstraints")
@js.native
object PolicyConstraints extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

