package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "IssuingDistributionPoint")
@js.native
class IssuingDistributionPoint () extends js.Object {
  def this(params: js.Any) = this()
  var distributionPoint: js.UndefOr[js.Array[GeneralName] | RelativeDistinguishedNames] = js.native
  var indirectCRL: Boolean = js.native
  var onlyContainsAttributeCerts: Boolean = js.native
  var onlyContainsUserCerts: Boolean = js.native
  var onlySomeReasons: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "IssuingDistributionPoint")
@js.native
object IssuingDistributionPoint extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

