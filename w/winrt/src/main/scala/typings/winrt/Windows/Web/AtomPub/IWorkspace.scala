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

@js.native
trait IWorkspace extends ISyndicationNode {
  var collections: IVectorView[ResourceCollection] = js.native
  var title: ISyndicationText = js.native
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
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkspace]
  }
  @scala.inline
  implicit class IWorkspaceOps[Self <: IWorkspace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollections(value: IVectorView[ResourceCollection]): Self = this.set("collections", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ISyndicationText): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

