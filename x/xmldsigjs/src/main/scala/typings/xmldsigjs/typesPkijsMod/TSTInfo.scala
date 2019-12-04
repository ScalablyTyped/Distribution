package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "TSTInfo")
@js.native
class TSTInfo () extends js.Object {
  def this(params: js.Any) = this()
  var accuracy: js.UndefOr[Accuracy] = js.native
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  var genTime: Date = js.native
  var messageImprint: MessageImprint = js.native
  var nonce: js.UndefOr[Integer] = js.native
  var ordering: js.UndefOr[Boolean] = js.native
  var policy: String = js.native
  var serialNumber: Integer = js.native
  var tsa: js.UndefOr[GeneralName] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
  def verify(params: VerifyParams): js.Thenable[Boolean] = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "TSTInfo")
@js.native
object TSTInfo extends js.Object {
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

