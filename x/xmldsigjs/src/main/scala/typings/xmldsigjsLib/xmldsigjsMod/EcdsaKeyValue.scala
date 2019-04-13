package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "EcdsaKeyValue")
@js.native
class EcdsaKeyValue () extends KeyInfoClause {
  var DomainParameters: xmldsigjsLib.xmldsigjsMod.DomainParameters = js.native
  /**
    * Gets the NamedCurve value of then public key
    */
  val NamedCurve: java.lang.String = js.native
  var PublicKey: EcdsaPublicKey = js.native
  var jwk: stdLib.JsonWebKey | scala.Null = js.native
  var key: stdLib.CryptoKey | scala.Null = js.native
  var keyUsage: js.Array[java.lang.String] | scala.Null = js.native
  var name: java.lang.String = js.native
}

