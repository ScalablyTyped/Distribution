package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "OCSPRequest")
@js.native
class OCSPRequest () extends js.Object {
  def this(params: js.Any) = this()
  var optionalSignature: js.UndefOr[Signature] = js.native
  var tbsRequest: TBSRequest = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: Boolean): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "OCSPRequest")
@js.native
object OCSPRequest extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

