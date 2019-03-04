package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationNode extends js.Object {
  var attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute]
  var baseUri: winrtLib.WindowsNs.FoundationNs.Uri
  var elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode]
  var language: java.lang.String
  var nodeName: java.lang.String
  var nodeNamespace: java.lang.String
  var nodeValue: java.lang.String
  def getXmlDocument(format: SyndicationFormat): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
}

object ISyndicationNode {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode],
    getXmlDocument: js.Function1[SyndicationFormat, winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument],
    language: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String
  ): ISyndicationNode = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = getXmlDocument, language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue)
  
    __obj.asInstanceOf[ISyndicationNode]
  }
}

