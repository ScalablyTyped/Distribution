package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.BitString
import typings.std.CryptoKey
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "PublicKeyInfo")
@js.native
class PublicKeyInfo () extends js.Object {
  def this(params: js.Any) = this()
  var algorithm: AlgorithmIdentifier = js.native
  var parsedKey: js.UndefOr[ECPublicKey | RSAPublicKey] = js.native
  var subjectPublicKey: BitString = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def importKey(publicKey: CryptoKey): js.Thenable[Unit] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "PublicKeyInfo")
@js.native
object PublicKeyInfo extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

