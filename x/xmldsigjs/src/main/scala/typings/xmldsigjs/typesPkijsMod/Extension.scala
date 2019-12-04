package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "Extension")
@js.native
class Extension () extends js.Object {
  def this(params: js.Any) = this()
  var critical: Boolean = js.native
  var extnID: String = js.native
  var extnValue: OctetString = js.native
  var parsedValue: js.UndefOr[js.Any] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "Extension")
@js.native
object Extension extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

