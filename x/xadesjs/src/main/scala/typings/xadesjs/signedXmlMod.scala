package typings.xadesjs

import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.std.CryptoKey
import typings.std.Date
import typings.std.Document
import typings.std.Element
import typings.xadesjs.objectIdentifierMod.IdentifierQualifier
import typings.xadesjs.xmlMod.QualifyingProperties
import typings.xmldsigjs.mod.Signature
import typings.xmldsigjs.mod.X509Certificate
import typings.xmldsigjs.signedXmlMod.OptionsSign
import typings.xmldsigjs.signedXmlMod.OptionsSignTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signedXmlMod {
  
  @JSImport("xadesjs/build/types/signed_xml", "SignedXml")
  @js.native
  class SignedXml ()
    extends typings.xmldsigjs.mod.SignedXml {
    def this(node: Document) = this()
    def this(node: Element) = this()
    
    /* protected */ def ApplySignOptions(signature: Signature, algorithm: Algorithm, key: CryptoKey, options: OptionsXAdES): js.Promise[Unit] = js.native
    
    /* protected */ def ApplySignaturePolicyIdentifier(): js.Promise[Unit] = js.native
    /* protected */ def ApplySignaturePolicyIdentifier(options: Boolean): js.Promise[Unit] = js.native
    /* protected */ def ApplySignaturePolicyIdentifier(options: OptionsPolicyId): js.Promise[Unit] = js.native
    
    /* protected */ def ApplySignatureProductionPlace(): Unit = js.native
    /* protected */ def ApplySignatureProductionPlace(options: OptionsProductionPlace): Unit = js.native
    
    /* protected */ def ApplySignerRoles(): Unit = js.native
    /* protected */ def ApplySignerRoles(options: OptionsSignerRole): Unit = js.native
    
    /* protected */ def ApplySigningCertificate(): js.Promise[Unit] = js.native
    /* protected */ def ApplySigningCertificate(base64string: String): js.Promise[Unit] = js.native
    
    /* protected */ def ApplySigningCertificateV2(): js.Promise[Unit] = js.native
    /* protected */ def ApplySigningCertificateV2(base64string: String): js.Promise[Unit] = js.native
    
    /* protected */ def CreateQualifyingProperties(): Unit = js.native
    
    def LoadXml(value: String, useContainer: Boolean): Unit = js.native
    def LoadXml(value: Element, useContainer: Boolean): Unit = js.native
    
    def Properties: QualifyingProperties | Null = js.native
    
    def Sign(algorithm: Algorithm, key: CryptoKey, data: Document, options: OptionsXAdES): js.Promise[Signature] = js.native
    
    def SignedProperties: typings.xadesjs.xmlMod.SignedProperties = js.native
    
    def UnsignedProperties: typings.xadesjs.xmlMod.UnsignedProperties = js.native
    
    /* protected */ def VerifySigningCertificate(): js.Promise[X509Certificate | Null] = js.native
    
    var properties: QualifyingProperties | Null = js.native
  }
  
  trait OptionsNoticeReference extends StObject {
    
    var noticeNumbers: js.Array[Double]
    
    var organization: String
  }
  object OptionsNoticeReference {
    
    @scala.inline
    def apply(noticeNumbers: js.Array[Double], organization: String): OptionsNoticeReference = {
      val __obj = js.Dynamic.literal(noticeNumbers = noticeNumbers.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsNoticeReference]
    }
    
    @scala.inline
    implicit class OptionsNoticeReferenceMutableBuilder[Self <: OptionsNoticeReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoticeNumbers(value: js.Array[Double]): Self = StObject.set(x, "noticeNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeNumbersVarargs(value: Double*): Self = StObject.set(x, "noticeNumbers", js.Array(value :_*))
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsPolicyId extends StObject {
    
    var digestValue: js.UndefOr[String] = js.undefined
    
    var hash: AlgorithmIdentifier
    
    var identifier: OptionsPolicyIdentifier
    
    var qualifiers: js.UndefOr[js.Array[OptionsPolicyUserNotice | String]] = js.undefined
    
    var transforms: js.UndefOr[js.Array[OptionsSignTransform]] = js.undefined
  }
  object OptionsPolicyId {
    
    @scala.inline
    def apply(hash: AlgorithmIdentifier, identifier: OptionsPolicyIdentifier): OptionsPolicyId = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsPolicyId]
    }
    
    @scala.inline
    implicit class OptionsPolicyIdMutableBuilder[Self <: OptionsPolicyId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigestValue(value: String): Self = StObject.set(x, "digestValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestValueUndefined: Self = StObject.set(x, "digestValue", js.undefined)
      
      @scala.inline
      def setHash(value: AlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: OptionsPolicyIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifiers(value: js.Array[OptionsPolicyUserNotice | String]): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifiersUndefined: Self = StObject.set(x, "qualifiers", js.undefined)
      
      @scala.inline
      def setQualifiersVarargs(value: (OptionsPolicyUserNotice | String)*): Self = StObject.set(x, "qualifiers", js.Array(value :_*))
      
      @scala.inline
      def setTransforms(value: js.Array[OptionsSignTransform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      @scala.inline
      def setTransformsVarargs(value: OptionsSignTransform*): Self = StObject.set(x, "transforms", js.Array(value :_*))
    }
  }
  
  trait OptionsPolicyIdentifier extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var qualifier: js.UndefOr[IdentifierQualifier] = js.undefined
    
    var references: js.UndefOr[js.Array[String]] = js.undefined
    
    var value: String
  }
  object OptionsPolicyIdentifier {
    
    @scala.inline
    def apply(value: String): OptionsPolicyIdentifier = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsPolicyIdentifier]
    }
    
    @scala.inline
    implicit class OptionsPolicyIdentifierMutableBuilder[Self <: OptionsPolicyIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setQualifier(value: IdentifierQualifier): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
      
      @scala.inline
      def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsPolicyUserNotice extends StObject {
    
    var explicitText: js.UndefOr[String] = js.undefined
    
    var noticeRef: js.UndefOr[OptionsNoticeReference] = js.undefined
  }
  object OptionsPolicyUserNotice {
    
    @scala.inline
    def apply(): OptionsPolicyUserNotice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsPolicyUserNotice]
    }
    
    @scala.inline
    implicit class OptionsPolicyUserNoticeMutableBuilder[Self <: OptionsPolicyUserNotice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExplicitText(value: String): Self = StObject.set(x, "explicitText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitTextUndefined: Self = StObject.set(x, "explicitText", js.undefined)
      
      @scala.inline
      def setNoticeRef(value: OptionsNoticeReference): Self = StObject.set(x, "noticeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeRefUndefined: Self = StObject.set(x, "noticeRef", js.undefined)
    }
  }
  
  trait OptionsProductionPlace extends StObject {
    
    var city: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object OptionsProductionPlace {
    
    @scala.inline
    def apply(): OptionsProductionPlace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsProductionPlace]
    }
    
    @scala.inline
    implicit class OptionsProductionPlaceMutableBuilder[Self <: OptionsProductionPlace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait OptionsSignerRole extends StObject {
    
    var certified: js.UndefOr[js.Array[String]] = js.undefined
    
    var claimed: js.UndefOr[js.Array[String]] = js.undefined
  }
  object OptionsSignerRole {
    
    @scala.inline
    def apply(): OptionsSignerRole = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSignerRole]
    }
    
    @scala.inline
    implicit class OptionsSignerRoleMutableBuilder[Self <: OptionsSignerRole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertified(value: js.Array[String]): Self = StObject.set(x, "certified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertifiedUndefined: Self = StObject.set(x, "certified", js.undefined)
      
      @scala.inline
      def setCertifiedVarargs(value: String*): Self = StObject.set(x, "certified", js.Array(value :_*))
      
      @scala.inline
      def setClaimed(value: js.Array[String]): Self = StObject.set(x, "claimed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClaimedUndefined: Self = StObject.set(x, "claimed", js.undefined)
      
      @scala.inline
      def setClaimedVarargs(value: String*): Self = StObject.set(x, "claimed", js.Array(value :_*))
    }
  }
  
  trait OptionsSigningTime extends StObject {
    
    /**
      * Format of the signing time. Default format is ISO
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Signing time value. Default value if now
      */
    var value: js.UndefOr[Date] = js.undefined
  }
  object OptionsSigningTime {
    
    @scala.inline
    def apply(): OptionsSigningTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSigningTime]
    }
    
    @scala.inline
    implicit class OptionsSigningTimeMutableBuilder[Self <: OptionsSigningTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OptionsXAdES
    extends StObject
       with OptionsSign {
    
    var policy: js.UndefOr[OptionsPolicyId | Boolean] = js.undefined
    
    var productionPlace: js.UndefOr[OptionsProductionPlace] = js.undefined
    
    var signerRole: js.UndefOr[OptionsSignerRole] = js.undefined
    
    /**
      * Sets a certificate of signer for signature. Optional
      *
      * @type {string} base64 string of X509 certificate
      * @memberOf OptionsXAdES
      */
    var signingCertificate: js.UndefOr[String] = js.undefined
    
    /**
      * Sets a certificate of signer for signature. Optional
      *
      * @type {string} base64 string of X509 certificate
      * @memberOf OptionsXAdES
      */
    var signingCertificateV2: js.UndefOr[String] = js.undefined
    
    /**
      * Sets signing time options
      */
    var signingTime: js.UndefOr[OptionsSigningTime] = js.undefined
  }
  object OptionsXAdES {
    
    @scala.inline
    def apply(): OptionsXAdES = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsXAdES]
    }
    
    @scala.inline
    implicit class OptionsXAdESMutableBuilder[Self <: OptionsXAdES] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: OptionsPolicyId | Boolean): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setProductionPlace(value: OptionsProductionPlace): Self = StObject.set(x, "productionPlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionPlaceUndefined: Self = StObject.set(x, "productionPlace", js.undefined)
      
      @scala.inline
      def setSignerRole(value: OptionsSignerRole): Self = StObject.set(x, "signerRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerRoleUndefined: Self = StObject.set(x, "signerRole", js.undefined)
      
      @scala.inline
      def setSigningCertificate(value: String): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningCertificateUndefined: Self = StObject.set(x, "signingCertificate", js.undefined)
      
      @scala.inline
      def setSigningCertificateV2(value: String): Self = StObject.set(x, "signingCertificateV2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningCertificateV2Undefined: Self = StObject.set(x, "signingCertificateV2", js.undefined)
      
      @scala.inline
      def setSigningTime(value: OptionsSigningTime): Self = StObject.set(x, "signingTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningTimeUndefined: Self = StObject.set(x, "signingTime", js.undefined)
    }
  }
}
