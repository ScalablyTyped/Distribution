package typings.xadesjs

import typings.xadesjs.xmlCertificateValuesMod.CertificateValues
import typings.xadesjs.xmlCompleteCertificateRefsMod.CompleteCertificateRefs
import typings.xadesjs.xmlCompleteRevocationRefsMod.CompleteRevocationRefs
import typings.xadesjs.xmlRevocationValuesMod.RevocationValues
import typings.xadesjs.xmlXadesTimeStampMod.XAdESTimeStamp
import typings.xadesjs.xmlXmlBaseMod.XadesCollection
import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlUnsignedSignaturePropertiesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.xmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "ArchiveTimeStamp")
  @js.native
  open class ArchiveTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.xmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttrAuthoritiesCertValues")
  @js.native
  open class AttrAuthoritiesCertValues () extends CertificateValues {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeCertificateRefs")
  @js.native
  open class AttributeCertificateRefs () extends CompleteCertificateRefs {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeRevocationRefs")
  @js.native
  open class AttributeRevocationRefs () extends CompleteRevocationRefs {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.xmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeRevocationValues")
  @js.native
  open class AttributeRevocationValues () extends RevocationValues {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.xmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "RefsOnlyTimeStamp")
  @js.native
  open class RefsOnlyTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.xmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "SigAndRefsTimeStamp")
  @js.native
  open class SigAndRefsTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.typesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.xmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.xmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.xmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "SignatureTimeStamp")
  @js.native
  open class SignatureTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "UnsignedSignatureProperties")
  @js.native
  open class UnsignedSignatureProperties () extends XadesCollection[UnsignedSignatureProperty] {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "UnsignedSignatureProperty")
  @js.native
  open class UnsignedSignatureProperty () extends XadesObject {
    def this(properties: js.Object) = this()
  }
}
