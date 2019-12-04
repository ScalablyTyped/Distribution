package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "AuthorityKeyIdentifier")
@js.native
class AuthorityKeyIdentifier () extends js.Object {
  def this(params: js.Any) = this()
  var authorityCertIssuer: js.Array[GeneralName] = js.native
  var authorityCertSerialNumber: Integer = js.native
  var keyIdentifier: OctetString = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "AuthorityKeyIdentifier")
@js.native
object AuthorityKeyIdentifier extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

