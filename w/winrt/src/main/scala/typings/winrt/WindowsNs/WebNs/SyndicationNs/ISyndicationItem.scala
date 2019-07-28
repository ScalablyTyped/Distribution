package typings.winrt.WindowsNs.WebNs.SyndicationNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationItem extends ISyndicationNode {
  var authors: IVector[SyndicationPerson]
  var categories: IVector[SyndicationCategory]
  var commentsUri: Uri
  var content: SyndicationContent
  var contributors: IVector[SyndicationPerson]
  var eTag: String
  var editMediaUri: Uri
  var editUri: Uri
  var id: String
  var itemUri: Uri
  var lastUpdatedTime: Date
  var links: IVector[SyndicationLink]
  var publishedDate: Date
  var rights: ISyndicationText
  var source: SyndicationFeed
  var summary: ISyndicationText
  var title: ISyndicationText
  def load(item: String): Unit
  def loadFromXml(itemDocument: XmlDocument): Unit
}

object ISyndicationItem {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    authors: IVector[SyndicationPerson],
    baseUri: Uri,
    categories: IVector[SyndicationCategory],
    commentsUri: Uri,
    content: SyndicationContent,
    contributors: IVector[SyndicationPerson],
    eTag: String,
    editMediaUri: Uri,
    editUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
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
  ): ISyndicationItem = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, authors = authors, baseUri = baseUri, categories = categories, commentsUri = commentsUri, content = content, contributors = contributors, eTag = eTag, editMediaUri = editMediaUri, editUri = editUri, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), id = id, itemUri = itemUri, language = language, lastUpdatedTime = lastUpdatedTime, links = links, load = js.Any.fromFunction1(load), loadFromXml = js.Any.fromFunction1(loadFromXml), nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, publishedDate = publishedDate, rights = rights, source = source, summary = summary, title = title)
  
    __obj.asInstanceOf[ISyndicationItem]
  }
}

