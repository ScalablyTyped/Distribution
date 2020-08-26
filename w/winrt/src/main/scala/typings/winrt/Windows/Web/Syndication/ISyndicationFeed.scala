package typings.winrt.Windows.Web.Syndication

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationFeed extends ISyndicationNode {
  var authors: IVector[SyndicationPerson] = js.native
  var categories: IVector[SyndicationCategory] = js.native
  var contributors: IVector[SyndicationPerson] = js.native
  var firstUri: Uri = js.native
  var generator: SyndicationGenerator = js.native
  var iconUri: Uri = js.native
  var id: String = js.native
  var imageUri: Uri = js.native
  var items: IVector[SyndicationItem] = js.native
  var lastUpdatedTime: Date = js.native
  var lastUri: Uri = js.native
  var links: IVector[SyndicationLink] = js.native
  var nextUri: Uri = js.native
  var previousUri: Uri = js.native
  var rights: ISyndicationText = js.native
  var sourceFormat: SyndicationFormat = js.native
  var subtitle: ISyndicationText = js.native
  var title: ISyndicationText = js.native
  def load(feed: String): Unit = js.native
  def loadFromXml(feedDocument: XmlDocument): Unit = js.native
}

object ISyndicationFeed {
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
  ): ISyndicationFeed = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], firstUri = firstUri.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUri = imageUri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], lastUri = lastUri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), loadFromXml = js.Any.fromFunction1(loadFromXml), nextUri = nextUri.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], previousUri = previousUri.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], sourceFormat = sourceFormat.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationFeed]
  }
  @scala.inline
  implicit class ISyndicationFeedOps[Self <: ISyndicationFeed] (val x: Self) extends AnyVal {
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
    def setAuthors(value: IVector[SyndicationPerson]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategories(value: IVector[SyndicationCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setContributors(value: IVector[SyndicationPerson]): Self = this.set("contributors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstUri(value: Uri): Self = this.set("firstUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerator(value: SyndicationGenerator): Self = this.set("generator", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconUri(value: Uri): Self = this.set("iconUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageUri(value: Uri): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: IVector[SyndicationItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUri(value: Uri): Self = this.set("lastUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: IVector[SyndicationLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: String => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadFromXml(value: XmlDocument => Unit): Self = this.set("loadFromXml", js.Any.fromFunction1(value))
    @scala.inline
    def setNextUri(value: Uri): Self = this.set("nextUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousUri(value: Uri): Self = this.set("previousUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setRights(value: ISyndicationText): Self = this.set("rights", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFormat(value: SyndicationFormat): Self = this.set("sourceFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtitle(value: ISyndicationText): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ISyndicationText): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

