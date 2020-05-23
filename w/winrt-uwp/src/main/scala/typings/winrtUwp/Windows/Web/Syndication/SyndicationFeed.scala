package typings.winrtUwp.Windows.Web.Syndication

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a feed. This class encapsulates the information in the /rss/channel element in RSS 2.0 or the atom:feed element in Atom 1.0. */
trait SyndicationFeed extends js.Object {
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute]
  /** Gets the authors of an item. This property represents the collection of all the atom:author elements under atom:entry. */
  var authors: IVector[SyndicationPerson]
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri
  /** Gets a collection of categories of the feed. This property represents the collection of all the atom:category elements under atom:feed. */
  var categories: IVector[SyndicationCategory]
  /** Gets a collection of the contributors of the feed. This property represents the collection of all the atom:contributor elements under atom:feed. */
  var contributors: IVector[SyndicationPerson]
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode]
  /** Gets the first Uniform Resource Identifier (URI) in a sequence. This property represents the atom:link element with attribute rel=”first”. */
  var firstUri: Uri
  /** Gets or sets the generator of the feed. This property represents the atom:generator element or the generator element in RSS 2.0. */
  var generator: SyndicationGenerator
  /** Gets or sets the Uniform Resource Identifier (URI) for the image for the feed. This property represents the atom:icon element. */
  var iconUri: Uri
  /** Gets or sets the identifier for the syndication feed. */
  var id: String
  /** Gets or sets the Uniform Resource Identifier (URI) of the logo for the feed. This property represents the atom:logo element or image/uri element in RSS 2.0. */
  var imageUri: Uri
  /** Gets the collection of items in the feed. This property represents the collection of atom:entry elements or a collection of item elements in RSS 2.0. */
  var items: IVector[SyndicationItem]
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String
  /** Gets or sets the time the feed was last modified. This property represents the /rss/channel/lastBuildDate or atom:updated element. */
  var lastUpdatedTime: Date
  /** Gets the last Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel=”last”. */
  var lastUri: Uri
  /** Gets the links associated with the feed. This property represents a collection of the atom:link elements under atom:feed. In RSS 2.0, this maps to the link element. */
  var links: IVector[SyndicationLink]
  /** Gets the next Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel="next". */
  var nextUri: Uri
  /** Gets or sets the local name of the element. */
  var nodeName: String
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String
  /** Gets the previous Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel="previous". */
  var previousUri: Uri
  /** Gets or sets information about the rights for the feed. This property represents the atom:rights element or the copyright element in RSS 2.0. */
  var rights: ISyndicationText
  /** Gets the format of the source document. If the object is not loaded from a document, this property will return SyndicationFormat_Atom10. */
  var sourceFormat: SyndicationFormat
  /** Gets or sets the subtitle of the feed. This property represents the atom:subtitle element or the description element in RSS 2.0. */
  var subtitle: ISyndicationText
  /** Gets or sets the title of the syndication feed. */
  var title: ISyndicationText
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument
  /**
    * Initializes the object from the given feed string, which can be in either RSS 2.0 or Atom 1.0 format.
    * @param feed The feed string, which can be in either RSS 2.0 or Atom 1.0 format.
    */
  def load(feed: String): Unit
  /**
    * Initializes the SyndicationFeed object from the given DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
    * @param feedDocument The DOM object which contains XML content in either RSS 2.0 or Atom 1.0 format.
    */
  def loadFromXml(feedDocument: XmlDocument): Unit
}

object SyndicationFeed {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    authors: IVector[SyndicationPerson],
    baseUri: Uri,
    categories: IVector[SyndicationCategory],
    contributors: IVector[SyndicationPerson],
    elementExtensions: IVector[ISyndicationNode],
    firstUri: Uri,
    generator: SyndicationGenerator,
    getXmlDocument: SyndicationFormat => XmlDocument,
    iconUri: Uri,
    id: String,
    imageUri: Uri,
    items: IVector[SyndicationItem],
    language: String,
    lastUpdatedTime: Date,
    lastUri: Uri,
    links: IVector[SyndicationLink],
    load: String => Unit,
    loadFromXml: XmlDocument => Unit,
    nextUri: Uri,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    previousUri: Uri,
    rights: ISyndicationText,
    sourceFormat: SyndicationFormat,
    subtitle: ISyndicationText,
    title: ISyndicationText
  ): SyndicationFeed = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], firstUri = firstUri.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUri = imageUri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], lastUri = lastUri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), loadFromXml = js.Any.fromFunction1(loadFromXml), nextUri = nextUri.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], previousUri = previousUri.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], sourceFormat = sourceFormat.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationFeed]
  }
}

