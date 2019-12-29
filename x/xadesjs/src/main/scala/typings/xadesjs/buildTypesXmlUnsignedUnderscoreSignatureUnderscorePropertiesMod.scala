package typings.xadesjs

import typings.xadesjs.buildTypesXmlCertificateUnderscoreValuesMod.CertificateValues
import typings.xadesjs.buildTypesXmlCompleteUnderscoreCertificateUnderscoreRefsMod.CompleteCertificateRefs
import typings.xadesjs.buildTypesXmlCompleteUnderscoreRevocationUnderscoreRefsMod.CompleteRevocationRefs
import typings.xadesjs.buildTypesXmlRevocationUnderscoreValuesMod.RevocationValues
import typings.xadesjs.buildTypesXmlXadesUnderscoreTimeUnderscoreStampMod.XAdESTimeStamp
import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/unsigned_signature_properties", JSImport.Namespace)
@js.native
object buildTypesXmlUnsignedUnderscoreSignatureUnderscorePropertiesMod extends js.Object {
  @js.native
  class ArchiveTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class AttrAuthoritiesCertValues () extends CertificateValues
  
  @js.native
  class AttributeCertificateRefs () extends CompleteCertificateRefs
  
  @js.native
  class AttributeRevocationRefs () extends CompleteRevocationRefs
  
  @js.native
  class AttributeRevocationValues () extends RevocationValues
  
  @js.native
  class RefsOnlyTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class SigAndRefsTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class SignatureTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class UnsignedSignatureProperties () extends XmlCollection[UnsignedSignatureProperty] {
    var Id: String = js.native
  }
  
  @js.native
  class UnsignedSignatureProperty () extends XmlObject
  
}

