package typings.winrt.WindowsNs.WebNs.AtomPubNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.WebNs.SyndicationNs.ISyndicationNode
import typings.winrt.WindowsNs.WebNs.SyndicationNs.ISyndicationText
import typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute
import typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkspace extends ISyndicationNode {
  var collections: IVectorView[ResourceCollection]
  var title: ISyndicationText
}

object IWorkspace {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    collections: IVectorView[ResourceCollection],
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    title: ISyndicationText
  ): IWorkspace = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, collections = collections, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, title = title)
  
    __obj.asInstanceOf[IWorkspace]
  }
}

