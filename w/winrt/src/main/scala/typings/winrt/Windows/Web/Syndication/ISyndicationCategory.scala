package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationCategory extends ISyndicationNode {
  var label: String
  var scheme: String
  var term: String
}

object ISyndicationCategory {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    label: String,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    scheme: String,
    term: String
  ): ISyndicationCategory = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), label = label, language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, scheme = scheme, term = term)
  
    __obj.asInstanceOf[ISyndicationCategory]
  }
}

