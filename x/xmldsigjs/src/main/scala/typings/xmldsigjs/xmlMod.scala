package typings.xmldsigjs

import typings.xmldsigjs.anon.Algorithm
import typings.xmldsigjs.anon.Manifest
import typings.xmldsigjs.anon.XmlDecryptionTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("xmldsigjs/build/types/xml", "CanonicalizationMethod")
  @js.native
  class CanonicalizationMethod ()
    extends typings.xmldsigjs.canonicalizationMethodMod.CanonicalizationMethod {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "DataObject")
  @js.native
  class DataObject ()
    extends typings.xmldsigjs.dataObjectMod.DataObject {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "DataObjects")
  @js.native
  class DataObjects ()
    extends typings.xmldsigjs.dataObjectMod.DataObjects {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "DigestMethod")
  @js.native
  class DigestMethod ()
    extends typings.xmldsigjs.digestMethodMod.DigestMethod {
    def this(hashNamespace: String) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "KeyInfo")
  @js.native
  class KeyInfo ()
    extends typings.xmldsigjs.keyInfoMod.KeyInfo {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "Reference")
  @js.native
  class Reference ()
    extends typings.xmldsigjs.referenceMod.Reference {
    def this(uri: String) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "References")
  @js.native
  class References ()
    extends typings.xmldsigjs.referenceMod.References {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "Signature")
  @js.native
  class Signature ()
    extends typings.xmldsigjs.signatureMod.Signature {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "SignatureMethod")
  @js.native
  class SignatureMethod ()
    extends typings.xmldsigjs.signatureMethodMod.SignatureMethod {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "SignatureMethodOther")
  @js.native
  class SignatureMethodOther ()
    extends typings.xmldsigjs.signatureMethodMod.SignatureMethodOther {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "SignedInfo")
  @js.native
  class SignedInfo ()
    extends typings.xmldsigjs.signedInfoMod.SignedInfo {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "Transform")
  @js.native
  class Transform ()
    extends typings.xmldsigjs.transformMod.Transform {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "Transforms")
  @js.native
  class Transforms ()
    extends typings.xmldsigjs.transformCollectionMod.Transforms {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlDsigBase64Transform")
  @js.native
  class XmlDsigBase64Transform ()
    extends typings.xmldsigjs.transformsMod.XmlDsigBase64Transform {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlDsigC14NTransform")
  @js.native
  class XmlDsigC14NTransform ()
    extends typings.xmldsigjs.transformsMod.XmlDsigC14NTransform {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlDsigC14NWithCommentsTransform")
  @js.native
  class XmlDsigC14NWithCommentsTransform ()
    extends typings.xmldsigjs.transformsMod.XmlDsigC14NWithCommentsTransform {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlDsigEnvelopedSignatureTransform")
  @js.native
  class XmlDsigEnvelopedSignatureTransform ()
    extends typings.xmldsigjs.transformsMod.XmlDsigEnvelopedSignatureTransform {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlDsigExcC14NTransform")
  @js.native
  class XmlDsigExcC14NTransform ()
    extends typings.xmldsigjs.transformsMod.XmlDsigExcC14NTransform {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlDsigExcC14NWithCommentsTransform")
  @js.native
  class XmlDsigExcC14NWithCommentsTransform ()
    extends typings.xmldsigjs.transformsMod.XmlDsigExcC14NWithCommentsTransform {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlDsigXPathTransform")
  @js.native
  class XmlDsigXPathTransform ()
    extends typings.xmldsigjs.transformsMod.XmlDsigXPathTransform {
    def this(properties: js.Object) = this()
  }
  
  object XmlSignature {
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.AlgorithmNamespaces")
    @js.native
    def AlgorithmNamespaces: XmlDecryptionTransform = js.native
    @scala.inline
    def AlgorithmNamespaces_=(x: XmlDecryptionTransform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmNamespaces")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.AttributeNames")
    @js.native
    def AttributeNames: Algorithm = js.native
    @scala.inline
    def AttributeNames_=(x: Algorithm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.DefaultCanonMethod")
    @js.native
    def DefaultCanonMethod: String = js.native
    @scala.inline
    def DefaultCanonMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultCanonMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.DefaultDigestMethod")
    @js.native
    def DefaultDigestMethod: String = js.native
    @scala.inline
    def DefaultDigestMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDigestMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.DefaultPrefix")
    @js.native
    def DefaultPrefix: String = js.native
    @scala.inline
    def DefaultPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultPrefix")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.ElementNames")
    @js.native
    def ElementNames: typings.xmldsigjs.anon.CanonicalizationMethod = js.native
    @scala.inline
    def ElementNames_=(x: typings.xmldsigjs.anon.CanonicalizationMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ElementNames")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.NamespaceURI")
    @js.native
    def NamespaceURI: String = js.native
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.NamespaceURIMore")
    @js.native
    def NamespaceURIMore: String = js.native
    @scala.inline
    def NamespaceURIMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURIMore")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.NamespaceURIPss")
    @js.native
    def NamespaceURIPss: String = js.native
    @scala.inline
    def NamespaceURIPss_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURIPss")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NamespaceURI_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURI")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml", "XmlSignature.Uri")
    @js.native
    def Uri: Manifest = js.native
    @scala.inline
    def Uri_=(x: Manifest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uri")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlSignatureCollection")
  @js.native
  abstract class XmlSignatureCollection[I /* <: typings.xmldsigjs.xmlObjectMod.XmlSignatureObject */] ()
    extends typings.xmldsigjs.xmlObjectMod.XmlSignatureCollection[I] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xmldsigjs/build/types/xml", "XmlSignatureObject")
  @js.native
  abstract class XmlSignatureObject ()
    extends typings.xmldsigjs.xmlObjectMod.XmlSignatureObject {
    def this(properties: js.Object) = this()
  }
}
