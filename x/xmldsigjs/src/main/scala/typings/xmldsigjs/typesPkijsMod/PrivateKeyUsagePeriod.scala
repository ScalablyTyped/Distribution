package typings.xmldsigjs.typesPkijsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "PrivateKeyUsagePeriod")
@js.native
class PrivateKeyUsagePeriod () extends js.Object {
  def this(params: js.Any) = this()
  var notAfter: js.UndefOr[Date] = js.native
  var notBefore: js.UndefOr[Date] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "PrivateKeyUsagePeriod")
@js.native
object PrivateKeyUsagePeriod extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

