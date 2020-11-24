package typings.xmldsigjs

import typings.std.Uint8Array
import typings.xmldsigjs.pkiMod.X509Certificate
import typings.xmldsigjs.rsaKeyMod.RsaPSSSignParams
import typings.xmldsigjs.x509DataMod.X509IncludeOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/key_infos", JSImport.Namespace)
@js.native
object keyInfosMod extends js.Object {
  
  @js.native
  class DomainParameters ()
    extends typings.xmldsigjs.ecdsaKeyMod.DomainParameters
  
  @js.native
  class EcdsaKeyValue ()
    extends typings.xmldsigjs.ecdsaKeyMod.EcdsaKeyValue
  
  @js.native
  class EcdsaPublicKey ()
    extends typings.xmldsigjs.ecdsaKeyMod.EcdsaPublicKey
  
  @js.native
  abstract class KeyInfoClause ()
    extends typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause
  
  @js.native
  class KeyInfoX509Data ()
    extends typings.xmldsigjs.x509DataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @js.native
  class KeyValue ()
    extends typings.xmldsigjs.keyValueMod.KeyValue {
    def this(value: typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause) = this()
  }
  
  @js.native
  class MaskGenerationFunction ()
    extends typings.xmldsigjs.rsaKeyMod.MaskGenerationFunction
  
  @js.native
  class NamedCurve ()
    extends typings.xmldsigjs.ecdsaKeyMod.NamedCurve
  
  @js.native
  class PssAlgorithmParams ()
    extends typings.xmldsigjs.rsaKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  /* static members */
  @js.native
  object PssAlgorithmParams extends js.Object {
    
    def FromAlgorithm(algorithm: RsaPSSSignParams): typings.xmldsigjs.rsaKeyMod.PssAlgorithmParams = js.native
  }
  
  @js.native
  class RsaKeyValue ()
    extends typings.xmldsigjs.rsaKeyMod.RsaKeyValue
  
  @js.native
  class SPKIData ()
    extends typings.xmldsigjs.spkiDataMod.SPKIData
  
  @js.native
  object X509IncludeOption extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xmldsigjs.x509DataMod.X509IncludeOption with Double] = js.native
    
    /* 1 */ val EndCertOnly: typings.xmldsigjs.x509DataMod.X509IncludeOption.EndCertOnly with Double = js.native
    
    /* 2 */ val ExcludeRoot: typings.xmldsigjs.x509DataMod.X509IncludeOption.ExcludeRoot with Double = js.native
    
    /* 0 */ val None: typings.xmldsigjs.x509DataMod.X509IncludeOption.None with Double = js.native
    
    /* 3 */ val WholeChain: typings.xmldsigjs.x509DataMod.X509IncludeOption.WholeChain with Double = js.native
  }
  
  @js.native
  class X509IssuerSerial ()
    extends typings.xmldsigjs.x509DataMod.X509IssuerSerial
}
