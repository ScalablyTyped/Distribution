package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents text, HTML, or XHTML content. This interface encapsulates elements in RSS 2.0 or Atom 1.0 that can have either text, HTML, or XHTML content. In Atom 1.0 this interface maps to an atomTextConstruct in the schema, which can be element atom:title, atom:subtitle, atom:rights or atom:summary. */
trait ISyndicationText extends ISyndicationNode {
  /** Gets or sets the content of a text content construct like atom:title. */
  var text: java.lang.String
  /** Gets or sets the type of the content. */
  var `type`: java.lang.String
  /** Gets or sets the XML content. */
  var xml: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
}

object ISyndicationText {
  @scala.inline
  def apply(
    attributeExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute],
    baseUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    elementExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode],
    getXmlDocument: js.Function1[SyndicationFormat, winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument],
    language: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    text: java.lang.String,
    `type`: java.lang.String,
    xml: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  ): ISyndicationText = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = getXmlDocument, language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, text = text, xml = xml)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISyndicationText]
  }
}

