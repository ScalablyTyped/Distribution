package typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an item in the feed. This class encapsulates information in the /rss/channel/item element in RSS 2.0 or the atom:entry element in Atom 1.0. */
@JSGlobal("Windows.Web.Syndication.SyndicationItem")
@js.native
/** Creates a new SyndicationItem object. */
class SyndicationItem () extends js.Object {
  /**
    * Creates a new SyndicationItem object with a title, content, and URI.
    * @param title Title of the new item.
    * @param content The content for this feed item.
    * @param uri The URI associated with this item.
    */
  def this(title: String, content: SyndicationContent, uri: Uri) = this()
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /** Gets the authors of an item. This property represents the collection of all the atom:author elements under atom:entry. */
  var authors: IVector[SyndicationPerson] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri = js.native
  /** Gets a collection of categories of the feed. This property represents the collection of all the atom:category elements under atom:feed. */
  var categories: IVector[SyndicationCategory] = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) of the comments for the item. This property represents the /rss/channel/item/comments element. */
  var commentsUri: Uri = js.native
  /** Gets or sets the content of the item. */
  var content: SyndicationContent = js.native
  /** Gets a collection of the contributors of the feed. This property represents the collection of all the atom:contributor elements under atom:feed. */
  var contributors: IVector[SyndicationPerson] = js.native
  /** Gets the Uniform Resource Identifier (URI) of an editable media resource. */
  var editMediaUri: Uri = js.native
  /** Gets the Uniform Resource Identifier (URI) of an editable resource. */
  var editUri: Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode] = js.native
  /** Gets an ETag HTTP header. */
  var etag: String = js.native
  /** Gets or sets the identifier for the syndication feed. */
  var id: String = js.native
  /** Gets the Uniform Resource Identifier (URI) of this item. AtomPubClient creates this property after new resource is created. */
  var itemUri: Uri = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String = js.native
  /** Gets or sets the most recent time the item was modified. This property represents the atom:updated element. */
  var lastUpdatedTime: Date = js.native
  /** Gets the links contained in the item. */
  var links: IVector[SyndicationLink] = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String = js.native
  /** Gets or sets the date the item was published. */
  var publishedDate: Date = js.native
  /** Gets or sets information about the rights of an item. This property represents the atom:rights element. */
  var rights: ISyndicationText = js.native
  /** Gets or sets the source feed of the item. This property represents the atom:source element or the source element in RSS 2.0. */
  var source: SyndicationFeed = js.native
  /** Gets or sets a summary of the item. */
  var summary: ISyndicationText = js.native
  /** Gets or sets the title of the item. */
  var title: ISyndicationText = js.native
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  /**
    * Initializes the object from the given feed string, which can be in either RSS 2.0 or Atom 1.0 format.
    * @param item The feed string, which can be in either RSS 2.0 or Atom 1.0 format.
    */
  def load(item: String): Unit = js.native
  /**
    * Initializes the object from the given DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
    * @param itemDocument The DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
    */
  def loadFromXml(itemDocument: XmlDocument): Unit = js.native
}

