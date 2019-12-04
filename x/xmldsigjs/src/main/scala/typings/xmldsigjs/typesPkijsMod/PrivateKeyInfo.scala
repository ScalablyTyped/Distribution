package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.OctetString
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "PrivateKeyInfo")
@js.native
class PrivateKeyInfo () extends js.Object {
  def this(params: js.Any) = this()
  var attributes: js.UndefOr[js.Array[Attribute]] = js.native
  var parsedKey: js.UndefOr[ECPrivateKey | RSAPrivateKey] = js.native
  var privateKey: OctetString = js.native
  var privateKeyAlgorithm: AlgorithmIdentifier = js.native
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
@JSImport("xmldsigjs/types/pkijs", "PrivateKeyInfo")
@js.native
object PrivateKeyInfo extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

