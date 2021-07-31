package typings.winrtUwp.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains settings that are used during loading and parsing of XML documents. The default settings are chosen for the highest security. This class can be instantiated and is accepted by LoadXml , LoadFromUriAsync , and LoadFromFileAsync . */
trait XmlLoadSettings extends StObject {
  
  /** Specifies whether default handling preserves white space. */
  var elementContentWhiteSpace: Boolean
  
  /** Gets and sets the limits of the element depth of an XML document to be loaded into a DOM object. */
  var maxElementDepth: Double
  
  /** Gets or sets a value that specifies whether to prohibit or allow the inclusion of a DTD in the XML DOM document. */
  var prohibitDtd: Boolean
  
  /** Gets or sets a value that specifies whether external definitions, resolvable namespaces, external subsets of document type definitions (DTDs), and external entity references are to be resolved at the time the document is parsed. */
  var resolveExternals: Boolean
  
  /** Gets or sets a value that specifies whether the XML parser should validate this document against the document type definition (DTD) on loading. */
  var validateOnParse: Boolean
}
object XmlLoadSettings {
  
  @scala.inline
  def apply(
    elementContentWhiteSpace: Boolean,
    maxElementDepth: Double,
    prohibitDtd: Boolean,
    resolveExternals: Boolean,
    validateOnParse: Boolean
  ): XmlLoadSettings = {
    val __obj = js.Dynamic.literal(elementContentWhiteSpace = elementContentWhiteSpace.asInstanceOf[js.Any], maxElementDepth = maxElementDepth.asInstanceOf[js.Any], prohibitDtd = prohibitDtd.asInstanceOf[js.Any], resolveExternals = resolveExternals.asInstanceOf[js.Any], validateOnParse = validateOnParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlLoadSettings]
  }
  
  @scala.inline
  implicit class XmlLoadSettingsMutableBuilder[Self <: XmlLoadSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementContentWhiteSpace(value: Boolean): Self = StObject.set(x, "elementContentWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxElementDepth(value: Double): Self = StObject.set(x, "maxElementDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProhibitDtd(value: Boolean): Self = StObject.set(x, "prohibitDtd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveExternals(value: Boolean): Self = StObject.set(x, "resolveExternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnParse(value: Boolean): Self = StObject.set(x, "validateOnParse", value.asInstanceOf[js.Any])
  }
}
