package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "RevocationInfoChoices")
@js.native
class RevocationInfoChoices () extends js.Object {
  def this(params: js.Any) = this()
  var crls: js.Array[CertificateRevocationList] = js.native
  var otherRevocationInfos: js.Array[OtherRevocationInfoFormat] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "RevocationInfoChoices")
@js.native
object RevocationInfoChoices extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

