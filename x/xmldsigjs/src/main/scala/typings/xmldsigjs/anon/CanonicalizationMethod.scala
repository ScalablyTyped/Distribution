package typings.xmldsigjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanonicalizationMethod extends js.Object {
  
  var CanonicalizationMethod: String = js.native
  
  var DSAKeyValue: String = js.native
  
  var DigestMethod: String = js.native
  
  var DigestValue: String = js.native
  
  var DomainParameters: String = js.native
  
  var ECDSAKeyValue: String = js.native
  
  var EncryptedKey: String = js.native
  
  var Exponent: String = js.native
  
  var HMACOutputLength: String = js.native
  
  var KeyInfo: String = js.native
  
  var KeyName: String = js.native
  
  var KeyValue: String = js.native
  
  var Manifest: String = js.native
  
  var MaskGenerationFunction: String = js.native
  
  var MgmtData: String = js.native
  
  var Modulus: String = js.native
  
  var NamedCurve: String = js.native
  
  var Object: String = js.native
  
  var PGPData: String = js.native
  
  var PublicKey: String = js.native
  
  var RSAKeyValue: String = js.native
  
  var RSAPSSParams: String = js.native
  
  var Reference: String = js.native
  
  var RetrievalMethod: String = js.native
  
  var SPKIData: String = js.native
  
  var SPKIexp: String = js.native
  
  var SaltLength: String = js.native
  
  var Signature: String = js.native
  
  var SignatureMethod: String = js.native
  
  var SignatureValue: String = js.native
  
  var SignedInfo: String = js.native
  
  var Transform: String = js.native
  
  var Transforms: String = js.native
  
  var X: String = js.native
  
  var X509CRL: String = js.native
  
  var X509Certificate: String = js.native
  
  var X509Data: String = js.native
  
  var X509IssuerName: String = js.native
  
  var X509IssuerSerial: String = js.native
  
  var X509SKI: String = js.native
  
  var X509SerialNumber: String = js.native
  
  var X509SubjectName: String = js.native
  
  var XPath: String = js.native
  
  var Y: String = js.native
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
  implicit class CanonicalizationMethodOps[Self <: CanonicalizationMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanonicalizationMethod(value: String): Self = this.set("CanonicalizationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDSAKeyValue(value: String): Self = this.set("DSAKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestMethod(value: String): Self = this.set("DigestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestValue(value: String): Self = this.set("DigestValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainParameters(value: String): Self = this.set("DomainParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setECDSAKeyValue(value: String): Self = this.set("ECDSAKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedKey(value: String): Self = this.set("EncryptedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponent(value: String): Self = this.set("Exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHMACOutputLength(value: String): Self = this.set("HMACOutputLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyInfo(value: String): Self = this.set("KeyInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyName(value: String): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValue(value: String): Self = this.set("KeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: String): Self = this.set("Manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskGenerationFunction(value: String): Self = this.set("MaskGenerationFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMgmtData(value: String): Self = this.set("MgmtData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulus(value: String): Self = this.set("Modulus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedCurve(value: String): Self = this.set("NamedCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: String): Self = this.set("Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPGPData(value: String): Self = this.set("PGPData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSAKeyValue(value: String): Self = this.set("RSAKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSAPSSParams(value: String): Self = this.set("RSAPSSParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: String): Self = this.set("Reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalMethod(value: String): Self = this.set("RetrievalMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPKIData(value: String): Self = this.set("SPKIData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPKIexp(value: String): Self = this.set("SPKIexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLength(value: String): Self = this.set("SaltLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureMethod(value: String): Self = this.set("SignatureMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureValue(value: String): Self = this.set("SignatureValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedInfo(value: String): Self = this.set("SignedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: String): Self = this.set("Transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransforms(value: String): Self = this.set("Transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509CRL(value: String): Self = this.set("X509CRL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509Certificate(value: String): Self = this.set("X509Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509Data(value: String): Self = this.set("X509Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509IssuerName(value: String): Self = this.set("X509IssuerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509IssuerSerial(value: String): Self = this.set("X509IssuerSerial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509SKI(value: String): Self = this.set("X509SKI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509SerialNumber(value: String): Self = this.set("X509SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX509SubjectName(value: String): Self = this.set("X509SubjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPath(value: String): Self = this.set("XPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
}
