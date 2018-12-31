package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implements the ISyndicationText interface that encapsulates elements in RSS 2.0 or Atom 1.0 that can have either text, HTML, or XHTML. In Atom 1.0, this object maps to an atomTextConstruct in the schema, which can be atom:title, atom:subtitle, atom:rights, or atom:summary elements. */
@JSGlobal("Windows.Web.Syndication.SyndicationText")
@js.native
/** Creates a new SyndicationText object. */
class SyndicationText () extends js.Object {
  /**
    * Creates a new SyndicationText object with the specified Text property value.
    * @param text The content of a text content construct like atom:title.
    */
  def this(text: java.lang.String) = this()
  /**
    * Creates a new SyndicationText object with the specified Text and Type property values.
    * @param text The content of a text content construct like atom:title.
    * @param type The type of the content. This value can be "text", "html", and "xhtml".
    */
  def this(text: java.lang.String, `type`: SyndicationTextType) = this()
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
  /** Gets the content of a text content construct like atom:title. */
  var text: java.lang.String = js.native
  /** Gets or sets the type of the content. */
  var `type`: java.lang.String = js.native
  /** Gets or sets the XML content. */
  var xml: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

