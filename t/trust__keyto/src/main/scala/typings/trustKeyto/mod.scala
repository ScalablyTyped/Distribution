package typings.trustKeyto

import typings.std.Exclude
import typings.trustKeyto.trustKeytoStrings.jwk
import typings.trustKeyto.trustKeytoStrings.pem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@trust/keyto", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Key
  @JSImport("@trust/keyto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def from(key: String, format: SerializableFormat): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(key.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  /**
    * Import a key.
    *
    * @param format The format of the key.
    * - `'pem'`: will parse a PEM encoded string (as per OpenSSL output).
    * - `'jwk'`: will parse a JWK object or JSON String
    * - `'blk'`: will parse a hex encoded key string as used on various blockchains (limited to secp256k1 keys).
    *
    * @example <caption>Decode PEM and convert to JWK</caption>
    * import keyto = require('@trust/keyto')
    * import * as assert from 'node:assert'
    *
    * const pemPrivate = getPrivatePemStringSomehow()
    * const jwk = getPublicJwkSomehow()
    *
    * // String data can either be passed in directly:
    * const key = keyto.from(pemPrivate, 'pem').toJwk('public')
    *
    * assert.equal(jwk, key)
    *
    * @example <caption>Decode HEX (Blockchain) private key and convert to PEM PKCS8 public key</caption>
    * import keyto = require('@trust/keyto')
    * import * as assert from 'node:assert'
    *
    * const blk = getPrivateBlockchainHexStringSomehow()
    * const pemPublic = getPublicPemSomehow()
    *
    * const key = keyto.from(blk, 'blk').toString('pem', 'public_pkcs8')
    *
    * assert.equal(pemPublic, key)
    */
  /* static member */
  inline def from_jwk(key: JWK, format: jwk): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(key.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  trait JWK extends StObject {
    
    var crv: js.UndefOr[String] = js.undefined
    
    var d: js.UndefOr[String] = js.undefined
    
    var dp: js.UndefOr[String] = js.undefined
    
    var dq: js.UndefOr[String] = js.undefined
    
    var e: js.UndefOr[String] = js.undefined
    
    var kty: String
    
    var n: js.UndefOr[String] = js.undefined
    
    var p: js.UndefOr[String] = js.undefined
    
    var q: js.UndefOr[String] = js.undefined
    
    var qi: js.UndefOr[String] = js.undefined
    
    var x: js.UndefOr[String] = js.undefined
    
    var y: js.UndefOr[String] = js.undefined
  }
  object JWK {
    
    inline def apply(kty: String): JWK = {
      val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JWK] (val x: Self) extends AnyVal {
      
      inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
      
      inline def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
      
      inline def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
      
      inline def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
      
      inline def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var crv: String = js.native
    
    var format: SerializableFormat = js.native
    
    var kty: String = js.native
    
    var oid: String = js.native
    
    var selector: KeySelector | PEMKeySelector = js.native
    
    /**
      * Convert a key to JWK.
      */
    def toJwk(selector: KeySelector): JWK = js.native
    
    def toString(/** @default 'pem' */
    format: Unit, /** @default 'public_pkcs8' */
    selector: PEMKeySelector): String = js.native
    @JSName("toString")
    def toString_pem(format: Exclude[SerializableFormat, pem], selector: KeySelector): String = js.native
    @JSName("toString")
    def toString_pem(/** @default 'pem' */
    format: pem): String = js.native
    @JSName("toString")
    def toString_pem(/** @default 'pem' */
    format: pem, /** @default 'public_pkcs8' */
    selector: PEMKeySelector): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trustKeyto.trustKeytoStrings.public
    - typings.trustKeyto.trustKeytoStrings.`private`
  */
  trait KeySelector extends StObject
  object KeySelector {
    
    inline def `private`: typings.trustKeyto.trustKeytoStrings.`private` = "private".asInstanceOf[typings.trustKeyto.trustKeytoStrings.`private`]
    
    inline def public: typings.trustKeyto.trustKeytoStrings.public = "public".asInstanceOf[typings.trustKeyto.trustKeytoStrings.public]
  }
  
  /**
    * Note these refer specifically to different ASN encodings for PEM encoded keys
    * and are not compatible with non-PEM output types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.trustKeyto.trustKeytoStrings.public_pkcs1
    - typings.trustKeyto.trustKeytoStrings.public_pkcs8
    - typings.trustKeyto.trustKeytoStrings.private_pkcs1
    - typings.trustKeyto.trustKeytoStrings.private_pkcs8
  */
  trait PEMKeySelector extends StObject
  object PEMKeySelector {
    
    inline def private_pkcs1: typings.trustKeyto.trustKeytoStrings.private_pkcs1 = "private_pkcs1".asInstanceOf[typings.trustKeyto.trustKeytoStrings.private_pkcs1]
    
    inline def private_pkcs8: typings.trustKeyto.trustKeytoStrings.private_pkcs8 = "private_pkcs8".asInstanceOf[typings.trustKeyto.trustKeytoStrings.private_pkcs8]
    
    inline def public_pkcs1: typings.trustKeyto.trustKeytoStrings.public_pkcs1 = "public_pkcs1".asInstanceOf[typings.trustKeyto.trustKeytoStrings.public_pkcs1]
    
    inline def public_pkcs8: typings.trustKeyto.trustKeytoStrings.public_pkcs8 = "public_pkcs8".asInstanceOf[typings.trustKeyto.trustKeytoStrings.public_pkcs8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trustKeyto.trustKeytoStrings.jwk
    - typings.trustKeyto.trustKeytoStrings.pem
    - typings.trustKeyto.trustKeytoStrings.blk
  */
  trait SerializableFormat extends StObject
  object SerializableFormat {
    
    inline def blk: typings.trustKeyto.trustKeytoStrings.blk = "blk".asInstanceOf[typings.trustKeyto.trustKeytoStrings.blk]
    
    inline def jwk: typings.trustKeyto.trustKeytoStrings.jwk = "jwk".asInstanceOf[typings.trustKeyto.trustKeytoStrings.jwk]
    
    inline def pem: typings.trustKeyto.trustKeytoStrings.pem = "pem".asInstanceOf[typings.trustKeyto.trustKeytoStrings.pem]
  }
}
