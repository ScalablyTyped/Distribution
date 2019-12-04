package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "RSAPrivateKey")
@js.native
class RSAPrivateKey () extends js.Object {
  def this(params: js.Any) = this()
  var coefficient: Integer = js.native
  var exponent1: Integer = js.native
  var exponent2: Integer = js.native
  var modulus: Integer = js.native
  var otherPrimeInfos: js.UndefOr[js.Array[OtherPrimeInfo]] = js.native
  var prime1: Integer = js.native
  var prime2: Integer = js.native
  var privateExponent: Integer = js.native
  var publicExponent: Integer = js.native
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
@JSImport("xmldsigjs/types/pkijs", "RSAPrivateKey")
@js.native
object RSAPrivateKey extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

