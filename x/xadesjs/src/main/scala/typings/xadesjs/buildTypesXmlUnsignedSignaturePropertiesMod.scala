package typings.xadesjs

import typings.xadesjs.buildTypesXmlCertificateValuesMod.CertificateValues
import typings.xadesjs.buildTypesXmlCompleteCertificateRefsMod.CompleteCertificateRefs
import typings.xadesjs.buildTypesXmlCompleteRevocationRefsMod.CompleteRevocationRefs
import typings.xadesjs.buildTypesXmlRevocationValuesMod.RevocationValues
import typings.xadesjs.buildTypesXmlXadesTimeStampMod.XAdESTimeStamp
import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesCollection
import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlUnsignedSignaturePropertiesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.distTypesTypesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.distTypesXmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.buildTypesXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "ArchiveTimeStamp")
  @js.native
  open class ArchiveTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.distTypesTypesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.distTypesXmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.buildTypesXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttrAuthoritiesCertValues")
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
  - typings.xmlCore.distTypesTypesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.distTypesXmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.buildTypesXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "AttributeRevocationValues")
  @js.native
  open class AttributeRevocationValues () extends RevocationValues {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.distTypesTypesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.distTypesXmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.buildTypesXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "RefsOnlyTimeStamp")
  @js.native
  open class RefsOnlyTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.distTypesTypesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.distTypesXmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.buildTypesXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "SigAndRefsTimeStamp")
  @js.native
  open class SigAndRefsTimeStamp () extends XAdESTimeStamp {
    def this(properties: js.Object) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.xmlCore.distTypesTypesMod.IXmlSerializable because Already inherited
  - typings.xmlCore.distTypesXmlObjectMod.XmlObject because Already inherited
  - typings.xmlCore.mod.XmlObject because Already inherited
  - typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject because Already inherited
  - typings.xadesjs.buildTypesXmlUnsignedSignaturePropertiesMod.UnsignedSignatureProperty because Inheritance from two classes. Inlined  */ @JSImport("xadesjs/build/types/xml/unsigned_signature_properties", "SignatureTimeStamp")
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
