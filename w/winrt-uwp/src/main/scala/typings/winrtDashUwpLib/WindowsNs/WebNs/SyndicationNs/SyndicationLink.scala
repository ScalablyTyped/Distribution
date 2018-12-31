package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a link within a syndication feed or item. This class encapsulates information in the /rss/channel/link or / rss/channel/item/link element in RSS 2.0 or the atom:link element in Atom 1.0. */
@JSGlobal("Windows.Web.Syndication.SyndicationLink")
@js.native
/** Creates a new SyndicationLink object. */
class SyndicationLink () extends js.Object {
  /**
    * Creates a new SyndicationLink with a Uri.
    * @param uri The Uri value.
    */
  def this(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri) = this()
  /**
    * Creates a new SyndicationLink object with a Uri, Relationship, Title, MediaType, and Length.
    * @param uri The Uri value.
    * @param relationship The relationship type.
    * @param title The title of the syndication link.
    * @param mediaType The MediaType of the syndication link.
    * @param length The length, in bytes, of the syndication link.
    */
  def this(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri, relationship: java.lang.String, title: java.lang.String, mediaType: java.lang.String, length: scala.Double) = this()
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: java.lang.String = js.native
  /** Gets or sets the length of the linked resource, in bytes. */
  var length: scala.Double = js.native
  /** Gets or sets the media type of the linked resource. The string must have the pattern ".+/.+". */
  var mediaType: java.lang.String = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: java.lang.String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: java.lang.String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: java.lang.String = js.native
  /** Gets or sets the relationship type of the link. */
  var relationship: java.lang.String = js.native
  /** Gets or sets the language of the resource pointed to by the Uri property. This property represents the hreflang attribute on atom:link. It must adhere to the pattern defined by RFC 3066. */
  var resourceLanguage: java.lang.String = js.native
  /** Gets or sets the title of the syndication link. */
  var title: java.lang.String = js.native
  /** Gets or sets the URI of the linked resource. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

