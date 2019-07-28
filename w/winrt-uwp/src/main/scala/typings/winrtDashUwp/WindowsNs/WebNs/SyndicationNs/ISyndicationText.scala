package typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs

import typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents text, HTML, or XHTML content. This interface encapsulates elements in RSS 2.0 or Atom 1.0 that can have either text, HTML, or XHTML content. In Atom 1.0 this interface maps to an atomTextConstruct in the schema, which can be element atom:title, atom:subtitle, atom:rights or atom:summary. */
trait ISyndicationText extends ISyndicationNode {
  /** Gets or sets the content of a text content construct like atom:title. */
  var text: String
  /** Gets or sets the type of the content. */
  var `type`: String
  /** Gets or sets the XML content. */
  var xml: XmlDocument
}

object ISyndicationText {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    text: String,
    `type`: String,
    xml: XmlDocument
  ): ISyndicationText = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, text = text, xml = xml)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISyndicationText]
  }
}

