package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationItem")
@js.native
class SyndicationItem () extends ISyndicationItem {
  def this(title: java.lang.String, content: SyndicationContent, uri: winrtLib.WindowsNs.FoundationNs.Uri) = this()
  /* CompleteClass */
  override var attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var authors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson] = js.native
  /* CompleteClass */
  override var baseUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationCategory] = js.native
  /* CompleteClass */
  override var commentsUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var content: SyndicationContent = js.native
  /* CompleteClass */
  override var contributors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson] = js.native
  /* CompleteClass */
  override var eTag: java.lang.String = js.native
  /* CompleteClass */
  override var editMediaUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var editUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var itemUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override var lastUpdatedTime: stdLib.Date = js.native
  /* CompleteClass */
  override var links: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationLink] = js.native
  /* CompleteClass */
  override var nodeName: java.lang.String = js.native
  /* CompleteClass */
  override var nodeNamespace: java.lang.String = js.native
  /* CompleteClass */
  override var nodeValue: java.lang.String = js.native
  /* CompleteClass */
  override var publishedDate: stdLib.Date = js.native
  /* CompleteClass */
  override var rights: ISyndicationText = js.native
  /* CompleteClass */
  override var source: SyndicationFeed = js.native
  /* CompleteClass */
  override var summary: ISyndicationText = js.native
  /* CompleteClass */
  override var title: ISyndicationText = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /* CompleteClass */
  override def load(item: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def loadFromXml(itemDocument: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): scala.Unit = js.native
}

