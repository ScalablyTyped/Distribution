package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "TimeStampReq")
@js.native
class TimeStampReq () extends js.Object {
  def this(params: js.Any) = this()
  var certReq: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  var messageImprint: MessageImprint = js.native
  var nonce: js.UndefOr[Integer] = js.native
  var reqPolicy: js.UndefOr[String] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "TimeStampReq")
@js.native
object TimeStampReq extends js.Object {
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

