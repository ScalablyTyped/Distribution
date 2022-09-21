package typings.typeformEmbed

import typings.std.Animation
import typings.std.AnimationEvent
import typings.std.Attr
import typings.std.ChildNode
import typings.std.ClipboardEvent
import typings.std.DOMRect
import typings.std.DOMRectList
import typings.std.DOMStringMap
import typings.std.DOMTokenList
import typings.std.Document
import typings.std.DragEvent
import typings.std.Element
import typings.std.ElementInternals
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.InsertPosition
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeListOf
import typings.std.OnErrorEventHandler
import typings.std.ParentNode
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.ReferrerPolicy
import typings.std.SecurityPolicyViolationEvent
import typings.std.ShadowRoot
import typings.std.ShadowRootInit
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.std.WindowProxy
import typings.typeformEmbed.anon.PartialHTMLIFrameElementW
import typings.typeformEmbed.typeformEmbedStrings.a
import typings.typeformEmbed.typeformEmbedStrings.fullscreenchange
import typings.typeformEmbed.typeformEmbedStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iframeOptionsMod {
  
  /* Inlined std.Omit<std.HTMLIFrameElement, 'style'> & @typeform/embed.@typeform/embed/types/base/iframe-options.StyleString */
  trait HTMLIFrameElementWithStyleString extends StObject {
    
    var ATTRIBUTE_NODE: Double
    
    var CDATA_SECTION_NODE: Double
    
    var COMMENT_NODE: Double
    
    var DOCUMENT_FRAGMENT_NODE: Double
    
    var DOCUMENT_NODE: Double
    
    var DOCUMENT_POSITION_CONTAINED_BY: Double
    
    var DOCUMENT_POSITION_CONTAINS: Double
    
    var DOCUMENT_POSITION_DISCONNECTED: Double
    
    var DOCUMENT_POSITION_FOLLOWING: Double
    
    var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double
    
    var DOCUMENT_POSITION_PRECEDING: Double
    
    var DOCUMENT_TYPE_NODE: Double
    
    var ELEMENT_NODE: Double
    
    var ENTITY_NODE: Double
    
    var ENTITY_REFERENCE_NODE: Double
    
    var NOTATION_NODE: Double
    
    var PROCESSING_INSTRUCTION_NODE: Double
    
    var TEXT_NODE: Double
    
    var accessKey: String
    
    var accessKeyLabel: String
    
    @JSName("addEventListener")
    var addEventListener_Original: js.Function2[
        fullscreenchange, 
        /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
        Unit
      ]
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
    
    def after(nodes: (Node | String)*): Unit
    @JSName("after")
    var after_Original: js.Function1[/* repeated */ Node | String, Unit]
    
    var align: String
    
    var allow: String
    
    var allowFullscreen: Boolean
    
    def animate(): Animation
    @JSName("animate")
    var animate_Original: js.Function0[Animation]
    
    def append(nodes: (Node | String)*): Unit
    
    def appendChild[T /* <: Node */](node: T): T
    @JSName("appendChild")
    var appendChild_Original: js.Function1[/* node */ Node, Node]
    
    @JSName("append")
    var append_Original: js.Function1[/* repeated */ Node | String, Unit]
    
    var ariaAtomic: js.UndefOr[String | Null] = js.undefined
    
    var ariaAutoComplete: js.UndefOr[String | Null] = js.undefined
    
    var ariaBusy: js.UndefOr[String | Null] = js.undefined
    
    var ariaChecked: js.UndefOr[String | Null] = js.undefined
    
    var ariaColCount: js.UndefOr[String | Null] = js.undefined
    
    var ariaColIndex: js.UndefOr[String | Null] = js.undefined
    
    var ariaColSpan: js.UndefOr[String | Null] = js.undefined
    
    var ariaCurrent: js.UndefOr[String | Null] = js.undefined
    
    var ariaDisabled: js.UndefOr[String | Null] = js.undefined
    
    var ariaExpanded: js.UndefOr[String | Null] = js.undefined
    
    var ariaHasPopup: js.UndefOr[String | Null] = js.undefined
    
    var ariaHidden: js.UndefOr[String | Null] = js.undefined
    
    var ariaKeyShortcuts: js.UndefOr[String | Null] = js.undefined
    
    var ariaLabel: js.UndefOr[String | Null] = js.undefined
    
    var ariaLevel: js.UndefOr[String | Null] = js.undefined
    
    var ariaLive: js.UndefOr[String | Null] = js.undefined
    
    var ariaModal: js.UndefOr[String | Null] = js.undefined
    
    var ariaMultiLine: js.UndefOr[String | Null] = js.undefined
    
    var ariaMultiSelectable: js.UndefOr[String | Null] = js.undefined
    
    var ariaOrientation: js.UndefOr[String | Null] = js.undefined
    
    var ariaPlaceholder: js.UndefOr[String | Null] = js.undefined
    
    var ariaPosInSet: js.UndefOr[String | Null] = js.undefined
    
    var ariaPressed: js.UndefOr[String | Null] = js.undefined
    
    var ariaReadOnly: js.UndefOr[String | Null] = js.undefined
    
    var ariaRequired: js.UndefOr[String | Null] = js.undefined
    
    var ariaRoleDescription: js.UndefOr[String | Null] = js.undefined
    
    var ariaRowCount: js.UndefOr[String | Null] = js.undefined
    
    var ariaRowIndex: js.UndefOr[String | Null] = js.undefined
    
    var ariaRowSpan: js.UndefOr[String | Null] = js.undefined
    
    var ariaSelected: js.UndefOr[String | Null] = js.undefined
    
    var ariaSetSize: js.UndefOr[String | Null] = js.undefined
    
    var ariaSort: js.UndefOr[String | Null] = js.undefined
    
    var ariaValueMax: js.UndefOr[String | Null] = js.undefined
    
    var ariaValueMin: js.UndefOr[String | Null] = js.undefined
    
    var ariaValueNow: js.UndefOr[String | Null] = js.undefined
    
    var ariaValueText: js.UndefOr[String | Null] = js.undefined
    
    var assignedSlot: js.UndefOr[HTMLSlotElement | Null] = js.undefined
    
    def attachInternals(): ElementInternals
    @JSName("attachInternals")
    var attachInternals_Original: js.Function0[ElementInternals]
    
    def attachShadow(init: ShadowRootInit): ShadowRoot
    @JSName("attachShadow")
    var attachShadow_Original: js.Function1[/* init */ ShadowRootInit, ShadowRoot]
    
    var attributes: NamedNodeMap
    
    var autocapitalize: String
    
    var autofocus: Boolean
    
    var baseURI: String
    
    def before(nodes: (Node | String)*): Unit
    @JSName("before")
    var before_Original: js.Function1[/* repeated */ Node | String, Unit]
    
    def blur(): Unit
    @JSName("blur")
    var blur_Original: js.Function0[Unit]
    
    var childElementCount: Double
    
    var childNodes: NodeListOf[ChildNode]
    
    var children: HTMLCollection
    
    var classList: DOMTokenList
    
    var className: String
    
    def click(): Unit
    @JSName("click")
    var click_Original: js.Function0[Unit]
    
    var clientHeight: Double
    
    var clientLeft: Double
    
    var clientTop: Double
    
    var clientWidth: Double
    
    def cloneNode(): Node
    @JSName("cloneNode")
    var cloneNode_Original: js.Function0[Node]
    
    @JSName("closest")
    var closest_Original: js.Function1[a, HTMLAnchorElement | Null]
    @JSName("closest")
    def closest_a(selector: a): HTMLAnchorElement | Null
    
    def compareDocumentPosition(other: Node): Double
    @JSName("compareDocumentPosition")
    var compareDocumentPosition_Original: js.Function1[/* other */ Node, Double]
    
    def contains(): Boolean
    @JSName("contains")
    var contains_Original: js.Function0[Boolean]
    
    var contentDocument: js.UndefOr[Document | Null] = js.undefined
    
    var contentEditable: String
    
    var contentWindow: js.UndefOr[WindowProxy | Null] = js.undefined
    
    var dataset: DOMStringMap
    
    var dir: String
    
    def dispatchEvent(event: Event): Boolean
    @JSName("dispatchEvent")
    var dispatchEvent_Original: js.Function1[/* event */ Event, Boolean]
    
    var draggable: Boolean
    
    var enterKeyHint: String
    
    var firstChild: js.UndefOr[ChildNode | Null] = js.undefined
    
    var firstElementChild: js.UndefOr[Element | Null] = js.undefined
    
    def focus(): Unit
    @JSName("focus")
    var focus_Original: js.Function0[Unit]
    
    var frameBorder: String
    
    def getAnimations(): js.Array[Animation]
    @JSName("getAnimations")
    var getAnimations_Original: js.Function0[js.Array[Animation]]
    
    def getAttribute(qualifiedName: String): String | Null
    
    def getAttributeNS(namespace: String, localName: String): String | Null
    @JSName("getAttributeNS")
    var getAttributeNS_Original: js.Function2[/* namespace */ String, /* localName */ String, String | Null]
    
    def getAttributeNames(): js.Array[String]
    @JSName("getAttributeNames")
    var getAttributeNames_Original: js.Function0[js.Array[String]]
    
    def getAttributeNode(qualifiedName: String): Attr | Null
    
    def getAttributeNodeNS(namespace: String, localName: String): Attr | Null
    @JSName("getAttributeNodeNS")
    var getAttributeNodeNS_Original: js.Function2[/* namespace */ String, /* localName */ String, Attr | Null]
    
    @JSName("getAttributeNode")
    var getAttributeNode_Original: js.Function1[/* qualifiedName */ String, Attr | Null]
    
    @JSName("getAttribute")
    var getAttribute_Original: js.Function1[/* qualifiedName */ String, String | Null]
    
    def getBoundingClientRect(): DOMRect
    @JSName("getBoundingClientRect")
    var getBoundingClientRect_Original: js.Function0[DOMRect]
    
    def getClientRects(): DOMRectList
    @JSName("getClientRects")
    var getClientRects_Original: js.Function0[DOMRectList]
    
    def getElementsByClassName(classNames: String): HTMLCollectionOf[Element]
    @JSName("getElementsByClassName")
    var getElementsByClassName_Original: js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]
    
    @JSName("getElementsByTagNameNS")
    var getElementsByTagNameNS_Original: js.Function2[
        httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
        /* localName */ String, 
        HTMLCollectionOf[HTMLElement]
      ]
    @JSName("getElementsByTagNameNS")
    def getElementsByTagNameNS_httpwwww3org1999xhtml(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, localName: String): HTMLCollectionOf[HTMLElement]
    
    @JSName("getElementsByTagName")
    var getElementsByTagName_Original: js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]
    @JSName("getElementsByTagName")
    def getElementsByTagName_a(qualifiedName: a): HTMLCollectionOf[HTMLAnchorElement]
    
    def getRootNode(): Node
    @JSName("getRootNode")
    var getRootNode_Original: js.Function0[Node]
    
    def getSVGDocument(): Document | Null
    @JSName("getSVGDocument")
    var getSVGDocument_Original: js.Function0[Document | Null]
    
    def hasAttribute(qualifiedName: String): Boolean
    
    def hasAttributeNS(namespace: String, localName: String): Boolean
    @JSName("hasAttributeNS")
    var hasAttributeNS_Original: js.Function2[/* namespace */ String, /* localName */ String, Boolean]
    
    @JSName("hasAttribute")
    var hasAttribute_Original: js.Function1[/* qualifiedName */ String, Boolean]
    
    def hasAttributes(): Boolean
    @JSName("hasAttributes")
    var hasAttributes_Original: js.Function0[Boolean]
    
    def hasChildNodes(): Boolean
    @JSName("hasChildNodes")
    var hasChildNodes_Original: js.Function0[Boolean]
    
    def hasPointerCapture(pointerId: Double): Boolean
    @JSName("hasPointerCapture")
    var hasPointerCapture_Original: js.Function1[/* pointerId */ Double, Boolean]
    
    var height: String
    
    var hidden: Boolean
    
    var id: String
    
    var inert: Boolean
    
    var innerHTML: String
    
    var innerText: String
    
    var inputMode: String
    
    def insertAdjacentElement(where: InsertPosition, element: Element): Element | Null
    @JSName("insertAdjacentElement")
    var insertAdjacentElement_Original: js.Function2[/* where */ InsertPosition, /* element */ Element, Element | Null]
    
    def insertAdjacentHTML(position: InsertPosition, text: String): Unit
    @JSName("insertAdjacentHTML")
    var insertAdjacentHTML_Original: js.Function2[/* position */ InsertPosition, /* text */ String, Unit]
    
    def insertAdjacentText(where: InsertPosition, data: String): Unit
    @JSName("insertAdjacentText")
    var insertAdjacentText_Original: js.Function2[/* where */ InsertPosition, /* data */ String, Unit]
    
    def insertBefore[T /* <: Node */](node: T): T
    @JSName("insertBefore")
    var insertBefore_Original: js.Function1[/* node */ Node, Node]
    
    var isConnected: Boolean
    
    var isContentEditable: Boolean
    
    def isDefaultNamespace(): Boolean
    @JSName("isDefaultNamespace")
    var isDefaultNamespace_Original: js.Function0[Boolean]
    
    def isEqualNode(): Boolean
    @JSName("isEqualNode")
    var isEqualNode_Original: js.Function0[Boolean]
    
    def isSameNode(): Boolean
    @JSName("isSameNode")
    var isSameNode_Original: js.Function0[Boolean]
    
    var lang: String
    
    var lastChild: js.UndefOr[ChildNode | Null] = js.undefined
    
    var lastElementChild: js.UndefOr[Element | Null] = js.undefined
    
    var localName: String
    
    var longDesc: String
    
    def lookupNamespaceURI(): String | Null
    @JSName("lookupNamespaceURI")
    var lookupNamespaceURI_Original: js.Function0[String | Null]
    
    def lookupPrefix(): String | Null
    @JSName("lookupPrefix")
    var lookupPrefix_Original: js.Function0[String | Null]
    
    var marginHeight: String
    
    var marginWidth: String
    
    def matches(selectors: String): Boolean
    @JSName("matches")
    var matches_Original: js.Function1[/* selectors */ String, Boolean]
    
    var name: String
    
    var namespaceURI: js.UndefOr[String | Null] = js.undefined
    
    var nextElementSibling: js.UndefOr[Element | Null] = js.undefined
    
    var nextSibling: js.UndefOr[ChildNode | Null] = js.undefined
    
    var nodeName: String
    
    var nodeType: Double
    
    var nodeValue: js.UndefOr[String | Null] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    def normalize(): Unit
    @JSName("normalize")
    var normalize_Original: js.Function0[Unit]
    
    var offsetHeight: Double
    
    var offsetLeft: Double
    
    var offsetParent: js.UndefOr[Element | Null] = js.undefined
    
    var offsetTop: Double
    
    var offsetWidth: Double
    
    var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]) | Null] = js.undefined
    
    var onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]) | Null] = js.undefined
    
    var oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var oncopy: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null] = js.undefined
    
    var oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oncut: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null] = js.undefined
    
    var ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onerror: OnErrorEventHandler
    
    var onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]) | Null] = js.undefined
    
    var onformdata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]) | Null] = js.undefined
    
    var onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onpaste: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]) | Null] = js.undefined
    
    var onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onprogress: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]) | Null
      ] = js.undefined
    
    var onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]) | Null] = js.undefined
    
    var onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onsecuritypolicyviolation: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]) | Null
      ] = js.undefined
    
    var onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onslotchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]) | Null] = js.undefined
    
    var onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontransitioncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionrun: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkittransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]) | Null] = js.undefined
    
    var outerHTML: String
    
    var outerText: String
    
    var ownerDocument: Document
    
    var parentElement: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var parentNode: js.UndefOr[ParentNode | Null] = js.undefined
    
    var part: DOMTokenList
    
    var prefix: js.UndefOr[String | Null] = js.undefined
    
    def prepend(nodes: (Node | String)*): Unit
    @JSName("prepend")
    var prepend_Original: js.Function1[/* repeated */ Node | String, Unit]
    
    var previousElementSibling: js.UndefOr[Element | Null] = js.undefined
    
    var previousSibling: js.UndefOr[ChildNode | Null] = js.undefined
    
    @JSName("querySelectorAll")
    var querySelectorAll_Original: js.Function1[a, NodeListOf[HTMLAnchorElement]]
    @JSName("querySelectorAll")
    def querySelectorAll_a(selectors: a): NodeListOf[HTMLAnchorElement]
    
    @JSName("querySelector")
    var querySelector_Original: js.Function1[a, HTMLAnchorElement | Null]
    @JSName("querySelector")
    def querySelector_a(selectors: a): HTMLAnchorElement | Null
    
    var referrerPolicy: ReferrerPolicy
    
    def releasePointerCapture(pointerId: Double): Unit
    @JSName("releasePointerCapture")
    var releasePointerCapture_Original: js.Function1[/* pointerId */ Double, Unit]
    
    def remove(): Unit
    
    def removeAttribute(qualifiedName: String): Unit
    
    def removeAttributeNS(namespace: String, localName: String): Unit
    @JSName("removeAttributeNS")
    var removeAttributeNS_Original: js.Function2[/* namespace */ String, /* localName */ String, Unit]
    
    def removeAttributeNode(attr: Attr): Attr
    @JSName("removeAttributeNode")
    var removeAttributeNode_Original: js.Function1[/* attr */ Attr, Attr]
    
    @JSName("removeAttribute")
    var removeAttribute_Original: js.Function1[/* qualifiedName */ String, Unit]
    
    def removeChild[T /* <: Node */](child: T): T
    @JSName("removeChild")
    var removeChild_Original: js.Function1[/* child */ Node, Node]
    
    @JSName("removeEventListener")
    var removeEventListener_Original: js.Function2[
        fullscreenchange, 
        /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
        Unit
      ]
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
    
    @JSName("remove")
    var remove_Original: js.Function0[Unit]
    
    def replaceChild[T /* <: Node */](node: Node, child: T): T
    @JSName("replaceChild")
    var replaceChild_Original: js.Function2[/* node */ Node, /* child */ Node, Node]
    
    def replaceChildren(nodes: (Node | String)*): Unit
    @JSName("replaceChildren")
    var replaceChildren_Original: js.Function1[/* repeated */ Node | String, Unit]
    
    def replaceWith(nodes: (Node | String)*): Unit
    @JSName("replaceWith")
    var replaceWith_Original: js.Function1[/* repeated */ Node | String, Unit]
    
    def requestFullscreen(): js.Promise[Unit]
    @JSName("requestFullscreen")
    var requestFullscreen_Original: js.Function0[js.Promise[Unit]]
    
    def requestPointerLock(): Unit
    @JSName("requestPointerLock")
    var requestPointerLock_Original: js.Function0[Unit]
    
    var sandbox: DOMTokenList
    
    def scroll(): Unit
    
    def scrollBy(): Unit
    @JSName("scrollBy")
    var scrollBy_Original: js.Function0[Unit]
    
    var scrollHeight: Double
    
    def scrollIntoView(): Unit
    @JSName("scrollIntoView")
    var scrollIntoView_Original: js.Function0[Unit]
    
    var scrollLeft: Double
    
    def scrollTo(): Unit
    @JSName("scrollTo")
    var scrollTo_Original: js.Function0[Unit]
    
    var scrollTop: Double
    
    var scrollWidth: Double
    
    @JSName("scroll")
    var scroll_Original: js.Function0[Unit]
    
    var scrolling: String
    
    def setAttribute(qualifiedName: String, value: String): Unit
    
    def setAttributeNS(namespace: String, qualifiedName: String, value: String): Unit
    @JSName("setAttributeNS")
    var setAttributeNS_Original: js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
    
    def setAttributeNode(attr: Attr): Attr | Null
    
    def setAttributeNodeNS(attr: Attr): Attr | Null
    @JSName("setAttributeNodeNS")
    var setAttributeNodeNS_Original: js.Function1[/* attr */ Attr, Attr | Null]
    
    @JSName("setAttributeNode")
    var setAttributeNode_Original: js.Function1[/* attr */ Attr, Attr | Null]
    
    @JSName("setAttribute")
    var setAttribute_Original: js.Function2[/* qualifiedName */ String, /* value */ String, Unit]
    
    def setPointerCapture(pointerId: Double): Unit
    @JSName("setPointerCapture")
    var setPointerCapture_Original: js.Function1[/* pointerId */ Double, Unit]
    
    var shadowRoot: js.UndefOr[ShadowRoot | Null] = js.undefined
    
    var slot: String
    
    var spellcheck: Boolean
    
    var src: String
    
    var srcdoc: String
    
    var style: String
    
    var tabIndex: Double
    
    var tagName: String
    
    var textContent: js.UndefOr[String | Null] = js.undefined
    
    var title: String
    
    def toggleAttribute(qualifiedName: String): Boolean
    @JSName("toggleAttribute")
    var toggleAttribute_Original: js.Function1[/* qualifiedName */ String, Boolean]
    
    var translate: Boolean
    
    def webkitMatchesSelector(selectors: String): Boolean
    @JSName("webkitMatchesSelector")
    var webkitMatchesSelector_Original: js.Function1[/* selectors */ String, Boolean]
    
    var width: String
  }
  object HTMLIFrameElementWithStyleString {
    
    inline def apply(
      ATTRIBUTE_NODE: Double,
      CDATA_SECTION_NODE: Double,
      COMMENT_NODE: Double,
      DOCUMENT_FRAGMENT_NODE: Double,
      DOCUMENT_NODE: Double,
      DOCUMENT_POSITION_CONTAINED_BY: Double,
      DOCUMENT_POSITION_CONTAINS: Double,
      DOCUMENT_POSITION_DISCONNECTED: Double,
      DOCUMENT_POSITION_FOLLOWING: Double,
      DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double,
      DOCUMENT_POSITION_PRECEDING: Double,
      DOCUMENT_TYPE_NODE: Double,
      ELEMENT_NODE: Double,
      ENTITY_NODE: Double,
      ENTITY_REFERENCE_NODE: Double,
      NOTATION_NODE: Double,
      PROCESSING_INSTRUCTION_NODE: Double,
      TEXT_NODE: Double,
      accessKey: String,
      accessKeyLabel: String,
      addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]) => Unit,
      after: /* repeated */ Node | String => Unit,
      align: String,
      allow: String,
      allowFullscreen: Boolean,
      animate: () => Animation,
      append: /* repeated */ Node | String => Unit,
      appendChild: /* node */ Node => Node,
      attachInternals: () => ElementInternals,
      attachShadow: /* init */ ShadowRootInit => ShadowRoot,
      attributes: NamedNodeMap,
      autocapitalize: String,
      autofocus: Boolean,
      baseURI: String,
      before: /* repeated */ Node | String => Unit,
      blur: () => Unit,
      childElementCount: Double,
      childNodes: NodeListOf[ChildNode],
      children: HTMLCollection,
      classList: DOMTokenList,
      className: String,
      click: () => Unit,
      clientHeight: Double,
      clientLeft: Double,
      clientTop: Double,
      clientWidth: Double,
      cloneNode: () => Node,
      closest: a => HTMLAnchorElement | Null,
      compareDocumentPosition: /* other */ Node => Double,
      contains: () => Boolean,
      contentEditable: String,
      dataset: DOMStringMap,
      dir: String,
      dispatchEvent: /* event */ Event => Boolean,
      draggable: Boolean,
      enterKeyHint: String,
      focus: () => Unit,
      frameBorder: String,
      getAnimations: () => js.Array[Animation],
      getAttribute: /* qualifiedName */ String => String | Null,
      getAttributeNS: (/* namespace */ String, /* localName */ String) => String | Null,
      getAttributeNames: () => js.Array[String],
      getAttributeNode: /* qualifiedName */ String => Attr | Null,
      getAttributeNodeNS: (/* namespace */ String, /* localName */ String) => Attr | Null,
      getBoundingClientRect: () => DOMRect,
      getClientRects: () => DOMRectList,
      getElementsByClassName: /* classNames */ String => HTMLCollectionOf[Element],
      getElementsByTagName: a => HTMLCollectionOf[HTMLAnchorElement],
      getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement],
      getRootNode: () => Node,
      getSVGDocument: () => Document | Null,
      hasAttribute: /* qualifiedName */ String => Boolean,
      hasAttributeNS: (/* namespace */ String, /* localName */ String) => Boolean,
      hasAttributes: () => Boolean,
      hasChildNodes: () => Boolean,
      hasPointerCapture: /* pointerId */ Double => Boolean,
      height: String,
      hidden: Boolean,
      id: String,
      inert: Boolean,
      innerHTML: String,
      innerText: String,
      inputMode: String,
      insertAdjacentElement: (/* where */ InsertPosition, /* element */ Element) => Element | Null,
      insertAdjacentHTML: (/* position */ InsertPosition, /* text */ String) => Unit,
      insertAdjacentText: (/* where */ InsertPosition, /* data */ String) => Unit,
      insertBefore: /* node */ Node => Node,
      isConnected: Boolean,
      isContentEditable: Boolean,
      isDefaultNamespace: () => Boolean,
      isEqualNode: () => Boolean,
      isSameNode: () => Boolean,
      lang: String,
      localName: String,
      longDesc: String,
      lookupNamespaceURI: () => String | Null,
      lookupPrefix: () => String | Null,
      marginHeight: String,
      marginWidth: String,
      matches: /* selectors */ String => Boolean,
      name: String,
      nodeName: String,
      nodeType: Double,
      normalize: () => Unit,
      offsetHeight: Double,
      offsetLeft: Double,
      offsetTop: Double,
      offsetWidth: Double,
      outerHTML: String,
      outerText: String,
      ownerDocument: Document,
      part: DOMTokenList,
      prepend: /* repeated */ Node | String => Unit,
      querySelector: a => HTMLAnchorElement | Null,
      querySelectorAll: a => NodeListOf[HTMLAnchorElement],
      referrerPolicy: ReferrerPolicy,
      releasePointerCapture: /* pointerId */ Double => Unit,
      remove: () => Unit,
      removeAttribute: /* qualifiedName */ String => Unit,
      removeAttributeNS: (/* namespace */ String, /* localName */ String) => Unit,
      removeAttributeNode: /* attr */ Attr => Attr,
      removeChild: /* child */ Node => Node,
      removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]) => Unit,
      replaceChild: (/* node */ Node, /* child */ Node) => Node,
      replaceChildren: /* repeated */ Node | String => Unit,
      replaceWith: /* repeated */ Node | String => Unit,
      requestFullscreen: () => js.Promise[Unit],
      requestPointerLock: () => Unit,
      sandbox: DOMTokenList,
      scroll: () => Unit,
      scrollBy: () => Unit,
      scrollHeight: Double,
      scrollIntoView: () => Unit,
      scrollLeft: Double,
      scrollTo: () => Unit,
      scrollTop: Double,
      scrollWidth: Double,
      scrolling: String,
      setAttribute: (/* qualifiedName */ String, /* value */ String) => Unit,
      setAttributeNS: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit,
      setAttributeNode: /* attr */ Attr => Attr | Null,
      setAttributeNodeNS: /* attr */ Attr => Attr | Null,
      setPointerCapture: /* pointerId */ Double => Unit,
      slot: String,
      spellcheck: Boolean,
      src: String,
      srcdoc: String,
      style: String,
      tabIndex: Double,
      tagName: String,
      title: String,
      toggleAttribute: /* qualifiedName */ String => Boolean,
      translate: Boolean,
      webkitMatchesSelector: /* selectors */ String => Boolean,
      width: String
    ): HTMLIFrameElementWithStyleString = {
      val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINED_BY = DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINS = DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any], DOCUMENT_POSITION_DISCONNECTED = DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any], DOCUMENT_POSITION_FOLLOWING = DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any], DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any], DOCUMENT_POSITION_PRECEDING = DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], accessKey = accessKey.asInstanceOf[js.Any], accessKeyLabel = accessKeyLabel.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), after = js.Any.fromFunction1(after), align = align.asInstanceOf[js.Any], allow = allow.asInstanceOf[js.Any], allowFullscreen = allowFullscreen.asInstanceOf[js.Any], animate = js.Any.fromFunction0(animate), append = js.Any.fromFunction1(append), appendChild = js.Any.fromFunction1(appendChild), attachInternals = js.Any.fromFunction0(attachInternals), attachShadow = js.Any.fromFunction1(attachShadow), attributes = attributes.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], baseURI = baseURI.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), blur = js.Any.fromFunction0(blur), childElementCount = childElementCount.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), clientHeight = clientHeight.asInstanceOf[js.Any], clientLeft = clientLeft.asInstanceOf[js.Any], clientTop = clientTop.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction0(cloneNode), closest = js.Any.fromFunction1(closest), compareDocumentPosition = js.Any.fromFunction1(compareDocumentPosition), contains = js.Any.fromFunction0(contains), contentEditable = contentEditable.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), draggable = draggable.asInstanceOf[js.Any], enterKeyHint = enterKeyHint.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), frameBorder = frameBorder.asInstanceOf[js.Any], getAnimations = js.Any.fromFunction0(getAnimations), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNames = js.Any.fromFunction0(getAttributeNames), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getRootNode = js.Any.fromFunction0(getRootNode), getSVGDocument = js.Any.fromFunction0(getSVGDocument), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasPointerCapture = js.Any.fromFunction1(hasPointerCapture), height = height.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inert = inert.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], insertAdjacentElement = js.Any.fromFunction2(insertAdjacentElement), insertAdjacentHTML = js.Any.fromFunction2(insertAdjacentHTML), insertAdjacentText = js.Any.fromFunction2(insertAdjacentText), insertBefore = js.Any.fromFunction1(insertBefore), isConnected = isConnected.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any], isDefaultNamespace = js.Any.fromFunction0(isDefaultNamespace), isEqualNode = js.Any.fromFunction0(isEqualNode), isSameNode = js.Any.fromFunction0(isSameNode), lang = lang.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], longDesc = longDesc.asInstanceOf[js.Any], lookupNamespaceURI = js.Any.fromFunction0(lookupNamespaceURI), lookupPrefix = js.Any.fromFunction0(lookupPrefix), marginHeight = marginHeight.asInstanceOf[js.Any], marginWidth = marginWidth.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), name = name.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], outerText = outerText.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend), querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll), referrerPolicy = referrerPolicy.asInstanceOf[js.Any], releasePointerCapture = js.Any.fromFunction1(releasePointerCapture), remove = js.Any.fromFunction0(remove), removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), replaceChildren = js.Any.fromFunction1(replaceChildren), replaceWith = js.Any.fromFunction1(replaceWith), requestFullscreen = js.Any.fromFunction0(requestFullscreen), requestPointerLock = js.Any.fromFunction0(requestPointerLock), sandbox = sandbox.asInstanceOf[js.Any], scroll = js.Any.fromFunction0(scroll), scrollBy = js.Any.fromFunction0(scrollBy), scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollIntoView = js.Any.fromFunction0(scrollIntoView), scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTo = js.Any.fromFunction0(scrollTo), scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setPointerCapture = js.Any.fromFunction1(setPointerCapture), slot = slot.asInstanceOf[js.Any], spellcheck = spellcheck.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcdoc = srcdoc.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toggleAttribute = js.Any.fromFunction1(toggleAttribute), translate = translate.asInstanceOf[js.Any], webkitMatchesSelector = js.Any.fromFunction1(webkitMatchesSelector), width = width.asInstanceOf[js.Any], onerror = null)
      __obj.asInstanceOf[HTMLIFrameElementWithStyleString]
    }
    
    extension [Self <: HTMLIFrameElementWithStyleString](x: Self) {
      
      inline def setATTRIBUTE_NODE(value: Double): Self = StObject.set(x, "ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyLabel(value: String): Self = StObject.set(x, "accessKeyLabel", value.asInstanceOf[js.Any])
      
      inline def setAddEventListener(
        value: (fullscreenchange, /* listener */ js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]) => Unit
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setAfter(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowFullscreen(value: Boolean): Self = StObject.set(x, "allowFullscreen", value.asInstanceOf[js.Any])
      
      inline def setAnimate(value: () => Animation): Self = StObject.set(x, "animate", js.Any.fromFunction0(value))
      
      inline def setAppend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setAppendChild(value: /* node */ Node => Node): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
      
      inline def setAriaAtomic(value: String): Self = StObject.set(x, "ariaAtomic", value.asInstanceOf[js.Any])
      
      inline def setAriaAtomicNull: Self = StObject.set(x, "ariaAtomic", null)
      
      inline def setAriaAtomicUndefined: Self = StObject.set(x, "ariaAtomic", js.undefined)
      
      inline def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
      
      inline def setAriaAutoCompleteNull: Self = StObject.set(x, "ariaAutoComplete", null)
      
      inline def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
      
      inline def setAriaBusy(value: String): Self = StObject.set(x, "ariaBusy", value.asInstanceOf[js.Any])
      
      inline def setAriaBusyNull: Self = StObject.set(x, "ariaBusy", null)
      
      inline def setAriaBusyUndefined: Self = StObject.set(x, "ariaBusy", js.undefined)
      
      inline def setAriaChecked(value: String): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
      
      inline def setAriaCheckedNull: Self = StObject.set(x, "ariaChecked", null)
      
      inline def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
      
      inline def setAriaColCount(value: String): Self = StObject.set(x, "ariaColCount", value.asInstanceOf[js.Any])
      
      inline def setAriaColCountNull: Self = StObject.set(x, "ariaColCount", null)
      
      inline def setAriaColCountUndefined: Self = StObject.set(x, "ariaColCount", js.undefined)
      
      inline def setAriaColIndex(value: String): Self = StObject.set(x, "ariaColIndex", value.asInstanceOf[js.Any])
      
      inline def setAriaColIndexNull: Self = StObject.set(x, "ariaColIndex", null)
      
      inline def setAriaColIndexUndefined: Self = StObject.set(x, "ariaColIndex", js.undefined)
      
      inline def setAriaColSpan(value: String): Self = StObject.set(x, "ariaColSpan", value.asInstanceOf[js.Any])
      
      inline def setAriaColSpanNull: Self = StObject.set(x, "ariaColSpan", null)
      
      inline def setAriaColSpanUndefined: Self = StObject.set(x, "ariaColSpan", js.undefined)
      
      inline def setAriaCurrent(value: String): Self = StObject.set(x, "ariaCurrent", value.asInstanceOf[js.Any])
      
      inline def setAriaCurrentNull: Self = StObject.set(x, "ariaCurrent", null)
      
      inline def setAriaCurrentUndefined: Self = StObject.set(x, "ariaCurrent", js.undefined)
      
      inline def setAriaDisabled(value: String): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
      
      inline def setAriaDisabledNull: Self = StObject.set(x, "ariaDisabled", null)
      
      inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
      
      inline def setAriaExpanded(value: String): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
      
      inline def setAriaExpandedNull: Self = StObject.set(x, "ariaExpanded", null)
      
      inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
      
      inline def setAriaHasPopup(value: String): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupNull: Self = StObject.set(x, "ariaHasPopup", null)
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaHidden(value: String): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
      
      inline def setAriaHiddenNull: Self = StObject.set(x, "ariaHidden", null)
      
      inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
      
      inline def setAriaKeyShortcuts(value: String): Self = StObject.set(x, "ariaKeyShortcuts", value.asInstanceOf[js.Any])
      
      inline def setAriaKeyShortcutsNull: Self = StObject.set(x, "ariaKeyShortcuts", null)
      
      inline def setAriaKeyShortcutsUndefined: Self = StObject.set(x, "ariaKeyShortcuts", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelNull: Self = StObject.set(x, "ariaLabel", null)
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLevel(value: String): Self = StObject.set(x, "ariaLevel", value.asInstanceOf[js.Any])
      
      inline def setAriaLevelNull: Self = StObject.set(x, "ariaLevel", null)
      
      inline def setAriaLevelUndefined: Self = StObject.set(x, "ariaLevel", js.undefined)
      
      inline def setAriaLive(value: String): Self = StObject.set(x, "ariaLive", value.asInstanceOf[js.Any])
      
      inline def setAriaLiveNull: Self = StObject.set(x, "ariaLive", null)
      
      inline def setAriaLiveUndefined: Self = StObject.set(x, "ariaLive", js.undefined)
      
      inline def setAriaModal(value: String): Self = StObject.set(x, "ariaModal", value.asInstanceOf[js.Any])
      
      inline def setAriaModalNull: Self = StObject.set(x, "ariaModal", null)
      
      inline def setAriaModalUndefined: Self = StObject.set(x, "ariaModal", js.undefined)
      
      inline def setAriaMultiLine(value: String): Self = StObject.set(x, "ariaMultiLine", value.asInstanceOf[js.Any])
      
      inline def setAriaMultiLineNull: Self = StObject.set(x, "ariaMultiLine", null)
      
      inline def setAriaMultiLineUndefined: Self = StObject.set(x, "ariaMultiLine", js.undefined)
      
      inline def setAriaMultiSelectable(value: String): Self = StObject.set(x, "ariaMultiSelectable", value.asInstanceOf[js.Any])
      
      inline def setAriaMultiSelectableNull: Self = StObject.set(x, "ariaMultiSelectable", null)
      
      inline def setAriaMultiSelectableUndefined: Self = StObject.set(x, "ariaMultiSelectable", js.undefined)
      
      inline def setAriaOrientation(value: String): Self = StObject.set(x, "ariaOrientation", value.asInstanceOf[js.Any])
      
      inline def setAriaOrientationNull: Self = StObject.set(x, "ariaOrientation", null)
      
      inline def setAriaOrientationUndefined: Self = StObject.set(x, "ariaOrientation", js.undefined)
      
      inline def setAriaPlaceholder(value: String): Self = StObject.set(x, "ariaPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setAriaPlaceholderNull: Self = StObject.set(x, "ariaPlaceholder", null)
      
      inline def setAriaPlaceholderUndefined: Self = StObject.set(x, "ariaPlaceholder", js.undefined)
      
      inline def setAriaPosInSet(value: String): Self = StObject.set(x, "ariaPosInSet", value.asInstanceOf[js.Any])
      
      inline def setAriaPosInSetNull: Self = StObject.set(x, "ariaPosInSet", null)
      
      inline def setAriaPosInSetUndefined: Self = StObject.set(x, "ariaPosInSet", js.undefined)
      
      inline def setAriaPressed(value: String): Self = StObject.set(x, "ariaPressed", value.asInstanceOf[js.Any])
      
      inline def setAriaPressedNull: Self = StObject.set(x, "ariaPressed", null)
      
      inline def setAriaPressedUndefined: Self = StObject.set(x, "ariaPressed", js.undefined)
      
      inline def setAriaReadOnly(value: String): Self = StObject.set(x, "ariaReadOnly", value.asInstanceOf[js.Any])
      
      inline def setAriaReadOnlyNull: Self = StObject.set(x, "ariaReadOnly", null)
      
      inline def setAriaReadOnlyUndefined: Self = StObject.set(x, "ariaReadOnly", js.undefined)
      
      inline def setAriaRequired(value: String): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
      
      inline def setAriaRequiredNull: Self = StObject.set(x, "ariaRequired", null)
      
      inline def setAriaRequiredUndefined: Self = StObject.set(x, "ariaRequired", js.undefined)
      
      inline def setAriaRoleDescription(value: String): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaRoleDescriptionNull: Self = StObject.set(x, "ariaRoleDescription", null)
      
      inline def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
      
      inline def setAriaRowCount(value: String): Self = StObject.set(x, "ariaRowCount", value.asInstanceOf[js.Any])
      
      inline def setAriaRowCountNull: Self = StObject.set(x, "ariaRowCount", null)
      
      inline def setAriaRowCountUndefined: Self = StObject.set(x, "ariaRowCount", js.undefined)
      
      inline def setAriaRowIndex(value: String): Self = StObject.set(x, "ariaRowIndex", value.asInstanceOf[js.Any])
      
      inline def setAriaRowIndexNull: Self = StObject.set(x, "ariaRowIndex", null)
      
      inline def setAriaRowIndexUndefined: Self = StObject.set(x, "ariaRowIndex", js.undefined)
      
      inline def setAriaRowSpan(value: String): Self = StObject.set(x, "ariaRowSpan", value.asInstanceOf[js.Any])
      
      inline def setAriaRowSpanNull: Self = StObject.set(x, "ariaRowSpan", null)
      
      inline def setAriaRowSpanUndefined: Self = StObject.set(x, "ariaRowSpan", js.undefined)
      
      inline def setAriaSelected(value: String): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setAriaSelectedNull: Self = StObject.set(x, "ariaSelected", null)
      
      inline def setAriaSelectedUndefined: Self = StObject.set(x, "ariaSelected", js.undefined)
      
      inline def setAriaSetSize(value: String): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      inline def setAriaSetSizeNull: Self = StObject.set(x, "ariaSetSize", null)
      
      inline def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      inline def setAriaSort(value: String): Self = StObject.set(x, "ariaSort", value.asInstanceOf[js.Any])
      
      inline def setAriaSortNull: Self = StObject.set(x, "ariaSort", null)
      
      inline def setAriaSortUndefined: Self = StObject.set(x, "ariaSort", js.undefined)
      
      inline def setAriaValueMax(value: String): Self = StObject.set(x, "ariaValueMax", value.asInstanceOf[js.Any])
      
      inline def setAriaValueMaxNull: Self = StObject.set(x, "ariaValueMax", null)
      
      inline def setAriaValueMaxUndefined: Self = StObject.set(x, "ariaValueMax", js.undefined)
      
      inline def setAriaValueMin(value: String): Self = StObject.set(x, "ariaValueMin", value.asInstanceOf[js.Any])
      
      inline def setAriaValueMinNull: Self = StObject.set(x, "ariaValueMin", null)
      
      inline def setAriaValueMinUndefined: Self = StObject.set(x, "ariaValueMin", js.undefined)
      
      inline def setAriaValueNow(value: String): Self = StObject.set(x, "ariaValueNow", value.asInstanceOf[js.Any])
      
      inline def setAriaValueNowNull: Self = StObject.set(x, "ariaValueNow", null)
      
      inline def setAriaValueNowUndefined: Self = StObject.set(x, "ariaValueNow", js.undefined)
      
      inline def setAriaValueText(value: String): Self = StObject.set(x, "ariaValueText", value.asInstanceOf[js.Any])
      
      inline def setAriaValueTextNull: Self = StObject.set(x, "ariaValueText", null)
      
      inline def setAriaValueTextUndefined: Self = StObject.set(x, "ariaValueText", js.undefined)
      
      inline def setAssignedSlot(value: HTMLSlotElement): Self = StObject.set(x, "assignedSlot", value.asInstanceOf[js.Any])
      
      inline def setAssignedSlotNull: Self = StObject.set(x, "assignedSlot", null)
      
      inline def setAssignedSlotUndefined: Self = StObject.set(x, "assignedSlot", js.undefined)
      
      inline def setAttachInternals(value: () => ElementInternals): Self = StObject.set(x, "attachInternals", js.Any.fromFunction0(value))
      
      inline def setAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = StObject.set(x, "attachShadow", js.Any.fromFunction1(value))
      
      inline def setAttributes(value: NamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setCDATA_SECTION_NODE(value: Double): Self = StObject.set(x, "CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
      
      inline def setCOMMENT_NODE(value: Double): Self = StObject.set(x, "COMMENT_NODE", value.asInstanceOf[js.Any])
      
      inline def setChildElementCount(value: Double): Self = StObject.set(x, "childElementCount", value.asInstanceOf[js.Any])
      
      inline def setChildNodes(value: NodeListOf[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: HTMLCollection): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassList(value: DOMTokenList): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientLeft(value: Double): Self = StObject.set(x, "clientLeft", value.asInstanceOf[js.Any])
      
      inline def setClientTop(value: Double): Self = StObject.set(x, "clientTop", value.asInstanceOf[js.Any])
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setCloneNode(value: () => Node): Self = StObject.set(x, "cloneNode", js.Any.fromFunction0(value))
      
      inline def setClosest(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
      
      inline def setCompareDocumentPosition(value: /* other */ Node => Double): Self = StObject.set(x, "compareDocumentPosition", js.Any.fromFunction1(value))
      
      inline def setContains(value: () => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction0(value))
      
      inline def setContentDocument(value: Document): Self = StObject.set(x, "contentDocument", value.asInstanceOf[js.Any])
      
      inline def setContentDocumentNull: Self = StObject.set(x, "contentDocument", null)
      
      inline def setContentDocumentUndefined: Self = StObject.set(x, "contentDocument", js.undefined)
      
      inline def setContentEditable(value: String): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      inline def setContentWindow(value: WindowProxy): Self = StObject.set(x, "contentWindow", value.asInstanceOf[js.Any])
      
      inline def setContentWindowNull: Self = StObject.set(x, "contentWindow", null)
      
      inline def setContentWindowUndefined: Self = StObject.set(x, "contentWindow", js.undefined)
      
      inline def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_NODE", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_TYPE_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
      
      inline def setDataset(value: DOMStringMap): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setELEMENT_NODE(value: Double): Self = StObject.set(x, "ELEMENT_NODE", value.asInstanceOf[js.Any])
      
      inline def setENTITY_NODE(value: Double): Self = StObject.set(x, "ENTITY_NODE", value.asInstanceOf[js.Any])
      
      inline def setENTITY_REFERENCE_NODE(value: Double): Self = StObject.set(x, "ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
      
      inline def setEnterKeyHint(value: String): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
      
      inline def setFirstChild(value: ChildNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      inline def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
      
      inline def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
      
      inline def setFirstElementChild(value: Element): Self = StObject.set(x, "firstElementChild", value.asInstanceOf[js.Any])
      
      inline def setFirstElementChildNull: Self = StObject.set(x, "firstElementChild", null)
      
      inline def setFirstElementChildUndefined: Self = StObject.set(x, "firstElementChild", js.undefined)
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setFrameBorder(value: String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      inline def setGetAnimations(value: () => js.Array[Animation]): Self = StObject.set(x, "getAnimations", js.Any.fromFunction0(value))
      
      inline def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
      
      inline def setGetAttributeNames(value: () => js.Array[String]): Self = StObject.set(x, "getAttributeNames", js.Any.fromFunction0(value))
      
      inline def setGetAttributeNode(value: /* qualifiedName */ String => Attr | Null): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
      
      inline def setGetAttributeNodeNS(value: (/* namespace */ String, /* localName */ String) => Attr | Null): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
      
      inline def setGetBoundingClientRect(value: () => DOMRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
      
      inline def setGetClientRects(value: () => DOMRectList): Self = StObject.set(x, "getClientRects", js.Any.fromFunction0(value))
      
      inline def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
      
      inline def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
      
      inline def setGetElementsByTagNameNS(
        value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
      ): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
      
      inline def setGetRootNode(value: () => Node): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
      
      inline def setGetSVGDocument(value: () => Document | Null): Self = StObject.set(x, "getSVGDocument", js.Any.fromFunction0(value))
      
      inline def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
      
      inline def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = StObject.set(x, "hasAttributeNS", js.Any.fromFunction2(value))
      
      inline def setHasAttributes(value: () => Boolean): Self = StObject.set(x, "hasAttributes", js.Any.fromFunction0(value))
      
      inline def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
      
      inline def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = StObject.set(x, "hasPointerCapture", js.Any.fromFunction1(value))
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInert(value: Boolean): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
      
      inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
      
      inline def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      inline def setInsertAdjacentElement(value: (/* where */ InsertPosition, /* element */ Element) => Element | Null): Self = StObject.set(x, "insertAdjacentElement", js.Any.fromFunction2(value))
      
      inline def setInsertAdjacentHTML(value: (/* position */ InsertPosition, /* text */ String) => Unit): Self = StObject.set(x, "insertAdjacentHTML", js.Any.fromFunction2(value))
      
      inline def setInsertAdjacentText(value: (/* where */ InsertPosition, /* data */ String) => Unit): Self = StObject.set(x, "insertAdjacentText", js.Any.fromFunction2(value))
      
      inline def setInsertBefore(value: /* node */ Node => Node): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
      
      inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
      
      inline def setIsContentEditable(value: Boolean): Self = StObject.set(x, "isContentEditable", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultNamespace(value: () => Boolean): Self = StObject.set(x, "isDefaultNamespace", js.Any.fromFunction0(value))
      
      inline def setIsEqualNode(value: () => Boolean): Self = StObject.set(x, "isEqualNode", js.Any.fromFunction0(value))
      
      inline def setIsSameNode(value: () => Boolean): Self = StObject.set(x, "isSameNode", js.Any.fromFunction0(value))
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLastChild(value: ChildNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      inline def setLastChildNull: Self = StObject.set(x, "lastChild", null)
      
      inline def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
      
      inline def setLastElementChild(value: Element): Self = StObject.set(x, "lastElementChild", value.asInstanceOf[js.Any])
      
      inline def setLastElementChildNull: Self = StObject.set(x, "lastElementChild", null)
      
      inline def setLastElementChildUndefined: Self = StObject.set(x, "lastElementChild", js.undefined)
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setLongDesc(value: String): Self = StObject.set(x, "longDesc", value.asInstanceOf[js.Any])
      
      inline def setLookupNamespaceURI(value: () => String | Null): Self = StObject.set(x, "lookupNamespaceURI", js.Any.fromFunction0(value))
      
      inline def setLookupPrefix(value: () => String | Null): Self = StObject.set(x, "lookupPrefix", js.Any.fromFunction0(value))
      
      inline def setMarginHeight(value: String): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      inline def setMarginWidth(value: String): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: /* selectors */ String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setNOTATION_NODE(value: Double): Self = StObject.set(x, "NOTATION_NODE", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
      
      inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      inline def setNextElementSibling(value: Element): Self = StObject.set(x, "nextElementSibling", value.asInstanceOf[js.Any])
      
      inline def setNextElementSiblingNull: Self = StObject.set(x, "nextElementSibling", null)
      
      inline def setNextElementSiblingUndefined: Self = StObject.set(x, "nextElementSibling", js.undefined)
      
      inline def setNextSibling(value: ChildNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
      
      inline def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
      
      inline def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      inline def setNodeValueNull: Self = StObject.set(x, "nodeValue", null)
      
      inline def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
      
      inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      inline def setOffsetParent(value: Element): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      inline def setOffsetParentNull: Self = StObject.set(x, "offsetParent", null)
      
      inline def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
      
      inline def setOnabort(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ UIEvent, Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      inline def setOnabortNull: Self = StObject.set(x, "onabort", null)
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setOnanimationcancel(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationcancel", value.asInstanceOf[js.Any])
      
      inline def setOnanimationcancelNull: Self = StObject.set(x, "onanimationcancel", null)
      
      inline def setOnanimationcancelUndefined: Self = StObject.set(x, "onanimationcancel", js.undefined)
      
      inline def setOnanimationend(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationend", value.asInstanceOf[js.Any])
      
      inline def setOnanimationendNull: Self = StObject.set(x, "onanimationend", null)
      
      inline def setOnanimationendUndefined: Self = StObject.set(x, "onanimationend", js.undefined)
      
      inline def setOnanimationiteration(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setOnanimationiterationNull: Self = StObject.set(x, "onanimationiteration", null)
      
      inline def setOnanimationiterationUndefined: Self = StObject.set(x, "onanimationiteration", js.undefined)
      
      inline def setOnanimationstart(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationstart", value.asInstanceOf[js.Any])
      
      inline def setOnanimationstartNull: Self = StObject.set(x, "onanimationstart", null)
      
      inline def setOnanimationstartUndefined: Self = StObject.set(x, "onanimationstart", js.undefined)
      
      inline def setOnauxclick(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      inline def setOnauxclickNull: Self = StObject.set(x, "onauxclick", null)
      
      inline def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
      
      inline def setOnblur(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      inline def setOnblurNull: Self = StObject.set(x, "onblur", null)
      
      inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      inline def setOncanplay(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      inline def setOncanplayNull: Self = StObject.set(x, "oncanplay", null)
      
      inline def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
      
      inline def setOncanplaythrough(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      inline def setOncanplaythroughNull: Self = StObject.set(x, "oncanplaythrough", null)
      
      inline def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
      
      inline def setOnchange(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      inline def setOnchangeNull: Self = StObject.set(x, "onchange", null)
      
      inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      inline def setOnclick(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      inline def setOnclickNull: Self = StObject.set(x, "onclick", null)
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setOnclose(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
      
      inline def setOncloseNull: Self = StObject.set(x, "onclose", null)
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOncontextmenu(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      inline def setOncontextmenuNull: Self = StObject.set(x, "oncontextmenu", null)
      
      inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
      
      inline def setOncopy(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ ClipboardEvent, Any]): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
      
      inline def setOncopyNull: Self = StObject.set(x, "oncopy", null)
      
      inline def setOncopyUndefined: Self = StObject.set(x, "oncopy", js.undefined)
      
      inline def setOncuechange(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      inline def setOncuechangeNull: Self = StObject.set(x, "oncuechange", null)
      
      inline def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
      
      inline def setOncut(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ ClipboardEvent, Any]): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
      
      inline def setOncutNull: Self = StObject.set(x, "oncut", null)
      
      inline def setOncutUndefined: Self = StObject.set(x, "oncut", js.undefined)
      
      inline def setOndblclick(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      inline def setOndblclickNull: Self = StObject.set(x, "ondblclick", null)
      
      inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      inline def setOndrag(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      inline def setOndragNull: Self = StObject.set(x, "ondrag", null)
      
      inline def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      inline def setOndragend(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      inline def setOndragendNull: Self = StObject.set(x, "ondragend", null)
      
      inline def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      inline def setOndragenter(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      inline def setOndragenterNull: Self = StObject.set(x, "ondragenter", null)
      
      inline def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      inline def setOndragleave(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      inline def setOndragleaveNull: Self = StObject.set(x, "ondragleave", null)
      
      inline def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      inline def setOndragover(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      inline def setOndragoverNull: Self = StObject.set(x, "ondragover", null)
      
      inline def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      inline def setOndragstart(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      inline def setOndragstartNull: Self = StObject.set(x, "ondragstart", null)
      
      inline def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      inline def setOndrop(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      inline def setOndropNull: Self = StObject.set(x, "ondrop", null)
      
      inline def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      inline def setOndurationchange(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      inline def setOndurationchangeNull: Self = StObject.set(x, "ondurationchange", null)
      
      inline def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
      
      inline def setOnemptied(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      inline def setOnemptiedNull: Self = StObject.set(x, "onemptied", null)
      
      inline def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
      
      inline def setOnended(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      inline def setOnendedNull: Self = StObject.set(x, "onended", null)
      
      inline def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
      
      inline def setOnerror(
        value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => Any
      ): Self = StObject.set(x, "onerror", js.Any.fromFunction5(value))
      
      inline def setOnerrorNull: Self = StObject.set(x, "onerror", null)
      
      inline def setOnfocus(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      inline def setOnfocusNull: Self = StObject.set(x, "onfocus", null)
      
      inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      inline def setOnformdata(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ FormDataEvent, Any]): Self = StObject.set(x, "onformdata", value.asInstanceOf[js.Any])
      
      inline def setOnformdataNull: Self = StObject.set(x, "onformdata", null)
      
      inline def setOnformdataUndefined: Self = StObject.set(x, "onformdata", js.undefined)
      
      inline def setOnfullscreenchange(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onfullscreenchange", value.asInstanceOf[js.Any])
      
      inline def setOnfullscreenchangeNull: Self = StObject.set(x, "onfullscreenchange", null)
      
      inline def setOnfullscreenchangeUndefined: Self = StObject.set(x, "onfullscreenchange", js.undefined)
      
      inline def setOnfullscreenerror(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onfullscreenerror", value.asInstanceOf[js.Any])
      
      inline def setOnfullscreenerrorNull: Self = StObject.set(x, "onfullscreenerror", null)
      
      inline def setOnfullscreenerrorUndefined: Self = StObject.set(x, "onfullscreenerror", js.undefined)
      
      inline def setOngotpointercapture(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "ongotpointercapture", value.asInstanceOf[js.Any])
      
      inline def setOngotpointercaptureNull: Self = StObject.set(x, "ongotpointercapture", null)
      
      inline def setOngotpointercaptureUndefined: Self = StObject.set(x, "ongotpointercapture", js.undefined)
      
      inline def setOninput(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      inline def setOninputNull: Self = StObject.set(x, "oninput", null)
      
      inline def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      inline def setOninvalid(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setOninvalidNull: Self = StObject.set(x, "oninvalid", null)
      
      inline def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
      
      inline def setOnkeydown(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      inline def setOnkeydownNull: Self = StObject.set(x, "onkeydown", null)
      
      inline def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      inline def setOnkeypress(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      inline def setOnkeypressNull: Self = StObject.set(x, "onkeypress", null)
      
      inline def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      inline def setOnkeyup(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      inline def setOnkeyupNull: Self = StObject.set(x, "onkeyup", null)
      
      inline def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      inline def setOnload(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      inline def setOnloadNull: Self = StObject.set(x, "onload", null)
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOnloadeddata(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      inline def setOnloadeddataNull: Self = StObject.set(x, "onloadeddata", null)
      
      inline def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
      
      inline def setOnloadedmetadata(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setOnloadedmetadataNull: Self = StObject.set(x, "onloadedmetadata", null)
      
      inline def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
      
      inline def setOnloadstart(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      inline def setOnloadstartNull: Self = StObject.set(x, "onloadstart", null)
      
      inline def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
      
      inline def setOnlostpointercapture(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onlostpointercapture", value.asInstanceOf[js.Any])
      
      inline def setOnlostpointercaptureNull: Self = StObject.set(x, "onlostpointercapture", null)
      
      inline def setOnlostpointercaptureUndefined: Self = StObject.set(x, "onlostpointercapture", js.undefined)
      
      inline def setOnmousedown(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      inline def setOnmousedownNull: Self = StObject.set(x, "onmousedown", null)
      
      inline def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      inline def setOnmouseenter(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      inline def setOnmouseenterNull: Self = StObject.set(x, "onmouseenter", null)
      
      inline def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      inline def setOnmouseleave(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      inline def setOnmouseleaveNull: Self = StObject.set(x, "onmouseleave", null)
      
      inline def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      inline def setOnmousemove(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      inline def setOnmousemoveNull: Self = StObject.set(x, "onmousemove", null)
      
      inline def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      inline def setOnmouseout(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoutNull: Self = StObject.set(x, "onmouseout", null)
      
      inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      inline def setOnmouseover(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoverNull: Self = StObject.set(x, "onmouseover", null)
      
      inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      inline def setOnmouseup(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      inline def setOnmouseupNull: Self = StObject.set(x, "onmouseup", null)
      
      inline def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      inline def setOnpaste(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ ClipboardEvent, Any]): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
      
      inline def setOnpasteNull: Self = StObject.set(x, "onpaste", null)
      
      inline def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
      
      inline def setOnpause(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      inline def setOnpauseNull: Self = StObject.set(x, "onpause", null)
      
      inline def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      inline def setOnplay(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      inline def setOnplayNull: Self = StObject.set(x, "onplay", null)
      
      inline def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      inline def setOnplaying(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      inline def setOnplayingNull: Self = StObject.set(x, "onplaying", null)
      
      inline def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
      
      inline def setOnpointercancel(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      inline def setOnpointercancelNull: Self = StObject.set(x, "onpointercancel", null)
      
      inline def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
      
      inline def setOnpointerdown(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      inline def setOnpointerdownNull: Self = StObject.set(x, "onpointerdown", null)
      
      inline def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
      
      inline def setOnpointerenter(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      inline def setOnpointerenterNull: Self = StObject.set(x, "onpointerenter", null)
      
      inline def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
      
      inline def setOnpointerleave(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      inline def setOnpointerleaveNull: Self = StObject.set(x, "onpointerleave", null)
      
      inline def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
      
      inline def setOnpointermove(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      inline def setOnpointermoveNull: Self = StObject.set(x, "onpointermove", null)
      
      inline def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
      
      inline def setOnpointerout(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroutNull: Self = StObject.set(x, "onpointerout", null)
      
      inline def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
      
      inline def setOnpointerover(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroverNull: Self = StObject.set(x, "onpointerover", null)
      
      inline def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
      
      inline def setOnpointerup(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      inline def setOnpointerupNull: Self = StObject.set(x, "onpointerup", null)
      
      inline def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
      
      inline def setOnprogress(
        value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ ProgressEvent[EventTarget], Any]
      ): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      inline def setOnprogressNull: Self = StObject.set(x, "onprogress", null)
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      inline def setOnratechange(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      inline def setOnratechangeNull: Self = StObject.set(x, "onratechange", null)
      
      inline def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
      
      inline def setOnreset(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      inline def setOnresetNull: Self = StObject.set(x, "onreset", null)
      
      inline def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      inline def setOnresize(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ UIEvent, Any]): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
      
      inline def setOnresizeNull: Self = StObject.set(x, "onresize", null)
      
      inline def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
      
      inline def setOnscroll(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      inline def setOnscrollNull: Self = StObject.set(x, "onscroll", null)
      
      inline def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      inline def setOnsecuritypolicyviolation(
        value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ SecurityPolicyViolationEvent, Any]
      ): Self = StObject.set(x, "onsecuritypolicyviolation", value.asInstanceOf[js.Any])
      
      inline def setOnsecuritypolicyviolationNull: Self = StObject.set(x, "onsecuritypolicyviolation", null)
      
      inline def setOnsecuritypolicyviolationUndefined: Self = StObject.set(x, "onsecuritypolicyviolation", js.undefined)
      
      inline def setOnseeked(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      inline def setOnseekedNull: Self = StObject.set(x, "onseeked", null)
      
      inline def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
      
      inline def setOnseeking(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      inline def setOnseekingNull: Self = StObject.set(x, "onseeking", null)
      
      inline def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
      
      inline def setOnselect(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      inline def setOnselectNull: Self = StObject.set(x, "onselect", null)
      
      inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
      
      inline def setOnselectionchange(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onselectionchange", value.asInstanceOf[js.Any])
      
      inline def setOnselectionchangeNull: Self = StObject.set(x, "onselectionchange", null)
      
      inline def setOnselectionchangeUndefined: Self = StObject.set(x, "onselectionchange", js.undefined)
      
      inline def setOnselectstart(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      inline def setOnselectstartNull: Self = StObject.set(x, "onselectstart", null)
      
      inline def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
      
      inline def setOnslotchange(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onslotchange", value.asInstanceOf[js.Any])
      
      inline def setOnslotchangeNull: Self = StObject.set(x, "onslotchange", null)
      
      inline def setOnslotchangeUndefined: Self = StObject.set(x, "onslotchange", js.undefined)
      
      inline def setOnstalled(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      inline def setOnstalledNull: Self = StObject.set(x, "onstalled", null)
      
      inline def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
      
      inline def setOnsubmit(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ SubmitEvent, Any]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      inline def setOnsubmitNull: Self = StObject.set(x, "onsubmit", null)
      
      inline def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      inline def setOnsuspend(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      inline def setOnsuspendNull: Self = StObject.set(x, "onsuspend", null)
      
      inline def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
      
      inline def setOntimeupdate(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      inline def setOntimeupdateNull: Self = StObject.set(x, "ontimeupdate", null)
      
      inline def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
      
      inline def setOntoggle(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "ontoggle", value.asInstanceOf[js.Any])
      
      inline def setOntoggleNull: Self = StObject.set(x, "ontoggle", null)
      
      inline def setOntoggleUndefined: Self = StObject.set(x, "ontoggle", js.undefined)
      
      inline def setOntouchcancel(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchcancel", value.asInstanceOf[js.Any])
      
      inline def setOntouchcancelNull: Self = StObject.set(x, "ontouchcancel", null)
      
      inline def setOntouchcancelUndefined: Self = StObject.set(x, "ontouchcancel", js.undefined)
      
      inline def setOntouchend(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchend", value.asInstanceOf[js.Any])
      
      inline def setOntouchendNull: Self = StObject.set(x, "ontouchend", null)
      
      inline def setOntouchendUndefined: Self = StObject.set(x, "ontouchend", js.undefined)
      
      inline def setOntouchmove(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchmove", value.asInstanceOf[js.Any])
      
      inline def setOntouchmoveNull: Self = StObject.set(x, "ontouchmove", null)
      
      inline def setOntouchmoveUndefined: Self = StObject.set(x, "ontouchmove", js.undefined)
      
      inline def setOntouchstart(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchstart", value.asInstanceOf[js.Any])
      
      inline def setOntouchstartNull: Self = StObject.set(x, "ontouchstart", null)
      
      inline def setOntouchstartUndefined: Self = StObject.set(x, "ontouchstart", js.undefined)
      
      inline def setOntransitioncancel(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitioncancel", value.asInstanceOf[js.Any])
      
      inline def setOntransitioncancelNull: Self = StObject.set(x, "ontransitioncancel", null)
      
      inline def setOntransitioncancelUndefined: Self = StObject.set(x, "ontransitioncancel", js.undefined)
      
      inline def setOntransitionend(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionend", value.asInstanceOf[js.Any])
      
      inline def setOntransitionendNull: Self = StObject.set(x, "ontransitionend", null)
      
      inline def setOntransitionendUndefined: Self = StObject.set(x, "ontransitionend", js.undefined)
      
      inline def setOntransitionrun(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionrun", value.asInstanceOf[js.Any])
      
      inline def setOntransitionrunNull: Self = StObject.set(x, "ontransitionrun", null)
      
      inline def setOntransitionrunUndefined: Self = StObject.set(x, "ontransitionrun", js.undefined)
      
      inline def setOntransitionstart(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionstart", value.asInstanceOf[js.Any])
      
      inline def setOntransitionstartNull: Self = StObject.set(x, "ontransitionstart", null)
      
      inline def setOntransitionstartUndefined: Self = StObject.set(x, "ontransitionstart", js.undefined)
      
      inline def setOnvolumechange(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      inline def setOnvolumechangeNull: Self = StObject.set(x, "onvolumechange", null)
      
      inline def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
      
      inline def setOnwaiting(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
      
      inline def setOnwaitingNull: Self = StObject.set(x, "onwaiting", null)
      
      inline def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
      
      inline def setOnwebkitanimationend(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationend", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationendNull: Self = StObject.set(x, "onwebkitanimationend", null)
      
      inline def setOnwebkitanimationendUndefined: Self = StObject.set(x, "onwebkitanimationend", js.undefined)
      
      inline def setOnwebkitanimationiteration(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationiterationNull: Self = StObject.set(x, "onwebkitanimationiteration", null)
      
      inline def setOnwebkitanimationiterationUndefined: Self = StObject.set(x, "onwebkitanimationiteration", js.undefined)
      
      inline def setOnwebkitanimationstart(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationstart", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationstartNull: Self = StObject.set(x, "onwebkitanimationstart", null)
      
      inline def setOnwebkitanimationstartUndefined: Self = StObject.set(x, "onwebkitanimationstart", js.undefined)
      
      inline def setOnwebkittransitionend(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkittransitionend", value.asInstanceOf[js.Any])
      
      inline def setOnwebkittransitionendNull: Self = StObject.set(x, "onwebkittransitionend", null)
      
      inline def setOnwebkittransitionendUndefined: Self = StObject.set(x, "onwebkittransitionend", js.undefined)
      
      inline def setOnwheel(value: js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ WheelEvent, Any]): Self = StObject.set(x, "onwheel", value.asInstanceOf[js.Any])
      
      inline def setOnwheelNull: Self = StObject.set(x, "onwheel", null)
      
      inline def setOnwheelUndefined: Self = StObject.set(x, "onwheel", js.undefined)
      
      inline def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
      
      inline def setOuterText(value: String): Self = StObject.set(x, "outerText", value.asInstanceOf[js.Any])
      
      inline def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
      
      inline def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: HTMLElement): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setParentElementNull: Self = StObject.set(x, "parentElement", null)
      
      inline def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
      
      inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
      
      inline def setPart(value: DOMTokenList): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrepend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction1(value))
      
      inline def setPreviousElementSibling(value: Element): Self = StObject.set(x, "previousElementSibling", value.asInstanceOf[js.Any])
      
      inline def setPreviousElementSiblingNull: Self = StObject.set(x, "previousElementSibling", null)
      
      inline def setPreviousElementSiblingUndefined: Self = StObject.set(x, "previousElementSibling", js.undefined)
      
      inline def setPreviousSibling(value: ChildNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
      
      inline def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
      
      inline def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
      
      inline def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
      
      inline def setQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "releasePointerCapture", js.Any.fromFunction1(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
      
      inline def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2(value))
      
      inline def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
      
      inline def setRemoveChild(value: /* child */ Node => Node): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListener(
        value: (fullscreenchange, /* listener */ js.ThisFunction1[HTMLIFrameElementWithStyleString, /* ev */ Event, Any]) => Unit
      ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      inline def setReplaceChild(value: (/* node */ Node, /* child */ Node) => Node): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
      
      inline def setReplaceChildren(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "replaceChildren", js.Any.fromFunction1(value))
      
      inline def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
      
      inline def setRequestFullscreen(value: () => js.Promise[Unit]): Self = StObject.set(x, "requestFullscreen", js.Any.fromFunction0(value))
      
      inline def setRequestPointerLock(value: () => Unit): Self = StObject.set(x, "requestPointerLock", js.Any.fromFunction0(value))
      
      inline def setSandbox(value: DOMTokenList): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: () => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction0(value))
      
      inline def setScrollBy(value: () => Unit): Self = StObject.set(x, "scrollBy", js.Any.fromFunction0(value))
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollIntoView(value: () => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction0(value))
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTo(value: () => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction0(value))
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3(value))
      
      inline def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
      
      inline def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
      
      inline def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1(value))
      
      inline def setShadowRoot(value: ShadowRoot): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
      
      inline def setShadowRootNull: Self = StObject.set(x, "shadowRoot", null)
      
      inline def setShadowRootUndefined: Self = StObject.set(x, "shadowRoot", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTEXT_NODE(value: Double): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      inline def setTextContentNull: Self = StObject.set(x, "textContent", null)
      
      inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "toggleAttribute", js.Any.fromFunction1(value))
      
      inline def setTranslate(value: Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = StObject.set(x, "webkitMatchesSelector", js.Any.fromFunction1(value))
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IframeOptions extends StObject {
    
    var iframeProps: js.UndefOr[PartialHTMLIFrameElementW] = js.undefined
  }
  object IframeOptions {
    
    inline def apply(): IframeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IframeOptions]
    }
    
    extension [Self <: IframeOptions](x: Self) {
      
      inline def setIframeProps(value: PartialHTMLIFrameElementW): Self = StObject.set(x, "iframeProps", value.asInstanceOf[js.Any])
      
      inline def setIframePropsUndefined: Self = StObject.set(x, "iframeProps", js.undefined)
    }
  }
  
  trait StyleString extends StObject {
    
    var style: String
  }
  object StyleString {
    
    inline def apply(style: String): StyleString = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleString]
    }
    
    extension [Self <: StyleString](x: Self) {
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
