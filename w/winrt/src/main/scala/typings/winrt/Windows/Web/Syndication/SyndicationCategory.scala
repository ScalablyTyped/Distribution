package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationCategory")
@js.native
class SyndicationCategory () extends ISyndicationCategory {
  def this(term: String) = this()
  def this(term: String, scheme: String, label: String) = this()
  /* CompleteClass */
  override var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: Uri = js.native
  /* CompleteClass */
  override var elementExtensions: IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var label: String = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var nodeName: String = js.native
  /* CompleteClass */
  override var nodeNamespace: String = js.native
  /* CompleteClass */
  override var nodeValue: String = js.native
  /* CompleteClass */
  override var scheme: String = js.native
  /* CompleteClass */
  override var term: String = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

