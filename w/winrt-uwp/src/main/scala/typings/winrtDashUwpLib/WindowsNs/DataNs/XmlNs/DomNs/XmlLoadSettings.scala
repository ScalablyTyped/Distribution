package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains settings that are used during loading and parsing of XML documents. The default settings are chosen for the highest security. This class can be instantiated and is accepted by LoadXml , LoadFromUriAsync , and LoadFromFileAsync . */
@JSGlobal("Windows.Data.Xml.Dom.XmlLoadSettings")
@js.native
/** Creates a new XmlLoadSettings object. */
class XmlLoadSettings () extends js.Object {
  /** Specifies whether default handling preserves white space. */
  var elementContentWhiteSpace: scala.Boolean = js.native
  /** Gets and sets the limits of the element depth of an XML document to be loaded into a DOM object. */
  var maxElementDepth: scala.Double = js.native
  /** Gets or sets a value that specifies whether to prohibit or allow the inclusion of a DTD in the XML DOM document. */
  var prohibitDtd: scala.Boolean = js.native
  /** Gets or sets a value that specifies whether external definitions, resolvable namespaces, external subsets of document type definitions (DTDs), and external entity references are to be resolved at the time the document is parsed. */
  var resolveExternals: scala.Boolean = js.native
  /** Gets or sets a value that specifies whether the XML parser should validate this document against the document type definition (DTD) on loading. */
  var validateOnParse: scala.Boolean = js.native
}

