package typings.xmldsigjs

import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.xmldsigjs.algorithmMod.HashAlgorithm
import typings.xmldsigjs.algorithmMod.IHashAlgorithm
import typings.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import typings.xmldsigjs.signatureMethodMod.SignatureMethod
import typings.xmldsigjs.xmlMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoConfigMod {
  
  @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig")
  @js.native
  class CryptoConfig () extends StObject
  /* static members */
  object CryptoConfig {
    
    /**
      * Creates Transform from given name
      * if name is not exist then throws error
      *
      * @static
      * @param {(string |)} [name=null]
      * @returns
      *
      * @memberOf CryptoConfig
      */
    @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig.CreateFromName")
    @js.native
    def CreateFromName(): Transform = js.native
    @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig.CreateFromName")
    @js.native
    def CreateFromName(name: String): Transform = js.native
    
    @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig.CreateHashAlgorithm")
    @js.native
    def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
    
    @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig.CreateSignatureAlgorithm")
    @js.native
    def CreateSignatureAlgorithm(method: SignatureMethod): SignatureAlgorithm = js.native
    
    @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig.GetHashAlgorithm")
    @js.native
    def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
    
    @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig.GetSignatureAlgorithm")
    @js.native
    def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
  }
}
