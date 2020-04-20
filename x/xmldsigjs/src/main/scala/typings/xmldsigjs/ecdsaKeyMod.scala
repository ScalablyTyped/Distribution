package typings.xmldsigjs

import typings.std.CryptoKey
import typings.std.JsonWebKey
import typings.std.Uint8Array
import typings.xmlCore.mod.XmlObject
import typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", JSImport.Namespace)
@js.native
object ecdsaKeyMod extends js.Object {
  @js.native
  class DomainParameters () extends XmlObject {
    var NamedCurve: typings.xmldsigjs.ecdsaKeyMod.NamedCurve = js.native
  }
  
  @js.native
  class EcdsaKeyValue () extends KeyInfoClause {
    var DomainParameters: typings.xmldsigjs.ecdsaKeyMod.DomainParameters = js.native
    var PublicKey: EcdsaPublicKey = js.native
    var jwk: JsonWebKey | Null = js.native
    var key: CryptoKey | Null = js.native
    var keyUsage: js.Array[String] | Null = js.native
    var name: String = js.native
    /**
      * Gets the NamedCurve value of then public key
      */
    def NamedCurve: String = js.native
  }
  
  @js.native
  class EcdsaPublicKey () extends XmlObject {
    var X: Uint8Array = js.native
    var Y: Uint8Array = js.native
  }
  
  @js.native
  class NamedCurve () extends XmlObject {
    var Uri: String = js.native
  }
  
  trait _NamedCurveType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.xmldsigjs.xmldsigjsStrings.`P-256`
    - typings.xmldsigjs.xmldsigjsStrings.`P-384`
    - typings.xmldsigjs.xmldsigjsStrings.`P-521`
  */
  type NamedCurveType = _NamedCurveType | String
}

