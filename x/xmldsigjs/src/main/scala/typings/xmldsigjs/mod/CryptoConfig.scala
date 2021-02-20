package typings.xmldsigjs.mod

import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.xmldsigjs.algorithmMod.HashAlgorithm
import typings.xmldsigjs.algorithmMod.IHashAlgorithm
import typings.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
class CryptoConfig ()
  extends typings.xmldsigjs.cryptoConfigMod.CryptoConfig
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
  @JSImport("xmldsigjs", "CryptoConfig.CreateFromName")
  @js.native
  def CreateFromName(): typings.xmldsigjs.xmlMod.Transform = js.native
  @JSImport("xmldsigjs", "CryptoConfig.CreateFromName")
  @js.native
  def CreateFromName(name: String): typings.xmldsigjs.xmlMod.Transform = js.native
  
  @JSImport("xmldsigjs", "CryptoConfig.CreateHashAlgorithm")
  @js.native
  def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
  
  @JSImport("xmldsigjs", "CryptoConfig.CreateSignatureAlgorithm")
  @js.native
  def CreateSignatureAlgorithm(method: typings.xmldsigjs.signatureMethodMod.SignatureMethod): SignatureAlgorithm = js.native
  
  @JSImport("xmldsigjs", "CryptoConfig.GetHashAlgorithm")
  @js.native
  def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
  
  @JSImport("xmldsigjs", "CryptoConfig.GetSignatureAlgorithm")
  @js.native
  def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
}
