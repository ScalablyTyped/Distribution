package typings.xmldsigjs.mod

import typings.xmldsigjs.anon.Algorithm
import typings.xmldsigjs.anon.Manifest
import typings.xmldsigjs.anon.XmlDecryptionTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XmlSignature {
  
  @JSImport("xmldsigjs", "XmlSignature")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xmldsigjs", "XmlSignature.AlgorithmNamespaces")
  @js.native
  def AlgorithmNamespaces: XmlDecryptionTransform = js.native
  inline def AlgorithmNamespaces_=(x: XmlDecryptionTransform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmNamespaces")(x.asInstanceOf[js.Any])
  
  @JSImport("xmldsigjs", "XmlSignature.AttributeNames")
  @js.native
  def AttributeNames: Algorithm = js.native
  inline def AttributeNames_=(x: Algorithm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(x.asInstanceOf[js.Any])
  
  @JSImport("xmldsigjs", "XmlSignature.DefaultCanonMethod")
  @js.native
  def DefaultCanonMethod: String = js.native
  inline def DefaultCanonMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultCanonMethod")(x.asInstanceOf[js.Any])
  
  @JSImport("xmldsigjs", "XmlSignature.DefaultDigestMethod")
  @js.native
  def DefaultDigestMethod: String = js.native
  inline def DefaultDigestMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDigestMethod")(x.asInstanceOf[js.Any])
  
  @JSImport("xmldsigjs", "XmlSignature.DefaultPrefix")
  @js.native
  def DefaultPrefix: String = js.native
  inline def DefaultPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultPrefix")(x.asInstanceOf[js.Any])
  
  @JSImport("xmldsigjs", "XmlSignature.ElementNames")
  @js.native
  def ElementNames: typings.xmldsigjs.anon.CanonicalizationMethod = js.native
  inline def ElementNames_=(x: typings.xmldsigjs.anon.CanonicalizationMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ElementNames")(x.asInstanceOf[js.Any])
  
  @JSImport("xmldsigjs", "XmlSignature.NamespaceURI")
  @js.native
  def NamespaceURI: String = js.native
  
  @JSImport("xmldsigjs", "XmlSignature.NamespaceURIMore")
  @js.native
  def NamespaceURIMore: String = js.native
  inline def NamespaceURIMore_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURIMore")(x.asInstanceOf[js.Any])
  
  @JSImport("xmldsigjs", "XmlSignature.NamespaceURIPss")
  @js.native
  def NamespaceURIPss: String = js.native
  inline def NamespaceURIPss_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURIPss")(x.asInstanceOf[js.Any])
  
  inline def NamespaceURI_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURI")(x.asInstanceOf[js.Any])
  
  @JSImport("xmldsigjs", "XmlSignature.Uri")
  @js.native
  def Uri: Manifest = js.native
  inline def Uri_=(x: Manifest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uri")(x.asInstanceOf[js.Any])
}
