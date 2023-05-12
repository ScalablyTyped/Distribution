package typings.vueTestUtils.anon

import typings.std.AddEventListenerOptions
import typings.std.ChildNode
import typings.std.Document
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.GetRootNodeOptions
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeListOf
import typings.std.ParentNode
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueTestUtils.vueTestUtilsInts.`0x01`
import typings.vueTestUtils.vueTestUtilsInts.`0x02`
import typings.vueTestUtils.vueTestUtilsInts.`0x04`
import typings.vueTestUtils.vueTestUtilsInts.`0x08`
import typings.vueTestUtils.vueTestUtilsInts.`0x10`
import typings.vueTestUtils.vueTestUtilsInts.`0x20`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @vue/test-utils.@vue/test-utils/dist/types.VueNode<std.Node> */
@js.native
trait VueNodeNode extends StObject {
  
  /* standard dom */
  val ATTRIBUTE_NODE: typings.vueTestUtils.vueTestUtilsInts.`2` = js.native
  
  /** node is a CDATASection node. */
  /* standard dom */
  val CDATA_SECTION_NODE: typings.vueTestUtils.vueTestUtilsInts.`4` = js.native
  
  /** node is a Comment node. */
  /* standard dom */
  val COMMENT_NODE: typings.vueTestUtils.vueTestUtilsInts.`8` = js.native
  
  /** node is a DocumentFragment node. */
  /* standard dom */
  val DOCUMENT_FRAGMENT_NODE: typings.vueTestUtils.vueTestUtilsInts.`11` = js.native
  
  /** node is a document. */
  /* standard dom */
  val DOCUMENT_NODE: typings.vueTestUtils.vueTestUtilsInts.`9` = js.native
  
  /** Set when other is a descendant of node. */
  /* standard dom */
  val DOCUMENT_POSITION_CONTAINED_BY: `0x10` = js.native
  
  /** Set when other is an ancestor of node. */
  /* standard dom */
  val DOCUMENT_POSITION_CONTAINS: `0x08` = js.native
  
  /** Set when node and other are not in the same tree. */
  /* standard dom */
  val DOCUMENT_POSITION_DISCONNECTED: `0x01` = js.native
  
  /** Set when other is following node. */
  /* standard dom */
  val DOCUMENT_POSITION_FOLLOWING: `0x04` = js.native
  
  /* standard dom */
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: `0x20` = js.native
  
  /** Set when other is preceding node. */
  /* standard dom */
  val DOCUMENT_POSITION_PRECEDING: `0x02` = js.native
  
  /** node is a doctype. */
  /* standard dom */
  val DOCUMENT_TYPE_NODE: typings.vueTestUtils.vueTestUtilsInts.`10` = js.native
  
  /** node is an element. */
  /* standard dom */
  val ELEMENT_NODE: typings.vueTestUtils.vueTestUtilsInts.`1` = js.native
  
  /* standard dom */
  val ENTITY_NODE: typings.vueTestUtils.vueTestUtilsInts.`6` = js.native
  
  /* standard dom */
  val ENTITY_REFERENCE_NODE: typings.vueTestUtils.vueTestUtilsInts.`5` = js.native
  
  /* standard dom */
  val NOTATION_NODE: typings.vueTestUtils.vueTestUtilsInts.`12` = js.native
  
  /** node is a ProcessingInstruction node. */
  /* standard dom */
  val PROCESSING_INSTRUCTION_NODE: typings.vueTestUtils.vueTestUtilsInts.`7` = js.native
  
  /** node is a Text node. */
  /* standard dom */
  val TEXT_NODE: typings.vueTestUtils.vueTestUtilsInts.`3` = js.native
  
  var __vueParentComponent: js.UndefOr[ComponentInternalInstance] = js.native
  
  var __vue_app__ : js.UndefOr[Any] = js.native
  
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    *
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    *
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    *
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
    *
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    *
    * If an AbortSignal is passed for options's signal, then the event listener will be removed when signal is aborted.
    *
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* standard dom */
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, callback: Null, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* standard dom */
  def appendChild[T /* <: Node */](node: T): T = js.native
  
  /** Returns node's node document's document base URL. */
  /* standard dom */
  val baseURI: String = js.native
  
  /** Returns the children. */
  /* standard dom */
  val childNodes: NodeListOf[ChildNode] = js.native
  
  /** Returns a copy of node. If deep is true, the copy also includes the node's descendants. */
  /* standard dom */
  def cloneNode(): Node = js.native
  def cloneNode(deep: Boolean): Node = js.native
  
  /** Returns a bitmask indicating the position of other relative to node. */
  /* standard dom */
  def compareDocumentPosition(other: Node): Double = js.native
  
  /** Returns true if other is an inclusive descendant of node, and false otherwise. */
  /* standard dom */
  def contains(): Boolean = js.native
  def contains(other: Node): Boolean = js.native
  
  /** Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise. */
  /* standard dom */
  def dispatchEvent(event: Event): Boolean = js.native
  
  /** Returns the first child. */
  /* standard dom */
  val firstChild: ChildNode | Null = js.native
  
  /** Returns node's root. */
  /* standard dom */
  def getRootNode(): Node = js.native
  def getRootNode(options: GetRootNodeOptions): Node = js.native
  
  /** Returns whether node has children. */
  /* standard dom */
  def hasChildNodes(): Boolean = js.native
  
  /* standard dom */
  def insertBefore[T /* <: Node */](node: T): T = js.native
  def insertBefore[T /* <: Node */](node: T, child: Node): T = js.native
  
  /** Returns true if node is connected and false otherwise. */
  /* standard dom */
  val isConnected: Boolean = js.native
  
  /* standard dom */
  def isDefaultNamespace(): Boolean = js.native
  def isDefaultNamespace(namespace: String): Boolean = js.native
  
  /** Returns whether node and otherNode have the same properties. */
  /* standard dom */
  def isEqualNode(): Boolean = js.native
  def isEqualNode(otherNode: Node): Boolean = js.native
  
  /* standard dom */
  def isSameNode(): Boolean = js.native
  def isSameNode(otherNode: Node): Boolean = js.native
  
  /** Returns the last child. */
  /* standard dom */
  val lastChild: ChildNode | Null = js.native
  
  /* standard dom */
  def lookupNamespaceURI(): String | Null = js.native
  def lookupNamespaceURI(prefix: String): String | Null = js.native
  
  /* standard dom */
  def lookupPrefix(): String | Null = js.native
  def lookupPrefix(namespace: String): String | Null = js.native
  
  /** Returns the next sibling. */
  /* standard dom */
  val nextSibling: ChildNode | Null = js.native
  
  /** Returns a string appropriate for the type of node. */
  /* standard dom */
  val nodeName: String = js.native
  
  /** Returns the type of node. */
  /* standard dom */
  val nodeType: Double = js.native
  
  /* standard dom */
  var nodeValue: String | Null = js.native
  
  /** Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes. */
  /* standard dom */
  def normalize(): Unit = js.native
  
  /** Returns the node document. Returns null for documents. */
  /* standard dom */
  val ownerDocument: Document | Null = js.native
  
  /** Returns the parent element. */
  /* standard dom */
  val parentElement: HTMLElement | Null = js.native
  
  /** Returns the parent. */
  /* standard dom */
  val parentNode: ParentNode | Null = js.native
  
  /** Returns the previous sibling. */
  /* standard dom */
  val previousSibling: ChildNode | Null = js.native
  
  /* standard dom */
  def removeChild[T /* <: Node */](child: T): T = js.native
  
  /** Removes the event listener in target's event listener list with the same type, callback, and options. */
  /* standard dom */
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /* standard dom */
  def replaceChild[T /* <: Node */](node: Node, child: T): T = js.native
  
  /* standard dom */
  var textContent: String | Null = js.native
}
