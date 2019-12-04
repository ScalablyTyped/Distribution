package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "PolicyMapping")
@js.native
class PolicyMapping () extends js.Object {
  def this(params: js.Any) = this()
  var issuerDomainPolicy: String = js.native
  var subjectDomainPolicy: String = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "PolicyMapping")
@js.native
object PolicyMapping extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

