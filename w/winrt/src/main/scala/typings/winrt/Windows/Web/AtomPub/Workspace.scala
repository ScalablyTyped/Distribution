package typings.winrt.Windows.Web.AtomPub

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Web.Syndication.ISyndicationNode
import typings.winrt.Windows.Web.Syndication.ISyndicationText
import typings.winrt.Windows.Web.Syndication.SyndicationAttribute
import typings.winrt.Windows.Web.Syndication.SyndicationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub.Workspace")
@js.native
class Workspace () extends IWorkspace {
  /* CompleteClass */
  override var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: Uri = js.native
  /* CompleteClass */
  override var collections: IVectorView[ResourceCollection] = js.native
  /* CompleteClass */
  override var elementExtensions: IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var nodeName: String = js.native
  /* CompleteClass */
  override var nodeNamespace: String = js.native
  /* CompleteClass */
  override var nodeValue: String = js.native
  /* CompleteClass */
  override var title: ISyndicationText = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

