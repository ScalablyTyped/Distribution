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

