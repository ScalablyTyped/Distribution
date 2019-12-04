package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "RSAPublicKey")
@js.native
class RSAPublicKey () extends js.Object {
  def this(params: js.Any) = this()
  var modulus: Integer = js.native
  var publicExponent: Integer = js.native
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
@JSImport("xmldsigjs/types/pkijs", "RSAPublicKey")
@js.native
object RSAPublicKey extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

