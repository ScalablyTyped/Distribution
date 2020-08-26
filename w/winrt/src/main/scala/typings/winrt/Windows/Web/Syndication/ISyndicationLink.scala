package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationLink extends ISyndicationNode {
  var length: Double = js.native
  var mediaType: String = js.native
  var relationship: String = js.native
  var resourceLanguage: String = js.native
  var title: String = js.native
  var uri: Uri = js.native
}

object ISyndicationLink {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    length: Double,
    mediaType: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    relationship: String,
    resourceLanguage: String,
    title: String,
    uri: Uri
  ): ISyndicationLink = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceLanguage = resourceLanguage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationLink]
  }
  @scala.inline
  implicit class ISyndicationLinkOps[Self <: ISyndicationLink] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelationship(value: String): Self = this.set("relationship", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceLanguage(value: String): Self = this.set("resourceLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

