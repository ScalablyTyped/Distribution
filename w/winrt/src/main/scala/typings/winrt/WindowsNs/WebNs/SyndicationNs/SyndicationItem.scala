package typings.winrt.WindowsNs.WebNs.SyndicationNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationItem")
@js.native
class SyndicationItem () extends ISyndicationItem {
  def this(title: String, content: SyndicationContent, uri: Uri) = this()
  /* CompleteClass */
  override var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var authors: IVector[SyndicationPerson] = js.native
  /* CompleteClass */
  override var baseUri: Uri = js.native
  /* CompleteClass */
  override var categories: IVector[SyndicationCategory] = js.native
  /* CompleteClass */
  override var commentsUri: Uri = js.native
  /* CompleteClass */
  override var content: SyndicationContent = js.native
  /* CompleteClass */
  override var contributors: IVector[SyndicationPerson] = js.native
  /* CompleteClass */
  override var eTag: String = js.native
  /* CompleteClass */
  override var editMediaUri: Uri = js.native
  /* CompleteClass */
  override var editUri: Uri = js.native
  /* CompleteClass */
  override var elementExtensions: IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var itemUri: Uri = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var lastUpdatedTime: Date = js.native
  /* CompleteClass */
  override var links: IVector[SyndicationLink] = js.native
  /* CompleteClass */
  override var nodeName: String = js.native
  /* CompleteClass */
  override var nodeNamespace: String = js.native
  /* CompleteClass */
  override var nodeValue: String = js.native
  /* CompleteClass */
  override var publishedDate: Date = js.native
  /* CompleteClass */
  override var rights: ISyndicationText = js.native
  /* CompleteClass */
  override var source: SyndicationFeed = js.native
  /* CompleteClass */
  override var summary: ISyndicationText = js.native
  /* CompleteClass */
  override var title: ISyndicationText = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  /* CompleteClass */
  override def load(item: String): Unit = js.native
  /* CompleteClass */
  override def loadFromXml(itemDocument: XmlDocument): Unit = js.native
}

