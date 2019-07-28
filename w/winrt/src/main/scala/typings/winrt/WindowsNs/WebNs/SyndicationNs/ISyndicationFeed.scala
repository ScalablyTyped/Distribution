package typings.winrt.WindowsNs.WebNs.SyndicationNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationFeed extends ISyndicationNode {
  var authors: IVector[SyndicationPerson]
  var categories: IVector[SyndicationCategory]
  var contributors: IVector[SyndicationPerson]
  var firstUri: Uri
  var generator: SyndicationGenerator
  var iconUri: Uri
  var id: String
  var imageUri: Uri
  var items: IVector[SyndicationItem]
  var lastUpdatedTime: Date
  var lastUri: Uri
  var links: IVector[SyndicationLink]
  var nextUri: Uri
  var previousUri: Uri
  var rights: ISyndicationText
  var sourceFormat: SyndicationFormat
  var subtitle: ISyndicationText
  var title: ISyndicationText
  def load(feed: String): Unit
  def loadFromXml(feedDocument: XmlDocument): Unit
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
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, authors = authors, baseUri = baseUri, categories = categories, contributors = contributors, elementExtensions = elementExtensions, firstUri = firstUri, generator = generator, getXmlDocument = js.Any.fromFunction1(getXmlDocument), iconUri = iconUri, id = id, imageUri = imageUri, items = items, language = language, lastUpdatedTime = lastUpdatedTime, lastUri = lastUri, links = links, load = js.Any.fromFunction1(load), loadFromXml = js.Any.fromFunction1(loadFromXml), nextUri = nextUri, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, previousUri = previousUri, rights = rights, sourceFormat = sourceFormat, subtitle = subtitle, title = title)
  
    __obj.asInstanceOf[ISyndicationFeed]
  }
}

