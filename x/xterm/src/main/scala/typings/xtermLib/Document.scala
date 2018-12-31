package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document
  extends Node
     with NonElementParentNode
     with DocumentOrShadowRoot
     with ParentNode
     with GlobalEventHandlers
     with DocumentAndElementEventHandlers {
  /**
    * Sets or gets the URL for the current document.
    */
  val URL: java.lang.String = js.native
  /**
    * Sets or gets the color of all active links in the document.
    */
  /** @deprecated */
  var alinkColor: java.lang.String = js.native
  /**
    * Returns a reference to the collection of elements contained by the object.
    */
  /** @deprecated */
  val all: HTMLAllCollection = js.native
  /**
    * Retrieves a collection of all a objects that have a name and/or id property. Objects in this collection are in HTML source order.
    */
  /** @deprecated */
  val anchors: HTMLCollectionOf[HTMLAnchorElement] = js.native
  /**
    * Retrieves a collection of all applet objects in the document.
    */
  /** @deprecated */
  val applets: HTMLCollectionOf[HTMLAppletElement] = js.native
  /**
    * Deprecated. Sets or retrieves a value that indicates the background color behind the object.
    */
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /**
    * Specifies the beginning and end of the document body.
    */
  var body: HTMLElement = js.native
  /**
    * Returns document's encoding.
    */
  val characterSet: java.lang.String = js.native
  /**
    * Gets or sets the character set used to encode the object.
    */
  val charset: java.lang.String = js.native
  /**
    * Gets a value that indicates whether standards-compliant mode is switched on for the object.
    */
  val compatMode: java.lang.String = js.native
  /**
    * Returns document's content type.
    */
  val contentType: java.lang.String = js.native
  /**
    * Returns the HTTP cookies that apply to the Document. If there are no cookies or
    * cookies can't be applied to this resource, the empty string will be returned.
    * Can be set, to add a new cookie to the element's set of HTTP cookies.
    * If the contents are sandboxed into a
    * unique origin (e.g. in an iframe with the sandbox attribute), a
    * "SecurityError" DOMException will be thrown on getting
    * and setting.
    */
  var cookie: java.lang.String = js.native
  /**
    * Returns the script element, or the SVG script element,
    * that is currently executing, as long as the element represents a classic script.
    * In the case of reentrant script execution, returns the one that most recently started executing
    * amongst those that have not yet finished executing.
    * Returns null if the Document is not currently executing a script
    * or SVG script element (e.g., because the running script is an event
    * handler, or a timeout), or if the currently executing script or SVG
    * script element represents a module script.
    */
  val currentScript: HTMLOrSVGScriptElement | scala.Null = js.native
  val defaultView: WindowProxy | scala.Null = js.native
  /**
    * Sets or gets a value that indicates whether the document can be edited.
    */
  var designMode: java.lang.String = js.native
  /**
    * Sets or retrieves a value that indicates the reading order of the object.
    */
  var dir: java.lang.String = js.native
  /**
    * Gets an object representing the document type declaration associated with the current document.
    */
  val doctype: DocumentType | scala.Null = js.native
  /**
    * Gets a reference to the root node of the document.
    */
  val documentElement: HTMLElement = js.native
  /**
    * Returns document's URL.
    */
  val documentURI: java.lang.String = js.native
  /**
    * Sets or gets the security domain of the document.
    */
  var domain: java.lang.String = js.native
  /**
    * Retrieves a collection of all embed objects in the document.
    */
  val embeds: HTMLCollectionOf[HTMLEmbedElement] = js.native
  /**
    * Sets or gets the foreground (text) color of the document.
    */
  /** @deprecated */
  var fgColor: java.lang.String = js.native
  /**
    * Retrieves a collection, in source order, of all form objects in the document.
    */
  val forms: HTMLCollectionOf[HTMLFormElement] = js.native
  /** @deprecated */
  val fullscreen: scala.Boolean = js.native
  /**
    * Returns true if document has the ability to display elements fullscreen
    * and fullscreen is supported, or false otherwise.
    */
  val fullscreenEnabled: scala.Boolean = js.native
  /**
    * Returns the head element.
    */
  val head: HTMLHeadElement = js.native
  val hidden: scala.Boolean = js.native
  /**
    * Retrieves a collection, in source order, of img objects in the document.
    */
  val images: HTMLCollectionOf[HTMLImageElement] = js.native
  /**
    * Gets the implementation object of the current document.
    */
  val implementation: DOMImplementation = js.native
  /**
    * Returns the character encoding used to create the webpage that is loaded into the document object.
    */
  val inputEncoding: java.lang.String = js.native
  /**
    * Gets the date that the page was last modified, if the page supplies one.
    */
  val lastModified: java.lang.String = js.native
  /**
    * Sets or gets the color of the document links.
    */
  /** @deprecated */
  var linkColor: java.lang.String = js.native
  /**
    * Retrieves a collection of all a objects that specify the href property and all area objects in the document.
    */
  val links: HTMLCollectionOf[HTMLAnchorElement | HTMLAreaElement] = js.native
  /**
    * Contains information about the current URL.
    */
  var location: Location = js.native
  var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the state of the object has changed.
    * @param ev The event
    */
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onvisibilitychange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Returns document's origin.
    */
  val origin: java.lang.String = js.native
  /**
    * Return an HTMLCollection of the embed elements in the Document.
    */
  val plugins: HTMLCollectionOf[HTMLEmbedElement] = js.native
  /**
    * Retrieves a value that indicates the current state of the object.
    */
  val readyState: DocumentReadyState = js.native
  /**
    * Gets the URL of the location that referred the user to the current page.
    */
  val referrer: java.lang.String = js.native
  /**
    * Retrieves a collection of all script objects in the document.
    */
  val scripts: HTMLCollectionOf[HTMLScriptElement] = js.native
  val scrollingElement: Element | scala.Null = js.native
  val timeline: DocumentTimeline = js.native
  /**
    * Contains the title of the document.
    */
  var title: java.lang.String = js.native
  val visibilityState: VisibilityState = js.native
  /**
    * Sets or gets the color of the links that the user has visited.
    */
  /** @deprecated */
  var vlinkColor: java.lang.String = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * The options argument sets listener-specific options. For compatibility this can be a
    * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
    * be removed.
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: xtermLib.xtermLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: xtermLib.xtermLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: xtermLib.xtermLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Moves node from another document and returns it.
    * If node is a document, throws a "NotSupportedError" DOMException or, if node is a shadow root, throws a
    * "HierarchyRequestError" DOMException.
    */
  def adoptNode[T /* <: Node */](source: T): T = js.native
  /** @deprecated */
  def captureEvents(): scala.Unit = js.native
  /** @deprecated */
  def clear(): scala.Unit = js.native
  /**
    * Closes an output stream and forces the sent data to display.
    */
  def close(): scala.Unit = js.native
  /**
    * Creates an attribute object with a specified name.
    * @param name String that sets the attribute object's name.
    */
  def createAttribute(localName: java.lang.String): Attr = js.native
  def createAttributeNS(namespace: java.lang.String, qualifiedName: java.lang.String): Attr = js.native
  def createAttributeNS(namespace: scala.Null, qualifiedName: java.lang.String): Attr = js.native
  /**
    * Returns a CDATASection node whose data is data.
    */
  def createCDATASection(data: java.lang.String): CDATASection = js.native
  /**
    * Creates a comment object with the specified data.
    * @param data Sets the comment object's data.
    */
  def createComment(data: java.lang.String): Comment = js.native
  /**
    * Creates a new document.
    */
  def createDocumentFragment(): DocumentFragment = js.native
  def createElement(tagName: java.lang.String): HTMLElement = js.native
  def createElement(tagName: java.lang.String, options: ElementCreationOptions): HTMLElement = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(namespaceURI: scala.Null, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: scala.Null, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.a
  ): SVGAElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.circle
  ): SVGCircleElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.clipPath
  ): SVGClipPathElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.componentTransferFunction
  ): SVGComponentTransferFunctionElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.cursor
  ): SVGCursorElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.defs
  ): SVGDefsElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.desc
  ): SVGDescElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.ellipse
  ): SVGEllipseElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feBlend
  ): SVGFEBlendElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feColorMatrix
  ): SVGFEColorMatrixElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feComponentTransfer
  ): SVGFEComponentTransferElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feComposite
  ): SVGFECompositeElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feConvolveMatrix
  ): SVGFEConvolveMatrixElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feDiffuseLighting
  ): SVGFEDiffuseLightingElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feDisplacementMap
  ): SVGFEDisplacementMapElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feDistantLight
  ): SVGFEDistantLightElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feFlood
  ): SVGFEFloodElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feFuncA
  ): SVGFEFuncAElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feFuncB
  ): SVGFEFuncBElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feFuncG
  ): SVGFEFuncGElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feFuncR
  ): SVGFEFuncRElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feGaussianBlur
  ): SVGFEGaussianBlurElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feImage
  ): SVGFEImageElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feMerge
  ): SVGFEMergeElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feMergeNode
  ): SVGFEMergeNodeElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feMorphology
  ): SVGFEMorphologyElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feOffset
  ): SVGFEOffsetElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.fePointLight
  ): SVGFEPointLightElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feSpecularLighting
  ): SVGFESpecularLightingElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feSpotLight
  ): SVGFESpotLightElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feTile
  ): SVGFETileElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.feTurbulence
  ): SVGFETurbulenceElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.filter
  ): SVGFilterElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.foreignObject
  ): SVGForeignObjectElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.g
  ): SVGGElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.gradient
  ): SVGGradientElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.image
  ): SVGImageElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.line
  ): SVGLineElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.linearGradient
  ): SVGLinearGradientElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.marker
  ): SVGMarkerElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.mask
  ): SVGMaskElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.metadata
  ): SVGMetadataElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.path
  ): SVGPathElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.pattern
  ): SVGPatternElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.polygon
  ): SVGPolygonElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.polyline
  ): SVGPolylineElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.radialGradient
  ): SVGRadialGradientElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.rect
  ): SVGRectElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.script
  ): SVGScriptElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.stop
  ): SVGStopElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.style
  ): SVGStyleElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.svg
  ): SVGSVGElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.switch
  ): SVGSwitchElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.symbol
  ): SVGSymbolElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.text
  ): SVGTextElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.textContent
  ): SVGTextContentElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.textPath
  ): SVGTextPathElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.textPositioning
  ): SVGTextPositioningElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.title
  ): SVGTitleElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.tspan
  ): SVGTSpanElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.use
  ): SVGUseElement = js.native
  def createElementNS(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: xtermLib.xtermLibStrings.view
  ): SVGViewElement = js.native
  def createElementNS(namespace: java.lang.String, qualifiedName: java.lang.String, options: java.lang.String): Element = js.native
  def createElementNS(namespace: scala.Null, qualifiedName: java.lang.String, options: java.lang.String): Element = js.native
  /**
    * Returns an element with namespace namespace. Its namespace prefix will be everything before ":" (U+003E) in qualifiedName or null. Its local name will be everything after
    * ":" (U+003E) in qualifiedName or qualifiedName.
    * If localName does not match the Name production an
    * "InvalidCharacterError" DOMException will be thrown.
    * If one of the following conditions is true a "NamespaceError" DOMException will be thrown:
    * localName does not match the QName production.
    * Namespace prefix is not null and namespace is the empty string.
    * Namespace prefix is "xml" and namespace is not the XML namespace.
    * qualifiedName or namespace prefix is "xmlns" and namespace is not the XMLNS namespace.
    * namespace is the XMLNS namespace and
    * neither qualifiedName nor namespace prefix is "xmlns".
    * When supplied, options's is can be used to create a customized built-in element.
    */
  @JSName("createElementNS")
  def `createElementNS_http://wwww3org/1999/xhtml`(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    qualifiedName: java.lang.String
  ): HTMLElement = js.native
  @JSName("createElementNS")
  def `createElementNS_http://wwww3org/2000/svg`(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: java.lang.String
  ): SVGElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_a(tagName: xtermLib.xtermLibStrings.a): HTMLAnchorElement = js.native
  @JSName("createElement")
  def createElement_a(tagName: xtermLib.xtermLibStrings.a, options: ElementCreationOptions): HTMLAnchorElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_abbr(tagName: xtermLib.xtermLibStrings.abbr): HTMLElement = js.native
  @JSName("createElement")
  def createElement_abbr(tagName: xtermLib.xtermLibStrings.abbr, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_address(tagName: xtermLib.xtermLibStrings.address): HTMLElement = js.native
  @JSName("createElement")
  def createElement_address(tagName: xtermLib.xtermLibStrings.address, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_applet(tagName: xtermLib.xtermLibStrings.applet): HTMLAppletElement = js.native
  @JSName("createElement")
  def createElement_applet(tagName: xtermLib.xtermLibStrings.applet, options: ElementCreationOptions): HTMLAppletElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_area(tagName: xtermLib.xtermLibStrings.area): HTMLAreaElement = js.native
  @JSName("createElement")
  def createElement_area(tagName: xtermLib.xtermLibStrings.area, options: ElementCreationOptions): HTMLAreaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_article(tagName: xtermLib.xtermLibStrings.article): HTMLElement = js.native
  @JSName("createElement")
  def createElement_article(tagName: xtermLib.xtermLibStrings.article, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_aside(tagName: xtermLib.xtermLibStrings.aside): HTMLElement = js.native
  @JSName("createElement")
  def createElement_aside(tagName: xtermLib.xtermLibStrings.aside, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_audio(tagName: xtermLib.xtermLibStrings.audio): HTMLAudioElement = js.native
  @JSName("createElement")
  def createElement_audio(tagName: xtermLib.xtermLibStrings.audio, options: ElementCreationOptions): HTMLAudioElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_b(tagName: xtermLib.xtermLibStrings.b): HTMLElement = js.native
  @JSName("createElement")
  def createElement_b(tagName: xtermLib.xtermLibStrings.b, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_base(tagName: xtermLib.xtermLibStrings.base): HTMLBaseElement = js.native
  @JSName("createElement")
  def createElement_base(tagName: xtermLib.xtermLibStrings.base, options: ElementCreationOptions): HTMLBaseElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_basefont(tagName: xtermLib.xtermLibStrings.basefont): HTMLBaseFontElement = js.native
  @JSName("createElement")
  def createElement_basefont(tagName: xtermLib.xtermLibStrings.basefont, options: ElementCreationOptions): HTMLBaseFontElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_bdo(tagName: xtermLib.xtermLibStrings.bdo): HTMLElement = js.native
  @JSName("createElement")
  def createElement_bdo(tagName: xtermLib.xtermLibStrings.bdo, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_blockquote(tagName: xtermLib.xtermLibStrings.blockquote): HTMLQuoteElement = js.native
  @JSName("createElement")
  def createElement_blockquote(tagName: xtermLib.xtermLibStrings.blockquote, options: ElementCreationOptions): HTMLQuoteElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_body(tagName: xtermLib.xtermLibStrings.body): HTMLBodyElement = js.native
  @JSName("createElement")
  def createElement_body(tagName: xtermLib.xtermLibStrings.body, options: ElementCreationOptions): HTMLBodyElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_br(tagName: xtermLib.xtermLibStrings.br): HTMLBRElement = js.native
  @JSName("createElement")
  def createElement_br(tagName: xtermLib.xtermLibStrings.br, options: ElementCreationOptions): HTMLBRElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_button(tagName: xtermLib.xtermLibStrings.button): HTMLButtonElement = js.native
  @JSName("createElement")
  def createElement_button(tagName: xtermLib.xtermLibStrings.button, options: ElementCreationOptions): HTMLButtonElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_canvas(tagName: xtermLib.xtermLibStrings.canvas): HTMLCanvasElement = js.native
  @JSName("createElement")
  def createElement_canvas(tagName: xtermLib.xtermLibStrings.canvas, options: ElementCreationOptions): HTMLCanvasElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_caption(tagName: xtermLib.xtermLibStrings.caption): HTMLTableCaptionElement = js.native
  @JSName("createElement")
  def createElement_caption(tagName: xtermLib.xtermLibStrings.caption, options: ElementCreationOptions): HTMLTableCaptionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_cite(tagName: xtermLib.xtermLibStrings.cite): HTMLElement = js.native
  @JSName("createElement")
  def createElement_cite(tagName: xtermLib.xtermLibStrings.cite, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_code(tagName: xtermLib.xtermLibStrings.code): HTMLElement = js.native
  @JSName("createElement")
  def createElement_code(tagName: xtermLib.xtermLibStrings.code, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_col(tagName: xtermLib.xtermLibStrings.col): HTMLTableColElement = js.native
  @JSName("createElement")
  def createElement_col(tagName: xtermLib.xtermLibStrings.col, options: ElementCreationOptions): HTMLTableColElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_colgroup(tagName: xtermLib.xtermLibStrings.colgroup): HTMLTableColElement = js.native
  @JSName("createElement")
  def createElement_colgroup(tagName: xtermLib.xtermLibStrings.colgroup, options: ElementCreationOptions): HTMLTableColElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_data(tagName: xtermLib.xtermLibStrings.data): HTMLDataElement = js.native
  @JSName("createElement")
  def createElement_data(tagName: xtermLib.xtermLibStrings.data, options: ElementCreationOptions): HTMLDataElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_datalist(tagName: xtermLib.xtermLibStrings.datalist): HTMLDataListElement = js.native
  @JSName("createElement")
  def createElement_datalist(tagName: xtermLib.xtermLibStrings.datalist, options: ElementCreationOptions): HTMLDataListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dd(tagName: xtermLib.xtermLibStrings.dd): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dd(tagName: xtermLib.xtermLibStrings.dd, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_del(tagName: xtermLib.xtermLibStrings.del): HTMLModElement = js.native
  @JSName("createElement")
  def createElement_del(tagName: xtermLib.xtermLibStrings.del, options: ElementCreationOptions): HTMLModElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_details(tagName: xtermLib.xtermLibStrings.details): HTMLDetailsElement = js.native
  @JSName("createElement")
  def createElement_details(tagName: xtermLib.xtermLibStrings.details, options: ElementCreationOptions): HTMLDetailsElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dfn(tagName: xtermLib.xtermLibStrings.dfn): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dfn(tagName: xtermLib.xtermLibStrings.dfn, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dialog(tagName: xtermLib.xtermLibStrings.dialog): HTMLDialogElement = js.native
  @JSName("createElement")
  def createElement_dialog(tagName: xtermLib.xtermLibStrings.dialog, options: ElementCreationOptions): HTMLDialogElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dir(tagName: xtermLib.xtermLibStrings.dir): HTMLDirectoryElement = js.native
  @JSName("createElement")
  def createElement_dir(tagName: xtermLib.xtermLibStrings.dir, options: ElementCreationOptions): HTMLDirectoryElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_div(tagName: xtermLib.xtermLibStrings.div): HTMLDivElement = js.native
  @JSName("createElement")
  def createElement_div(tagName: xtermLib.xtermLibStrings.div, options: ElementCreationOptions): HTMLDivElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dl(tagName: xtermLib.xtermLibStrings.dl): HTMLDListElement = js.native
  @JSName("createElement")
  def createElement_dl(tagName: xtermLib.xtermLibStrings.dl, options: ElementCreationOptions): HTMLDListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dt(tagName: xtermLib.xtermLibStrings.dt): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dt(tagName: xtermLib.xtermLibStrings.dt, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_em(tagName: xtermLib.xtermLibStrings.em): HTMLElement = js.native
  @JSName("createElement")
  def createElement_em(tagName: xtermLib.xtermLibStrings.em, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_embed(tagName: xtermLib.xtermLibStrings.embed): HTMLEmbedElement = js.native
  @JSName("createElement")
  def createElement_embed(tagName: xtermLib.xtermLibStrings.embed, options: ElementCreationOptions): HTMLEmbedElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_fieldset(tagName: xtermLib.xtermLibStrings.fieldset): HTMLFieldSetElement = js.native
  @JSName("createElement")
  def createElement_fieldset(tagName: xtermLib.xtermLibStrings.fieldset, options: ElementCreationOptions): HTMLFieldSetElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_figcaption(tagName: xtermLib.xtermLibStrings.figcaption): HTMLElement = js.native
  @JSName("createElement")
  def createElement_figcaption(tagName: xtermLib.xtermLibStrings.figcaption, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_figure(tagName: xtermLib.xtermLibStrings.figure): HTMLElement = js.native
  @JSName("createElement")
  def createElement_figure(tagName: xtermLib.xtermLibStrings.figure, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_font(tagName: xtermLib.xtermLibStrings.font): HTMLFontElement = js.native
  @JSName("createElement")
  def createElement_font(tagName: xtermLib.xtermLibStrings.font, options: ElementCreationOptions): HTMLFontElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_footer(tagName: xtermLib.xtermLibStrings.footer): HTMLElement = js.native
  @JSName("createElement")
  def createElement_footer(tagName: xtermLib.xtermLibStrings.footer, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_form(tagName: xtermLib.xtermLibStrings.form): HTMLFormElement = js.native
  @JSName("createElement")
  def createElement_form(tagName: xtermLib.xtermLibStrings.form, options: ElementCreationOptions): HTMLFormElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_frame(tagName: xtermLib.xtermLibStrings.frame): HTMLFrameElement = js.native
  @JSName("createElement")
  def createElement_frame(tagName: xtermLib.xtermLibStrings.frame, options: ElementCreationOptions): HTMLFrameElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_frameset(tagName: xtermLib.xtermLibStrings.frameset): HTMLFrameSetElement = js.native
  @JSName("createElement")
  def createElement_frameset(tagName: xtermLib.xtermLibStrings.frameset, options: ElementCreationOptions): HTMLFrameSetElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h1(tagName: xtermLib.xtermLibStrings.h1): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h1(tagName: xtermLib.xtermLibStrings.h1, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h2(tagName: xtermLib.xtermLibStrings.h2): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h2(tagName: xtermLib.xtermLibStrings.h2, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h3(tagName: xtermLib.xtermLibStrings.h3): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h3(tagName: xtermLib.xtermLibStrings.h3, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h4(tagName: xtermLib.xtermLibStrings.h4): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h4(tagName: xtermLib.xtermLibStrings.h4, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h5(tagName: xtermLib.xtermLibStrings.h5): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h5(tagName: xtermLib.xtermLibStrings.h5, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h6(tagName: xtermLib.xtermLibStrings.h6): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h6(tagName: xtermLib.xtermLibStrings.h6, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_head(tagName: xtermLib.xtermLibStrings.head): HTMLHeadElement = js.native
  @JSName("createElement")
  def createElement_head(tagName: xtermLib.xtermLibStrings.head, options: ElementCreationOptions): HTMLHeadElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_header(tagName: xtermLib.xtermLibStrings.header): HTMLElement = js.native
  @JSName("createElement")
  def createElement_header(tagName: xtermLib.xtermLibStrings.header, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_hgroup(tagName: xtermLib.xtermLibStrings.hgroup): HTMLElement = js.native
  @JSName("createElement")
  def createElement_hgroup(tagName: xtermLib.xtermLibStrings.hgroup, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_hr(tagName: xtermLib.xtermLibStrings.hr): HTMLHRElement = js.native
  @JSName("createElement")
  def createElement_hr(tagName: xtermLib.xtermLibStrings.hr, options: ElementCreationOptions): HTMLHRElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_html(tagName: xtermLib.xtermLibStrings.html): HTMLHtmlElement = js.native
  @JSName("createElement")
  def createElement_html(tagName: xtermLib.xtermLibStrings.html, options: ElementCreationOptions): HTMLHtmlElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_i(tagName: xtermLib.xtermLibStrings.i): HTMLElement = js.native
  @JSName("createElement")
  def createElement_i(tagName: xtermLib.xtermLibStrings.i, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_iframe(tagName: xtermLib.xtermLibStrings.iframe): HTMLIFrameElement = js.native
  @JSName("createElement")
  def createElement_iframe(tagName: xtermLib.xtermLibStrings.iframe, options: ElementCreationOptions): HTMLIFrameElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_img(tagName: xtermLib.xtermLibStrings.img): HTMLImageElement = js.native
  @JSName("createElement")
  def createElement_img(tagName: xtermLib.xtermLibStrings.img, options: ElementCreationOptions): HTMLImageElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_input(tagName: xtermLib.xtermLibStrings.input): HTMLInputElement = js.native
  @JSName("createElement")
  def createElement_input(tagName: xtermLib.xtermLibStrings.input, options: ElementCreationOptions): HTMLInputElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ins(tagName: xtermLib.xtermLibStrings.ins): HTMLModElement = js.native
  @JSName("createElement")
  def createElement_ins(tagName: xtermLib.xtermLibStrings.ins, options: ElementCreationOptions): HTMLModElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_kbd(tagName: xtermLib.xtermLibStrings.kbd): HTMLElement = js.native
  @JSName("createElement")
  def createElement_kbd(tagName: xtermLib.xtermLibStrings.kbd, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_label(tagName: xtermLib.xtermLibStrings.label): HTMLLabelElement = js.native
  @JSName("createElement")
  def createElement_label(tagName: xtermLib.xtermLibStrings.label, options: ElementCreationOptions): HTMLLabelElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_legend(tagName: xtermLib.xtermLibStrings.legend): HTMLLegendElement = js.native
  @JSName("createElement")
  def createElement_legend(tagName: xtermLib.xtermLibStrings.legend, options: ElementCreationOptions): HTMLLegendElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_li(tagName: xtermLib.xtermLibStrings.li): HTMLLIElement = js.native
  @JSName("createElement")
  def createElement_li(tagName: xtermLib.xtermLibStrings.li, options: ElementCreationOptions): HTMLLIElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_link(tagName: xtermLib.xtermLibStrings.link): HTMLLinkElement = js.native
  @JSName("createElement")
  def createElement_link(tagName: xtermLib.xtermLibStrings.link, options: ElementCreationOptions): HTMLLinkElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_listing(tagName: xtermLib.xtermLibStrings.listing): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_listing(tagName: xtermLib.xtermLibStrings.listing, options: ElementCreationOptions): HTMLPreElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_map(tagName: xtermLib.xtermLibStrings.map): HTMLMapElement = js.native
  @JSName("createElement")
  def createElement_map(tagName: xtermLib.xtermLibStrings.map, options: ElementCreationOptions): HTMLMapElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_mark(tagName: xtermLib.xtermLibStrings.mark): HTMLElement = js.native
  @JSName("createElement")
  def createElement_mark(tagName: xtermLib.xtermLibStrings.mark, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_marquee(tagName: xtermLib.xtermLibStrings.marquee): HTMLMarqueeElement = js.native
  @JSName("createElement")
  def createElement_marquee(tagName: xtermLib.xtermLibStrings.marquee, options: ElementCreationOptions): HTMLMarqueeElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_menu(tagName: xtermLib.xtermLibStrings.menu): HTMLMenuElement = js.native
  @JSName("createElement")
  def createElement_menu(tagName: xtermLib.xtermLibStrings.menu, options: ElementCreationOptions): HTMLMenuElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_meta(tagName: xtermLib.xtermLibStrings.meta): HTMLMetaElement = js.native
  @JSName("createElement")
  def createElement_meta(tagName: xtermLib.xtermLibStrings.meta, options: ElementCreationOptions): HTMLMetaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_meter(tagName: xtermLib.xtermLibStrings.meter): HTMLMeterElement = js.native
  @JSName("createElement")
  def createElement_meter(tagName: xtermLib.xtermLibStrings.meter, options: ElementCreationOptions): HTMLMeterElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_nav(tagName: xtermLib.xtermLibStrings.nav): HTMLElement = js.native
  @JSName("createElement")
  def createElement_nav(tagName: xtermLib.xtermLibStrings.nav, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_noscript(tagName: xtermLib.xtermLibStrings.noscript): HTMLElement = js.native
  @JSName("createElement")
  def createElement_noscript(tagName: xtermLib.xtermLibStrings.noscript, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_object(tagName: xtermLib.xtermLibStrings.`object`): HTMLObjectElement = js.native
  @JSName("createElement")
  def createElement_object(tagName: xtermLib.xtermLibStrings.`object`, options: ElementCreationOptions): HTMLObjectElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ol(tagName: xtermLib.xtermLibStrings.ol): HTMLOListElement = js.native
  @JSName("createElement")
  def createElement_ol(tagName: xtermLib.xtermLibStrings.ol, options: ElementCreationOptions): HTMLOListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_optgroup(tagName: xtermLib.xtermLibStrings.optgroup): HTMLOptGroupElement = js.native
  @JSName("createElement")
  def createElement_optgroup(tagName: xtermLib.xtermLibStrings.optgroup, options: ElementCreationOptions): HTMLOptGroupElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_option(tagName: xtermLib.xtermLibStrings.option): HTMLOptionElement = js.native
  @JSName("createElement")
  def createElement_option(tagName: xtermLib.xtermLibStrings.option, options: ElementCreationOptions): HTMLOptionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_output(tagName: xtermLib.xtermLibStrings.output): HTMLOutputElement = js.native
  @JSName("createElement")
  def createElement_output(tagName: xtermLib.xtermLibStrings.output, options: ElementCreationOptions): HTMLOutputElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_p(tagName: xtermLib.xtermLibStrings.p): HTMLParagraphElement = js.native
  @JSName("createElement")
  def createElement_p(tagName: xtermLib.xtermLibStrings.p, options: ElementCreationOptions): HTMLParagraphElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_param(tagName: xtermLib.xtermLibStrings.param): HTMLParamElement = js.native
  @JSName("createElement")
  def createElement_param(tagName: xtermLib.xtermLibStrings.param, options: ElementCreationOptions): HTMLParamElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_picture(tagName: xtermLib.xtermLibStrings.picture): HTMLPictureElement = js.native
  @JSName("createElement")
  def createElement_picture(tagName: xtermLib.xtermLibStrings.picture, options: ElementCreationOptions): HTMLPictureElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_pre(tagName: xtermLib.xtermLibStrings.pre): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_pre(tagName: xtermLib.xtermLibStrings.pre, options: ElementCreationOptions): HTMLPreElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_progress(tagName: xtermLib.xtermLibStrings.progress): HTMLProgressElement = js.native
  @JSName("createElement")
  def createElement_progress(tagName: xtermLib.xtermLibStrings.progress, options: ElementCreationOptions): HTMLProgressElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_q(tagName: xtermLib.xtermLibStrings.q): HTMLQuoteElement = js.native
  @JSName("createElement")
  def createElement_q(tagName: xtermLib.xtermLibStrings.q, options: ElementCreationOptions): HTMLQuoteElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_rt(tagName: xtermLib.xtermLibStrings.rt): HTMLElement = js.native
  @JSName("createElement")
  def createElement_rt(tagName: xtermLib.xtermLibStrings.rt, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ruby(tagName: xtermLib.xtermLibStrings.ruby): HTMLElement = js.native
  @JSName("createElement")
  def createElement_ruby(tagName: xtermLib.xtermLibStrings.ruby, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_s(tagName: xtermLib.xtermLibStrings.s): HTMLElement = js.native
  @JSName("createElement")
  def createElement_s(tagName: xtermLib.xtermLibStrings.s, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_samp(tagName: xtermLib.xtermLibStrings.samp): HTMLElement = js.native
  @JSName("createElement")
  def createElement_samp(tagName: xtermLib.xtermLibStrings.samp, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_script(tagName: xtermLib.xtermLibStrings.script): HTMLScriptElement = js.native
  @JSName("createElement")
  def createElement_script(tagName: xtermLib.xtermLibStrings.script, options: ElementCreationOptions): HTMLScriptElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_section(tagName: xtermLib.xtermLibStrings.section): HTMLElement = js.native
  @JSName("createElement")
  def createElement_section(tagName: xtermLib.xtermLibStrings.section, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_select(tagName: xtermLib.xtermLibStrings.select): HTMLSelectElement = js.native
  @JSName("createElement")
  def createElement_select(tagName: xtermLib.xtermLibStrings.select, options: ElementCreationOptions): HTMLSelectElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_slot(tagName: xtermLib.xtermLibStrings.slot): HTMLSlotElement = js.native
  @JSName("createElement")
  def createElement_slot(tagName: xtermLib.xtermLibStrings.slot, options: ElementCreationOptions): HTMLSlotElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_small(tagName: xtermLib.xtermLibStrings.small): HTMLElement = js.native
  @JSName("createElement")
  def createElement_small(tagName: xtermLib.xtermLibStrings.small, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_source(tagName: xtermLib.xtermLibStrings.source): HTMLSourceElement = js.native
  @JSName("createElement")
  def createElement_source(tagName: xtermLib.xtermLibStrings.source, options: ElementCreationOptions): HTMLSourceElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_span(tagName: xtermLib.xtermLibStrings.span): HTMLSpanElement = js.native
  @JSName("createElement")
  def createElement_span(tagName: xtermLib.xtermLibStrings.span, options: ElementCreationOptions): HTMLSpanElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_strong(tagName: xtermLib.xtermLibStrings.strong): HTMLElement = js.native
  @JSName("createElement")
  def createElement_strong(tagName: xtermLib.xtermLibStrings.strong, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_style(tagName: xtermLib.xtermLibStrings.style): HTMLStyleElement = js.native
  @JSName("createElement")
  def createElement_style(tagName: xtermLib.xtermLibStrings.style, options: ElementCreationOptions): HTMLStyleElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_sub(tagName: xtermLib.xtermLibStrings.sub): HTMLElement = js.native
  @JSName("createElement")
  def createElement_sub(tagName: xtermLib.xtermLibStrings.sub, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_sup(tagName: xtermLib.xtermLibStrings.sup): HTMLElement = js.native
  @JSName("createElement")
  def createElement_sup(tagName: xtermLib.xtermLibStrings.sup, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_table(tagName: xtermLib.xtermLibStrings.table): HTMLTableElement = js.native
  @JSName("createElement")
  def createElement_table(tagName: xtermLib.xtermLibStrings.table, options: ElementCreationOptions): HTMLTableElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tbody(tagName: xtermLib.xtermLibStrings.tbody): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_tbody(tagName: xtermLib.xtermLibStrings.tbody, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_td(tagName: xtermLib.xtermLibStrings.td): HTMLTableDataCellElement = js.native
  @JSName("createElement")
  def createElement_td(tagName: xtermLib.xtermLibStrings.td, options: ElementCreationOptions): HTMLTableDataCellElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_template(tagName: xtermLib.xtermLibStrings.template): HTMLTemplateElement = js.native
  @JSName("createElement")
  def createElement_template(tagName: xtermLib.xtermLibStrings.template, options: ElementCreationOptions): HTMLTemplateElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_textarea(tagName: xtermLib.xtermLibStrings.textarea): HTMLTextAreaElement = js.native
  @JSName("createElement")
  def createElement_textarea(tagName: xtermLib.xtermLibStrings.textarea, options: ElementCreationOptions): HTMLTextAreaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tfoot(tagName: xtermLib.xtermLibStrings.tfoot): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_tfoot(tagName: xtermLib.xtermLibStrings.tfoot, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_th(tagName: xtermLib.xtermLibStrings.th): HTMLTableHeaderCellElement = js.native
  @JSName("createElement")
  def createElement_th(tagName: xtermLib.xtermLibStrings.th, options: ElementCreationOptions): HTMLTableHeaderCellElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_thead(tagName: xtermLib.xtermLibStrings.thead): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_thead(tagName: xtermLib.xtermLibStrings.thead, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_time(tagName: xtermLib.xtermLibStrings.time): HTMLTimeElement = js.native
  @JSName("createElement")
  def createElement_time(tagName: xtermLib.xtermLibStrings.time, options: ElementCreationOptions): HTMLTimeElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_title(tagName: xtermLib.xtermLibStrings.title): HTMLTitleElement = js.native
  @JSName("createElement")
  def createElement_title(tagName: xtermLib.xtermLibStrings.title, options: ElementCreationOptions): HTMLTitleElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tr(tagName: xtermLib.xtermLibStrings.tr): HTMLTableRowElement = js.native
  @JSName("createElement")
  def createElement_tr(tagName: xtermLib.xtermLibStrings.tr, options: ElementCreationOptions): HTMLTableRowElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_track(tagName: xtermLib.xtermLibStrings.track): HTMLTrackElement = js.native
  @JSName("createElement")
  def createElement_track(tagName: xtermLib.xtermLibStrings.track, options: ElementCreationOptions): HTMLTrackElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_u(tagName: xtermLib.xtermLibStrings.u): HTMLElement = js.native
  @JSName("createElement")
  def createElement_u(tagName: xtermLib.xtermLibStrings.u, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ul(tagName: xtermLib.xtermLibStrings.ul): HTMLUListElement = js.native
  @JSName("createElement")
  def createElement_ul(tagName: xtermLib.xtermLibStrings.ul, options: ElementCreationOptions): HTMLUListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_var(tagName: xtermLib.xtermLibStrings.`var`): HTMLElement = js.native
  @JSName("createElement")
  def createElement_var(tagName: xtermLib.xtermLibStrings.`var`, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_video(tagName: xtermLib.xtermLibStrings.video): HTMLVideoElement = js.native
  @JSName("createElement")
  def createElement_video(tagName: xtermLib.xtermLibStrings.video, options: ElementCreationOptions): HTMLVideoElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_wbr(tagName: xtermLib.xtermLibStrings.wbr): HTMLElement = js.native
  @JSName("createElement")
  def createElement_wbr(tagName: xtermLib.xtermLibStrings.wbr, options: ElementCreationOptions): HTMLElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_xmp(tagName: xtermLib.xtermLibStrings.xmp): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_xmp(tagName: xtermLib.xtermLibStrings.xmp, options: ElementCreationOptions): HTMLPreElement = js.native
  def createEvent(eventInterface: java.lang.String): Event = js.native
  @JSName("createEvent")
  def createEvent_AnimationEvent(eventInterface: xtermLib.xtermLibStrings.AnimationEvent): AnimationEvent = js.native
  @JSName("createEvent")
  def createEvent_AnimationPlaybackEvent(eventInterface: xtermLib.xtermLibStrings.AnimationPlaybackEvent): AnimationPlaybackEvent = js.native
  @JSName("createEvent")
  def createEvent_AudioProcessingEvent(eventInterface: xtermLib.xtermLibStrings.AudioProcessingEvent): AudioProcessingEvent = js.native
  @JSName("createEvent")
  def createEvent_BeforeUnloadEvent(eventInterface: xtermLib.xtermLibStrings.BeforeUnloadEvent): BeforeUnloadEvent = js.native
  @JSName("createEvent")
  def createEvent_ClipboardEvent(eventInterface: xtermLib.xtermLibStrings.ClipboardEvent): ClipboardEvent = js.native
  @JSName("createEvent")
  def createEvent_CloseEvent(eventInterface: xtermLib.xtermLibStrings.CloseEvent): CloseEvent = js.native
  @JSName("createEvent")
  def createEvent_CompositionEvent(eventInterface: xtermLib.xtermLibStrings.CompositionEvent): CompositionEvent = js.native
  @JSName("createEvent")
  def createEvent_CustomEvent(eventInterface: xtermLib.xtermLibStrings.CustomEvent): CustomEvent[_] = js.native
  @JSName("createEvent")
  def createEvent_DeviceLightEvent(eventInterface: xtermLib.xtermLibStrings.DeviceLightEvent): DeviceLightEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceMotionEvent(eventInterface: xtermLib.xtermLibStrings.DeviceMotionEvent): DeviceMotionEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceOrientationEvent(eventInterface: xtermLib.xtermLibStrings.DeviceOrientationEvent): DeviceOrientationEvent = js.native
  @JSName("createEvent")
  def createEvent_DragEvent(eventInterface: xtermLib.xtermLibStrings.DragEvent): DragEvent = js.native
  @JSName("createEvent")
  def createEvent_ErrorEvent(eventInterface: xtermLib.xtermLibStrings.ErrorEvent): ErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_Event(eventInterface: xtermLib.xtermLibStrings.Event): Event = js.native
  @JSName("createEvent")
  def createEvent_Events(eventInterface: xtermLib.xtermLibStrings.Events): Event = js.native
  @JSName("createEvent")
  def createEvent_FocusEvent(eventInterface: xtermLib.xtermLibStrings.FocusEvent): FocusEvent = js.native
  @JSName("createEvent")
  def createEvent_FocusNavigationEvent(eventInterface: xtermLib.xtermLibStrings.FocusNavigationEvent): FocusNavigationEvent = js.native
  @JSName("createEvent")
  def createEvent_GamepadEvent(eventInterface: xtermLib.xtermLibStrings.GamepadEvent): GamepadEvent = js.native
  @JSName("createEvent")
  def createEvent_HashChangeEvent(eventInterface: xtermLib.xtermLibStrings.HashChangeEvent): HashChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_IDBVersionChangeEvent(eventInterface: xtermLib.xtermLibStrings.IDBVersionChangeEvent): IDBVersionChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_KeyboardEvent(eventInterface: xtermLib.xtermLibStrings.KeyboardEvent): KeyboardEvent = js.native
  @JSName("createEvent")
  def createEvent_ListeningStateChangedEvent(eventInterface: xtermLib.xtermLibStrings.ListeningStateChangedEvent): ListeningStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_MSGestureEvent(eventInterface: xtermLib.xtermLibStrings.MSGestureEvent): MSGestureEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyMessageEvent(eventInterface: xtermLib.xtermLibStrings.MSMediaKeyMessageEvent): MSMediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyNeededEvent(eventInterface: xtermLib.xtermLibStrings.MSMediaKeyNeededEvent): MSMediaKeyNeededEvent = js.native
  @JSName("createEvent")
  def createEvent_MSPointerEvent(eventInterface: xtermLib.xtermLibStrings.MSPointerEvent): MSPointerEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaEncryptedEvent(eventInterface: xtermLib.xtermLibStrings.MediaEncryptedEvent): MediaEncryptedEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaKeyMessageEvent(eventInterface: xtermLib.xtermLibStrings.MediaKeyMessageEvent): MediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaQueryListEvent(eventInterface: xtermLib.xtermLibStrings.MediaQueryListEvent): MediaQueryListEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamErrorEvent(eventInterface: xtermLib.xtermLibStrings.MediaStreamErrorEvent): MediaStreamErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamEvent(eventInterface: xtermLib.xtermLibStrings.MediaStreamEvent): MediaStreamEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamTrackEvent(eventInterface: xtermLib.xtermLibStrings.MediaStreamTrackEvent): MediaStreamTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_MessageEvent(eventInterface: xtermLib.xtermLibStrings.MessageEvent): MessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvent(eventInterface: xtermLib.xtermLibStrings.MouseEvent): MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvents(eventInterface: xtermLib.xtermLibStrings.MouseEvents): MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvent(eventInterface: xtermLib.xtermLibStrings.MutationEvent): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvents(eventInterface: xtermLib.xtermLibStrings.MutationEvents): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_OfflineAudioCompletionEvent(eventInterface: xtermLib.xtermLibStrings.OfflineAudioCompletionEvent): OfflineAudioCompletionEvent = js.native
  @JSName("createEvent")
  def createEvent_OverflowEvent(eventInterface: xtermLib.xtermLibStrings.OverflowEvent): OverflowEvent = js.native
  @JSName("createEvent")
  def createEvent_PageTransitionEvent(eventInterface: xtermLib.xtermLibStrings.PageTransitionEvent): PageTransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_PaymentRequestUpdateEvent(eventInterface: xtermLib.xtermLibStrings.PaymentRequestUpdateEvent): PaymentRequestUpdateEvent = js.native
  @JSName("createEvent")
  def createEvent_PermissionRequestedEvent(eventInterface: xtermLib.xtermLibStrings.PermissionRequestedEvent): PermissionRequestedEvent = js.native
  @JSName("createEvent")
  def createEvent_PointerEvent(eventInterface: xtermLib.xtermLibStrings.PointerEvent): PointerEvent = js.native
  @JSName("createEvent")
  def createEvent_PopStateEvent(eventInterface: xtermLib.xtermLibStrings.PopStateEvent): PopStateEvent = js.native
  @JSName("createEvent")
  def createEvent_ProgressEvent(eventInterface: xtermLib.xtermLibStrings.ProgressEvent): ProgressEvent = js.native
  @JSName("createEvent")
  def createEvent_PromiseRejectionEvent(eventInterface: xtermLib.xtermLibStrings.PromiseRejectionEvent): PromiseRejectionEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDTMFToneChangeEvent(eventInterface: xtermLib.xtermLibStrings.RTCDTMFToneChangeEvent): RTCDTMFToneChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDataChannelEvent(eventInterface: xtermLib.xtermLibStrings.RTCDataChannelEvent): RTCDataChannelEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDtlsTransportStateChangedEvent(eventInterface: xtermLib.xtermLibStrings.RTCDtlsTransportStateChangedEvent): RTCDtlsTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCErrorEvent(eventInterface: xtermLib.xtermLibStrings.RTCErrorEvent): RTCErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceCandidatePairChangedEvent(eventInterface: xtermLib.xtermLibStrings.RTCIceCandidatePairChangedEvent): RTCIceCandidatePairChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceGathererEvent(eventInterface: xtermLib.xtermLibStrings.RTCIceGathererEvent): RTCIceGathererEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceTransportStateChangedEvent(eventInterface: xtermLib.xtermLibStrings.RTCIceTransportStateChangedEvent): RTCIceTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceErrorEvent(eventInterface: xtermLib.xtermLibStrings.RTCPeerConnectionIceErrorEvent): RTCPeerConnectionIceErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceEvent(eventInterface: xtermLib.xtermLibStrings.RTCPeerConnectionIceEvent): RTCPeerConnectionIceEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCSsrcConflictEvent(eventInterface: xtermLib.xtermLibStrings.RTCSsrcConflictEvent): RTCSsrcConflictEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCStatsEvent(eventInterface: xtermLib.xtermLibStrings.RTCStatsEvent): RTCStatsEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCTrackEvent(eventInterface: xtermLib.xtermLibStrings.RTCTrackEvent): RTCTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvent(eventInterface: xtermLib.xtermLibStrings.SVGZoomEvent): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvents(eventInterface: xtermLib.xtermLibStrings.SVGZoomEvents): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SecurityPolicyViolationEvent(eventInterface: xtermLib.xtermLibStrings.SecurityPolicyViolationEvent): SecurityPolicyViolationEvent = js.native
  @JSName("createEvent")
  def createEvent_ServiceWorkerMessageEvent(eventInterface: xtermLib.xtermLibStrings.ServiceWorkerMessageEvent): ServiceWorkerMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionError(eventInterface: xtermLib.xtermLibStrings.SpeechRecognitionError): SpeechRecognitionError = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionEvent(eventInterface: xtermLib.xtermLibStrings.SpeechRecognitionEvent): SpeechRecognitionEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisErrorEvent(eventInterface: xtermLib.xtermLibStrings.SpeechSynthesisErrorEvent): SpeechSynthesisErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisEvent(eventInterface: xtermLib.xtermLibStrings.SpeechSynthesisEvent): SpeechSynthesisEvent = js.native
  @JSName("createEvent")
  def createEvent_StorageEvent(eventInterface: xtermLib.xtermLibStrings.StorageEvent): StorageEvent = js.native
  @JSName("createEvent")
  def createEvent_TextEvent(eventInterface: xtermLib.xtermLibStrings.TextEvent): TextEvent = js.native
  @JSName("createEvent")
  def createEvent_TouchEvent(eventInterface: xtermLib.xtermLibStrings.TouchEvent): TouchEvent = js.native
  @JSName("createEvent")
  def createEvent_TrackEvent(eventInterface: xtermLib.xtermLibStrings.TrackEvent): TrackEvent = js.native
  @JSName("createEvent")
  def createEvent_TransitionEvent(eventInterface: xtermLib.xtermLibStrings.TransitionEvent): TransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvent(eventInterface: xtermLib.xtermLibStrings.UIEvent): UIEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvents(eventInterface: xtermLib.xtermLibStrings.UIEvents): UIEvent = js.native
  @JSName("createEvent")
  def createEvent_VRDisplayEvent(eventInterface: xtermLib.xtermLibStrings.VRDisplayEvent): VRDisplayEvent = js.native
  @JSName("createEvent")
  def `createEvent_VRDisplayEvent `(eventInterface: xtermLib.xtermLibStrings.`VRDisplayEvent `): VRDisplayEvent = js.native
  @JSName("createEvent")
  def createEvent_WebGLContextEvent(eventInterface: xtermLib.xtermLibStrings.WebGLContextEvent): WebGLContextEvent = js.native
  @JSName("createEvent")
  def createEvent_WheelEvent(eventInterface: xtermLib.xtermLibStrings.WheelEvent): WheelEvent = js.native
  /**
    * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list
    * @param filter A custom NodeFilter function to use. For more information, see filter. Use null for no filter.
    * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
    */
  def createNodeIterator(root: Node): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: scala.Double): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: scala.Double, filter: NodeFilter): NodeIterator = js.native
  /**
    * Returns a ProcessingInstruction node whose target is target and data is data.
    * If target does not match the Name production an
    * "InvalidCharacterError" DOMException will be thrown.
    * If data contains "?>" an
    * "InvalidCharacterError" DOMException will be thrown.
    */
  def createProcessingInstruction(target: java.lang.String, data: java.lang.String): ProcessingInstruction = js.native
  /**
    *  Returns an empty range object that has both of its boundary points positioned at the beginning of the document.
    */
  def createRange(): Range = js.native
  /**
    * Creates a text string from the specified value.
    * @param data String that specifies the nodeValue property of the text node.
    */
  def createTextNode(data: java.lang.String): Text = js.native
  def createTouch(
    view: WindowProxy,
    target: EventTarget,
    identifier: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    screenX: scala.Double,
    screenY: scala.Double
  ): Touch = js.native
  def createTouchList(touches: Touch*): TouchList = js.native
  /**
    * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
    * @param filter A custom NodeFilter function to use.
    * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
    */
  def createTreeWalker(root: Node): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: scala.Null, entityReferenceExpansion: scala.Boolean): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: NodeFilter): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: NodeFilter, entityReferenceExpansion: scala.Boolean): TreeWalker = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | scala.Null],
    `type`: scala.Double
  ): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | scala.Null],
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: scala.Null, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: scala.Null,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  /**
    * Executes a command on the current document, current selection, or the given range.
    * @param commandId String that specifies the command to execute. This command can be any of the command identifiers that can be executed in script.
    * @param showUI Display the user interface, defaults to false.
    * @param value Value to assign.
    */
  def execCommand(commandId: java.lang.String): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean, value: java.lang.String): scala.Boolean = js.native
  /**
    * Stops document's fullscreen element from being displayed fullscreen and
    * resolves promise when done.
    */
  def exitFullscreen(): js.Promise[scala.Unit] = js.native
  def getAnimations(): js.Array[Animation] = js.native
  /**
    * collection = element . getElementsByClassName(classNames)
    */
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[Element] = js.native
  /**
    * Gets a collection of objects based on the value of the NAME or ID attribute.
    * @param elementName Gets a collection of objects based on the value of the NAME or ID attribute.
    */
  def getElementsByName(elementName: java.lang.String): NodeListOf[HTMLElement] = js.native
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  /**
    * If namespace and localName are
    * "*" returns a HTMLCollection of all descendant elements.
    * If only namespace is "*" returns a HTMLCollection of all descendant elements whose local name is localName.
    * If only localName is "*" returns a HTMLCollection of all descendant elements whose namespace is namespace.
    * Otherwise, returns a HTMLCollection of all descendant elements whose namespace is namespace and local name is localName.
    */
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/1999/xhtml`(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    localName: java.lang.String
  ): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/2000/svg`(
    namespaceURI: xtermLib.xtermLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    localName: java.lang.String
  ): HTMLCollectionOf[SVGElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_a(qualifiedName: xtermLib.xtermLibStrings.a): HTMLCollectionOf[HTMLAnchorElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_abbr(qualifiedName: xtermLib.xtermLibStrings.abbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_address(qualifiedName: xtermLib.xtermLibStrings.address): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_applet(qualifiedName: xtermLib.xtermLibStrings.applet): HTMLCollectionOf[HTMLAppletElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_area(qualifiedName: xtermLib.xtermLibStrings.area): HTMLCollectionOf[HTMLAreaElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_article(qualifiedName: xtermLib.xtermLibStrings.article): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_aside(qualifiedName: xtermLib.xtermLibStrings.aside): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_audio(qualifiedName: xtermLib.xtermLibStrings.audio): HTMLCollectionOf[HTMLAudioElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_b(qualifiedName: xtermLib.xtermLibStrings.b): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_base(qualifiedName: xtermLib.xtermLibStrings.base): HTMLCollectionOf[HTMLBaseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_basefont(qualifiedName: xtermLib.xtermLibStrings.basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdo(qualifiedName: xtermLib.xtermLibStrings.bdo): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_blockquote(qualifiedName: xtermLib.xtermLibStrings.blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_body(qualifiedName: xtermLib.xtermLibStrings.body): HTMLCollectionOf[HTMLBodyElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_br(qualifiedName: xtermLib.xtermLibStrings.br): HTMLCollectionOf[HTMLBRElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_button(qualifiedName: xtermLib.xtermLibStrings.button): HTMLCollectionOf[HTMLButtonElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_canvas(qualifiedName: xtermLib.xtermLibStrings.canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_caption(qualifiedName: xtermLib.xtermLibStrings.caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_circle(qualifiedName: xtermLib.xtermLibStrings.circle): HTMLCollectionOf[SVGCircleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_cite(qualifiedName: xtermLib.xtermLibStrings.cite): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_clipPath(qualifiedName: xtermLib.xtermLibStrings.clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_code(qualifiedName: xtermLib.xtermLibStrings.code): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_col(qualifiedName: xtermLib.xtermLibStrings.col): HTMLCollectionOf[HTMLTableColElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_colgroup(qualifiedName: xtermLib.xtermLibStrings.colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_data(qualifiedName: xtermLib.xtermLibStrings.data): HTMLCollectionOf[HTMLDataElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_datalist(qualifiedName: xtermLib.xtermLibStrings.datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dd(qualifiedName: xtermLib.xtermLibStrings.dd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_defs(qualifiedName: xtermLib.xtermLibStrings.defs): HTMLCollectionOf[SVGDefsElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_del(qualifiedName: xtermLib.xtermLibStrings.del): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_desc(qualifiedName: xtermLib.xtermLibStrings.desc): HTMLCollectionOf[SVGDescElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_details(qualifiedName: xtermLib.xtermLibStrings.details): HTMLCollectionOf[HTMLDetailsElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dfn(qualifiedName: xtermLib.xtermLibStrings.dfn): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dialog(qualifiedName: xtermLib.xtermLibStrings.dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dir(qualifiedName: xtermLib.xtermLibStrings.dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_div(qualifiedName: xtermLib.xtermLibStrings.div): HTMLCollectionOf[HTMLDivElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dl(qualifiedName: xtermLib.xtermLibStrings.dl): HTMLCollectionOf[HTMLDListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dt(qualifiedName: xtermLib.xtermLibStrings.dt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ellipse(qualifiedName: xtermLib.xtermLibStrings.ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_em(qualifiedName: xtermLib.xtermLibStrings.em): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_embed(qualifiedName: xtermLib.xtermLibStrings.embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feBlend(qualifiedName: xtermLib.xtermLibStrings.feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feColorMatrix(qualifiedName: xtermLib.xtermLibStrings.feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComponentTransfer(qualifiedName: xtermLib.xtermLibStrings.feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComposite(qualifiedName: xtermLib.xtermLibStrings.feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feConvolveMatrix(qualifiedName: xtermLib.xtermLibStrings.feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDiffuseLighting(qualifiedName: xtermLib.xtermLibStrings.feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDisplacementMap(qualifiedName: xtermLib.xtermLibStrings.feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDistantLight(qualifiedName: xtermLib.xtermLibStrings.feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFlood(qualifiedName: xtermLib.xtermLibStrings.feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncA(qualifiedName: xtermLib.xtermLibStrings.feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncB(qualifiedName: xtermLib.xtermLibStrings.feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncG(qualifiedName: xtermLib.xtermLibStrings.feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncR(qualifiedName: xtermLib.xtermLibStrings.feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feGaussianBlur(qualifiedName: xtermLib.xtermLibStrings.feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feImage(qualifiedName: xtermLib.xtermLibStrings.feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMerge(qualifiedName: xtermLib.xtermLibStrings.feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMergeNode(qualifiedName: xtermLib.xtermLibStrings.feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMorphology(qualifiedName: xtermLib.xtermLibStrings.feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feOffset(qualifiedName: xtermLib.xtermLibStrings.feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fePointLight(qualifiedName: xtermLib.xtermLibStrings.fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpecularLighting(qualifiedName: xtermLib.xtermLibStrings.feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpotLight(qualifiedName: xtermLib.xtermLibStrings.feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTile(qualifiedName: xtermLib.xtermLibStrings.feTile): HTMLCollectionOf[SVGFETileElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTurbulence(qualifiedName: xtermLib.xtermLibStrings.feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_fieldset(qualifiedName: xtermLib.xtermLibStrings.fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_figcaption(qualifiedName: xtermLib.xtermLibStrings.figcaption): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_figure(qualifiedName: xtermLib.xtermLibStrings.figure): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_filter(qualifiedName: xtermLib.xtermLibStrings.filter): HTMLCollectionOf[SVGFilterElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_font(qualifiedName: xtermLib.xtermLibStrings.font): HTMLCollectionOf[HTMLFontElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_footer(qualifiedName: xtermLib.xtermLibStrings.footer): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_foreignObject(qualifiedName: xtermLib.xtermLibStrings.foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_form(qualifiedName: xtermLib.xtermLibStrings.form): HTMLCollectionOf[HTMLFormElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_frame(qualifiedName: xtermLib.xtermLibStrings.frame): HTMLCollectionOf[HTMLFrameElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_frameset(qualifiedName: xtermLib.xtermLibStrings.frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_g(qualifiedName: xtermLib.xtermLibStrings.g): HTMLCollectionOf[SVGGElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h1(qualifiedName: xtermLib.xtermLibStrings.h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h2(qualifiedName: xtermLib.xtermLibStrings.h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h3(qualifiedName: xtermLib.xtermLibStrings.h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h4(qualifiedName: xtermLib.xtermLibStrings.h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h5(qualifiedName: xtermLib.xtermLibStrings.h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h6(qualifiedName: xtermLib.xtermLibStrings.h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_head(qualifiedName: xtermLib.xtermLibStrings.head): HTMLCollectionOf[HTMLHeadElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_header(qualifiedName: xtermLib.xtermLibStrings.header): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_hgroup(qualifiedName: xtermLib.xtermLibStrings.hgroup): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_hr(qualifiedName: xtermLib.xtermLibStrings.hr): HTMLCollectionOf[HTMLHRElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_html(qualifiedName: xtermLib.xtermLibStrings.html): HTMLCollectionOf[HTMLHtmlElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_i(qualifiedName: xtermLib.xtermLibStrings.i): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_iframe(qualifiedName: xtermLib.xtermLibStrings.iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_image(qualifiedName: xtermLib.xtermLibStrings.image): HTMLCollectionOf[SVGImageElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_img(qualifiedName: xtermLib.xtermLibStrings.img): HTMLCollectionOf[HTMLImageElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_input(qualifiedName: xtermLib.xtermLibStrings.input): HTMLCollectionOf[HTMLInputElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ins(qualifiedName: xtermLib.xtermLibStrings.ins): HTMLCollectionOf[HTMLModElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_kbd(qualifiedName: xtermLib.xtermLibStrings.kbd): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_label(qualifiedName: xtermLib.xtermLibStrings.label): HTMLCollectionOf[HTMLLabelElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_legend(qualifiedName: xtermLib.xtermLibStrings.legend): HTMLCollectionOf[HTMLLegendElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_li(qualifiedName: xtermLib.xtermLibStrings.li): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_line(qualifiedName: xtermLib.xtermLibStrings.line): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_linearGradient(qualifiedName: xtermLib.xtermLibStrings.linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_link(qualifiedName: xtermLib.xtermLibStrings.link): HTMLCollectionOf[HTMLLinkElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_map(qualifiedName: xtermLib.xtermLibStrings.map): HTMLCollectionOf[HTMLMapElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_mark(qualifiedName: xtermLib.xtermLibStrings.mark): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marker(qualifiedName: xtermLib.xtermLibStrings.marker): HTMLCollectionOf[SVGMarkerElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_marquee(qualifiedName: xtermLib.xtermLibStrings.marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mask(qualifiedName: xtermLib.xtermLibStrings.mask): HTMLCollectionOf[SVGMaskElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_menu(qualifiedName: xtermLib.xtermLibStrings.menu): HTMLCollectionOf[HTMLMenuElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_meta(qualifiedName: xtermLib.xtermLibStrings.meta): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_metadata(qualifiedName: xtermLib.xtermLibStrings.metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_meter(qualifiedName: xtermLib.xtermLibStrings.meter): HTMLCollectionOf[HTMLMeterElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_nav(qualifiedName: xtermLib.xtermLibStrings.nav): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_noscript(qualifiedName: xtermLib.xtermLibStrings.noscript): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_object(qualifiedName: xtermLib.xtermLibStrings.`object`): HTMLCollectionOf[HTMLObjectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ol(qualifiedName: xtermLib.xtermLibStrings.ol): HTMLCollectionOf[HTMLOListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_optgroup(qualifiedName: xtermLib.xtermLibStrings.optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_option(qualifiedName: xtermLib.xtermLibStrings.option): HTMLCollectionOf[HTMLOptionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_output(qualifiedName: xtermLib.xtermLibStrings.output): HTMLCollectionOf[HTMLOutputElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_p(qualifiedName: xtermLib.xtermLibStrings.p): HTMLCollectionOf[HTMLParagraphElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_param(qualifiedName: xtermLib.xtermLibStrings.param): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_path(qualifiedName: xtermLib.xtermLibStrings.path): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pattern(qualifiedName: xtermLib.xtermLibStrings.pattern): HTMLCollectionOf[SVGPatternElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_picture(qualifiedName: xtermLib.xtermLibStrings.picture): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polygon(qualifiedName: xtermLib.xtermLibStrings.polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polyline(qualifiedName: xtermLib.xtermLibStrings.polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_pre(qualifiedName: xtermLib.xtermLibStrings.pre): HTMLCollectionOf[HTMLPreElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_progress(qualifiedName: xtermLib.xtermLibStrings.progress): HTMLCollectionOf[HTMLProgressElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_q(qualifiedName: xtermLib.xtermLibStrings.q): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_radialGradient(qualifiedName: xtermLib.xtermLibStrings.radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rect(qualifiedName: xtermLib.xtermLibStrings.rect): HTMLCollectionOf[SVGRectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_rt(qualifiedName: xtermLib.xtermLibStrings.rt): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ruby(qualifiedName: xtermLib.xtermLibStrings.ruby): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_s(qualifiedName: xtermLib.xtermLibStrings.s): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_samp(qualifiedName: xtermLib.xtermLibStrings.samp): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_script(qualifiedName: xtermLib.xtermLibStrings.script): HTMLCollectionOf[HTMLScriptElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_section(qualifiedName: xtermLib.xtermLibStrings.section): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_select(qualifiedName: xtermLib.xtermLibStrings.select): HTMLCollectionOf[HTMLSelectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_slot(qualifiedName: xtermLib.xtermLibStrings.slot): HTMLCollectionOf[HTMLSlotElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_small(qualifiedName: xtermLib.xtermLibStrings.small): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_source(qualifiedName: xtermLib.xtermLibStrings.source): HTMLCollectionOf[HTMLSourceElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_span(qualifiedName: xtermLib.xtermLibStrings.span): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_stop(qualifiedName: xtermLib.xtermLibStrings.stop): HTMLCollectionOf[SVGStopElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_strong(qualifiedName: xtermLib.xtermLibStrings.strong): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_style(qualifiedName: xtermLib.xtermLibStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_sub(qualifiedName: xtermLib.xtermLibStrings.sub): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_sup(qualifiedName: xtermLib.xtermLibStrings.sup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_svg(qualifiedName: xtermLib.xtermLibStrings.svg): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_switch(qualifiedName: xtermLib.xtermLibStrings.switch): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_symbol(qualifiedName: xtermLib.xtermLibStrings.symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_table(qualifiedName: xtermLib.xtermLibStrings.table): HTMLCollectionOf[HTMLTableElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tbody(qualifiedName: xtermLib.xtermLibStrings.tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_td(qualifiedName: xtermLib.xtermLibStrings.td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_template(qualifiedName: xtermLib.xtermLibStrings.template): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_text(qualifiedName: xtermLib.xtermLibStrings.text): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textPath(qualifiedName: xtermLib.xtermLibStrings.textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_textarea(qualifiedName: xtermLib.xtermLibStrings.textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tfoot(qualifiedName: xtermLib.xtermLibStrings.tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_th(qualifiedName: xtermLib.xtermLibStrings.th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_thead(qualifiedName: xtermLib.xtermLibStrings.thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_time(qualifiedName: xtermLib.xtermLibStrings.time): HTMLCollectionOf[HTMLTimeElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_title(qualifiedName: xtermLib.xtermLibStrings.title): HTMLCollectionOf[HTMLTitleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tr(qualifiedName: xtermLib.xtermLibStrings.tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_track(qualifiedName: xtermLib.xtermLibStrings.track): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tspan(qualifiedName: xtermLib.xtermLibStrings.tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_u(qualifiedName: xtermLib.xtermLibStrings.u): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ul(qualifiedName: xtermLib.xtermLibStrings.ul): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_use(qualifiedName: xtermLib.xtermLibStrings.use): HTMLCollectionOf[SVGUseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_var(qualifiedName: xtermLib.xtermLibStrings.`var`): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_video(qualifiedName: xtermLib.xtermLibStrings.video): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_view(qualifiedName: xtermLib.xtermLibStrings.view): HTMLCollectionOf[SVGViewElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_wbr(qualifiedName: xtermLib.xtermLibStrings.wbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Gets a value indicating whether the object currently has focus.
    */
  def hasFocus(): scala.Boolean = js.native
  def importNode[T /* <: Node */](importedNode: T, deep: scala.Boolean): T = js.native
  /**
    * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
    * @param url Specifies a MIME type for the document.
    * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
    * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
    * @param replace Specifies whether the existing entry for the document is replaced in the history list.
    */
  def open(): Document = js.native
  def open(url: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String, replace: scala.Boolean): Document = js.native
  /**
    * Returns a Boolean value that indicates whether a specified command can be successfully executed using execCommand, given the current state of the document.
    * @param commandId Specifies a command identifier.
    */
  def queryCommandEnabled(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether the specified command is in the indeterminate state.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandIndeterm(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates the current state of the command.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandState(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether the current command is supported on the current range.
    * @param commandId Specifies a command identifier.
    */
  def queryCommandSupported(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the current value of the document, range, or current selection for the given command.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandValue(commandId: java.lang.String): java.lang.String = js.native
  /** @deprecated */
  def releaseEvents(): scala.Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: xtermLib.xtermLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: xtermLib.xtermLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: xtermLib.xtermLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: xtermLib.xtermLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: xtermLib.xtermLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  /**
    * Writes one or more HTML expressions to a document in the specified window.
    * @param content Specifies the text and HTML tags to write.
    */
  def write(text: java.lang.String*): scala.Unit = js.native
  /**
    * Writes one or more HTML expressions, followed by a carriage return, to a document in the specified window.
    * @param content The text and HTML tags to write.
    */
  def writeln(text: java.lang.String*): scala.Unit = js.native
}

@JSGlobal("Document")
@js.native
object Document
  extends org.scalablytyped.runtime.Instantiable0[Document]

