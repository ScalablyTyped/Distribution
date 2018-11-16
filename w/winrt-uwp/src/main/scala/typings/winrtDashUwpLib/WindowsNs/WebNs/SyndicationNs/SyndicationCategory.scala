package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the category of a feed or an item. This class encapsulates information in the /rss/channel/item/category element in RSS 2.0 or the atom:category element in Atom 1.0. */
@JSGlobal("Windows.Web.Syndication.SyndicationCategory")
@js.native
class SyndicationCategory () extends js.Object {
  /**
                   * Creates a SyndicationCategory object with the specified term property.
                   * @param term A string that identifies the category. This parameter represents the required term attribute on atom:category or the text content of the category element in RSS 2.0.
                   */
  def this(term: java.lang.String) = this()
  /**
                   * Creates SyndicationCategory object with the specified property values.
                   * @param term A string that identifies the category.
                   * @param scheme The scheme of the category.
                   * @param label A label for display in end-user applications.
                   */
  def this(term: java.lang.String, scheme: java.lang.String, label: java.lang.String) = this()
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /** Gets or sets the label for the category. This property represents the label attribute on atom:category. It provides a label for display in end-user applications. */
  var label: java.lang.String = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: java.lang.String = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: java.lang.String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: java.lang.String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: java.lang.String = js.native
  /** Gets or sets the scheme of the category. This property represents the scheme attribute on atom:category or the domain attribute on the category element in RSS 2.0. */
  var scheme: java.lang.String = js.native
  /** Gets or sets a string that identifies the category. This property represents the required term attribute on atom:category or the text content of the category element in RSS 2.0. */
  var term: java.lang.String = js.native
  /**
                   * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
                   * @param format The format of the data.
                   * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
                   */
  def getXmlDocument(format: SyndicationFormat): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

