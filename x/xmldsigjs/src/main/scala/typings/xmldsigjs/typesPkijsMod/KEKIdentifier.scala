package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.GeneralizedTime
import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "KEKIdentifier")
@js.native
class KEKIdentifier () extends js.Object {
  def this(params: js.Any) = this()
  var date: js.UndefOr[GeneralizedTime] = js.native
  var keyIdentifier: OctetString = js.native
  var other: js.UndefOr[OtherKeyAttribute] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "KEKIdentifier")
@js.native
object KEKIdentifier extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

