package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationPerson extends ISyndicationNode {
  var email: String
  var name: String
  var uri: Uri
}

object ISyndicationPerson {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    email: String,
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    name: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    uri: Uri
  ): ISyndicationPerson = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, email = email, getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language, name = name, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, uri = uri)
  
    __obj.asInstanceOf[ISyndicationPerson]
  }
}

