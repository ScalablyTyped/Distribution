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

trait IResourceCollection extends ISyndicationNode {
  var accepts: IVectorView[String]
  var categories: IVectorView[SyndicationCategory]
  var title: ISyndicationText
  var uri: Uri
}

object IResourceCollection {
  @scala.inline
  def apply(
    accepts: IVectorView[String],
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    categories: IVectorView[SyndicationCategory],
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    title: ISyndicationText,
    uri: Uri
  ): IResourceCollection = {
    val __obj = js.Dynamic.literal(accepts = accepts, attributeExtensions = attributeExtensions, baseUri = baseUri, categories = categories, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, title = title, uri = uri)
  
    __obj.asInstanceOf[IResourceCollection]
  }
}

