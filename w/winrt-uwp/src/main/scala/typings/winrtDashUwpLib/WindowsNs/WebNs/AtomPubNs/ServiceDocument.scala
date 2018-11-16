package typings
package winrtDashUwpLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a service document. */
@JSGlobal("Windows.Web.AtomPub.ServiceDocument")
@js.native
abstract class ServiceDocument () extends js.Object {
  /** Gets the list of attributes of the element. */
  var attributeExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute] = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.ISyndicationNode] = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: java.lang.String = js.native
  /** Gets or sets the local name of the element. It must be valid according to XML 1.0. */
  var nodeName: java.lang.String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: java.lang.String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this attribute is NULL. */
  var nodeValue: java.lang.String = js.native
  /** Gets the collection of app:workspace elements in the service document. */
  var workspaces: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Workspace] = js.native
  /**
                   * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
                   * @param format The format of the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
                   * @return The XML document.
                   */
  def getXmlDocument(format: winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

