package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationLink")
@js.native
class SyndicationLink () extends ISyndicationLink {
  def this(uri: Uri) = this()
  def this(uri: Uri, relationship: String, title: String, mediaType: String, length: Double) = this()
  /* CompleteClass */
  override var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: Uri = js.native
  /* CompleteClass */
  override var elementExtensions: IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var length: Double = js.native
  /* CompleteClass */
  override var mediaType: String = js.native
  /* CompleteClass */
  override var nodeName: String = js.native
  /* CompleteClass */
  override var nodeNamespace: String = js.native
  /* CompleteClass */
  override var nodeValue: String = js.native
  /* CompleteClass */
  override var relationship: String = js.native
  /* CompleteClass */
  override var resourceLanguage: String = js.native
  /* CompleteClass */
  override var title: String = js.native
  /* CompleteClass */
  override var uri: Uri = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

