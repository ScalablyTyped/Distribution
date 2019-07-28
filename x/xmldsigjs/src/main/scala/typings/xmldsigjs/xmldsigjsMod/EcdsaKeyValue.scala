package typings.xmldsigjs.xmldsigjsMod

import typings.std.CryptoKey
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "EcdsaKeyValue")
@js.native
class EcdsaKeyValue () extends KeyInfoClause {
  var DomainParameters: typings.xmldsigjs.xmldsigjsMod.DomainParameters = js.native
  /**
    * Gets the NamedCurve value of then public key
    */
  val NamedCurve: String = js.native
  var PublicKey: EcdsaPublicKey = js.native
  var jwk: JsonWebKey | Null = js.native
  var key: CryptoKey | Null = js.native
  var keyUsage: js.Array[String] | Null = js.native
  var name: String = js.native
}

