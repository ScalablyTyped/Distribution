package typings
package winrtDashUwpLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates one or more collections within a workspace. */
@JSGlobal("Windows.Web.AtomPub.ResourceCollection")
@js.native
abstract class ResourceCollection () extends js.Object {
  /** Gets or sets the collection of app:accept elements. */
  var accepts: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the list of attributes of the element. */
  var attributeExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute] = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the collection of atom:category elements within the app:categories element. */
  var categories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationCategory] = js.native
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
  /** Gets the atom:title element under the app:collection element. */
  var title: winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.ISyndicationText = js.native
  /** Gets the Uniform Resource Identifier (URI) representing the href attribute of the app:collection element. This is the absolute URI resolved against the xml:base attribute when it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property will be Null. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /**
    * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
    * @param format The format of the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @return The XML document.
    */
  def getXmlDocument(format: winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

