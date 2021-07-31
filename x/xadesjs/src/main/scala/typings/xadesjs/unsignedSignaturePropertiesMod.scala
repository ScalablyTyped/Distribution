package typings.xadesjs

import typings.xadesjs.certificateValuesMod.CertificateValues
import typings.xadesjs.completeCertificateRefsMod.CompleteCertificateRefs
import typings.xadesjs.completeRevocationRefsMod.CompleteRevocationRefs
import typings.xadesjs.revocationValuesMod.RevocationValues
import typings.xadesjs.xadesTimeStampMod.XAdESTimeStamp
import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsignedSignaturePropertiesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "ArchiveTimeStamp")
  @js.native
  class ArchiveTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttrAuthoritiesCertValues")
  @js.native
  class AttrAuthoritiesCertValues () extends CertificateValues {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeCertificateRefs")
  @js.native
  class AttributeCertificateRefs () extends CompleteCertificateRefs {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeRevocationRefs")
  @js.native
  class AttributeRevocationRefs () extends CompleteRevocationRefs {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeRevocationValues")
  @js.native
  class AttributeRevocationValues () extends RevocationValues {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "RefsOnlyTimeStamp")
  @js.native
  class RefsOnlyTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "SigAndRefsTimeStamp")
  @js.native
  class SigAndRefsTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "SignatureTimeStamp")
  @js.native
  class SignatureTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "UnsignedSignatureProperties")
  @js.native
  class UnsignedSignatureProperties () extends XadesCollection[UnsignedSignatureProperty] {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "UnsignedSignatureProperty")
  @js.native
  class UnsignedSignatureProperty () extends XadesObject {
    def this(properties: js.Object) = this()
  }
}
