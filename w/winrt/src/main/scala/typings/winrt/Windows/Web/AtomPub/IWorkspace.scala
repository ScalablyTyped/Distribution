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

