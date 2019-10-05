package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationNode extends js.Object {
  var attributeExtensions: IVector[SyndicationAttribute]
  var baseUri: Uri
  var elementExtensions: IVector[ISyndicationNode]
  var language: String
  var nodeName: String
  var nodeNamespace: String
  var nodeValue: String
  def getXmlDocument(format: SyndicationFormat): XmlDocument
}

object ISyndicationNode {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String
  ): ISyndicationNode = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue)
  
    __obj.asInstanceOf[ISyndicationNode]
  }
}

