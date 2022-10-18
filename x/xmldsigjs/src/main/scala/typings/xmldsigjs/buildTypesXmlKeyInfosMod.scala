package typings.xmldsigjs

import typings.xmldsigjs.buildTypesPkiMod.X509Certificate
import typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.RsaPSSSignParams
import typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlKeyInfosMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "DomainParameters")
  @js.native
  open class DomainParameters ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.DomainParameters {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "EcdsaKeyValue")
  @js.native
  open class EcdsaKeyValue ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.EcdsaKeyValue {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "EcdsaPublicKey")
  @js.native
  open class EcdsaPublicKey ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.EcdsaPublicKey {
    def this(properties: js.Object) = this()
  }
  
  /* note: abstract class */ @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyInfoClause")
  @js.native
  open class KeyInfoClause ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosKeyInfoClauseMod.KeyInfoClause {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyInfoX509Data")
  @js.native
  open class KeyInfoX509Data ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: js.typedarray.Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyValue")
  @js.native
  open class KeyValue ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosKeyValueMod.KeyValue {
    def this(value: typings.xmldsigjs.buildTypesXmlKeyInfosKeyInfoClauseMod.KeyInfoClause) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "MaskGenerationFunction")
  @js.native
  open class MaskGenerationFunction ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.MaskGenerationFunction {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "NamedCurve")
  @js.native
  open class NamedCurve ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosEcdsaKeyMod.NamedCurve {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "PssAlgorithmParams")
  @js.native
  open class PssAlgorithmParams ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  /* static members */
  object PssAlgorithmParams {
    
    @JSImport("xmldsigjs/build/types/xml/key_infos", "PssAlgorithmParams")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FromAlgorithm(algorithm: RsaPSSSignParams): typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.PssAlgorithmParams = ^.asInstanceOf[js.Dynamic].applyDynamic("FromAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.PssAlgorithmParams]
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "RsaKeyValue")
  @js.native
  open class RsaKeyValue ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.RsaKeyValue {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "SPKIData")
  @js.native
  open class SPKIData ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosSpkiDataMod.SPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "X509IncludeOption")
  @js.native
  object X509IncludeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption & Double] = js.native
    
    /* 1 */ val EndCertOnly: typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption.EndCertOnly & Double = js.native
    
    /* 2 */ val ExcludeRoot: typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption.ExcludeRoot & Double = js.native
    
    /* 0 */ val None: typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption.None & Double = js.native
    
    /* 3 */ val WholeChain: typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption.WholeChain & Double = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "X509IssuerSerial")
  @js.native
  open class X509IssuerSerial ()
    extends typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IssuerSerial {
    def this(properties: js.Object) = this()
  }
}
