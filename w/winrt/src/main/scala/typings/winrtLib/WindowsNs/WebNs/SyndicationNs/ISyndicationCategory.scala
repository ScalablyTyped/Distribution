package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationCategory extends ISyndicationNode {
  var label: java.lang.String
  var scheme: java.lang.String
  var term: java.lang.String
}

object ISyndicationCategory {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    label: java.lang.String,
    language: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    scheme: java.lang.String,
    term: java.lang.String
  ): ISyndicationCategory = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), label = label, language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, scheme = scheme, term = term)
  
    __obj.asInstanceOf[ISyndicationCategory]
  }
}

