package typings
package xadesjsLib.xadesjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "xml")
@js.native
object xmlNs extends js.Object {
  @js.native
  class AllDataObjectsTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class AllDataObjectsTimeStampCollection () extends XadesCollection[AllDataObjectsTimeStamp]
  
  @js.native
  class Any () extends XadesObject {
    var Value: java.lang.String = js.native
  }
  
  @js.native
  class AnyCollection () extends XadesCollection[XadesObject]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - xadesjsLib.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class ArchiveTimeStamp () extends XAdESTimeStamp
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - xadesjsLib.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class AttrAuthoritiesCertValues () extends CertificateValues
  
  @js.native
  class AttributeCertificateRefs () extends CompleteCertificateRefs
  
  @js.native
  class AttributeRevocationRefs () extends CompleteRevocationRefs
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - xadesjsLib.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class AttributeRevocationValues () extends RevocationValues
  
  @js.native
  class CRLIdentifier () extends XadesObject {
    var IssueTime: XadesDateTime = js.native
    var Issuer: java.lang.String = js.native
    var Number: scala.Double = js.native
    var URI: java.lang.String = js.native
  }
  
  @js.native
  class CRLRef () extends XadesObject {
    var CRLIdentifier: xadesjsLib.xadesjsMod.xmlNs.CRLIdentifier = js.native
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
  }
  
  @js.native
  class CRLRefs () extends XadesCollection[CRLRef]
  
  @js.native
  class CRLValues () extends XadesCollection[EncapsulatedCRLValue]
  
  @js.native
  class Cert () extends XadesObject {
    var CertDigest: DigestAlgAndValueType = js.native
    var IssuerSerial: xmldsigjsLib.xmldsigjsMod.X509IssuerSerial = js.native
    var Uri: java.lang.String = js.native
  }
  
  @js.native
  class CertIDList () extends XadesCollection[Cert]
  
  @js.native
  class CertificateValues () extends XadesObject {
    var EncapsulatedX509Certificates: EncapsulatedX509CertificateCollection = js.native
    var Id: java.lang.String = js.native
    var OtherCertificates: OtherCertificateCollection = js.native
  }
  
  @js.native
  class CertifiedRole () extends EncapsulatedPKIData
  
  @js.native
  class CertifiedRoles () extends XadesCollection[CertifiedRole]
  
  @js.native
  class ClaimedRole () extends Any
  
  @js.native
  class ClaimedRoles () extends XadesCollection[ClaimedRole]
  
  @js.native
  class CommitmentTypeIndication () extends XadesObject {
    var AllSignedDataObjects: scala.Boolean = js.native
    var CommitmentTypeId: ObjectIdentifier = js.native
    var CommitmentTypeQualifiers: xadesjsLib.xadesjsMod.xmlNs.CommitmentTypeQualifiers = js.native
    var ObjectReference: ObjectReferenceCollection = js.native
  }
  
  @js.native
  class CommitmentTypeIndicationCollection () extends XadesCollection[CommitmentTypeIndication]
  
  @js.native
  class CommitmentTypeQualifier () extends Any
  
  @js.native
  class CommitmentTypeQualifiers () extends XadesCollection[CommitmentTypeQualifier]
  
  @js.native
  class CompleteCertificateRefs () extends UnsignedSignatureProperty {
    var CertRefs: CertIDList = js.native
    var Id: java.lang.String = js.native
  }
  
  @js.native
  class CompleteRevocationRefs () extends UnsignedSignatureProperty {
    var CRLRefs: xadesjsLib.xadesjsMod.xmlNs.CRLRefs = js.native
    var Id: java.lang.String = js.native
    var OCSPRefs: xadesjsLib.xadesjsMod.xmlNs.OCSPRefs = js.native
    var OtherRefs: xadesjsLib.xadesjsMod.xmlNs.OtherRefs = js.native
  }
  
  @js.native
  class CounterSignature () extends UnsignedSignatureProperty {
    var Signature: xmldsigjsLib.xmldsigjsMod.Signature = js.native
  }
  
  @js.native
  class DataObject ()
    extends xmldsigjsLib.xmldsigjsMod.DataObject {
    var QualifyingProperties: xadesjsLib.xadesjsMod.xmlNs.QualifyingProperties = js.native
  }
  
  @js.native
  class DataObjectFormat () extends XadesObject {
    var Description: java.lang.String = js.native
    var Encoding: java.lang.String = js.native
    var MimeType: java.lang.String = js.native
    var ObjectIdentifier: xadesjsLib.xadesjsMod.xmlNs.ObjectIdentifier = js.native
    var ObjectReference: java.lang.String = js.native
  }
  
  @js.native
  class DataObjectFormatCollection () extends XadesCollection[DataObjectFormat]
  
  @js.native
  class DigestAlgAndValueType () extends XadesObject {
    var DigestMethod: xmldsigjsLib.xmldsigjsMod.DigestMethod = js.native
    var DigestValue: stdLib.Uint8Array = js.native
  }
  
  @js.native
  class DocumentationReference () extends XadesObject {
    var Uri: java.lang.String = js.native
  }
  
  @js.native
  class DocumentationReferences () extends XadesCollection[DocumentationReference]
  
  @js.native
  class EncapsulatedCRLValue () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedOCSPValue () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedPKIData () extends XadesObject {
    var Encoding: EncodingType = js.native
    var Id: java.lang.String = js.native
    var Value: stdLib.Uint8Array = js.native
  }
  
  @js.native
  class EncapsulatedTimeStamp () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedTimeStampCollection () extends XadesCollection[EncapsulatedTimeStamp]
  
  @js.native
  class EncapsulatedX509Certificate () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedX509CertificateCollection () extends XadesCollection[EncapsulatedX509Certificate]
  
  @js.native
  class GenericTimeStamp () extends XadesObject {
    var CanonicalizationMethod: xmldsigjsLib.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: java.lang.String = js.native
    var Include: xadesjsLib.xadesjsMod.xmlNs.Include = js.native
    var ReferenceInfo: ReferenceInfos = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
  @js.native
  class Identifier () extends XadesObject {
    var Qualifier: xadesjsLib.xadesjsLibStrings.OIDAsURI | xadesjsLib.xadesjsLibStrings.OIDAsURN = js.native
    var Value: java.lang.String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - xadesjsLib.xadesjsLibStrings.OIDAsURI
    - xadesjsLib.xadesjsLibStrings.OIDAsURN
  */
  trait IdentifierQualifier extends js.Object
  
  @js.native
  class Include () extends XadesObject {
    var ReferencedData: scala.Boolean = js.native
    var Uri: java.lang.String = js.native
  }
  
  @js.native
  class IndividualDataObjectsTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class IndividualDataObjectsTimeStampCollection () extends XadesCollection[IndividualDataObjectsTimeStamp]
  
  @js.native
  class Integer () extends XadesObject {
    var Value: scala.Double = js.native
  }
  
  @js.native
  class IntegerList () extends XadesCollection[Integer]
  
  @js.native
  class IssuerSerial ()
    extends xmldsigjsLib.xmldsigjsMod.X509IssuerSerial
  
  @js.native
  class NoticeReference () extends XadesObject {
    var NoticeNumbers: IntegerList = js.native
    var Organization: java.lang.String = js.native
  }
  
  @js.native
  class OCSPIdentifier () extends XadesObject {
    var ProducedAt: XadesDateTime = js.native
    var ResponderID: xadesjsLib.xadesjsMod.xmlNs.ResponderID = js.native
    var URI: java.lang.String = js.native
  }
  
  @js.native
  class OCSPRef () extends XadesObject {
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
    var OCSPIdentifier: xadesjsLib.xadesjsMod.xmlNs.OCSPIdentifier = js.native
  }
  
  @js.native
  class OCSPRefs () extends XadesCollection[OCSPRef]
  
  @js.native
  class OCSPValues () extends XadesCollection[EncapsulatedOCSPValue]
  
  @js.native
  class ObjectIdentifier () extends XadesObject {
    var Description: java.lang.String = js.native
    var DocumentationReferences: xadesjsLib.xadesjsMod.xmlNs.DocumentationReferences = js.native
    var Identifier: xadesjsLib.xadesjsMod.xmlNs.Identifier = js.native
  }
  
  @js.native
  class ObjectReference () extends XadesObject {
    var Value: java.lang.String = js.native
  }
  
  @js.native
  class ObjectReferenceCollection () extends XadesCollection[ObjectReference]
  
  @js.native
  class OtherCertificate () extends Any
  
  @js.native
  class OtherCertificateCollection () extends XadesCollection[OtherCertificate]
  
  @js.native
  class OtherRef () extends Any
  
  @js.native
  class OtherRefs () extends XadesCollection[OtherRef]
  
  @js.native
  class OtherTimeStamp () extends XadesObject {
    var CanonicalizationMethod: xmldsigjsLib.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: java.lang.String = js.native
    var ReferenceInfo: ReferenceInfos = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
  @js.native
  class OtherValue () extends EncapsulatedPKIData
  
  @js.native
  class OtherValues () extends XadesCollection[OtherValue]
  
  @js.native
  class QualifyingProperties () extends XadesObject {
    var Id: java.lang.String = js.native
    var SignedProperties: xadesjsLib.xadesjsMod.xmlNs.SignedProperties = js.native
    var Target: java.lang.String = js.native
    var UnsignedProperties: xadesjsLib.xadesjsMod.xmlNs.UnsignedProperties = js.native
  }
  
  @js.native
  class QualifyingPropertiesReference () extends XadesObject {
    var Id: java.lang.String = js.native
    var Uri: java.lang.String = js.native
  }
  
  @js.native
  class ReferenceInfo () extends XadesObject {
    var DigestMethod: java.lang.String = js.native
    var DigestValue: stdLib.Uint8Array = js.native
    var Id: java.lang.String = js.native
    var Uri: java.lang.String = js.native
  }
  
  @js.native
  class ReferenceInfos () extends XadesCollection[ReferenceInfo]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - xadesjsLib.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class RefsOnlyTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class ResponderID () extends XadesObject {
    var ByKey: stdLib.Uint8Array = js.native
    var ByName: java.lang.String = js.native
  }
  
  @js.native
  class RevocationValues () extends XadesObject {
    var CRLValues: xadesjsLib.xadesjsMod.xmlNs.CRLValues = js.native
    var Id: java.lang.String = js.native
    var OCSPValues: xadesjsLib.xadesjsMod.xmlNs.OCSPValues = js.native
    var OtherValues: xadesjsLib.xadesjsMod.xmlNs.OtherValues = js.native
  }
  
  @js.native
  class SPURI () extends XadesObject {
    var Value: java.lang.String = js.native
  }
  
  @js.native
  class SPUserNotice () extends XadesObject {
    var ExplicitText: java.lang.String = js.native
    var NoticeRef: NoticeReference = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - xadesjsLib.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class SigAndRefsTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class SigPolicyHash () extends DigestAlgAndValueType
  
  @js.native
  class SigPolicyId () extends ObjectIdentifier
  
  @js.native
  class SigPolicyQualifier () extends AnyCollection
  
  @js.native
  class SigPolicyQualifiers () extends XadesCollection[SigPolicyQualifier]
  
  @js.native
  class SignaturePolicyId () extends XadesObject {
    var SigPolicyHash: DigestAlgAndValueType = js.native
    var SigPolicyId: ObjectIdentifier = js.native
    var SigPolicyQualifiers: xadesjsLib.xadesjsMod.xmlNs.SigPolicyQualifiers = js.native
    var Transforms: xmldsigjsLib.xmldsigjsMod.Transforms = js.native
  }
  
  @js.native
  class SignaturePolicyIdentifier () extends XadesObject {
    var SignaturePolicyId: xadesjsLib.xadesjsMod.xmlNs.SignaturePolicyId = js.native
    var SignaturePolicyImplied: scala.Boolean = js.native
  }
  
  @js.native
  class SignatureProductionPlace () extends XadesObject {
    var City: java.lang.String = js.native
    var CountryName: java.lang.String = js.native
    var PostalCode: java.lang.String = js.native
    var StateOrProvince: java.lang.String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - xadesjsLib.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class SignatureTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class SignedDataObjectProperties () extends XadesObject {
    var AllDataObjectsTimeStamps: AllDataObjectsTimeStampCollection = js.native
    var CommitmentTypeIndications: CommitmentTypeIndicationCollection = js.native
    var DataObjectFormats: DataObjectFormatCollection = js.native
    var Id: java.lang.String = js.native
    var IndividualDataObjectsTimeStamps: IndividualDataObjectsTimeStampCollection = js.native
  }
  
  @js.native
  class SignedProperties () extends XadesObject {
    var Id: java.lang.String = js.native
    var SignedDataObjectProperties: xadesjsLib.xadesjsMod.xmlNs.SignedDataObjectProperties = js.native
    var SignedSignatureProperties: xadesjsLib.xadesjsMod.xmlNs.SignedSignatureProperties = js.native
  }
  
  @js.native
  class SignedSignatureProperties () extends XadesObject {
    var Id: java.lang.String = js.native
    var SignaturePolicyIdentifier: xadesjsLib.xadesjsMod.xmlNs.SignaturePolicyIdentifier = js.native
    var SignatureProductionPlace: xadesjsLib.xadesjsMod.xmlNs.SignatureProductionPlace = js.native
    var SignerRole: xadesjsLib.xadesjsMod.xmlNs.SignerRole = js.native
    var SigningCertificate: xadesjsLib.xadesjsMod.xmlNs.SigningCertificate = js.native
    var SigningTime: XadesDateTime = js.native
  }
  
  @js.native
  class SignerRole () extends XadesObject {
    var CertifiedRoles: xadesjsLib.xadesjsMod.xmlNs.CertifiedRoles = js.native
    var ClaimedRoles: xadesjsLib.xadesjsMod.xmlNs.ClaimedRoles = js.native
  }
  
  @js.native
  class SigningCertificate () extends CertIDList
  
  @js.native
  class UnsignedDataObjectProperties () extends XadesCollection[UnsignedDataObjectProperty] {
    var Id: java.lang.String = js.native
  }
  
  @js.native
  class UnsignedDataObjectProperty () extends Any
  
  @js.native
  class UnsignedProperties () extends XadesObject {
    var Id: java.lang.String = js.native
    var UnsignedDataObjectProperties: xadesjsLib.xadesjsMod.xmlNs.UnsignedDataObjectProperties = js.native
    var UnsignedSignatureProperties: xadesjsLib.xadesjsMod.xmlNs.UnsignedSignatureProperties = js.native
  }
  
  @js.native
  class UnsignedSignatureProperties () extends XadesCollection[UnsignedSignatureProperty] {
    var Id: java.lang.String = js.native
  }
  
  @js.native
  class UnsignedSignatureProperty () extends XadesObject
  
  @js.native
  class XAdESTimeStamp () extends XadesObject {
    var CanonicalizationMethod: xmldsigjsLib.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: java.lang.String = js.native
    var Include: xadesjsLib.xadesjsMod.xmlNs.Include = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
  @js.native
  class XMLTimeStamp () extends Any
  
  @js.native
  class XMLTimeStampCollection () extends XadesCollection[XMLTimeStamp]
  
  @js.native
  abstract class XadesCollection[I /* <: XadesObject */] ()
    extends xmlDashCoreLib.xmlDashCoreMod.XmlCollection[I]
  
  @js.native
  class XadesDateTime () extends XadesObject {
    var Format: js.UndefOr[java.lang.String] = js.native
    var Value: stdLib.Date = js.native
  }
  
  @js.native
  abstract class XadesObject ()
    extends xmlDashCoreLib.xmlDashCoreMod.XmlObject
  
  trait _EncodingType extends js.Object
  
  @js.native
  object XmlXades extends js.Object {
    var AttributeNames: xadesjsLib.Anon_Encoding = js.native
    var DefaultPrefix: java.lang.String = js.native
    var ElementNames: xadesjsLib.Anon_AllDataObjectsTimeStamp = js.native
    var NamespaceURI: java.lang.String = js.native
    var SignedPropertiesType: java.lang.String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - xadesjsLib.xadesjsLibStrings.der
    - xadesjsLib.xadesjsLibStrings.ber
    - xadesjsLib.xadesjsLibStrings.cer
    - xadesjsLib.xadesjsLibStrings.per
    - xadesjsLib.xadesjsLibStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | scala.Null
}

