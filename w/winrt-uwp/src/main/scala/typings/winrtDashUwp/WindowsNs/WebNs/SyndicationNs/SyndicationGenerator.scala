package typings.winrtDashUwp.WindowsNs.WebNs.SyndicationNs

import typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the agent or the tool used to generate the feed. This class encapsulates information in the /rss/channel/generator element in RSS 2.0 or the /atom:feed/atom:generator element in Atom 1.0. */
@JSGlobal("Windows.Web.Syndication.SyndicationGenerator")
@js.native
/** Creates a new SyndicationGenerator object. */
class SyndicationGenerator () extends js.Object {
  /**
    * Creates a new SyndicationGenerator object with the specified Text property value.
    * @param text Identifies the generator. This parameter represents the text content in the atom:generator element or the generator element in RSS 2.0.
    */
  def this(text: String) = this()
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode] = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String = js.native
  /** Gets or sets the text that identifies the generator. */
  var text: String = js.native
  /** Gets or sets the Uniform Resource Identifier (URI) of the syndication generator. */
  var uri: Uri = js.native
  /** Gets or sets the version of the generator. */
  var version: String = js.native
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

