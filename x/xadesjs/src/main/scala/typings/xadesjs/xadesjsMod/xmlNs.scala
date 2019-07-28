package typings.xadesjs.xadesjsMod

import typings.std.Date
import typings.std.Uint8Array
import typings.xadesjs.Anon_AllDataObjectsTimeStamp
import typings.xadesjs.Anon_Encoding
import typings.xadesjs.xadesjsMod.xmlNs.AllDataObjectsTimeStamp
import typings.xadesjs.xadesjsMod.xmlNs.AllDataObjectsTimeStampCollection
import typings.xadesjs.xadesjsMod.xmlNs.Any
import typings.xadesjs.xadesjsMod.xmlNs.AnyCollection
import typings.xadesjs.xadesjsMod.xmlNs.CRLRef
import typings.xadesjs.xadesjsMod.xmlNs.Cert
import typings.xadesjs.xadesjsMod.xmlNs.CertIDList
import typings.xadesjs.xadesjsMod.xmlNs.CertificateValues
import typings.xadesjs.xadesjsMod.xmlNs.CertifiedRole
import typings.xadesjs.xadesjsMod.xmlNs.ClaimedRole
import typings.xadesjs.xadesjsMod.xmlNs.CommitmentTypeIndication
import typings.xadesjs.xadesjsMod.xmlNs.CommitmentTypeIndicationCollection
import typings.xadesjs.xadesjsMod.xmlNs.CommitmentTypeQualifier
import typings.xadesjs.xadesjsMod.xmlNs.CompleteCertificateRefs
import typings.xadesjs.xadesjsMod.xmlNs.CompleteRevocationRefs
import typings.xadesjs.xadesjsMod.xmlNs.DataObjectFormat
import typings.xadesjs.xadesjsMod.xmlNs.DataObjectFormatCollection
import typings.xadesjs.xadesjsMod.xmlNs.DigestAlgAndValueType
import typings.xadesjs.xadesjsMod.xmlNs.DocumentationReference
import typings.xadesjs.xadesjsMod.xmlNs.EncapsulatedCRLValue
import typings.xadesjs.xadesjsMod.xmlNs.EncapsulatedOCSPValue
import typings.xadesjs.xadesjsMod.xmlNs.EncapsulatedPKIData
import typings.xadesjs.xadesjsMod.xmlNs.EncapsulatedTimeStamp
import typings.xadesjs.xadesjsMod.xmlNs.EncapsulatedTimeStampCollection
import typings.xadesjs.xadesjsMod.xmlNs.EncapsulatedX509Certificate
import typings.xadesjs.xadesjsMod.xmlNs.EncapsulatedX509CertificateCollection
import typings.xadesjs.xadesjsMod.xmlNs.EncodingType
import typings.xadesjs.xadesjsMod.xmlNs.IndividualDataObjectsTimeStamp
import typings.xadesjs.xadesjsMod.xmlNs.IndividualDataObjectsTimeStampCollection
import typings.xadesjs.xadesjsMod.xmlNs.Integer
import typings.xadesjs.xadesjsMod.xmlNs.IntegerList
import typings.xadesjs.xadesjsMod.xmlNs.NoticeReference
import typings.xadesjs.xadesjsMod.xmlNs.OCSPRef
import typings.xadesjs.xadesjsMod.xmlNs.ObjectIdentifier
import typings.xadesjs.xadesjsMod.xmlNs.ObjectReference
import typings.xadesjs.xadesjsMod.xmlNs.ObjectReferenceCollection
import typings.xadesjs.xadesjsMod.xmlNs.OtherCertificate
import typings.xadesjs.xadesjsMod.xmlNs.OtherCertificateCollection
import typings.xadesjs.xadesjsMod.xmlNs.OtherRef
import typings.xadesjs.xadesjsMod.xmlNs.OtherValue
import typings.xadesjs.xadesjsMod.xmlNs.ReferenceInfo
import typings.xadesjs.xadesjsMod.xmlNs.ReferenceInfos
import typings.xadesjs.xadesjsMod.xmlNs.RevocationValues
import typings.xadesjs.xadesjsMod.xmlNs.SigPolicyQualifier
import typings.xadesjs.xadesjsMod.xmlNs.UnsignedDataObjectProperty
import typings.xadesjs.xadesjsMod.xmlNs.UnsignedSignatureProperty
import typings.xadesjs.xadesjsMod.xmlNs.XAdESTimeStamp
import typings.xadesjs.xadesjsMod.xmlNs.XMLTimeStamp
import typings.xadesjs.xadesjsMod.xmlNs.XMLTimeStampCollection
import typings.xadesjs.xadesjsMod.xmlNs.XadesCollection
import typings.xadesjs.xadesjsMod.xmlNs.XadesDateTime
import typings.xadesjs.xadesjsMod.xmlNs.XadesObject
import typings.xadesjs.xadesjsMod.xmlNs._EncodingType
import typings.xadesjs.xadesjsStrings.OIDAsURI
import typings.xadesjs.xadesjsStrings.OIDAsURN
import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import typings.xmldsigjs.xmldsigjsMod.X509IssuerSerial
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
    var Value: String = js.native
  }
  
  @js.native
  class AnyCollection () extends XadesCollection[XadesObject]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.xadesjs.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class ArchiveTimeStamp () extends XAdESTimeStamp
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.xadesjs.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class AttrAuthoritiesCertValues () extends CertificateValues
  
  @js.native
  class AttributeCertificateRefs () extends CompleteCertificateRefs
  
  @js.native
  class AttributeRevocationRefs () extends CompleteRevocationRefs
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.xadesjs.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class AttributeRevocationValues () extends RevocationValues
  
  @js.native
  class CRLIdentifier () extends XadesObject {
    var IssueTime: XadesDateTime = js.native
    var Issuer: String = js.native
    var Number: Double = js.native
    var URI: String = js.native
  }
  
  @js.native
  class CRLRef () extends XadesObject {
    var CRLIdentifier: typings.xadesjs.xadesjsMod.xmlNs.CRLIdentifier = js.native
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
  }
  
  @js.native
  class CRLRefs () extends XadesCollection[CRLRef]
  
  @js.native
  class CRLValues () extends XadesCollection[EncapsulatedCRLValue]
  
  @js.native
  class Cert () extends XadesObject {
    var CertDigest: DigestAlgAndValueType = js.native
    var IssuerSerial: X509IssuerSerial = js.native
    var Uri: String = js.native
  }
  
  @js.native
  class CertIDList () extends XadesCollection[Cert]
  
  @js.native
  class CertificateValues () extends XadesObject {
    var EncapsulatedX509Certificates: EncapsulatedX509CertificateCollection = js.native
    var Id: String = js.native
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
    var AllSignedDataObjects: Boolean = js.native
    var CommitmentTypeId: ObjectIdentifier = js.native
    var CommitmentTypeQualifiers: typings.xadesjs.xadesjsMod.xmlNs.CommitmentTypeQualifiers = js.native
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
    var Id: String = js.native
  }
  
  @js.native
  class CompleteRevocationRefs () extends UnsignedSignatureProperty {
    var CRLRefs: typings.xadesjs.xadesjsMod.xmlNs.CRLRefs = js.native
    var Id: String = js.native
    var OCSPRefs: typings.xadesjs.xadesjsMod.xmlNs.OCSPRefs = js.native
    var OtherRefs: typings.xadesjs.xadesjsMod.xmlNs.OtherRefs = js.native
  }
  
  @js.native
  class CounterSignature () extends UnsignedSignatureProperty {
    var Signature: typings.xmldsigjs.xmldsigjsMod.Signature = js.native
  }
  
  @js.native
  class DataObject ()
    extends typings.xmldsigjs.xmldsigjsMod.DataObject {
    var QualifyingProperties: typings.xadesjs.xadesjsMod.xmlNs.QualifyingProperties = js.native
  }
  
  @js.native
  class DataObjectFormat () extends XadesObject {
    var Description: String = js.native
    var Encoding: String = js.native
    var MimeType: String = js.native
    var ObjectIdentifier: typings.xadesjs.xadesjsMod.xmlNs.ObjectIdentifier = js.native
    var ObjectReference: String = js.native
  }
  
  @js.native
  class DataObjectFormatCollection () extends XadesCollection[DataObjectFormat]
  
  @js.native
  class DigestAlgAndValueType () extends XadesObject {
    var DigestMethod: typings.xmldsigjs.xmldsigjsMod.DigestMethod = js.native
    var DigestValue: Uint8Array = js.native
  }
  
  @js.native
  class DocumentationReference () extends XadesObject {
    var Uri: String = js.native
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
    var Id: String = js.native
    var Value: Uint8Array = js.native
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
    var CanonicalizationMethod: typings.xmldsigjs.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: String = js.native
    var Include: typings.xadesjs.xadesjsMod.xmlNs.Include = js.native
    var ReferenceInfo: ReferenceInfos = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
  @js.native
  class Identifier () extends XadesObject {
    var Qualifier: OIDAsURI | OIDAsURN = js.native
    var Value: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xadesjs.xadesjsStrings.OIDAsURI
    - typings.xadesjs.xadesjsStrings.OIDAsURN
  */
  trait IdentifierQualifier extends js.Object
  
  @js.native
  class Include () extends XadesObject {
    var ReferencedData: Boolean = js.native
    var Uri: String = js.native
  }
  
  @js.native
  class IndividualDataObjectsTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class IndividualDataObjectsTimeStampCollection () extends XadesCollection[IndividualDataObjectsTimeStamp]
  
  @js.native
  class Integer () extends XadesObject {
    var Value: Double = js.native
  }
  
  @js.native
  class IntegerList () extends XadesCollection[Integer]
  
  @js.native
  class IssuerSerial () extends X509IssuerSerial
  
  @js.native
  class NoticeReference () extends XadesObject {
    var NoticeNumbers: IntegerList = js.native
    var Organization: String = js.native
  }
  
  @js.native
  class OCSPIdentifier () extends XadesObject {
    var ProducedAt: XadesDateTime = js.native
    var ResponderID: typings.xadesjs.xadesjsMod.xmlNs.ResponderID = js.native
    var URI: String = js.native
  }
  
  @js.native
  class OCSPRef () extends XadesObject {
    var DigestAlgAndValue: DigestAlgAndValueType = js.native
    var OCSPIdentifier: typings.xadesjs.xadesjsMod.xmlNs.OCSPIdentifier = js.native
  }
  
  @js.native
  class OCSPRefs () extends XadesCollection[OCSPRef]
  
  @js.native
  class OCSPValues () extends XadesCollection[EncapsulatedOCSPValue]
  
  @js.native
  class ObjectIdentifier () extends XadesObject {
    var Description: String = js.native
    var DocumentationReferences: typings.xadesjs.xadesjsMod.xmlNs.DocumentationReferences = js.native
    var Identifier: typings.xadesjs.xadesjsMod.xmlNs.Identifier = js.native
  }
  
  @js.native
  class ObjectReference () extends XadesObject {
    var Value: String = js.native
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
    var CanonicalizationMethod: typings.xmldsigjs.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: String = js.native
    var ReferenceInfo: ReferenceInfos = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
  @js.native
  class OtherValue () extends EncapsulatedPKIData
  
  @js.native
  class OtherValues () extends XadesCollection[OtherValue]
  
  @js.native
  class QualifyingProperties () extends XadesObject {
    var Id: String = js.native
    var SignedProperties: typings.xadesjs.xadesjsMod.xmlNs.SignedProperties = js.native
    var Target: String = js.native
    var UnsignedProperties: typings.xadesjs.xadesjsMod.xmlNs.UnsignedProperties = js.native
  }
  
  @js.native
  class QualifyingPropertiesReference () extends XadesObject {
    var Id: String = js.native
    var Uri: String = js.native
  }
  
  @js.native
  class ReferenceInfo () extends XadesObject {
    var DigestMethod: String = js.native
    var DigestValue: Uint8Array = js.native
    var Id: String = js.native
    var Uri: String = js.native
  }
  
  @js.native
  class ReferenceInfos () extends XadesCollection[ReferenceInfo]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.xadesjs.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class RefsOnlyTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class ResponderID () extends XadesObject {
    var ByKey: Uint8Array = js.native
    var ByName: String = js.native
  }
  
  @js.native
  class RevocationValues () extends XadesObject {
    var CRLValues: typings.xadesjs.xadesjsMod.xmlNs.CRLValues = js.native
    var Id: String = js.native
    var OCSPValues: typings.xadesjs.xadesjsMod.xmlNs.OCSPValues = js.native
    var OtherValues: typings.xadesjs.xadesjsMod.xmlNs.OtherValues = js.native
  }
  
  @js.native
  class SPURI () extends XadesObject {
    var Value: String = js.native
  }
  
  @js.native
  class SPUserNotice () extends XadesObject {
    var ExplicitText: String = js.native
    var NoticeRef: NoticeReference = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.xadesjs.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
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
    var SigPolicyQualifiers: typings.xadesjs.xadesjsMod.xmlNs.SigPolicyQualifiers = js.native
    var Transforms: typings.xmldsigjs.xmldsigjsMod.Transforms = js.native
  }
  
  @js.native
  class SignaturePolicyIdentifier () extends XadesObject {
    var SignaturePolicyId: typings.xadesjs.xadesjsMod.xmlNs.SignaturePolicyId = js.native
    var SignaturePolicyImplied: Boolean = js.native
  }
  
  @js.native
  class SignatureProductionPlace () extends XadesObject {
    var City: String = js.native
    var CountryName: String = js.native
    var PostalCode: String = js.native
    var StateOrProvince: String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.xadesjs.xadesjsMod.xmlNs.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @js.native
  class SignatureTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class SignedDataObjectProperties () extends XadesObject {
    var AllDataObjectsTimeStamps: AllDataObjectsTimeStampCollection = js.native
    var CommitmentTypeIndications: CommitmentTypeIndicationCollection = js.native
    var DataObjectFormats: DataObjectFormatCollection = js.native
    var Id: String = js.native
    var IndividualDataObjectsTimeStamps: IndividualDataObjectsTimeStampCollection = js.native
  }
  
  @js.native
  class SignedProperties () extends XadesObject {
    var Id: String = js.native
    var SignedDataObjectProperties: typings.xadesjs.xadesjsMod.xmlNs.SignedDataObjectProperties = js.native
    var SignedSignatureProperties: typings.xadesjs.xadesjsMod.xmlNs.SignedSignatureProperties = js.native
  }
  
  @js.native
  class SignedSignatureProperties () extends XadesObject {
    var Id: String = js.native
    var SignaturePolicyIdentifier: typings.xadesjs.xadesjsMod.xmlNs.SignaturePolicyIdentifier = js.native
    var SignatureProductionPlace: typings.xadesjs.xadesjsMod.xmlNs.SignatureProductionPlace = js.native
    var SignerRole: typings.xadesjs.xadesjsMod.xmlNs.SignerRole = js.native
    var SigningCertificate: typings.xadesjs.xadesjsMod.xmlNs.SigningCertificate = js.native
    var SigningTime: XadesDateTime = js.native
  }
  
  @js.native
  class SignerRole () extends XadesObject {
    var CertifiedRoles: typings.xadesjs.xadesjsMod.xmlNs.CertifiedRoles = js.native
    var ClaimedRoles: typings.xadesjs.xadesjsMod.xmlNs.ClaimedRoles = js.native
  }
  
  @js.native
  class SigningCertificate () extends CertIDList
  
  @js.native
  class UnsignedDataObjectProperties () extends XadesCollection[UnsignedDataObjectProperty] {
    var Id: String = js.native
  }
  
  @js.native
  class UnsignedDataObjectProperty () extends Any
  
  @js.native
  class UnsignedProperties () extends XadesObject {
    var Id: String = js.native
    var UnsignedDataObjectProperties: typings.xadesjs.xadesjsMod.xmlNs.UnsignedDataObjectProperties = js.native
    var UnsignedSignatureProperties: typings.xadesjs.xadesjsMod.xmlNs.UnsignedSignatureProperties = js.native
  }
  
  @js.native
  class UnsignedSignatureProperties () extends XadesCollection[UnsignedSignatureProperty] {
    var Id: String = js.native
  }
  
  @js.native
  class UnsignedSignatureProperty () extends XadesObject
  
  @js.native
  class XAdESTimeStamp () extends XadesObject {
    var CanonicalizationMethod: typings.xmldsigjs.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: String = js.native
    var Include: typings.xadesjs.xadesjsMod.xmlNs.Include = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
  @js.native
  class XMLTimeStamp () extends Any
  
  @js.native
  class XMLTimeStampCollection () extends XadesCollection[XMLTimeStamp]
  
  @js.native
  abstract class XadesCollection[I /* <: XadesObject */] () extends XmlCollection[I]
  
  @js.native
  class XadesDateTime () extends XadesObject {
    var Format: js.UndefOr[String] = js.native
    var Value: Date = js.native
  }
  
  @js.native
  abstract class XadesObject () extends XmlObject
  
  trait _EncodingType extends js.Object
  
  @js.native
  object XmlXades extends js.Object {
    var AttributeNames: Anon_Encoding = js.native
    var DefaultPrefix: String = js.native
    var ElementNames: Anon_AllDataObjectsTimeStamp = js.native
    var NamespaceURI: String = js.native
    var SignedPropertiesType: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xadesjs.xadesjsStrings.der
    - typings.xadesjs.xadesjsStrings.ber
    - typings.xadesjs.xadesjsStrings.cer
    - typings.xadesjs.xadesjsStrings.per
    - typings.xadesjs.xadesjsStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | Null
}

