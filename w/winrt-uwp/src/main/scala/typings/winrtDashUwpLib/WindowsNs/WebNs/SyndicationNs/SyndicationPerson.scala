package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an author or contributor of syndication content. */
@JSGlobal("Windows.Web.Syndication.SyndicationPerson")
@js.native
class SyndicationPerson () extends js.Object {
  /**
                   * Creates a SyndicationPerson object with the specified Name property value.
                   * @param name The name of the SyndicationPerson . This parameter represents the atom:name element.
                   */
  def this(name: java.lang.String) = this()
  /**
                   * Creates a SyndicationPerson object with the specified Name, Email, and Uri property values.
                   * @param name The name of the SyndicationPerson . This parameter represents the atom:name element.
                   * @param email Gets or sets the email address of the person. This property represents the atom:email element.
                   * @param uri Gets or sets the URI of the person. This property represents the atom:uri element. It is the absolute URI resolved against the xml:base attribute, if it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property is NULL because relative URI is not supported by the runtime URI class.
                   */
  def this(name: java.lang.String, email: java.lang.String, uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri) = this()
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /** Gets or sets the email address of the person. */
  var email: java.lang.String = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: java.lang.String = js.native
  /** Gets the name of the syndication person. */
  var name: java.lang.String = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: java.lang.String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: java.lang.String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: java.lang.String = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) of the person. This property represents the atom:uri element. It is the absolute URI resolved against the xml:base attribute, if it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property is NULL because the relative URI is not supported by the runtime URI class. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /**
                   * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
                   * @param format The format of the data.
                   * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
                   */
  def getXmlDocument(format: SyndicationFormat): winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

