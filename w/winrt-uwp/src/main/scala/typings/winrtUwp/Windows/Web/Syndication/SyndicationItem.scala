package typings.winrtUwp.Windows.Web.Syndication

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an item in the feed. This class encapsulates information in the /rss/channel/item element in RSS 2.0 or the atom:entry element in Atom 1.0. */
trait SyndicationItem extends js.Object {
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute]
  /** Gets the authors of an item. This property represents the collection of all the atom:author elements under atom:entry. */
  var authors: IVector[SyndicationPerson]
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri
  /** Gets a collection of categories of the feed. This property represents the collection of all the atom:category elements under atom:feed. */
  var categories: IVector[SyndicationCategory]
  /** Gets or sets the Uniform Resource Identifier (URI) of the comments for the item. This property represents the /rss/channel/item/comments element. */
  var commentsUri: Uri
  /** Gets or sets the content of the item. */
  var content: SyndicationContent
  /** Gets a collection of the contributors of the feed. This property represents the collection of all the atom:contributor elements under atom:feed. */
  var contributors: IVector[SyndicationPerson]
  /** Gets the Uniform Resource Identifier (URI) of an editable media resource. */
  var editMediaUri: Uri
  /** Gets the Uniform Resource Identifier (URI) of an editable resource. */
  var editUri: Uri
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode]
  /** Gets an ETag HTTP header. */
  var etag: String
  /** Gets or sets the identifier for the syndication feed. */
  var id: String
  /** Gets the Uniform Resource Identifier (URI) of this item. AtomPubClient creates this property after new resource is created. */
  var itemUri: Uri
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String
  /** Gets or sets the most recent time the item was modified. This property represents the atom:updated element. */
  var lastUpdatedTime: Date
  /** Gets the links contained in the item. */
  var links: IVector[SyndicationLink]
  /** Gets or sets the local name of the element. */
  var nodeName: String
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String
  /** Gets or sets the date the item was published. */
  var publishedDate: Date
  /** Gets or sets information about the rights of an item. This property represents the atom:rights element. */
  var rights: ISyndicationText
  /** Gets or sets the source feed of the item. This property represents the atom:source element or the source element in RSS 2.0. */
  var source: SyndicationFeed
  /** Gets or sets a summary of the item. */
  var summary: ISyndicationText
  /** Gets or sets the title of the item. */
  var title: ISyndicationText
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument
  /**
    * Initializes the object from the given feed string, which can be in either RSS 2.0 or Atom 1.0 format.
    * @param item The feed string, which can be in either RSS 2.0 or Atom 1.0 format.
    */
  def load(item: String): Unit
  /**
    * Initializes the object from the given DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
    * @param itemDocument The DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
    */
  def loadFromXml(itemDocument: XmlDocument): Unit
}

object SyndicationItem {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    authors: IVector[SyndicationPerson],
    baseUri: Uri,
    categories: IVector[SyndicationCategory],
    commentsUri: Uri,
    content: SyndicationContent,
    contributors: IVector[SyndicationPerson],
    editMediaUri: Uri,
    editUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    etag: String,
    getXmlDocument: SyndicationFormat => XmlDocument,
    id: String,
    itemUri: Uri,
    language: String,
    lastUpdatedTime: Date,
    links: IVector[SyndicationLink],
    load: String => Unit,
    loadFromXml: XmlDocument => Unit,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    publishedDate: Date,
    rights: ISyndicationText,
    source: SyndicationFeed,
    summary: ISyndicationText,
    title: ISyndicationText
  ): SyndicationItem = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], commentsUri = commentsUri.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], editMediaUri = editMediaUri.asInstanceOf[js.Any], editUri = editUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), id = id.asInstanceOf[js.Any], itemUri = itemUri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), loadFromXml = js.Any.fromFunction1(loadFromXml), nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationItem]
  }
}

