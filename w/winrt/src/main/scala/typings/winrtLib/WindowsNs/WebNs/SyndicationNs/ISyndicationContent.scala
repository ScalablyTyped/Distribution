package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationContent extends ISyndicationText {
  var sourceUri: winrtLib.WindowsNs.FoundationNs.Uri
}

object ISyndicationContent {
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
    sourceUri: winrtLib.WindowsNs.FoundationNs.Uri,
    text: java.lang.String,
    `type`: java.lang.String,
    xml: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  ): ISyndicationContent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attributeExtensions")(attributeExtensions)
    __obj.updateDynamic("baseUri")(baseUri)
    __obj.updateDynamic("elementExtensions")(elementExtensions)
    __obj.updateDynamic("getXmlDocument")(getXmlDocument)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodeNamespace")(nodeNamespace)
    __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.updateDynamic("sourceUri")(sourceUri)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[ISyndicationContent]
  }
}

