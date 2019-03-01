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
    getXmlDocument: js.Function1[SyndicationFormat, winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument],
    label: java.lang.String,
    language: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    scheme: java.lang.String,
    term: java.lang.String
  ): ISyndicationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeExtensions")(attributeExtensions)
    __obj.updateDynamic("baseUri")(baseUri)
    __obj.updateDynamic("elementExtensions")(elementExtensions)
    __obj.updateDynamic("getXmlDocument")(getXmlDocument)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodeNamespace")(nodeNamespace)
    __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.updateDynamic("scheme")(scheme)
    __obj.updateDynamic("term")(term)
    __obj.asInstanceOf[ISyndicationCategory]
  }
}

