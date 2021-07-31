package typings.xmldsigjs

import typings.xmldsigjs.anon.Algorithm
import typings.xmldsigjs.anon.CanonicalizationMethod
import typings.xmldsigjs.anon.Manifest
import typings.xmldsigjs.anon.XmlDecryptionTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlNamesMod {
  
  object XmlSignature {
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.AlgorithmNamespaces")
    @js.native
    def AlgorithmNamespaces: XmlDecryptionTransform = js.native
    @scala.inline
    def AlgorithmNamespaces_=(x: XmlDecryptionTransform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmNamespaces")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.AttributeNames")
    @js.native
    def AttributeNames: Algorithm = js.native
    @scala.inline
    def AttributeNames_=(x: Algorithm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.DefaultCanonMethod")
    @js.native
    def DefaultCanonMethod: String = js.native
    @scala.inline
    def DefaultCanonMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultCanonMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.DefaultDigestMethod")
    @js.native
    def DefaultDigestMethod: String = js.native
    @scala.inline
    def DefaultDigestMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDigestMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.DefaultPrefix")
    @js.native
    def DefaultPrefix: String = js.native
    @scala.inline
    def DefaultPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultPrefix")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.ElementNames")
    @js.native
    def ElementNames: CanonicalizationMethod = js.native
    @scala.inline
    def ElementNames_=(x: CanonicalizationMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ElementNames")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.NamespaceURI")
    @js.native
    def NamespaceURI: String = js.native
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.NamespaceURIMore")
    @js.native
    def NamespaceURIMore: String = js.native
    @scala.inline
    def NamespaceURIMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURIMore")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.NamespaceURIPss")
    @js.native
    def NamespaceURIPss: String = js.native
    @scala.inline
    def NamespaceURIPss_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURIPss")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NamespaceURI_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURI")(x.asInstanceOf[js.Any])
    
    @JSImport("xmldsigjs/build/types/xml/xml_names", "XmlSignature.Uri")
    @js.native
    def Uri: Manifest = js.native
    @scala.inline
    def Uri_=(x: Manifest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uri")(x.asInstanceOf[js.Any])
  }
}
