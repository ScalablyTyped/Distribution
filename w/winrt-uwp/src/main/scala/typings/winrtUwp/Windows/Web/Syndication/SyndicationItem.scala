package typings.winrtUwp.Windows.Web.Syndication

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an item in the feed. This class encapsulates information in the /rss/channel/item element in RSS 2.0 or the atom:entry element in Atom 1.0. */
@js.native
trait SyndicationItem extends js.Object {
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
  @scala.inline
  implicit class SyndicationItemOps[Self <: SyndicationItem] (val x: Self) extends AnyVal {
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
    def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = this.set("attributeExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthors(value: IVector[SyndicationPerson]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseUri(value: Uri): Self = this.set("baseUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategories(value: IVector[SyndicationCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentsUri(value: Uri): Self = this.set("commentsUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: SyndicationContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContributors(value: IVector[SyndicationPerson]): Self = this.set("contributors", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditMediaUri(value: Uri): Self = this.set("editMediaUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditUri(value: Uri): Self = this.set("editUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementExtensions(value: IVector[ISyndicationNode]): Self = this.set("elementExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = this.set("getXmlDocument", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemUri(value: Uri): Self = this.set("itemUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: IVector[SyndicationLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: String => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadFromXml(value: XmlDocument => Unit): Self = this.set("loadFromXml", js.Any.fromFunction1(value))
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeNamespace(value: String): Self = this.set("nodeNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishedDate(value: Date): Self = this.set("publishedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRights(value: ISyndicationText): Self = this.set("rights", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: SyndicationFeed): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: ISyndicationText): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ISyndicationText): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

