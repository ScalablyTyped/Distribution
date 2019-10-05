package typings.winrt.Windows.Web.Syndication

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationFeed")
@js.native
class SyndicationFeed () extends ISyndicationFeed {
  def this(title: String, subtitle: String, uri: Uri) = this()
  /* CompleteClass */
  override var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var authors: IVector[SyndicationPerson] = js.native
  /* CompleteClass */
  override var baseUri: Uri = js.native
  /* CompleteClass */
  override var categories: IVector[SyndicationCategory] = js.native
  /* CompleteClass */
  override var contributors: IVector[SyndicationPerson] = js.native
  /* CompleteClass */
  override var elementExtensions: IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var firstUri: Uri = js.native
  /* CompleteClass */
  override var generator: SyndicationGenerator = js.native
  /* CompleteClass */
  override var iconUri: Uri = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var imageUri: Uri = js.native
  /* CompleteClass */
  override var items: IVector[SyndicationItem] = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var lastUpdatedTime: Date = js.native
  /* CompleteClass */
  override var lastUri: Uri = js.native
  /* CompleteClass */
  override var links: IVector[SyndicationLink] = js.native
  /* CompleteClass */
  override var nextUri: Uri = js.native
  /* CompleteClass */
  override var nodeName: String = js.native
  /* CompleteClass */
  override var nodeNamespace: String = js.native
  /* CompleteClass */
  override var nodeValue: String = js.native
  /* CompleteClass */
  override var previousUri: Uri = js.native
  /* CompleteClass */
  override var rights: ISyndicationText = js.native
  /* CompleteClass */
  override var sourceFormat: SyndicationFormat = js.native
  /* CompleteClass */
  override var subtitle: ISyndicationText = js.native
  /* CompleteClass */
  override var title: ISyndicationText = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  /* CompleteClass */
  override def load(feed: String): Unit = js.native
  /* CompleteClass */
  override def loadFromXml(feedDocument: XmlDocument): Unit = js.native
}

