package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a feed. This class encapsulates the information in the /rss/channel element in RSS 2.0 or the atom:feed element in Atom 1.0. */
@JSGlobal("Windows.Web.Syndication.SyndicationFeed")
@js.native
class SyndicationFeed () extends js.Object {
  /**
                   * Creates a new SyndicationFeed object with a Title, Subtitle, and Uri.
                   * @param title The Title of the syndication feed.
                   * @param subtitle The Subtitle of the syndication feed.
                   * @param uri The Uri value.
                   */
  def this(title: java.lang.String, subtitle: java.lang.String, uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri) = this()
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /** Gets the authors of an item. This property represents the collection of all the atom:author elements under atom:entry. */
  var authors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets a collection of categories of the feed. This property represents the collection of all the atom:category elements under atom:feed. */
  var categories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationCategory] = js.native
  /** Gets a collection of the contributors of the feed. This property represents the collection of all the atom:contributor elements under atom:feed. */
  var contributors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson] = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /** Gets the first Uniform Resource Identifier (URI) in a sequence. This property represents the atom:link element with attribute rel=”first”. */
  var firstUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets or sets the generator of the feed. This property represents the atom:generator element or the generator element in RSS 2.0. */
  var generator: SyndicationGenerator = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) for the image for the feed. This property represents the atom:icon element. */
  var iconUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets or sets the identifier for the syndication feed. */
  var id: java.lang.String = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) of the logo for the feed. This property represents the atom:logo element or image/uri element in RSS 2.0. */
  var imageUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the collection of items in the feed. This property represents the collection of atom:entry elements or a collection of item elements in RSS 2.0. */
  var items: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationItem] = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: java.lang.String = js.native
  /** Gets or sets the time the feed was last modified. This property represents the /rss/channel/lastBuildDate or atom:updated element. */
  var lastUpdatedTime: stdLib.Date = js.native
  /** Gets the last Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel=”last”. */
  var lastUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the links associated with the feed. This property represents a collection of the atom:link elements under atom:feed. In RSS 2.0, this maps to the link element. */
  var links: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationLink] = js.native
  /** Gets the next Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel="next". */
  var nextUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: java.lang.String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: java.lang.String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: java.lang.String = js.native
  /** Gets the previous Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel="previous". */
  var previousUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets or sets information about the rights for the feed. This property represents the atom:rights element or the copyright element in RSS 2.0. */
  var rights: ISyndicationText = js.native
  /** Gets the format of the source document. If the object is not loaded from a document, this property will return SyndicationFormat_Atom10. */
  var sourceFormat: SyndicationFormat = js.native
  /** Gets or sets the subtitle of the feed. This property represents the atom:subtitle element or the description element in RSS 2.0. */
  var subtitle: ISyndicationText = js.native
  /** Gets or sets the title of the syndication feed. */
  var title: ISyndicationText = js.native
  /**
                   * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
                   * @param format The format of the data.
                   * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
                   */
  def getXmlDocument(format: SyndicationFormat): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /**
                   * Initializes the object from the given feed string, which can be in either RSS 2.0 or Atom 1.0 format.
                   * @param feed The feed string, which can be in either RSS 2.0 or Atom 1.0 format.
                   */
  def load(feed: java.lang.String): scala.Unit = js.native
  /**
                   * Initializes the SyndicationFeed object from the given DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
                   * @param feedDocument The DOM object which contains XML content in either RSS 2.0 or Atom 1.0 format.
                   */
  def loadFromXml(feedDocument: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): scala.Unit = js.native
}

