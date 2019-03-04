package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationText extends ISyndicationNode {
  var text: java.lang.String
  var `type`: java.lang.String
  var xml: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
}

object ISyndicationText {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode],
    getXmlDocument: js.Function1[SyndicationFormat, winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument],
    language: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    text: java.lang.String,
    `type`: java.lang.String,
    xml: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  ): ISyndicationText = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = getXmlDocument, language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, text = text, xml = xml)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISyndicationText]
  }
}

