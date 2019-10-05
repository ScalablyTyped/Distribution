package typings.winrtDashUwp.Windows.Web.Syndication

import typings.winrtDashUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a generic syndication XML element extension. */
trait ISyndicationNode extends js.Object {
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute]
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode]
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String
  /** Gets or sets the local name of the element. */
  var nodeName: String
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument
}

object ISyndicationNode {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String
  ): ISyndicationNode = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue)
  
    __obj.asInstanceOf[ISyndicationNode]
  }
}

