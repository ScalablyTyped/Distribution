package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationItem extends ISyndicationNode {
  var authors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson]
  var categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationCategory]
  var commentsUri: winrtLib.WindowsNs.FoundationNs.Uri
  var content: SyndicationContent
  var contributors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson]
  var eTag: java.lang.String
  var editMediaUri: winrtLib.WindowsNs.FoundationNs.Uri
  var editUri: winrtLib.WindowsNs.FoundationNs.Uri
  var id: java.lang.String
  var itemUri: winrtLib.WindowsNs.FoundationNs.Uri
  var lastUpdatedTime: stdLib.Date
  var links: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationLink]
  var publishedDate: stdLib.Date
  var rights: ISyndicationText
  var source: SyndicationFeed
  var summary: ISyndicationText
  var title: ISyndicationText
  def load(item: java.lang.String): scala.Unit
  def loadFromXml(itemDocument: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): scala.Unit
}

object ISyndicationItem {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute],
    authors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationCategory],
    commentsUri: winrtLib.WindowsNs.FoundationNs.Uri,
    content: SyndicationContent,
    contributors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson],
    eTag: java.lang.String,
    editMediaUri: winrtLib.WindowsNs.FoundationNs.Uri,
    editUri: winrtLib.WindowsNs.FoundationNs.Uri,
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    id: java.lang.String,
    itemUri: winrtLib.WindowsNs.FoundationNs.Uri,
    language: java.lang.String,
    lastUpdatedTime: stdLib.Date,
    links: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationLink],
    load: java.lang.String => scala.Unit,
    loadFromXml: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument => scala.Unit,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    publishedDate: stdLib.Date,
    rights: ISyndicationText,
    source: SyndicationFeed,
    summary: ISyndicationText,
    title: ISyndicationText
  ): ISyndicationItem = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, authors = authors, baseUri = baseUri, categories = categories, commentsUri = commentsUri, content = content, contributors = contributors, eTag = eTag, editMediaUri = editMediaUri, editUri = editUri, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), id = id, itemUri = itemUri, language = language, lastUpdatedTime = lastUpdatedTime, links = links, load = js.Any.fromFunction1(load), loadFromXml = js.Any.fromFunction1(loadFromXml), nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, publishedDate = publishedDate, rights = rights, source = source, summary = summary, title = title)
  
    __obj.asInstanceOf[ISyndicationItem]
  }
}

