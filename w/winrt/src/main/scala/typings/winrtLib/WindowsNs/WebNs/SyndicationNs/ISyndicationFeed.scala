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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeExtensions")(attributeExtensions)
    __obj.updateDynamic("authors")(authors)
    __obj.updateDynamic("baseUri")(baseUri)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("contributors")(contributors)
    __obj.updateDynamic("elementExtensions")(elementExtensions)
    __obj.updateDynamic("firstUri")(firstUri)
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("getXmlDocument")(getXmlDocument)
    __obj.updateDynamic("iconUri")(iconUri)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("imageUri")(imageUri)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime)
    __obj.updateDynamic("lastUri")(lastUri)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadFromXml")(loadFromXml)
    __obj.updateDynamic("nextUri")(nextUri)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodeNamespace")(nodeNamespace)
    __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.updateDynamic("previousUri")(previousUri)
    __obj.updateDynamic("rights")(rights)
    __obj.updateDynamic("sourceFormat")(sourceFormat)
    __obj.updateDynamic("subtitle")(subtitle)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ISyndicationFeed]
  }
}

