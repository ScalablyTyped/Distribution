package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "DistributionPoint")
@js.native
class DistributionPoint () extends js.Object {
  def this(params: js.Any) = this()
  var cRLIssuer: js.UndefOr[js.Array[GeneralName]] = js.native
  var distributionPoint: js.UndefOr[js.Array[GeneralName]] = js.native
  var reasons: js.UndefOr[BitString] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "DistributionPoint")
@js.native
object DistributionPoint extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

