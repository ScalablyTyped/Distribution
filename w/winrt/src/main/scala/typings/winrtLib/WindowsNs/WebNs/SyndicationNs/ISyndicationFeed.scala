package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationFeed extends ISyndicationNode {
  var authors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson]
  var categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationCategory]
  var contributors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson]
  var firstUri: winrtLib.WindowsNs.FoundationNs.Uri
  var generator: SyndicationGenerator
  var iconUri: winrtLib.WindowsNs.FoundationNs.Uri
  var id: java.lang.String
  var imageUri: winrtLib.WindowsNs.FoundationNs.Uri
  var items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationItem]
  var lastUpdatedTime: stdLib.Date
  var lastUri: winrtLib.WindowsNs.FoundationNs.Uri
  var links: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationLink]
  var nextUri: winrtLib.WindowsNs.FoundationNs.Uri
  var previousUri: winrtLib.WindowsNs.FoundationNs.Uri
  var rights: ISyndicationText
  var sourceFormat: SyndicationFormat
  var subtitle: ISyndicationText
  var title: ISyndicationText
  def load(feed: java.lang.String): scala.Unit
  def loadFromXml(feedDocument: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): scala.Unit
}

object ISyndicationFeed {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute],
    authors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationCategory],
    contributors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson],
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode],
    firstUri: winrtLib.WindowsNs.FoundationNs.Uri,
    generator: SyndicationGenerator,
    getXmlDocument: js.Function1[SyndicationFormat, winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument],
    iconUri: winrtLib.WindowsNs.FoundationNs.Uri,
    id: java.lang.String,
    imageUri: winrtLib.WindowsNs.FoundationNs.Uri,
    items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationItem],
    language: java.lang.String,
    lastUpdatedTime: stdLib.Date,
    lastUri: winrtLib.WindowsNs.FoundationNs.Uri,
    links: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationLink],
    load: js.Function1[java.lang.String, scala.Unit],
    loadFromXml: js.Function1[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, scala.Unit],
    nextUri: winrtLib.WindowsNs.FoundationNs.Uri,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    previousUri: winrtLib.WindowsNs.FoundationNs.Uri,
    rights: ISyndicationText,
    sourceFormat: SyndicationFormat,
    subtitle: ISyndicationText,
    title: ISyndicationText
  ): ISyndicationFeed = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, authors = authors, baseUri = baseUri, categories = categories, contributors = contributors, elementExtensions = elementExtensions, firstUri = firstUri, generator = generator, getXmlDocument = getXmlDocument, iconUri = iconUri, id = id, imageUri = imageUri, items = items, language = language, lastUpdatedTime = lastUpdatedTime, lastUri = lastUri, links = links, load = load, loadFromXml = loadFromXml, nextUri = nextUri, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, previousUri = previousUri, rights = rights, sourceFormat = sourceFormat, subtitle = subtitle, title = title)
  
    __obj.asInstanceOf[ISyndicationFeed]
  }
}

