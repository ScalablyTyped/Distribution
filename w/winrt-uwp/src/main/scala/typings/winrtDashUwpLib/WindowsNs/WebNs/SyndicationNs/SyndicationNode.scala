package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implements the ISyndicationNode interface which represents a generic XML syndication element. */
@JSGlobal("Windows.Web.Syndication.SyndicationNode")
@js.native
class SyndicationNode () extends js.Object {
  /**
                   * Creates a new SyndicationNode object with the specified NodeName, NodeNamespace, and NodeValue property values.
                   * @param nodeName The local name of the element. It must be valid according to XML 1.0.
                   * @param nodeNamespace The namespace of the element.
                   * @param nodeValue The text content of the element. If the element contains only child elements, this parameter is NULL.
                   */
  def this(nodeName: java.lang.String, nodeNamespace: java.lang.String, nodeValue: java.lang.String) = this()
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: java.lang.String = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: java.lang.String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: java.lang.String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: java.lang.String = js.native
  /**
                   * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
                   * @param format The format of the data.
                   * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
                   */
  def getXmlDocument(format: SyndicationFormat): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

