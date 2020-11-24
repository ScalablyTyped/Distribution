package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top level XML module.  The XML module is used for parsing and processing XML-based content.
  */
@JSGlobal("Titanium.XML")
@js.native
class XML ()
  extends typings.titanium.Titanium.Proxy
/**
  * The top level XML module.  The XML module is used for parsing and processing XML-based content.
  */
/* static members */
@JSGlobal("Titanium.XML")
@js.native
object XML extends js.Object {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.XML.apiName> property.
    * @deprecated Access <Titanium.XML.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.XML.bubbleParent> property.
    * @deprecated Access <Titanium.XML.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.XML.lifecycleContainer> property.
    * @deprecated Access <Titanium.XML.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Parses an XML string into a <Titanium.XML.Document> object.
    */
  def parseString(xml: String): typings.titanium.Titanium.XML.Document = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Serializes a [Node](Titanium.XML.Node) object into a string.
    */
  def serializeToString(node: typings.titanium.Titanium.XML.Node): String = js.native
  
  /**
    * Sets the value of the <Titanium.XML.bubbleParent> property.
    * @deprecated Set the value using <Titanium.XML.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.XML.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.XML.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Represents an attribute of an [Element](Titanium.XML.Element).
    */
  @js.native
  class Attr ()
    extends typings.titanium.Titanium.XML.Attr
  
  /**
    * Used to include blocks of literal text containing characters that would otherwise need
    * to be escaped.
    */
  @js.native
  class CDATASection ()
    extends typings.titanium.Titanium.XML.CDATASection
  
  /**
    * An interface extending <Titanium.XML.Node> with a set of attributes and methods for accessing character data in the DOM.
    * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-FF21A306) on Android and iOS. For reasons of compatibility with the javascript engine, text is represented by UTF-8 instead of UTF-16 on Android and iOS.
    */
  @js.native
  class CharacterData ()
    extends typings.titanium.Titanium.XML.CharacterData
  
  /**
    * Represents the contents of an XML comment.
    */
  @js.native
  class Comment ()
    extends typings.titanium.Titanium.XML.Comment
  
  /**
    * The <Titanium.XML.DOMImplementation> interface provides a number of methods for performing operations that are independent of any particular instance of the document object model.Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-102161490) on Android and iOS.
    */
  @js.native
  class DOMImplementation ()
    extends typings.titanium.Titanium.XML.DOMImplementation
  
  /**
    * The DOM Document returned from <Titanium.XML.parseString>.
    */
  @js.native
  class Document ()
    extends typings.titanium.Titanium.XML.Document
  
  /**
    * A lightweight document object used as a container for a group of nodes.
    */
  @js.native
  class DocumentFragment ()
    extends typings.titanium.Titanium.XML.DocumentFragment
  
  /**
    * Each <Titanium.XML.Document> has a `doctype` attribute whose value is either 'null' or a <Titanium.XML.DocumentType> object.
    */
  @js.native
  class DocumentType ()
    extends typings.titanium.Titanium.XML.DocumentType
  
  /**
    * Represents an element in a DOM document, a <Titanium.XML.Node> defined by a start-tag and end-tag (or an empty tag). Elements may have [attributes](Titanium.XML.Attr) associated with them.
    * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-745549614) on Android and iOS with some non-standard extensions.
    */
  @js.native
  class Element ()
    extends typings.titanium.Titanium.XML.Element
  
  /**
    * This interface represents an entity, either parsed or unparsed, in an XML document. Note that this models the entity itself not the entity declaration. The nodeName attribute that is inherited from Node contains the name of the entity. An Entity node does not have any parent.
    * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-527DCFF2) on Android and iOS.
    */
  @js.native
  class Entity ()
    extends typings.titanium.Titanium.XML.Entity
  
  /**
    * Represents an XML entity reference.
    */
  @js.native
  class EntityReference ()
    extends typings.titanium.Titanium.XML.EntityReference
  
  /**
    * A key-value paired map that maps String objects to <Titanium.XML.Node> objects.
    * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1780488922) on Android and iOS.
    */
  @js.native
  class NamedNodeMap ()
    extends typings.titanium.Titanium.XML.NamedNodeMap
  
  /**
    * A single node in the [Document](Titanium.XML.Document) tree.
    */
  @js.native
  class Node ()
    extends typings.titanium.Titanium.XML.Node
  
  /**
    * A list of <Titanium.XML.Node> objects. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-536297177) on Android and iOS.
    */
  @js.native
  class NodeList ()
    extends typings.titanium.Titanium.XML.NodeList
  
  /**
    * Represents a notation declared in the DTD.  Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-5431D1B9) on Android and iOS.
    */
  @js.native
  class Notation ()
    extends typings.titanium.Titanium.XML.Notation
  
  /**
    * A way to keep processor-specific information in the text of the document. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1004215813) on Android and iOS.
    */
  @js.native
  class ProcessingInstruction ()
    extends typings.titanium.Titanium.XML.ProcessingInstruction
  
  /**
    * Represents the textual content of an <Titanium.XML.Element> or <Titanium.XML.Attr> Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1312295772) on Android and iOS.
    */
  @js.native
  class Text ()
    extends typings.titanium.Titanium.XML.Text
}
