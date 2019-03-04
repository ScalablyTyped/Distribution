package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationPerson extends ISyndicationNode {
  var email: java.lang.String
  var name: java.lang.String
  var uri: winrtLib.WindowsNs.FoundationNs.Uri
}

object ISyndicationPerson {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode],
    email: java.lang.String,
    getXmlDocument: js.Function1[SyndicationFormat, winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument],
    language: java.lang.String,
    name: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    uri: winrtLib.WindowsNs.FoundationNs.Uri
  ): ISyndicationPerson = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, email = email, getXmlDocument = getXmlDocument, language = language, name = name, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, uri = uri)
  
    __obj.asInstanceOf[ISyndicationPerson]
  }
}

