package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationFeed")
@js.native
class SyndicationFeed () extends ISyndicationFeed {
  def this(title: java.lang.String, subtitle: java.lang.String, uri: winrtLib.WindowsNs.FoundationNs.Uri) = this()
  /* CompleteClass */
  override var attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var authors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson] = js.native
  /* CompleteClass */
  override var baseUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationCategory] = js.native
  /* CompleteClass */
  override var contributors: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationPerson] = js.native
  /* CompleteClass */
  override var elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var firstUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var generator: SyndicationGenerator = js.native
  /* CompleteClass */
  override var iconUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var imageUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationItem] = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override var lastUpdatedTime: stdLib.Date = js.native
  /* CompleteClass */
  override var lastUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var links: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationLink] = js.native
  /* CompleteClass */
  override var nextUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var nodeName: java.lang.String = js.native
  /* CompleteClass */
  override var nodeNamespace: java.lang.String = js.native
  /* CompleteClass */
  override var nodeValue: java.lang.String = js.native
  /* CompleteClass */
  override var previousUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var rights: ISyndicationText = js.native
  /* CompleteClass */
  override var sourceFormat: SyndicationFormat = js.native
  /* CompleteClass */
  override var subtitle: ISyndicationText = js.native
  /* CompleteClass */
  override var title: ISyndicationText = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /* CompleteClass */
  override def load(feed: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def loadFromXml(feedDocument: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): scala.Unit = js.native
}

