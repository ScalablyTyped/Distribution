package typings.xmldsigjs

import typings.std.CryptoKey
import typings.std.JsonWebKey
import typings.xmlCore.mod.XmlObject
import typings.xmldsigjs.buildTypesXmlKeyInfosKeyInfoClauseMod.KeyInfoClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlKeyInfosEcdsaKeyMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "DomainParameters")
  @js.native
  open class DomainParameters () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var NamedCurve: typings.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.NamedCurve = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "EcdsaKeyValue")
  @js.native
  open class EcdsaKeyValue () extends KeyInfoClause {
    def this(properties: js.Object) = this()
    
    var DomainParameters: typings.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.DomainParameters = js.native
    
    /**
      * Gets the NamedCurve value of then public key
      */
    def NamedCurve: String = js.native
    
    var PublicKey: EcdsaPublicKey = js.native
    
    /* protected */ var jwk: JsonWebKey | Null = js.native
    
    /* protected */ var key: CryptoKey | Null = js.native
    
    /* protected */ var keyUsage: js.Array[String] | Null = js.native
    
    /* protected */ var name: String = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "EcdsaPublicKey")
  @js.native
  open class EcdsaPublicKey () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var X: js.typedarray.Uint8Array = js.native
    
    var Y: js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/ecdsa_key", "NamedCurve")
  @js.native
  open class NamedCurve () extends XmlObject {
    def this(properties: js.Object) = this()
    
    var Uri: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.xmldsigjs.xmldsigjsStrings.`P-256`
    - typings.xmldsigjs.xmldsigjsStrings.`P-384`
    - typings.xmldsigjs.xmldsigjsStrings.`P-521`
  */
  type NamedCurveType = _NamedCurveType | String
  
  trait _NamedCurveType extends StObject
}
