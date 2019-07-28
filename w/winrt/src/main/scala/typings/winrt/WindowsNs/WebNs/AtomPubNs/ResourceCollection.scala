package typings.winrt.WindowsNs.WebNs.AtomPubNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.WebNs.SyndicationNs.ISyndicationNode
import typings.winrt.WindowsNs.WebNs.SyndicationNs.ISyndicationText
import typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute
import typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationCategory
import typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub.ResourceCollection")
@js.native
class ResourceCollection () extends IResourceCollection {
  /* CompleteClass */
  override var accepts: IVectorView[String] = js.native
  /* CompleteClass */
  override var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: Uri = js.native
  /* CompleteClass */
  override var categories: IVectorView[SyndicationCategory] = js.native
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
  override var uri: Uri = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

