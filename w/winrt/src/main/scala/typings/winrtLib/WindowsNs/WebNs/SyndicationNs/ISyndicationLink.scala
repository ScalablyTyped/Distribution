package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationLink extends ISyndicationNode {
  var length: scala.Double
  var mediaType: java.lang.String
  var relationship: java.lang.String
  var resourceLanguage: java.lang.String
  var title: java.lang.String
  var uri: winrtLib.WindowsNs.FoundationNs.Uri
}

object ISyndicationLink {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode],
    getXmlDocument: js.Function1[SyndicationFormat, winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument],
    language: java.lang.String,
    length: scala.Double,
    mediaType: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    relationship: java.lang.String,
    resourceLanguage: java.lang.String,
    title: java.lang.String,
    uri: winrtLib.WindowsNs.FoundationNs.Uri
  ): ISyndicationLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeExtensions")(attributeExtensions)
    __obj.updateDynamic("baseUri")(baseUri)
    __obj.updateDynamic("elementExtensions")(elementExtensions)
    __obj.updateDynamic("getXmlDocument")(getXmlDocument)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("mediaType")(mediaType)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodeNamespace")(nodeNamespace)
    __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.updateDynamic("relationship")(relationship)
    __obj.updateDynamic("resourceLanguage")(resourceLanguage)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ISyndicationLink]
  }
}

