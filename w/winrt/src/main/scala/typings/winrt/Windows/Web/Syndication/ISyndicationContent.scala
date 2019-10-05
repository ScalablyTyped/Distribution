package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationContent extends ISyndicationText {
  var sourceUri: Uri
}

object ISyndicationContent {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    sourceUri: Uri,
    text: String,
    `type`: String,
    xml: XmlDocument
  ): ISyndicationContent = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, sourceUri = sourceUri, text = text, xml = xml)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISyndicationContent]
  }
}

