package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object xtermLibMembers extends js.Object {
  var CSS: CSS = js.native
  var ServiceUIFrameContext: ServiceUIFrameContext = js.native
  var applicationCache: ApplicationCache = js.native
  var caches: CacheStorage = js.native
  var clientInformation: Navigator = js.native
  var closed: scala.Boolean = js.native
  var console: Console = js.native
  var crypto: Crypto = js.native
  var customElements: CustomElementRegistry = js.native
  var defaultStatus: java.lang.String = js.native
  var devicePixelRatio: scala.Double = js.native
  var doNotTrack: java.lang.String = js.native
  var document: Document = js.native
  var event: js.UndefOr[Event] = js.native
  /** @deprecated */
  var external: External = js.native
  var frameElement: Element = js.native
  var frames: Window = js.native
  var history: History = js.native
  var indexedDB: IDBFactory = js.native
  var innerHeight: scala.Double = js.native
  var innerWidth: scala.Double = js.native
  var isSecureContext: scala.Boolean = js.native
  var length: scala.Double = js.native
  var localStorage: Storage = js.native
  var location: Location = js.native
  var locationbar: BarProp = js.native
  var menubar: BarProp = js.native
  var msContentScript: ExtensionScriptApis = js.native
  val name: scala.Nothing = js.native
  var navigator: Navigator = js.native
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    */
  var onabort: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  var onafterprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onanimationcancel: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationend: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationiteration: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationstart: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onauxclick: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onbeforeprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onbeforeunload: (js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    */
  var onblur: (js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, js.Any]) | scala.Null = js.native
  var oncancel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    */
  var oncanplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oncanplaythrough: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    */
  var onchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    */
  var onclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onclose: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    */
  var oncontextmenu: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var oncuechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    */
  var ondblclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var ondevicelight: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, js.Any]) | scala.Null = js.native
  var ondevicemotion: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, js.Any]) | scala.Null = js.native
  var ondeviceorientation: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    */
  var ondrag: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    */
  var ondragend: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    */
  var ondragenter: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  var ondragexit: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    */
  var ondragleave: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    */
  var ondragover: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    */
  var ondragstart: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  var ondrop: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    */
  var ondurationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    */
  var onemptied: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    */
  var onended: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  var onerror: ErrorEventHandler = js.native
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    */
  var onfocus: (js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, js.Any]) | scala.Null = js.native
  var ongotpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onhashchange: (js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, js.Any]) | scala.Null = js.native
  var oninput: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oninvalid: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    */
  var onkeydown: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    */
  var onkeypress: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    */
  var onkeyup: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  var onlanguagechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    */
  var onload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    */
  var onloadeddata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    */
  var onloadedmetadata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    */
  var onloadstart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onlostpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, js.Any]) | scala.Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    */
  var onmousedown: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmouseenter: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmouseleave: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    */
  var onmousemove: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    */
  var onmouseout: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    */
  var onmouseover: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    */
  var onmouseup: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmousewheel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturedoubletap: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgestureend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturehold: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturestart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturetap: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsinertiastart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointermove: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerout: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerover: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerup: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onoffline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ononline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onpagehide: (js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, js.Any]) | scala.Null = js.native
  var onpageshow: (js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    */
  var onpause: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    */
  var onplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    */
  var onplaying: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onpointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointermove: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerout: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerover: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerup: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpopstate: (js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    */
  var onprogress: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    */
  var onratechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onreadystatechange: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  var onrejectionhandled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    */
  var onreset: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onresize: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    */
  var onscroll: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    */
  var onseeked: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    */
  var onseeking: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    */
  var onselect: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    */
  var onstalled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onstorage: (js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, js.Any]) | scala.Null = js.native
  var onsubmit: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    */
  var onsuspend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    */
  var ontimeupdate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ontoggle: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ontouchcancel: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchend: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchmove: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchstart: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontransitioncancel: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionend: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionrun: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionstart: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var onunhandledrejection: (js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, js.Any]) | scala.Null = js.native
  var onunload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    */
  var onvolumechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayblur: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    */
  var onwaiting: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onwheel: (js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, js.Any]) | scala.Null = js.native
  var opener: js.Any = js.native
  /** @deprecated */
  var orientation: java.lang.String | scala.Double = js.native
  var origin: java.lang.String = js.native
  var outerHeight: scala.Double = js.native
  var outerWidth: scala.Double = js.native
  var pageXOffset: scala.Double = js.native
  var pageYOffset: scala.Double = js.native
  var parent: Window = js.native
  var performance: Performance = js.native
  var personalbar: BarProp = js.native
  var screen: Screen = js.native
  var screenLeft: scala.Double = js.native
  var screenTop: scala.Double = js.native
  var screenX: scala.Double = js.native
  var screenY: scala.Double = js.native
  var scrollX: scala.Double = js.native
  var scrollY: scala.Double = js.native
  var scrollbars: BarProp = js.native
  var self: Window = js.native
  var sessionStorage: Storage = js.native
  var speechSynthesis: SpeechSynthesis = js.native
  var status: java.lang.String = js.native
  var statusbar: BarProp = js.native
  var styleMedia: StyleMedia = js.native
  var toolbar: BarProp = js.native
  var top: Window = js.native
  var window: Window = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: xtermLib.xtermLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: xtermLib.xtermLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: xtermLib.xtermLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: xtermLib.xtermLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: xtermLib.xtermLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: xtermLib.xtermLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: xtermLib.xtermLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: xtermLib.xtermLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: xtermLib.xtermLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: xtermLib.xtermLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: xtermLib.xtermLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: xtermLib.xtermLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: xtermLib.xtermLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: xtermLib.xtermLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: xtermLib.xtermLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: xtermLib.xtermLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: xtermLib.xtermLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: xtermLib.xtermLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: xtermLib.xtermLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: xtermLib.xtermLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: xtermLib.xtermLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: xtermLib.xtermLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: xtermLib.xtermLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: xtermLib.xtermLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: xtermLib.xtermLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: xtermLib.xtermLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: xtermLib.xtermLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: xtermLib.xtermLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: xtermLib.xtermLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: xtermLib.xtermLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: xtermLib.xtermLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: xtermLib.xtermLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: xtermLib.xtermLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: xtermLib.xtermLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: xtermLib.xtermLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: xtermLib.xtermLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: xtermLib.xtermLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: xtermLib.xtermLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: xtermLib.xtermLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: xtermLib.xtermLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: xtermLib.xtermLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: xtermLib.xtermLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: xtermLib.xtermLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: xtermLib.xtermLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: xtermLib.xtermLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: xtermLib.xtermLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: xtermLib.xtermLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: xtermLib.xtermLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: xtermLib.xtermLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: xtermLib.xtermLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: xtermLib.xtermLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: xtermLib.xtermLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: xtermLib.xtermLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: xtermLib.xtermLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: xtermLib.xtermLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: xtermLib.xtermLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: xtermLib.xtermLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: xtermLib.xtermLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: xtermLib.xtermLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: xtermLib.xtermLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: xtermLib.xtermLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: xtermLib.xtermLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: xtermLib.xtermLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: xtermLib.xtermLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: xtermLib.xtermLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: xtermLib.xtermLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: xtermLib.xtermLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: xtermLib.xtermLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: xtermLib.xtermLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: xtermLib.xtermLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: xtermLib.xtermLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: xtermLib.xtermLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: xtermLib.xtermLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: xtermLib.xtermLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: xtermLib.xtermLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: xtermLib.xtermLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: xtermLib.xtermLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: xtermLib.xtermLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: xtermLib.xtermLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: xtermLib.xtermLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: xtermLib.xtermLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: xtermLib.xtermLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: xtermLib.xtermLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: xtermLib.xtermLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: xtermLib.xtermLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: xtermLib.xtermLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: xtermLib.xtermLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: xtermLib.xtermLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: xtermLib.xtermLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: xtermLib.xtermLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: xtermLib.xtermLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: xtermLib.xtermLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: xtermLib.xtermLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: xtermLib.xtermLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: xtermLib.xtermLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: xtermLib.xtermLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: xtermLib.xtermLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: xtermLib.xtermLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: xtermLib.xtermLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: xtermLib.xtermLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: xtermLib.xtermLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: xtermLib.xtermLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: xtermLib.xtermLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: xtermLib.xtermLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: xtermLib.xtermLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: xtermLib.xtermLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: xtermLib.xtermLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: xtermLib.xtermLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: xtermLib.xtermLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: xtermLib.xtermLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: xtermLib.xtermLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: xtermLib.xtermLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: xtermLib.xtermLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: xtermLib.xtermLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: xtermLib.xtermLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: xtermLib.xtermLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: xtermLib.xtermLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: xtermLib.xtermLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: xtermLib.xtermLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: xtermLib.xtermLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: xtermLib.xtermLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: xtermLib.xtermLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: xtermLib.xtermLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: xtermLib.xtermLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: xtermLib.xtermLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: xtermLib.xtermLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: xtermLib.xtermLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: xtermLib.xtermLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: xtermLib.xtermLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: xtermLib.xtermLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: xtermLib.xtermLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: xtermLib.xtermLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: xtermLib.xtermLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: xtermLib.xtermLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: xtermLib.xtermLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: xtermLib.xtermLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: xtermLib.xtermLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: xtermLib.xtermLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: xtermLib.xtermLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: xtermLib.xtermLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: xtermLib.xtermLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: xtermLib.xtermLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: xtermLib.xtermLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: xtermLib.xtermLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: xtermLib.xtermLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: xtermLib.xtermLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: xtermLib.xtermLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: xtermLib.xtermLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: xtermLib.xtermLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: xtermLib.xtermLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: xtermLib.xtermLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: xtermLib.xtermLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: xtermLib.xtermLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: xtermLib.xtermLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: xtermLib.xtermLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: xtermLib.xtermLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: xtermLib.xtermLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: xtermLib.xtermLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: xtermLib.xtermLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: xtermLib.xtermLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: xtermLib.xtermLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: xtermLib.xtermLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: xtermLib.xtermLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: xtermLib.xtermLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: xtermLib.xtermLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: xtermLib.xtermLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: xtermLib.xtermLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: xtermLib.xtermLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: xtermLib.xtermLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: xtermLib.xtermLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: xtermLib.xtermLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: xtermLib.xtermLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: xtermLib.xtermLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: xtermLib.xtermLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: xtermLib.xtermLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: xtermLib.xtermLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: xtermLib.xtermLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: xtermLib.xtermLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: xtermLib.xtermLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: xtermLib.xtermLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: xtermLib.xtermLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: xtermLib.xtermLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: xtermLib.xtermLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: xtermLib.xtermLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: xtermLib.xtermLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: xtermLib.xtermLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: xtermLib.xtermLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: xtermLib.xtermLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: xtermLib.xtermLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: xtermLib.xtermLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: xtermLib.xtermLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: xtermLib.xtermLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: xtermLib.xtermLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: xtermLib.xtermLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: xtermLib.xtermLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: xtermLib.xtermLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: xtermLib.xtermLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: xtermLib.xtermLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: xtermLib.xtermLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: xtermLib.xtermLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: xtermLib.xtermLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: xtermLib.xtermLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: xtermLib.xtermLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: xtermLib.xtermLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: xtermLib.xtermLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: xtermLib.xtermLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: xtermLib.xtermLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: xtermLib.xtermLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: xtermLib.xtermLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: xtermLib.xtermLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: xtermLib.xtermLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: xtermLib.xtermLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: xtermLib.xtermLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: xtermLib.xtermLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: xtermLib.xtermLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: xtermLib.xtermLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: xtermLib.xtermLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: xtermLib.xtermLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: xtermLib.xtermLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: xtermLib.xtermLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: xtermLib.xtermLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: xtermLib.xtermLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: xtermLib.xtermLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: xtermLib.xtermLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: xtermLib.xtermLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: xtermLib.xtermLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: xtermLib.xtermLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: xtermLib.xtermLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: xtermLib.xtermLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: xtermLib.xtermLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: xtermLib.xtermLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: xtermLib.xtermLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: xtermLib.xtermLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: xtermLib.xtermLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: xtermLib.xtermLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: xtermLib.xtermLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: xtermLib.xtermLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: xtermLib.xtermLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: xtermLib.xtermLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: xtermLib.xtermLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: xtermLib.xtermLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: xtermLib.xtermLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: xtermLib.xtermLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: xtermLib.xtermLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: xtermLib.xtermLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: xtermLib.xtermLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: xtermLib.xtermLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: xtermLib.xtermLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: xtermLib.xtermLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: xtermLib.xtermLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: xtermLib.xtermLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: xtermLib.xtermLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: xtermLib.xtermLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: xtermLib.xtermLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: xtermLib.xtermLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: xtermLib.xtermLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: xtermLib.xtermLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: xtermLib.xtermLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: xtermLib.xtermLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: xtermLib.xtermLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: xtermLib.xtermLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: xtermLib.xtermLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: xtermLib.xtermLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: xtermLib.xtermLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: xtermLib.xtermLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: xtermLib.xtermLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: xtermLib.xtermLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: xtermLib.xtermLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: xtermLib.xtermLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: xtermLib.xtermLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: xtermLib.xtermLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: xtermLib.xtermLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: xtermLib.xtermLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: xtermLib.xtermLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: xtermLib.xtermLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: xtermLib.xtermLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: xtermLib.xtermLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: xtermLib.xtermLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: xtermLib.xtermLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: xtermLib.xtermLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: xtermLib.xtermLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: xtermLib.xtermLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: xtermLib.xtermLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: xtermLib.xtermLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: xtermLib.xtermLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: xtermLib.xtermLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: xtermLib.xtermLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: xtermLib.xtermLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: xtermLib.xtermLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: xtermLib.xtermLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: xtermLib.xtermLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: xtermLib.xtermLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: xtermLib.xtermLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: xtermLib.xtermLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: xtermLib.xtermLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: xtermLib.xtermLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: xtermLib.xtermLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: xtermLib.xtermLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: xtermLib.xtermLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: xtermLib.xtermLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: xtermLib.xtermLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: xtermLib.xtermLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: xtermLib.xtermLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: xtermLib.xtermLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: xtermLib.xtermLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: xtermLib.xtermLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: xtermLib.xtermLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: xtermLib.xtermLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: xtermLib.xtermLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: xtermLib.xtermLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: xtermLib.xtermLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: xtermLib.xtermLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: xtermLib.xtermLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: xtermLib.xtermLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: xtermLib.xtermLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: xtermLib.xtermLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: xtermLib.xtermLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: xtermLib.xtermLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: xtermLib.xtermLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: xtermLib.xtermLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: xtermLib.xtermLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: xtermLib.xtermLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: xtermLib.xtermLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: xtermLib.xtermLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: xtermLib.xtermLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: xtermLib.xtermLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: xtermLib.xtermLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: xtermLib.xtermLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: xtermLib.xtermLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: xtermLib.xtermLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: xtermLib.xtermLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: xtermLib.xtermLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: xtermLib.xtermLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: xtermLib.xtermLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: xtermLib.xtermLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: xtermLib.xtermLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: xtermLib.xtermLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: xtermLib.xtermLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: xtermLib.xtermLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: xtermLib.xtermLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: xtermLib.xtermLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: xtermLib.xtermLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: xtermLib.xtermLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: xtermLib.xtermLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: xtermLib.xtermLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: xtermLib.xtermLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: xtermLib.xtermLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: xtermLib.xtermLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: xtermLib.xtermLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: xtermLib.xtermLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: xtermLib.xtermLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: xtermLib.xtermLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: xtermLib.xtermLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: xtermLib.xtermLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: xtermLib.xtermLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: xtermLib.xtermLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: xtermLib.xtermLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: xtermLib.xtermLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: xtermLib.xtermLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: xtermLib.xtermLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: xtermLib.xtermLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: xtermLib.xtermLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: xtermLib.xtermLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: xtermLib.xtermLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: xtermLib.xtermLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: xtermLib.xtermLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def alert(): scala.Unit = js.native
  def alert(message: js.Any): scala.Unit = js.native
  def atob(encodedString: java.lang.String): java.lang.String = js.native
  def blur(): scala.Unit = js.native
  def btoa(rawString: java.lang.String): java.lang.String = js.native
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  /** @deprecated */
  def captureEvents(): scala.Unit = js.native
  def clearInterval(): scala.Unit = js.native
  def clearInterval(handle: scala.Double): scala.Unit = js.native
  def clearTimeout(): scala.Unit = js.native
  def clearTimeout(handle: scala.Double): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): js.Promise[ImageBitmap] = js.native
  def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): scala.Unit = js.native
  /**
    * Dispatches a synthetic event event to target and returns true
    * if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
    */
  def dispatchEvent(event: Event): scala.Boolean = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def focus(): scala.Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
  def getMatchedCSSRules(elt: Element, pseudoElt: java.lang.String): CSSRuleList = js.native
  def getSelection(): Selection = js.native
  def matchMedia(query: java.lang.String): MediaQueryList = js.native
  def moveBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def msWriteProfilerMark(profilerMarkName: java.lang.String): scala.Unit = js.native
  def open(): Window | scala.Null = js.native
  def open(url: java.lang.String): Window | scala.Null = js.native
  def open(url: java.lang.String, target: java.lang.String): Window | scala.Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): Window | scala.Null = js.native
  def open(
    url: java.lang.String,
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): Window | scala.Null = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String): scala.Unit = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): scala.Unit = js.native
  def print(): scala.Unit = js.native
  def prompt(): java.lang.String | scala.Null = js.native
  def prompt(message: java.lang.String): java.lang.String | scala.Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | scala.Null = js.native
  def queueMicrotask(callback: js.Function): scala.Unit = js.native
  /** @deprecated */
  def releaseEvents(): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: xtermLib.xtermLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: xtermLib.xtermLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: xtermLib.xtermLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: xtermLib.xtermLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: xtermLib.xtermLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: xtermLib.xtermLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: xtermLib.xtermLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: xtermLib.xtermLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: xtermLib.xtermLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: xtermLib.xtermLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: xtermLib.xtermLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: xtermLib.xtermLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: xtermLib.xtermLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: xtermLib.xtermLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: xtermLib.xtermLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: xtermLib.xtermLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: xtermLib.xtermLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: xtermLib.xtermLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: xtermLib.xtermLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: xtermLib.xtermLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: xtermLib.xtermLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: xtermLib.xtermLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: xtermLib.xtermLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: xtermLib.xtermLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: xtermLib.xtermLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: xtermLib.xtermLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: xtermLib.xtermLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: xtermLib.xtermLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: xtermLib.xtermLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: xtermLib.xtermLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: xtermLib.xtermLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: xtermLib.xtermLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: xtermLib.xtermLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: xtermLib.xtermLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: xtermLib.xtermLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: xtermLib.xtermLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: xtermLib.xtermLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: xtermLib.xtermLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: xtermLib.xtermLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: xtermLib.xtermLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: xtermLib.xtermLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: xtermLib.xtermLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: xtermLib.xtermLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: xtermLib.xtermLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: xtermLib.xtermLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: xtermLib.xtermLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: xtermLib.xtermLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: xtermLib.xtermLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: xtermLib.xtermLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: xtermLib.xtermLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: xtermLib.xtermLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: xtermLib.xtermLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: xtermLib.xtermLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: xtermLib.xtermLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: xtermLib.xtermLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: xtermLib.xtermLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: xtermLib.xtermLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: xtermLib.xtermLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: xtermLib.xtermLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: xtermLib.xtermLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: xtermLib.xtermLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: xtermLib.xtermLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: xtermLib.xtermLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: xtermLib.xtermLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: xtermLib.xtermLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: xtermLib.xtermLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: xtermLib.xtermLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: xtermLib.xtermLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: xtermLib.xtermLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: xtermLib.xtermLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: xtermLib.xtermLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: xtermLib.xtermLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: xtermLib.xtermLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: xtermLib.xtermLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: xtermLib.xtermLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: xtermLib.xtermLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: xtermLib.xtermLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: xtermLib.xtermLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: xtermLib.xtermLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: xtermLib.xtermLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: xtermLib.xtermLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: xtermLib.xtermLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: xtermLib.xtermLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: xtermLib.xtermLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: xtermLib.xtermLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: xtermLib.xtermLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: xtermLib.xtermLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: xtermLib.xtermLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: xtermLib.xtermLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: xtermLib.xtermLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: xtermLib.xtermLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: xtermLib.xtermLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: xtermLib.xtermLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: xtermLib.xtermLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: xtermLib.xtermLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: xtermLib.xtermLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: xtermLib.xtermLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: xtermLib.xtermLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: xtermLib.xtermLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: xtermLib.xtermLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: xtermLib.xtermLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: xtermLib.xtermLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: xtermLib.xtermLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: xtermLib.xtermLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: xtermLib.xtermLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: xtermLib.xtermLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: xtermLib.xtermLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: xtermLib.xtermLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: xtermLib.xtermLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: xtermLib.xtermLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: xtermLib.xtermLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: xtermLib.xtermLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: xtermLib.xtermLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: xtermLib.xtermLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: xtermLib.xtermLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: xtermLib.xtermLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: xtermLib.xtermLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: xtermLib.xtermLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: xtermLib.xtermLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: xtermLib.xtermLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: xtermLib.xtermLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: xtermLib.xtermLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: xtermLib.xtermLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: xtermLib.xtermLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: xtermLib.xtermLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: xtermLib.xtermLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: xtermLib.xtermLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: xtermLib.xtermLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: xtermLib.xtermLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: xtermLib.xtermLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: xtermLib.xtermLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: xtermLib.xtermLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: xtermLib.xtermLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: xtermLib.xtermLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: xtermLib.xtermLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: xtermLib.xtermLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: xtermLib.xtermLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: xtermLib.xtermLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: xtermLib.xtermLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: xtermLib.xtermLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: xtermLib.xtermLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: xtermLib.xtermLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: xtermLib.xtermLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: xtermLib.xtermLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: xtermLib.xtermLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: xtermLib.xtermLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: xtermLib.xtermLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: xtermLib.xtermLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: xtermLib.xtermLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: xtermLib.xtermLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: xtermLib.xtermLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: xtermLib.xtermLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: xtermLib.xtermLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: xtermLib.xtermLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: xtermLib.xtermLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: xtermLib.xtermLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: xtermLib.xtermLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: xtermLib.xtermLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: xtermLib.xtermLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: xtermLib.xtermLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: xtermLib.xtermLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: xtermLib.xtermLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: xtermLib.xtermLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: xtermLib.xtermLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: xtermLib.xtermLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: xtermLib.xtermLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: xtermLib.xtermLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: xtermLib.xtermLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: xtermLib.xtermLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: xtermLib.xtermLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: xtermLib.xtermLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: xtermLib.xtermLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: xtermLib.xtermLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: xtermLib.xtermLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: xtermLib.xtermLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: xtermLib.xtermLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: xtermLib.xtermLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: xtermLib.xtermLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: xtermLib.xtermLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: xtermLib.xtermLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: xtermLib.xtermLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: xtermLib.xtermLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: xtermLib.xtermLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: xtermLib.xtermLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: xtermLib.xtermLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: xtermLib.xtermLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: xtermLib.xtermLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: xtermLib.xtermLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: xtermLib.xtermLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: xtermLib.xtermLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: xtermLib.xtermLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: xtermLib.xtermLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: xtermLib.xtermLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: xtermLib.xtermLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: xtermLib.xtermLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: xtermLib.xtermLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: xtermLib.xtermLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: xtermLib.xtermLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: xtermLib.xtermLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: xtermLib.xtermLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: xtermLib.xtermLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: xtermLib.xtermLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: xtermLib.xtermLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: xtermLib.xtermLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: xtermLib.xtermLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: xtermLib.xtermLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: xtermLib.xtermLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: xtermLib.xtermLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: xtermLib.xtermLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: xtermLib.xtermLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: xtermLib.xtermLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: xtermLib.xtermLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: xtermLib.xtermLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: xtermLib.xtermLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: xtermLib.xtermLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: xtermLib.xtermLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: xtermLib.xtermLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: xtermLib.xtermLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: xtermLib.xtermLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: xtermLib.xtermLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: xtermLib.xtermLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: xtermLib.xtermLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: xtermLib.xtermLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: xtermLib.xtermLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: xtermLib.xtermLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: xtermLib.xtermLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: xtermLib.xtermLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: xtermLib.xtermLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: xtermLib.xtermLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: xtermLib.xtermLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: xtermLib.xtermLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: xtermLib.xtermLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: xtermLib.xtermLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: xtermLib.xtermLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: xtermLib.xtermLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: xtermLib.xtermLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: xtermLib.xtermLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: xtermLib.xtermLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: xtermLib.xtermLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: xtermLib.xtermLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: xtermLib.xtermLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: xtermLib.xtermLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: xtermLib.xtermLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: xtermLib.xtermLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: xtermLib.xtermLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: xtermLib.xtermLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: xtermLib.xtermLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: xtermLib.xtermLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: xtermLib.xtermLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: xtermLib.xtermLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: xtermLib.xtermLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: xtermLib.xtermLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: xtermLib.xtermLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: xtermLib.xtermLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: xtermLib.xtermLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: xtermLib.xtermLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: xtermLib.xtermLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: xtermLib.xtermLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: xtermLib.xtermLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: xtermLib.xtermLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: xtermLib.xtermLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: xtermLib.xtermLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: xtermLib.xtermLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: xtermLib.xtermLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: xtermLib.xtermLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: xtermLib.xtermLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: xtermLib.xtermLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: xtermLib.xtermLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: xtermLib.xtermLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: xtermLib.xtermLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: xtermLib.xtermLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: xtermLib.xtermLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: xtermLib.xtermLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: xtermLib.xtermLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: xtermLib.xtermLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: xtermLib.xtermLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: xtermLib.xtermLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: xtermLib.xtermLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: xtermLib.xtermLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: xtermLib.xtermLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: xtermLib.xtermLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: xtermLib.xtermLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: xtermLib.xtermLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: xtermLib.xtermLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: xtermLib.xtermLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: xtermLib.xtermLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: xtermLib.xtermLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: xtermLib.xtermLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: xtermLib.xtermLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: xtermLib.xtermLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: xtermLib.xtermLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: xtermLib.xtermLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: xtermLib.xtermLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: xtermLib.xtermLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: xtermLib.xtermLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: xtermLib.xtermLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: xtermLib.xtermLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: xtermLib.xtermLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: xtermLib.xtermLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: xtermLib.xtermLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: xtermLib.xtermLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: xtermLib.xtermLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: xtermLib.xtermLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: xtermLib.xtermLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: xtermLib.xtermLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: xtermLib.xtermLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: xtermLib.xtermLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: xtermLib.xtermLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: xtermLib.xtermLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: xtermLib.xtermLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: xtermLib.xtermLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: xtermLib.xtermLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: xtermLib.xtermLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: xtermLib.xtermLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: xtermLib.xtermLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: xtermLib.xtermLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: xtermLib.xtermLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: xtermLib.xtermLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: xtermLib.xtermLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: xtermLib.xtermLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: xtermLib.xtermLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: xtermLib.xtermLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: xtermLib.xtermLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: xtermLib.xtermLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: xtermLib.xtermLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: xtermLib.xtermLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: xtermLib.xtermLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: xtermLib.xtermLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: xtermLib.xtermLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: xtermLib.xtermLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: xtermLib.xtermLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: xtermLib.xtermLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: xtermLib.xtermLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: xtermLib.xtermLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: xtermLib.xtermLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: xtermLib.xtermLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: xtermLib.xtermLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: xtermLib.xtermLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: xtermLib.xtermLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: xtermLib.xtermLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: xtermLib.xtermLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: xtermLib.xtermLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: xtermLib.xtermLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: xtermLib.xtermLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: xtermLib.xtermLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: xtermLib.xtermLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: xtermLib.xtermLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: xtermLib.xtermLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: xtermLib.xtermLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: xtermLib.xtermLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: xtermLib.xtermLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: xtermLib.xtermLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: xtermLib.xtermLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: xtermLib.xtermLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: xtermLib.xtermLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: xtermLib.xtermLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: xtermLib.xtermLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: xtermLib.xtermLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: xtermLib.xtermLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: xtermLib.xtermLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: xtermLib.xtermLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: xtermLib.xtermLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: xtermLib.xtermLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: xtermLib.xtermLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: xtermLib.xtermLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: xtermLib.xtermLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: xtermLib.xtermLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: xtermLib.xtermLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: xtermLib.xtermLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: xtermLib.xtermLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: xtermLib.xtermLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
  def resizeBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def resizeTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scroll(): scala.Unit = js.native
  def scroll(options: ScrollToOptions): scala.Unit = js.native
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(): scala.Unit = js.native
  def scrollBy(options: ScrollToOptions): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(): scala.Unit = js.native
  def scrollTo(options: ScrollToOptions): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setInterval(handler: TimerHandler): scala.Double = js.native
  def setInterval(handler: TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
  def setTimeout(handler: TimerHandler): scala.Double = js.native
  def setTimeout(handler: TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
  def stop(): scala.Unit = js.native
  def webkitCancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
}

