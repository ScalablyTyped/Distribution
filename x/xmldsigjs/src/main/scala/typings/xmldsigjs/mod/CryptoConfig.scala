package typings.xmldsigjs.mod

import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.xmldsigjs.buildTypesAlgorithmMod.HashAlgorithm
import typings.xmldsigjs.buildTypesAlgorithmMod.IHashAlgorithm
import typings.xmldsigjs.buildTypesAlgorithmMod.ISignatureAlgorithm
import typings.xmldsigjs.buildTypesAlgorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
open class CryptoConfig ()
  extends typings.xmldsigjs.buildTypesCryptoConfigMod.CryptoConfig
/* static members */
object CryptoConfig {
  
  @JSImport("xmldsigjs", "CryptoConfig")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def CreateFromName(): typings.xmldsigjs.buildTypesXmlMod.Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromName")().asInstanceOf[typings.xmldsigjs.buildTypesXmlMod.Transform]
  inline def CreateFromName(name: String): typings.xmldsigjs.buildTypesXmlMod.Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromName")(name.asInstanceOf[js.Any]).asInstanceOf[typings.xmldsigjs.buildTypesXmlMod.Transform]
  
  inline def CreateHashAlgorithm(namespace: String): HashAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHashAlgorithm")(namespace.asInstanceOf[js.Any]).asInstanceOf[HashAlgorithm]
  
  inline def CreateSignatureAlgorithm(method: typings.xmldsigjs.buildTypesXmlSignatureMethodMod.SignatureMethod): SignatureAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSignatureAlgorithm")(method.asInstanceOf[js.Any]).asInstanceOf[SignatureAlgorithm]
  
  inline def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHashAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[IHashAlgorithm]
  
  inline def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSignatureAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[ISignatureAlgorithm]
}
