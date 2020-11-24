package typings.winrtUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains settings that are used during loading and parsing of XML documents. The default settings are chosen for the highest security. This class can be instantiated and is accepted by LoadXml , LoadFromUriAsync , and LoadFromFileAsync . */
@js.native
trait XmlLoadSettings extends js.Object {
  
  /** Specifies whether default handling preserves white space. */
  var elementContentWhiteSpace: Boolean = js.native
  
  /** Gets and sets the limits of the element depth of an XML document to be loaded into a DOM object. */
  var maxElementDepth: Double = js.native
  
  /** Gets or sets a value that specifies whether to prohibit or allow the inclusion of a DTD in the XML DOM document. */
  var prohibitDtd: Boolean = js.native
  
  /** Gets or sets a value that specifies whether external definitions, resolvable namespaces, external subsets of document type definitions (DTDs), and external entity references are to be resolved at the time the document is parsed. */
  var resolveExternals: Boolean = js.native
  
  /** Gets or sets a value that specifies whether the XML parser should validate this document against the document type definition (DTD) on loading. */
  var validateOnParse: Boolean = js.native
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
  implicit class XmlLoadSettingsOps[Self <: XmlLoadSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElementContentWhiteSpace(value: Boolean): Self = this.set("elementContentWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxElementDepth(value: Double): Self = this.set("maxElementDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProhibitDtd(value: Boolean): Self = this.set("prohibitDtd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveExternals(value: Boolean): Self = this.set("resolveExternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnParse(value: Boolean): Self = this.set("validateOnParse", value.asInstanceOf[js.Any])
  }
}
