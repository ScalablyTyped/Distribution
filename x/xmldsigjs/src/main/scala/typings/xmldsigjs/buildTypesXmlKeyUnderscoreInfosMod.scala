package typings.xmldsigjs

import typings.std.Uint8Array
import typings.xmldsigjs.buildTypesPkiMod.X509Certificate
import typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.RsaPSSSignParams
import typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos", JSImport.Namespace)
@js.native
object buildTypesXmlKeyUnderscoreInfosMod extends js.Object {
  @js.native
  class DomainParameters ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosEcdsaUnderscoreKeyMod.DomainParameters
  
  @js.native
  class EcdsaKeyValue ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosEcdsaUnderscoreKeyMod.EcdsaKeyValue
  
  @js.native
  class EcdsaPublicKey ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosEcdsaUnderscoreKeyMod.EcdsaPublicKey
  
  @js.native
  abstract class KeyInfoClause ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosKeyUnderscoreInfoUnderscoreClauseMod.KeyInfoClause
  
  @js.native
  class KeyInfoX509Data ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.KeyInfoX509Data {
    def this(cert: X509Certificate) = this()
    def this(rgbCert: Uint8Array) = this()
    def this(cert: X509Certificate, includeOptions: X509IncludeOption) = this()
  }
  
  @js.native
  class KeyValue ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosKeyUnderscoreValueMod.KeyValue {
    def this(value: typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosKeyUnderscoreInfoUnderscoreClauseMod.KeyInfoClause) = this()
  }
  
  @js.native
  class MaskGenerationFunction ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.MaskGenerationFunction
  
  @js.native
  class NamedCurve ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosEcdsaUnderscoreKeyMod.NamedCurve
  
  @js.native
  class PssAlgorithmParams ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.PssAlgorithmParams {
    def this(algorithm: RsaPSSSignParams) = this()
  }
  
  @js.native
  class RsaKeyValue ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.RsaKeyValue
  
  @js.native
  class SPKIData ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosSpkiUnderscoreDataMod.SPKIData
  
  @js.native
  class X509IssuerSerial ()
    extends typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IssuerSerial
  
  /* static members */
  @js.native
  object PssAlgorithmParams extends js.Object {
    def FromAlgorithm(algorithm: RsaPSSSignParams): typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosRsaUnderscoreKeyMod.PssAlgorithmParams = js.native
  }
  
  @js.native
  object X509IncludeOption extends js.Object {
    /* 1 */ val EndCertOnly: typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption.EndCertOnly with Double = js.native
    /* 2 */ val ExcludeRoot: typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption.ExcludeRoot with Double = js.native
    /* 0 */ val None: typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption.None with Double = js.native
    /* 3 */ val WholeChain: typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption.WholeChain with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod.X509IncludeOption with Double
      ] = js.native
  }
  
}

