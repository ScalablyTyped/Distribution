package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "PolicyInformation")
@js.native
class PolicyInformation () extends js.Object {
  def this(params: js.Any) = this()
  var policyIdentifier: String = js.native
  /**
    * Value of the TIME class 
    */
  var policyQualifiers: js.Array[PolicyQualifierInfo] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "PolicyInformation")
@js.native
object PolicyInformation extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

