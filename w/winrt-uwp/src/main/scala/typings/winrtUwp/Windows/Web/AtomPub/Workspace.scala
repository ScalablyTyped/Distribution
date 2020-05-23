package typings.winrtUwp.Windows.Web.AtomPub

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Web.Syndication.ISyndicationNode
import typings.winrtUwp.Windows.Web.Syndication.ISyndicationText
import typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute
import typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a workspace in a service document. */
trait Workspace extends js.Object {
  /** Gets the list of attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute]
  /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri
  /** Gets the read-only collection of app:collection elements within the app:workspace element. */
  var collections: IVectorView[ResourceCollection]
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode]
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String
  /** Gets or sets the local name of the element. It must be valid according to XML 1.0. */
  var nodeName: String
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String
  /** Gets or sets the text content of the element. If the element contains only child elements, this attribute is NULL. */
  var nodeValue: String
  /** Gets the atom:title element under the app:workspace element. */
  var title: ISyndicationText
  /**
    * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
    * @param format The format for the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @return The XML document.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument
}

object Workspace {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    collections: IVectorView[ResourceCollection],
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    title: ISyndicationText
  ): Workspace = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workspace]
  }
}

