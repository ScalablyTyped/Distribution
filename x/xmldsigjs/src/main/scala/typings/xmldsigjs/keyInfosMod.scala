package typings.xmldsigjs

import typings.std.Uint8Array
import typings.xmldsigjs.pkiMod.X509Certificate
import typings.xmldsigjs.rsaKeyMod.RsaPSSSignParams
import typings.xmldsigjs.x509DataMod.X509IncludeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyInfosMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "DomainParameters")
  @js.native
  class DomainParameters ()
    extends typings.xmldsigjs.ecdsaKeyMod.DomainParameters {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "EcdsaKeyValue")
  @js.native
  class EcdsaKeyValue ()
    extends typings.xmldsigjs.ecdsaKeyMod.EcdsaKeyValue {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "EcdsaPublicKey")
  @js.native
  class EcdsaPublicKey ()
    extends typings.xmldsigjs.ecdsaKeyMod.EcdsaPublicKey {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyInfoClause")
  @js.native
  abstract class KeyInfoClause ()
    extends typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyInfoX509Data")
  @js.native
  class KeyInfoX509Data ()
    extends typings.xmldsigjs.x509DataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "KeyValue")
  @js.native
  class KeyValue ()
    extends typings.xmldsigjs.keyValueMod.KeyValue {
    def this(value: typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "MaskGenerationFunction")
  @js.native
  class MaskGenerationFunction ()
    extends typings.xmldsigjs.rsaKeyMod.MaskGenerationFunction {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "NamedCurve")
  @js.native
  class NamedCurve ()
    extends typings.xmldsigjs.ecdsaKeyMod.NamedCurve {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "PssAlgorithmParams")
  @js.native
  class PssAlgorithmParams ()
    extends typings.xmldsigjs.rsaKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  /* static members */
  object PssAlgorithmParams {
    
    @JSImport("xmldsigjs/build/types/xml/key_infos", "PssAlgorithmParams.FromAlgorithm")
    @js.native
    def FromAlgorithm(algorithm: RsaPSSSignParams): typings.xmldsigjs.rsaKeyMod.PssAlgorithmParams = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "RsaKeyValue")
  @js.native
  class RsaKeyValue ()
    extends typings.xmldsigjs.rsaKeyMod.RsaKeyValue {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "SPKIData")
  @js.native
  class SPKIData ()
    extends typings.xmldsigjs.spkiDataMod.SPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "X509IncludeOption")
  @js.native
  object X509IncludeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xmldsigjs.x509DataMod.X509IncludeOption with Double] = js.native
    
    /* 1 */ val EndCertOnly: typings.xmldsigjs.x509DataMod.X509IncludeOption.EndCertOnly with Double = js.native
    
    /* 2 */ val ExcludeRoot: typings.xmldsigjs.x509DataMod.X509IncludeOption.ExcludeRoot with Double = js.native
    
    /* 0 */ val None: typings.xmldsigjs.x509DataMod.X509IncludeOption.None with Double = js.native
    
    /* 3 */ val WholeChain: typings.xmldsigjs.x509DataMod.X509IncludeOption.WholeChain with Double = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/key_infos", "X509IssuerSerial")
  @js.native
  class X509IssuerSerial ()
    extends typings.xmldsigjs.x509DataMod.X509IssuerSerial {
    def this(properties: js.Object) = this()
  }
}
