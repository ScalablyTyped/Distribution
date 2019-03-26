package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlNs {
  type AllDataObjectsTimeStamp = XAdESTimeStamp
  type AllDataObjectsTimeStampCollection = XadesCollection[AllDataObjectsTimeStamp]
  type AnyCollection = XadesCollection[XadesObject]
  type CRLRefs = XadesCollection[CRLRef]
  type CRLValues = XadesCollection[EncapsulatedCRLValue]
  type CertIDList = XadesCollection[Cert]
  type CertifiedRole = EncapsulatedPKIData
  type CertifiedRoles = XadesCollection[CertifiedRole]
  type ClaimedRole = Any
  type ClaimedRoles = XadesCollection[ClaimedRole]
  type CommitmentTypeIndicationCollection = XadesCollection[CommitmentTypeIndication]
  type CommitmentTypeQualifier = Any
  type CommitmentTypeQualifiers = XadesCollection[CommitmentTypeQualifier]
  type DataObjectFormatCollection = XadesCollection[DataObjectFormat]
  type DocumentationReferences = XadesCollection[DocumentationReference]
  type EncapsulatedCRLValue = EncapsulatedPKIData
  type EncapsulatedOCSPValue = EncapsulatedPKIData
  type EncapsulatedTimeStamp = EncapsulatedPKIData
  type EncapsulatedTimeStampCollection = XadesCollection[EncapsulatedTimeStamp]
  type EncapsulatedX509Certificate = EncapsulatedPKIData
  type EncapsulatedX509CertificateCollection = XadesCollection[EncapsulatedX509Certificate]
  /* Rewritten from type alias, can be one of: 
    - xadesjsLib.xadesjsLibStrings.der
    - xadesjsLib.xadesjsLibStrings.ber
    - xadesjsLib.xadesjsLibStrings.cer
    - xadesjsLib.xadesjsLibStrings.per
    - xadesjsLib.xadesjsLibStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | scala.Null
  type IndividualDataObjectsTimeStamp = XAdESTimeStamp
  type IndividualDataObjectsTimeStampCollection = XadesCollection[IndividualDataObjectsTimeStamp]
  type IntegerList = XadesCollection[Integer]
  type IssuerSerial = xmldsigjsLib.xmldsigjsMod.X509IssuerSerial
  type OCSPRefs = XadesCollection[OCSPRef]
  type OCSPValues = XadesCollection[EncapsulatedOCSPValue]
  type ObjectReferenceCollection = XadesCollection[ObjectReference]
  type OtherCertificate = Any
  type OtherCertificateCollection = XadesCollection[OtherCertificate]
  type OtherRef = Any
  type OtherRefs = XadesCollection[OtherRef]
  type OtherValue = EncapsulatedPKIData
  type OtherValues = XadesCollection[OtherValue]
  type ReferenceInfos = XadesCollection[ReferenceInfo]
  type SigPolicyHash = DigestAlgAndValueType
  type SigPolicyId = ObjectIdentifier
  type SigPolicyQualifier = AnyCollection
  type SigPolicyQualifiers = XadesCollection[SigPolicyQualifier]
  type SigningCertificate = CertIDList
  type UnsignedDataObjectProperty = Any
  type UnsignedSignatureProperty = XadesObject
  type XMLTimeStamp = Any
  type XMLTimeStampCollection = XadesCollection[XMLTimeStamp]
  type XadesCollection[I /* <: XadesObject */] = xmlDashCoreLib.xmlDashCoreMod.XmlCollection[I]
  type XadesObject = xmlDashCoreLib.xmlDashCoreMod.XmlObject
}
