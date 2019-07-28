package typings.winrtDashUwp.WindowsNs.WebNs.AtomPubNs

import typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs.ISyndicationNode
import typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs.ISyndicationText
import typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute
import typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs.SyndicationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a workspace in a service document. */
@JSGlobal("Windows.Web.AtomPub.Workspace")
@js.native
abstract class Workspace () extends js.Object {
  /** Gets the list of attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri = js.native
  /** Gets the read-only collection of app:collection elements within the app:workspace element. */
  var collections: IVectorView[ResourceCollection] = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode] = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String = js.native
  /** Gets or sets the local name of the element. It must be valid according to XML 1.0. */
  var nodeName: String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this attribute is NULL. */
  var nodeValue: String = js.native
  /** Gets the atom:title element under the app:workspace element. */
  var title: ISyndicationText = js.native
  /**
    * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
    * @param format The format for the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @return The XML document.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

