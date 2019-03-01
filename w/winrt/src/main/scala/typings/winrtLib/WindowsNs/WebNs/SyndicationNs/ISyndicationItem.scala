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
    getXmlDocument: js.Function1[SyndicationFormat, winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument],
    id: java.lang.String,
    itemUri: winrtLib.WindowsNs.FoundationNs.Uri,
    language: java.lang.String,
    lastUpdatedTime: stdLib.Date,
    links: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationLink],
    load: js.Function1[java.lang.String, scala.Unit],
    loadFromXml: js.Function1[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, scala.Unit],
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    publishedDate: stdLib.Date,
    rights: ISyndicationText,
    source: SyndicationFeed,
    summary: ISyndicationText,
    title: ISyndicationText
  ): ISyndicationItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeExtensions")(attributeExtensions)
    __obj.updateDynamic("authors")(authors)
    __obj.updateDynamic("baseUri")(baseUri)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("commentsUri")(commentsUri)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("contributors")(contributors)
    __obj.updateDynamic("eTag")(eTag)
    __obj.updateDynamic("editMediaUri")(editMediaUri)
    __obj.updateDynamic("editUri")(editUri)
    __obj.updateDynamic("elementExtensions")(elementExtensions)
    __obj.updateDynamic("getXmlDocument")(getXmlDocument)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("itemUri")(itemUri)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadFromXml")(loadFromXml)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodeNamespace")(nodeNamespace)
    __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.updateDynamic("publishedDate")(publishedDate)
    __obj.updateDynamic("rights")(rights)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("summary")(summary)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ISyndicationItem]
  }
}

