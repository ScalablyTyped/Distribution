package typings.xmldsigjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var Algorithm: String
    
    var Encoding: String
    
    var Id: String
    
    var MimeType: String
    
    var Type: String
    
    var URI: String
  }
  object Algorithm {
    
    @scala.inline
    def apply(Algorithm: String, Encoding: String, Id: String, MimeType: String, Type: String, URI: String): Algorithm = {
      val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanonicalizationMethod extends StObject {
    
    var CanonicalizationMethod: String
    
    var DSAKeyValue: String
    
    var DigestMethod: String
    
    var DigestValue: String
    
    var DomainParameters: String
    
    var ECDSAKeyValue: String
    
    var EncryptedKey: String
    
    var Exponent: String
    
    var HMACOutputLength: String
    
    var KeyInfo: String
    
    var KeyName: String
    
    var KeyValue: String
    
    var Manifest: String
    
    var MaskGenerationFunction: String
    
    var MgmtData: String
    
    var Modulus: String
    
    var NamedCurve: String
    
    var Object: String
    
    var PGPData: String
    
    var PublicKey: String
    
    var RSAKeyValue: String
    
    var RSAPSSParams: String
    
    var Reference: String
    
    var RetrievalMethod: String
    
    var SPKIData: String
    
    var SPKIexp: String
    
    var SaltLength: String
    
    var Signature: String
    
    var SignatureMethod: String
    
    var SignatureValue: String
    
    var SignedInfo: String
    
    var Transform: String
    
    var Transforms: String
    
    var X: String
    
    var X509CRL: String
    
    var X509Certificate: String
    
    var X509Data: String
    
    var X509IssuerName: String
    
    var X509IssuerSerial: String
    
    var X509SKI: String
    
    var X509SerialNumber: String
    
    var X509SubjectName: String
    
    var XPath: String
    
    var Y: String
  }
  object CanonicalizationMethod {
    
    @scala.inline
    def apply(
      CanonicalizationMethod: String,
      DSAKeyValue: String,
      DigestMethod: String,
      DigestValue: String,
      DomainParameters: String,
      ECDSAKeyValue: String,
      EncryptedKey: String,
      Exponent: String,
      HMACOutputLength: String,
      KeyInfo: String,
      KeyName: String,
      KeyValue: String,
      Manifest: String,
      MaskGenerationFunction: String,
      MgmtData: String,
      Modulus: String,
      NamedCurve: String,
      Object: String,
      PGPData: String,
      PublicKey: String,
      RSAKeyValue: String,
      RSAPSSParams: String,
      Reference: String,
      RetrievalMethod: String,
      SPKIData: String,
      SPKIexp: String,
      SaltLength: String,
      Signature: String,
      SignatureMethod: String,
      SignatureValue: String,
      SignedInfo: String,
      Transform: String,
      Transforms: String,
      X: String,
      X509CRL: String,
      X509Certificate: String,
      X509Data: String,
      X509IssuerName: String,
      X509IssuerSerial: String,
      X509SKI: String,
      X509SerialNumber: String,
      X509SubjectName: String,
      XPath: String,
      Y: String
    ): CanonicalizationMethod = {
      val __obj = js.Dynamic.literal(CanonicalizationMethod = CanonicalizationMethod.asInstanceOf[js.Any], DSAKeyValue = DSAKeyValue.asInstanceOf[js.Any], DigestMethod = DigestMethod.asInstanceOf[js.Any], DigestValue = DigestValue.asInstanceOf[js.Any], DomainParameters = DomainParameters.asInstanceOf[js.Any], ECDSAKeyValue = ECDSAKeyValue.asInstanceOf[js.Any], EncryptedKey = EncryptedKey.asInstanceOf[js.Any], Exponent = Exponent.asInstanceOf[js.Any], HMACOutputLength = HMACOutputLength.asInstanceOf[js.Any], KeyInfo = KeyInfo.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], KeyValue = KeyValue.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], MaskGenerationFunction = MaskGenerationFunction.asInstanceOf[js.Any], MgmtData = MgmtData.asInstanceOf[js.Any], Modulus = Modulus.asInstanceOf[js.Any], NamedCurve = NamedCurve.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], PGPData = PGPData.asInstanceOf[js.Any], PublicKey = PublicKey.asInstanceOf[js.Any], RSAKeyValue = RSAKeyValue.asInstanceOf[js.Any], RSAPSSParams = RSAPSSParams.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], RetrievalMethod = RetrievalMethod.asInstanceOf[js.Any], SPKIData = SPKIData.asInstanceOf[js.Any], SPKIexp = SPKIexp.asInstanceOf[js.Any], SaltLength = SaltLength.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SignatureMethod = SignatureMethod.asInstanceOf[js.Any], SignatureValue = SignatureValue.asInstanceOf[js.Any], SignedInfo = SignedInfo.asInstanceOf[js.Any], Transform = Transform.asInstanceOf[js.Any], Transforms = Transforms.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], X509CRL = X509CRL.asInstanceOf[js.Any], X509Certificate = X509Certificate.asInstanceOf[js.Any], X509Data = X509Data.asInstanceOf[js.Any], X509IssuerName = X509IssuerName.asInstanceOf[js.Any], X509IssuerSerial = X509IssuerSerial.asInstanceOf[js.Any], X509SKI = X509SKI.asInstanceOf[js.Any], X509SerialNumber = X509SerialNumber.asInstanceOf[js.Any], X509SubjectName = X509SubjectName.asInstanceOf[js.Any], XPath = XPath.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanonicalizationMethod]
    }
    
    @scala.inline
    implicit class CanonicalizationMethodMutableBuilder[Self <: CanonicalizationMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanonicalizationMethod(value: String): Self = StObject.set(x, "CanonicalizationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDSAKeyValue(value: String): Self = StObject.set(x, "DSAKeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestMethod(value: String): Self = StObject.set(x, "DigestMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestValue(value: String): Self = StObject.set(x, "DigestValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainParameters(value: String): Self = StObject.set(x, "DomainParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setECDSAKeyValue(value: String): Self = StObject.set(x, "ECDSAKeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedKey(value: String): Self = StObject.set(x, "EncryptedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponent(value: String): Self = StObject.set(x, "Exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHMACOutputLength(value: String): Self = StObject.set(x, "HMACOutputLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyInfo(value: String): Self = StObject.set(x, "KeyInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyValue(value: String): Self = StObject.set(x, "KeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskGenerationFunction(value: String): Self = StObject.set(x, "MaskGenerationFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMgmtData(value: String): Self = StObject.set(x, "MgmtData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulus(value: String): Self = StObject.set(x, "Modulus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedCurve(value: String): Self = StObject.set(x, "NamedCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: String): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPGPData(value: String): Self = StObject.set(x, "PGPData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRSAKeyValue(value: String): Self = StObject.set(x, "RSAKeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRSAPSSParams(value: String): Self = StObject.set(x, "RSAPSSParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference(value: String): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetrievalMethod(value: String): Self = StObject.set(x, "RetrievalMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPKIData(value: String): Self = StObject.set(x, "SPKIData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPKIexp(value: String): Self = StObject.set(x, "SPKIexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltLength(value: String): Self = StObject.set(x, "SaltLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureMethod(value: String): Self = StObject.set(x, "SignatureMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureValue(value: String): Self = StObject.set(x, "SignatureValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedInfo(value: String): Self = StObject.set(x, "SignedInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "Transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransforms(value: String): Self = StObject.set(x, "Transforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX509CRL(value: String): Self = StObject.set(x, "X509CRL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX509Certificate(value: String): Self = StObject.set(x, "X509Certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX509Data(value: String): Self = StObject.set(x, "X509Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX509IssuerName(value: String): Self = StObject.set(x, "X509IssuerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX509IssuerSerial(value: String): Self = StObject.set(x, "X509IssuerSerial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX509SKI(value: String): Self = StObject.set(x, "X509SKI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX509SerialNumber(value: String): Self = StObject.set(x, "X509SerialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX509SubjectName(value: String): Self = StObject.set(x, "X509SubjectName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXPath(value: String): Self = StObject.set(x, "XPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Manifest extends StObject {
    
    var Manifest: String
  }
  object Manifest {
    
    @scala.inline
    def apply(Manifest: String): Manifest = {
      val __obj = js.Dynamic.literal(Manifest = Manifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest]
    }
    
    @scala.inline
    implicit class ManifestMutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlDecryptionTransform extends StObject {
    
    var XmlDecryptionTransform: String
    
    var XmlDsigBase64Transform: String
    
    var XmlDsigC14NTransform: String
    
    var XmlDsigC14NWithCommentsTransform: String
    
    var XmlDsigEnvelopedSignatureTransform: String
    
    var XmlDsigExcC14NTransform: String
    
    var XmlDsigExcC14NWithCommentsTransform: String
    
    var XmlDsigXPathTransform: String
    
    var XmlDsigXsltTransform: String
    
    var XmlLicenseTransform: String
  }
  object XmlDecryptionTransform {
    
    @scala.inline
    def apply(
      XmlDecryptionTransform: String,
      XmlDsigBase64Transform: String,
      XmlDsigC14NTransform: String,
      XmlDsigC14NWithCommentsTransform: String,
      XmlDsigEnvelopedSignatureTransform: String,
      XmlDsigExcC14NTransform: String,
      XmlDsigExcC14NWithCommentsTransform: String,
      XmlDsigXPathTransform: String,
      XmlDsigXsltTransform: String,
      XmlLicenseTransform: String
    ): XmlDecryptionTransform = {
      val __obj = js.Dynamic.literal(XmlDecryptionTransform = XmlDecryptionTransform.asInstanceOf[js.Any], XmlDsigBase64Transform = XmlDsigBase64Transform.asInstanceOf[js.Any], XmlDsigC14NTransform = XmlDsigC14NTransform.asInstanceOf[js.Any], XmlDsigC14NWithCommentsTransform = XmlDsigC14NWithCommentsTransform.asInstanceOf[js.Any], XmlDsigEnvelopedSignatureTransform = XmlDsigEnvelopedSignatureTransform.asInstanceOf[js.Any], XmlDsigExcC14NTransform = XmlDsigExcC14NTransform.asInstanceOf[js.Any], XmlDsigExcC14NWithCommentsTransform = XmlDsigExcC14NWithCommentsTransform.asInstanceOf[js.Any], XmlDsigXPathTransform = XmlDsigXPathTransform.asInstanceOf[js.Any], XmlDsigXsltTransform = XmlDsigXsltTransform.asInstanceOf[js.Any], XmlLicenseTransform = XmlLicenseTransform.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlDecryptionTransform]
    }
    
    @scala.inline
    implicit class XmlDecryptionTransformMutableBuilder[Self <: XmlDecryptionTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXmlDecryptionTransform(value: String): Self = StObject.set(x, "XmlDecryptionTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigBase64Transform(value: String): Self = StObject.set(x, "XmlDsigBase64Transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigC14NTransform(value: String): Self = StObject.set(x, "XmlDsigC14NTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigC14NWithCommentsTransform(value: String): Self = StObject.set(x, "XmlDsigC14NWithCommentsTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigEnvelopedSignatureTransform(value: String): Self = StObject.set(x, "XmlDsigEnvelopedSignatureTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigExcC14NTransform(value: String): Self = StObject.set(x, "XmlDsigExcC14NTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigExcC14NWithCommentsTransform(value: String): Self = StObject.set(x, "XmlDsigExcC14NWithCommentsTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigXPathTransform(value: String): Self = StObject.set(x, "XmlDsigXPathTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDsigXsltTransform(value: String): Self = StObject.set(x, "XmlDsigXsltTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlLicenseTransform(value: String): Self = StObject.set(x, "XmlLicenseTransform", value.asInstanceOf[js.Any])
    }
  }
}
