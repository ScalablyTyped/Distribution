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

