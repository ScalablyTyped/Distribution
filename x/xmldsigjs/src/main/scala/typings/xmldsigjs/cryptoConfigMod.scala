package typings.xmldsigjs

import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.xmldsigjs.algorithmMod.HashAlgorithm
import typings.xmldsigjs.algorithmMod.IHashAlgorithm
import typings.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import typings.xmldsigjs.signatureMethodMod.SignatureMethod
import typings.xmldsigjs.xmlMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/crypto_config", JSImport.Namespace)
@js.native
object cryptoConfigMod extends js.Object {
  @js.native
  class CryptoConfig () extends js.Object
  
  /* static members */
  @js.native
  object CryptoConfig extends js.Object {
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
    def CreateFromName(): Transform = js.native
    def CreateFromName(name: String): Transform = js.native
    def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
    def CreateSignatureAlgorithm(method: SignatureMethod): SignatureAlgorithm = js.native
    def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
    def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
  }
  
}

