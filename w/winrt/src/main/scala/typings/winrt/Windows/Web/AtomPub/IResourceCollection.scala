package typings.winrt.Windows.Web.AtomPub

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Web.Syndication.ISyndicationNode
import typings.winrt.Windows.Web.Syndication.ISyndicationText
import typings.winrt.Windows.Web.Syndication.SyndicationAttribute
import typings.winrt.Windows.Web.Syndication.SyndicationCategory
import typings.winrt.Windows.Web.Syndication.SyndicationFormat
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
    val __obj = js.Dynamic.literal(accepts = accepts.asInstanceOf[js.Any], attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceCollection]
  }
}

