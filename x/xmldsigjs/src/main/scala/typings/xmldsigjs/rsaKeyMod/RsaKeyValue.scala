package typings.xmldsigjs.rsaKeyMod

import typings.std.CryptoKey
import typings.std.JsonWebKey
import typings.std.Uint8Array
import typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "RsaKeyValue")
@js.native
class RsaKeyValue () extends KeyInfoClause {
  
  /**
    * Gets the Exponent of the public key
    */
  var Exponent: Uint8Array | Null = js.native
  
  /**
    * Gets the Modulus of the public key
    */
  var Modulus: Uint8Array | Null = js.native
  
  var jwk: JsonWebKey | Null = js.native
  
  var key: CryptoKey | Null = js.native
  
  var keyUsage: js.Array[String] = js.native
}
