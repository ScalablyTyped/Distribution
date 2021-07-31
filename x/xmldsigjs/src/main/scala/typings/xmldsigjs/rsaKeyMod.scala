package typings.xmldsigjs

import typings.std.AlgorithmIdentifier
import typings.std.CryptoKey
import typings.std.JsonWebKey
import typings.std.RsaPssParams
import typings.std.Uint8Array
import typings.xmlCore.mod.XmlObject
import typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaKeyMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "MaskGenerationFunction")
  @js.native
  class MaskGenerationFunction () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var Algorithm: String = js.native
    
    var DigestMethod: typings.xmldsigjs.digestMethodMod.DigestMethod = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "PssAlgorithmParams")
  @js.native
  class PssAlgorithmParams () extends XmlObject {
    def this(algorithm: RsaPSSSignParams) = this()
    
    var DigestMethod: typings.xmldsigjs.digestMethodMod.DigestMethod = js.native
    
    def FromAlgorithm(algorithm: RsaPSSSignParams): Unit = js.native
    
    var MGF: MaskGenerationFunction = js.native
    
    var SaltLength: Double = js.native
    
    var TrailerField: Double = js.native
  }
  /* static members */
  object PssAlgorithmParams {
    
    @JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "PssAlgorithmParams")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def FromAlgorithm(algorithm: RsaPSSSignParams): PssAlgorithmParams = ^.asInstanceOf[js.Dynamic].applyDynamic("FromAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[PssAlgorithmParams]
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/rsa_key", "RsaKeyValue")
  @js.native
  class RsaKeyValue () extends KeyInfoClause {
    def this(properties: js.Object) = this()
    
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
  
  trait IJwkRsa extends StObject {
    
    var alg: String
    
    var e: String
    
    var ext: Boolean
    
    var kty: String
    
    var n: String
  }
  object IJwkRsa {
    
    @scala.inline
    def apply(alg: String, e: String, ext: Boolean, kty: String, n: String): IJwkRsa = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJwkRsa]
    }
    
    @scala.inline
    implicit class IJwkRsaMutableBuilder[Self <: IJwkRsa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  trait RsaPSSSignParams
    extends StObject
       with RsaPssParams {
    
    var hash: AlgorithmIdentifier
  }
  object RsaPSSSignParams {
    
    @scala.inline
    def apply(hash: AlgorithmIdentifier, name: String, saltLength: Double): RsaPSSSignParams = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[RsaPSSSignParams]
    }
    
    @scala.inline
    implicit class RsaPSSSignParamsMutableBuilder[Self <: RsaPSSSignParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: AlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
}
