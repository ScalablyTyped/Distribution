package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.OctetString
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "ECPrivateKey")
@js.native
class ECPrivateKey () extends js.Object {
  def this(params: js.Any) = this()
  var namedCurve: js.UndefOr[String] = js.native
  var privateKey: OctetString = js.native
  var publicKey: js.UndefOr[ECPublicKey] = js.native
  var version: Double = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "ECPrivateKey")
@js.native
object ECPrivateKey extends js.Object {
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

