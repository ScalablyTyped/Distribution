package typings.useItEventListener

import typings.std.AnimationEvent
import typings.std.BeforeUnloadEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DeviceMotionEvent
import typings.std.DeviceOrientationEvent
import typings.std.Document
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.GamepadEvent
import typings.std.HTMLElement
import typings.std.HashChangeEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MessageEvent
import typings.std.MouseEvent
import typings.std.PageTransitionEvent
import typings.std.PointerEvent
import typings.std.PopStateEvent
import typings.std.ProgressEvent
import typings.std.PromiseRejectionEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.StorageEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.DOMContentLoaded
import typings.useItEventListener.useItEventListenerStrings.abort
import typings.useItEventListener.useItEventListenerStrings.afterprint
import typings.useItEventListener.useItEventListenerStrings.animationcancel
import typings.useItEventListener.useItEventListenerStrings.animationend
import typings.useItEventListener.useItEventListenerStrings.animationiteration
import typings.useItEventListener.useItEventListenerStrings.animationstart
import typings.useItEventListener.useItEventListenerStrings.auxclick
import typings.useItEventListener.useItEventListenerStrings.beforeinput
import typings.useItEventListener.useItEventListenerStrings.beforeprint
import typings.useItEventListener.useItEventListenerStrings.beforeunload
import typings.useItEventListener.useItEventListenerStrings.blur
import typings.useItEventListener.useItEventListenerStrings.cancel
import typings.useItEventListener.useItEventListenerStrings.canplay
import typings.useItEventListener.useItEventListenerStrings.canplaythrough
import typings.useItEventListener.useItEventListenerStrings.change
import typings.useItEventListener.useItEventListenerStrings.click
import typings.useItEventListener.useItEventListenerStrings.close
import typings.useItEventListener.useItEventListenerStrings.compositionend
import typings.useItEventListener.useItEventListenerStrings.compositionstart
import typings.useItEventListener.useItEventListenerStrings.compositionupdate
import typings.useItEventListener.useItEventListenerStrings.contextmenu
import typings.useItEventListener.useItEventListenerStrings.copy
import typings.useItEventListener.useItEventListenerStrings.cuechange
import typings.useItEventListener.useItEventListenerStrings.cut
import typings.useItEventListener.useItEventListenerStrings.dblclick
import typings.useItEventListener.useItEventListenerStrings.devicemotion
import typings.useItEventListener.useItEventListenerStrings.deviceorientation
import typings.useItEventListener.useItEventListenerStrings.drag
import typings.useItEventListener.useItEventListenerStrings.dragend
import typings.useItEventListener.useItEventListenerStrings.dragenter
import typings.useItEventListener.useItEventListenerStrings.dragleave
import typings.useItEventListener.useItEventListenerStrings.dragover
import typings.useItEventListener.useItEventListenerStrings.dragstart
import typings.useItEventListener.useItEventListenerStrings.drop
import typings.useItEventListener.useItEventListenerStrings.durationchange
import typings.useItEventListener.useItEventListenerStrings.emptied
import typings.useItEventListener.useItEventListenerStrings.ended
import typings.useItEventListener.useItEventListenerStrings.error
import typings.useItEventListener.useItEventListenerStrings.focus
import typings.useItEventListener.useItEventListenerStrings.focusin
import typings.useItEventListener.useItEventListenerStrings.focusout
import typings.useItEventListener.useItEventListenerStrings.formdata
import typings.useItEventListener.useItEventListenerStrings.fullscreenchange
import typings.useItEventListener.useItEventListenerStrings.fullscreenerror
import typings.useItEventListener.useItEventListenerStrings.gamepadconnected
import typings.useItEventListener.useItEventListenerStrings.gamepaddisconnected
import typings.useItEventListener.useItEventListenerStrings.gotpointercapture
import typings.useItEventListener.useItEventListenerStrings.hashchange
import typings.useItEventListener.useItEventListenerStrings.input
import typings.useItEventListener.useItEventListenerStrings.invalid
import typings.useItEventListener.useItEventListenerStrings.keydown
import typings.useItEventListener.useItEventListenerStrings.keypress
import typings.useItEventListener.useItEventListenerStrings.keyup
import typings.useItEventListener.useItEventListenerStrings.languagechange
import typings.useItEventListener.useItEventListenerStrings.load
import typings.useItEventListener.useItEventListenerStrings.loadeddata
import typings.useItEventListener.useItEventListenerStrings.loadedmetadata
import typings.useItEventListener.useItEventListenerStrings.loadstart
import typings.useItEventListener.useItEventListenerStrings.lostpointercapture
import typings.useItEventListener.useItEventListenerStrings.message
import typings.useItEventListener.useItEventListenerStrings.messageerror
import typings.useItEventListener.useItEventListenerStrings.mousedown
import typings.useItEventListener.useItEventListenerStrings.mouseenter
import typings.useItEventListener.useItEventListenerStrings.mouseleave
import typings.useItEventListener.useItEventListenerStrings.mousemove
import typings.useItEventListener.useItEventListenerStrings.mouseout
import typings.useItEventListener.useItEventListenerStrings.mouseover
import typings.useItEventListener.useItEventListenerStrings.mouseup
import typings.useItEventListener.useItEventListenerStrings.offline
import typings.useItEventListener.useItEventListenerStrings.online
import typings.useItEventListener.useItEventListenerStrings.orientationchange
import typings.useItEventListener.useItEventListenerStrings.pagehide
import typings.useItEventListener.useItEventListenerStrings.pageshow
import typings.useItEventListener.useItEventListenerStrings.paste
import typings.useItEventListener.useItEventListenerStrings.pause
import typings.useItEventListener.useItEventListenerStrings.play
import typings.useItEventListener.useItEventListenerStrings.playing
import typings.useItEventListener.useItEventListenerStrings.pointercancel
import typings.useItEventListener.useItEventListenerStrings.pointerdown
import typings.useItEventListener.useItEventListenerStrings.pointerenter
import typings.useItEventListener.useItEventListenerStrings.pointerleave
import typings.useItEventListener.useItEventListenerStrings.pointerlockchange
import typings.useItEventListener.useItEventListenerStrings.pointerlockerror
import typings.useItEventListener.useItEventListenerStrings.pointermove
import typings.useItEventListener.useItEventListenerStrings.pointerout
import typings.useItEventListener.useItEventListenerStrings.pointerover
import typings.useItEventListener.useItEventListenerStrings.pointerup
import typings.useItEventListener.useItEventListenerStrings.popstate
import typings.useItEventListener.useItEventListenerStrings.progress
import typings.useItEventListener.useItEventListenerStrings.ratechange
import typings.useItEventListener.useItEventListenerStrings.readystatechange
import typings.useItEventListener.useItEventListenerStrings.rejectionhandled
import typings.useItEventListener.useItEventListenerStrings.reset
import typings.useItEventListener.useItEventListenerStrings.resize
import typings.useItEventListener.useItEventListenerStrings.scroll
import typings.useItEventListener.useItEventListenerStrings.securitypolicyviolation
import typings.useItEventListener.useItEventListenerStrings.seeked
import typings.useItEventListener.useItEventListenerStrings.seeking
import typings.useItEventListener.useItEventListenerStrings.select
import typings.useItEventListener.useItEventListenerStrings.selectionchange
import typings.useItEventListener.useItEventListenerStrings.selectstart
import typings.useItEventListener.useItEventListenerStrings.slotchange
import typings.useItEventListener.useItEventListenerStrings.stalled
import typings.useItEventListener.useItEventListenerStrings.storage
import typings.useItEventListener.useItEventListenerStrings.submit
import typings.useItEventListener.useItEventListenerStrings.suspend
import typings.useItEventListener.useItEventListenerStrings.timeupdate
import typings.useItEventListener.useItEventListenerStrings.toggle
import typings.useItEventListener.useItEventListenerStrings.touchcancel
import typings.useItEventListener.useItEventListenerStrings.touchend
import typings.useItEventListener.useItEventListenerStrings.touchmove
import typings.useItEventListener.useItEventListenerStrings.touchstart
import typings.useItEventListener.useItEventListenerStrings.transitioncancel
import typings.useItEventListener.useItEventListenerStrings.transitionend
import typings.useItEventListener.useItEventListenerStrings.transitionrun
import typings.useItEventListener.useItEventListenerStrings.transitionstart
import typings.useItEventListener.useItEventListenerStrings.unhandledrejection
import typings.useItEventListener.useItEventListenerStrings.unload
import typings.useItEventListener.useItEventListenerStrings.visibilitychange
import typings.useItEventListener.useItEventListenerStrings.volumechange
import typings.useItEventListener.useItEventListenerStrings.waiting
import typings.useItEventListener.useItEventListenerStrings.webkitanimationend
import typings.useItEventListener.useItEventListenerStrings.webkitanimationiteration
import typings.useItEventListener.useItEventListenerStrings.webkitanimationstart
import typings.useItEventListener.useItEventListenerStrings.webkittransitionend
import typings.useItEventListener.useItEventListenerStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@use-it/event-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(eventName: String, handler: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(eventName: String, handler: EventListenerOrEventListenerObject, element: Null, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(eventName: String, handler: EventListenerOrEventListenerObject, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(eventName: String, handler: EventListenerOrEventListenerObject, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    eventName: String,
    handler: EventListenerOrEventListenerObject,
    element: Document,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(eventName: String, handler: EventListenerOrEventListenerObject, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    eventName: String,
    handler: EventListenerOrEventListenerObject,
    element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(eventName: String, handler: EventListenerOrEventListenerObject, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(eventName: String, handler: EventListenerOrEventListenerObject, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Unit,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Document,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Window
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 127, starting with typings.useItEventListener.useItEventListenerStrings.fullscreenchange, typings.useItEventListener.useItEventListenerStrings.fullscreenerror, typings.useItEventListener.useItEventListenerStrings.copy */ Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Window,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_DOMContentLoaded(eventName: DOMContentLoaded, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded(eventName: DOMContentLoaded, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded(eventName: DOMContentLoaded, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded(eventName: DOMContentLoaded, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded(eventName: DOMContentLoaded, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded(eventName: DOMContentLoaded, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_abort(eventName: abort, handler: UIEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(eventName: abort, handler: UIEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(eventName: abort, handler: UIEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(eventName: abort, handler: UIEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(eventName: abort, handler: UIEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(eventName: abort, handler: UIEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_afterprint(eventName: afterprint, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_afterprint(eventName: afterprint, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_afterprint(eventName: afterprint, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_afterprint(eventName: afterprint, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationcancel(eventName: animationcancel, handler: AnimationEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(
    eventName: animationcancel,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(
    eventName: animationcancel,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(
    eventName: animationcancel,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationend(eventName: animationend, handler: AnimationEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(eventName: animationend, handler: AnimationEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(eventName: animationend, handler: AnimationEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(eventName: animationend, handler: AnimationEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(eventName: animationend, handler: AnimationEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(eventName: animationend, handler: AnimationEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationiteration(eventName: animationiteration, handler: AnimationEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationstart(eventName: animationstart, handler: AnimationEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(eventName: animationstart, handler: AnimationEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(eventName: animationstart, handler: AnimationEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(eventName: animationstart, handler: AnimationEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(eventName: animationstart, handler: AnimationEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(eventName: animationstart, handler: AnimationEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_auxclick(eventName: auxclick, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(
    eventName: auxclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(eventName: auxclick, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(eventName: auxclick, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(eventName: auxclick, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(
    eventName: auxclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(
    eventName: auxclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(eventName: auxclick, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(eventName: auxclick, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeinput(eventName: beforeinput, handler: InputEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(
    eventName: beforeinput,
    handler: InputEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(eventName: beforeinput, handler: InputEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(eventName: beforeinput, handler: InputEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(eventName: beforeinput, handler: InputEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(
    eventName: beforeinput,
    handler: InputEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(
    eventName: beforeinput,
    handler: InputEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(eventName: beforeinput, handler: InputEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(eventName: beforeinput, handler: InputEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeprint(eventName: beforeprint, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeprint(eventName: beforeprint, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeprint(eventName: beforeprint, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeprint(eventName: beforeprint, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeunload(eventName: beforeunload, handler: BeforeUnloadEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeunload(eventName: beforeunload, handler: BeforeUnloadEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeunload(eventName: beforeunload, handler: BeforeUnloadEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeunload(eventName: beforeunload, handler: BeforeUnloadEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_blur(eventName: blur, handler: FocusEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(
    eventName: blur,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(eventName: blur, handler: FocusEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(eventName: blur, handler: FocusEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(eventName: blur, handler: FocusEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(
    eventName: blur,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(
    eventName: blur,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(eventName: blur, handler: FocusEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(eventName: blur, handler: FocusEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cancel(eventName: cancel, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cancel(
    eventName: cancel,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cancel(eventName: cancel, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cancel(eventName: cancel, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cancel(eventName: cancel, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cancel(
    eventName: cancel,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cancel(
    eventName: cancel,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cancel(eventName: cancel, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cancel(eventName: cancel, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplay(eventName: canplay, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(
    eventName: canplay,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(eventName: canplay, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(eventName: canplay, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(eventName: canplay, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(
    eventName: canplay,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(
    eventName: canplay,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(eventName: canplay, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(eventName: canplay, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplaythrough(eventName: canplaythrough, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(
    eventName: canplaythrough,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(eventName: canplaythrough, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(eventName: canplaythrough, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(eventName: canplaythrough, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(
    eventName: canplaythrough,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(
    eventName: canplaythrough,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(eventName: canplaythrough, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(eventName: canplaythrough, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_change(eventName: change, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(
    eventName: change,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(eventName: change, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(eventName: change, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(eventName: change, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(
    eventName: change,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(
    eventName: change,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(eventName: change, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(eventName: change, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_click(eventName: click, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(
    eventName: click,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(eventName: click, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(eventName: click, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(eventName: click, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(
    eventName: click,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(
    eventName: click,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(eventName: click, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(eventName: click, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_close(eventName: close, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(
    eventName: close,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(eventName: close, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(eventName: close, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(eventName: close, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(
    eventName: close,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(
    eventName: close,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(eventName: close, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(eventName: close, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionend(eventName: compositionend, handler: CompositionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(
    eventName: compositionend,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(eventName: compositionend, handler: CompositionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(eventName: compositionend, handler: CompositionEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(eventName: compositionend, handler: CompositionEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(
    eventName: compositionend,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(
    eventName: compositionend,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(eventName: compositionend, handler: CompositionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(eventName: compositionend, handler: CompositionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionstart(eventName: compositionstart, handler: CompositionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(
    eventName: compositionstart,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(eventName: compositionstart, handler: CompositionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(eventName: compositionstart, handler: CompositionEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(eventName: compositionstart, handler: CompositionEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(
    eventName: compositionstart,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(
    eventName: compositionstart,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(eventName: compositionstart, handler: CompositionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(eventName: compositionstart, handler: CompositionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionupdate(eventName: compositionupdate, handler: CompositionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(
    eventName: compositionupdate,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(eventName: compositionupdate, handler: CompositionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(eventName: compositionupdate, handler: CompositionEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(eventName: compositionupdate, handler: CompositionEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(
    eventName: compositionupdate,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(
    eventName: compositionupdate,
    handler: CompositionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(eventName: compositionupdate, handler: CompositionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(eventName: compositionupdate, handler: CompositionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_contextmenu(eventName: contextmenu, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(
    eventName: contextmenu,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(
    eventName: contextmenu,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(
    eventName: contextmenu,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_copy(eventName: copy, handler: ClipboardEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(
    eventName: copy,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(eventName: copy, handler: ClipboardEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(eventName: copy, handler: ClipboardEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(
    eventName: copy,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(
    eventName: copy,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cuechange(eventName: cuechange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(eventName: cuechange, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(eventName: cuechange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(eventName: cuechange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(eventName: cuechange, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(eventName: cuechange, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cut(eventName: cut, handler: ClipboardEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(eventName: cut, handler: ClipboardEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(eventName: cut, handler: ClipboardEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dblclick(eventName: dblclick, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(
    eventName: dblclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(eventName: dblclick, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(eventName: dblclick, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(eventName: dblclick, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(
    eventName: dblclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(
    eventName: dblclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(eventName: dblclick, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(eventName: dblclick, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_devicemotion(eventName: devicemotion, handler: DeviceMotionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_devicemotion(eventName: devicemotion, handler: DeviceMotionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_devicemotion(eventName: devicemotion, handler: DeviceMotionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_devicemotion(eventName: devicemotion, handler: DeviceMotionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_deviceorientation(eventName: deviceorientation, handler: DeviceOrientationEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_deviceorientation(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_deviceorientation(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_deviceorientation(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drag(eventName: drag, handler: DragEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(
    eventName: drag,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(eventName: drag, handler: DragEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(eventName: drag, handler: DragEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(eventName: drag, handler: DragEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(
    eventName: drag,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(
    eventName: drag,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(eventName: drag, handler: DragEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(eventName: drag, handler: DragEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragend(eventName: dragend, handler: DragEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(
    eventName: dragend,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(eventName: dragend, handler: DragEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(eventName: dragend, handler: DragEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(eventName: dragend, handler: DragEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(
    eventName: dragend,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(
    eventName: dragend,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(eventName: dragend, handler: DragEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(eventName: dragend, handler: DragEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragenter(eventName: dragenter, handler: DragEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(
    eventName: dragenter,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(eventName: dragenter, handler: DragEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(eventName: dragenter, handler: DragEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(eventName: dragenter, handler: DragEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(
    eventName: dragenter,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(
    eventName: dragenter,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(eventName: dragenter, handler: DragEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(eventName: dragenter, handler: DragEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragleave(eventName: dragleave, handler: DragEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(eventName: dragleave, handler: DragEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(eventName: dragleave, handler: DragEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(eventName: dragleave, handler: DragEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(eventName: dragleave, handler: DragEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(eventName: dragleave, handler: DragEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragover(eventName: dragover, handler: DragEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(
    eventName: dragover,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(eventName: dragover, handler: DragEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(eventName: dragover, handler: DragEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(eventName: dragover, handler: DragEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(
    eventName: dragover,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(
    eventName: dragover,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(eventName: dragover, handler: DragEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(eventName: dragover, handler: DragEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragstart(eventName: dragstart, handler: DragEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(
    eventName: dragstart,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(eventName: dragstart, handler: DragEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(eventName: dragstart, handler: DragEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(eventName: dragstart, handler: DragEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(
    eventName: dragstart,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(
    eventName: dragstart,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(eventName: dragstart, handler: DragEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(eventName: dragstart, handler: DragEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drop(eventName: drop, handler: DragEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(eventName: drop, handler: DragEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(eventName: drop, handler: DragEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(eventName: drop, handler: DragEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(eventName: drop, handler: DragEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(eventName: drop, handler: DragEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_durationchange(eventName: durationchange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(
    eventName: durationchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(eventName: durationchange, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(eventName: durationchange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(eventName: durationchange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(
    eventName: durationchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(
    eventName: durationchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(eventName: durationchange, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(eventName: durationchange, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_emptied(eventName: emptied, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(
    eventName: emptied,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(eventName: emptied, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(eventName: emptied, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(eventName: emptied, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(
    eventName: emptied,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(
    eventName: emptied,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(eventName: emptied, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(eventName: emptied, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ended(eventName: ended, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(
    eventName: ended,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(eventName: ended, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(eventName: ended, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(eventName: ended, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(
    eventName: ended,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(
    eventName: ended,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(eventName: ended, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(eventName: ended, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_error(eventName: error, handler: ErrorEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(eventName: error, handler: ErrorEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(eventName: error, handler: ErrorEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(eventName: error, handler: ErrorEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(eventName: error, handler: ErrorEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(eventName: error, handler: ErrorEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focus(eventName: focus, handler: FocusEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(eventName: focus, handler: FocusEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(eventName: focus, handler: FocusEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(eventName: focus, handler: FocusEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(eventName: focus, handler: FocusEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(eventName: focus, handler: FocusEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusin(eventName: focusin, handler: FocusEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(
    eventName: focusin,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(eventName: focusin, handler: FocusEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(eventName: focusin, handler: FocusEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(eventName: focusin, handler: FocusEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(
    eventName: focusin,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(
    eventName: focusin,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(eventName: focusin, handler: FocusEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(eventName: focusin, handler: FocusEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusout(eventName: focusout, handler: FocusEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(
    eventName: focusout,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(eventName: focusout, handler: FocusEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(eventName: focusout, handler: FocusEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(eventName: focusout, handler: FocusEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(
    eventName: focusout,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(
    eventName: focusout,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(eventName: focusout, handler: FocusEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(eventName: focusout, handler: FocusEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_formdata(eventName: formdata, handler: FormDataEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(
    eventName: formdata,
    handler: FormDataEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(eventName: formdata, handler: FormDataEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(eventName: formdata, handler: FormDataEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(eventName: formdata, handler: FormDataEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(
    eventName: formdata,
    handler: FormDataEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(
    eventName: formdata,
    handler: FormDataEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(eventName: formdata, handler: FormDataEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(eventName: formdata, handler: FormDataEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A custom React Hook that provides a declarative useEventListener.
    */
  inline def default_fullscreenchange(eventName: fullscreenchange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(eventName: fullscreenchange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(eventName: fullscreenchange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_fullscreenerror(eventName: fullscreenerror, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(eventName: fullscreenerror, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(eventName: fullscreenerror, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gamepadconnected(eventName: gamepadconnected, handler: GamepadEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gamepadconnected(eventName: gamepadconnected, handler: GamepadEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gamepadconnected(eventName: gamepadconnected, handler: GamepadEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gamepadconnected(eventName: gamepadconnected, handler: GamepadEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gamepaddisconnected(eventName: gamepaddisconnected, handler: GamepadEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gamepaddisconnected(eventName: gamepaddisconnected, handler: GamepadEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gamepaddisconnected(eventName: gamepaddisconnected, handler: GamepadEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gamepaddisconnected(eventName: gamepaddisconnected, handler: GamepadEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(
    eventName: gotpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(
    eventName: gotpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(
    eventName: gotpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_hashchange(eventName: hashchange, handler: HashChangeEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_hashchange(eventName: hashchange, handler: HashChangeEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_hashchange(eventName: hashchange, handler: HashChangeEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_hashchange(eventName: hashchange, handler: HashChangeEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_input(eventName: input, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(eventName: input, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(eventName: input, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(eventName: input, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(eventName: input, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(eventName: input, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_invalid(eventName: invalid, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(
    eventName: invalid,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(eventName: invalid, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(eventName: invalid, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(eventName: invalid, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(
    eventName: invalid,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(
    eventName: invalid,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(eventName: invalid, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(eventName: invalid, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keydown(eventName: keydown, handler: KeyboardEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(
    eventName: keydown,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(eventName: keydown, handler: KeyboardEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(eventName: keydown, handler: KeyboardEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(eventName: keydown, handler: KeyboardEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(
    eventName: keydown,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(
    eventName: keydown,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(eventName: keydown, handler: KeyboardEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(eventName: keydown, handler: KeyboardEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keypress(eventName: keypress, handler: KeyboardEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(
    eventName: keypress,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(eventName: keypress, handler: KeyboardEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(eventName: keypress, handler: KeyboardEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(eventName: keypress, handler: KeyboardEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(
    eventName: keypress,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(
    eventName: keypress,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(eventName: keypress, handler: KeyboardEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(eventName: keypress, handler: KeyboardEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keyup(eventName: keyup, handler: KeyboardEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(eventName: keyup, handler: KeyboardEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(eventName: keyup, handler: KeyboardEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(eventName: keyup, handler: KeyboardEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(eventName: keyup, handler: KeyboardEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(eventName: keyup, handler: KeyboardEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_languagechange(eventName: languagechange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_languagechange(eventName: languagechange, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_languagechange(eventName: languagechange, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_languagechange(eventName: languagechange, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_load(eventName: load, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(
    eventName: load,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(eventName: load, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(eventName: load, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(eventName: load, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(
    eventName: load,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(
    eventName: load,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(eventName: load, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(eventName: load, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadeddata(eventName: loadeddata, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(
    eventName: loadeddata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(eventName: loadeddata, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(eventName: loadeddata, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(eventName: loadeddata, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(
    eventName: loadeddata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(
    eventName: loadeddata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(eventName: loadeddata, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(eventName: loadeddata, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadedmetadata(eventName: loadedmetadata, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(
    eventName: loadedmetadata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(
    eventName: loadedmetadata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(
    eventName: loadedmetadata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadstart(eventName: loadstart, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(
    eventName: loadstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(eventName: loadstart, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(eventName: loadstart, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(eventName: loadstart, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(
    eventName: loadstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(
    eventName: loadstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(eventName: loadstart, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(eventName: loadstart, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(
    eventName: lostpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(
    eventName: lostpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(
    eventName: lostpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_message(eventName: message, handler: MessageEvent[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_message(eventName: message, handler: MessageEvent[Any], element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_message(eventName: message, handler: MessageEvent[Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_message(eventName: message, handler: MessageEvent[Any], element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_messageerror(eventName: messageerror, handler: MessageEvent[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_messageerror(eventName: messageerror, handler: MessageEvent[Any], element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_messageerror(eventName: messageerror, handler: MessageEvent[Any], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_messageerror(eventName: messageerror, handler: MessageEvent[Any], element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousedown(eventName: mousedown, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(
    eventName: mousedown,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(eventName: mousedown, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(eventName: mousedown, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(eventName: mousedown, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(
    eventName: mousedown,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(
    eventName: mousedown,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(eventName: mousedown, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(eventName: mousedown, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseenter(eventName: mouseenter, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(
    eventName: mouseenter,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(
    eventName: mouseenter,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(
    eventName: mouseenter,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseleave(eventName: mouseleave, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(
    eventName: mouseleave,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(
    eventName: mouseleave,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(
    eventName: mouseleave,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousemove(eventName: mousemove, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(
    eventName: mousemove,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(eventName: mousemove, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(eventName: mousemove, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(eventName: mousemove, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(
    eventName: mousemove,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(
    eventName: mousemove,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(eventName: mousemove, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(eventName: mousemove, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseout(eventName: mouseout, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(eventName: mouseout, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(eventName: mouseout, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(eventName: mouseout, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(eventName: mouseout, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(eventName: mouseout, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseover(eventName: mouseover, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(
    eventName: mouseover,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(eventName: mouseover, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(eventName: mouseover, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(eventName: mouseover, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(
    eventName: mouseover,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(
    eventName: mouseover,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(eventName: mouseover, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(eventName: mouseover, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseup(eventName: mouseup, handler: MouseEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(
    eventName: mouseup,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(eventName: mouseup, handler: MouseEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(eventName: mouseup, handler: MouseEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(eventName: mouseup, handler: MouseEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(
    eventName: mouseup,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(
    eventName: mouseup,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(eventName: mouseup, handler: MouseEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(eventName: mouseup, handler: MouseEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_offline(eventName: offline, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_offline(eventName: offline, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_offline(eventName: offline, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_offline(eventName: offline, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_online(eventName: online, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_online(eventName: online, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_online(eventName: online, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_online(eventName: online, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_orientationchange(eventName: orientationchange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_orientationchange(eventName: orientationchange, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_orientationchange(eventName: orientationchange, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_orientationchange(eventName: orientationchange, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pagehide(eventName: pagehide, handler: PageTransitionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pagehide(eventName: pagehide, handler: PageTransitionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pagehide(eventName: pagehide, handler: PageTransitionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pagehide(eventName: pagehide, handler: PageTransitionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pageshow(eventName: pageshow, handler: PageTransitionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pageshow(eventName: pageshow, handler: PageTransitionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pageshow(eventName: pageshow, handler: PageTransitionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pageshow(eventName: pageshow, handler: PageTransitionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_paste(eventName: paste, handler: ClipboardEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(eventName: paste, handler: ClipboardEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(eventName: paste, handler: ClipboardEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pause(eventName: pause, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(eventName: pause, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(eventName: pause, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(eventName: pause, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(eventName: pause, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(eventName: pause, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_play(eventName: play, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(
    eventName: play,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(eventName: play, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(eventName: play, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(eventName: play, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(
    eventName: play,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(
    eventName: play,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(eventName: play, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(eventName: play, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_playing(eventName: playing, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(
    eventName: playing,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(eventName: playing, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(eventName: playing, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(eventName: playing, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(
    eventName: playing,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(
    eventName: playing,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(eventName: playing, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(eventName: playing, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointercancel(eventName: pointercancel, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerdown(eventName: pointerdown, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(
    eventName: pointerdown,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(
    eventName: pointerdown,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(
    eventName: pointerdown,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerenter(eventName: pointerenter, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(
    eventName: pointerenter,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(
    eventName: pointerenter,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(
    eventName: pointerenter,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerleave(eventName: pointerleave, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(
    eventName: pointerleave,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(
    eventName: pointerleave,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(
    eventName: pointerleave,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerlockchange(eventName: pointerlockchange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange(eventName: pointerlockchange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerlockerror(eventName: pointerlockerror, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror(eventName: pointerlockerror, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointermove(eventName: pointermove, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(
    eventName: pointermove,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(eventName: pointermove, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(eventName: pointermove, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(eventName: pointermove, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(
    eventName: pointermove,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(
    eventName: pointermove,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(eventName: pointermove, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(eventName: pointermove, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerout(eventName: pointerout, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(eventName: pointerout, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(eventName: pointerout, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(eventName: pointerout, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(eventName: pointerout, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(eventName: pointerout, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerover(eventName: pointerover, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(
    eventName: pointerover,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(eventName: pointerover, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(eventName: pointerover, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(eventName: pointerover, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(
    eventName: pointerover,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(
    eventName: pointerover,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(eventName: pointerover, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(eventName: pointerover, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerup(eventName: pointerup, handler: PointerEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(
    eventName: pointerup,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(eventName: pointerup, handler: PointerEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(eventName: pointerup, handler: PointerEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(eventName: pointerup, handler: PointerEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(
    eventName: pointerup,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(
    eventName: pointerup,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(eventName: pointerup, handler: PointerEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(eventName: pointerup, handler: PointerEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_popstate(eventName: popstate, handler: PopStateEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_popstate(eventName: popstate, handler: PopStateEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_popstate(eventName: popstate, handler: PopStateEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_popstate(eventName: popstate, handler: PopStateEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_progress(eventName: progress, handler: ProgressEvent[EventTarget]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(eventName: progress, handler: ProgressEvent[EventTarget], element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(eventName: progress, handler: ProgressEvent[EventTarget], element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(eventName: progress, handler: ProgressEvent[EventTarget], element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(eventName: progress, handler: ProgressEvent[EventTarget], element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(eventName: progress, handler: ProgressEvent[EventTarget], element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ratechange(eventName: ratechange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(
    eventName: ratechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(eventName: ratechange, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(eventName: ratechange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(eventName: ratechange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(
    eventName: ratechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(
    eventName: ratechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(eventName: ratechange, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(eventName: ratechange, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_readystatechange(eventName: readystatechange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange(eventName: readystatechange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_rejectionhandled(eventName: rejectionhandled, handler: PromiseRejectionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_rejectionhandled(eventName: rejectionhandled, handler: PromiseRejectionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_rejectionhandled(eventName: rejectionhandled, handler: PromiseRejectionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_rejectionhandled(eventName: rejectionhandled, handler: PromiseRejectionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_reset(eventName: reset, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(
    eventName: reset,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(eventName: reset, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(eventName: reset, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(eventName: reset, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(
    eventName: reset,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(
    eventName: reset,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(eventName: reset, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(eventName: reset, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_resize(eventName: resize, handler: UIEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(
    eventName: resize,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(eventName: resize, handler: UIEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(eventName: resize, handler: UIEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(eventName: resize, handler: UIEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(
    eventName: resize,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(
    eventName: resize,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(eventName: resize, handler: UIEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(eventName: resize, handler: UIEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_scroll(eventName: scroll, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(
    eventName: scroll,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(eventName: scroll, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(eventName: scroll, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(eventName: scroll, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(
    eventName: scroll,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(
    eventName: scroll,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(eventName: scroll, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(eventName: scroll, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_securitypolicyviolation(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: Unit,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: Document,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: Window,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeked(eventName: seeked, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(
    eventName: seeked,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(eventName: seeked, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(eventName: seeked, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(eventName: seeked, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(
    eventName: seeked,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(
    eventName: seeked,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(eventName: seeked, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(eventName: seeked, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeking(eventName: seeking, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(
    eventName: seeking,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(eventName: seeking, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(eventName: seeking, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(eventName: seeking, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(
    eventName: seeking,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(
    eventName: seeking,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(eventName: seeking, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(eventName: seeking, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_select(eventName: select, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(
    eventName: select,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(eventName: select, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(eventName: select, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(eventName: select, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(
    eventName: select,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(
    eventName: select,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(eventName: select, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(eventName: select, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectionchange(eventName: selectionchange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(
    eventName: selectionchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(eventName: selectionchange, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(eventName: selectionchange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(eventName: selectionchange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(
    eventName: selectionchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(
    eventName: selectionchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(eventName: selectionchange, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(eventName: selectionchange, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectstart(eventName: selectstart, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(
    eventName: selectstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(eventName: selectstart, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(eventName: selectstart, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(eventName: selectstart, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(
    eventName: selectstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(
    eventName: selectstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(eventName: selectstart, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(eventName: selectstart, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_slotchange(eventName: slotchange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(
    eventName: slotchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(eventName: slotchange, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(eventName: slotchange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(eventName: slotchange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(
    eventName: slotchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(
    eventName: slotchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(eventName: slotchange, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(eventName: slotchange, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_stalled(eventName: stalled, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(
    eventName: stalled,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(eventName: stalled, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(eventName: stalled, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(eventName: stalled, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(
    eventName: stalled,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(
    eventName: stalled,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(eventName: stalled, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(eventName: stalled, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_storage(eventName: storage, handler: StorageEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_storage(eventName: storage, handler: StorageEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_storage(eventName: storage, handler: StorageEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_storage(eventName: storage, handler: StorageEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_submit(eventName: submit, handler: SubmitEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(
    eventName: submit,
    handler: SubmitEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(eventName: submit, handler: SubmitEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(eventName: submit, handler: SubmitEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(eventName: submit, handler: SubmitEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(
    eventName: submit,
    handler: SubmitEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(
    eventName: submit,
    handler: SubmitEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(eventName: submit, handler: SubmitEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(eventName: submit, handler: SubmitEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_suspend(eventName: suspend, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(
    eventName: suspend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(eventName: suspend, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(eventName: suspend, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(eventName: suspend, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(
    eventName: suspend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(
    eventName: suspend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(eventName: suspend, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(eventName: suspend, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_timeupdate(eventName: timeupdate, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(
    eventName: timeupdate,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(eventName: timeupdate, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(eventName: timeupdate, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(eventName: timeupdate, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(
    eventName: timeupdate,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(
    eventName: timeupdate,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(eventName: timeupdate, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(eventName: timeupdate, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_toggle(eventName: toggle, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(
    eventName: toggle,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(eventName: toggle, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(eventName: toggle, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(eventName: toggle, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(
    eventName: toggle,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(
    eventName: toggle,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(eventName: toggle, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(eventName: toggle, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchcancel(eventName: touchcancel, handler: TouchEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(
    eventName: touchcancel,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(
    eventName: touchcancel,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(
    eventName: touchcancel,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchend(eventName: touchend, handler: TouchEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(
    eventName: touchend,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(eventName: touchend, handler: TouchEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(eventName: touchend, handler: TouchEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(eventName: touchend, handler: TouchEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(
    eventName: touchend,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(
    eventName: touchend,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(eventName: touchend, handler: TouchEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(eventName: touchend, handler: TouchEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchmove(eventName: touchmove, handler: TouchEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(eventName: touchmove, handler: TouchEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(eventName: touchmove, handler: TouchEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(eventName: touchmove, handler: TouchEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(eventName: touchmove, handler: TouchEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(eventName: touchmove, handler: TouchEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchstart(eventName: touchstart, handler: TouchEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(eventName: touchstart, handler: TouchEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(eventName: touchstart, handler: TouchEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(eventName: touchstart, handler: TouchEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(eventName: touchstart, handler: TouchEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(eventName: touchstart, handler: TouchEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitioncancel(eventName: transitioncancel, handler: TransitionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionend(eventName: transitionend, handler: TransitionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(eventName: transitionend, handler: TransitionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(eventName: transitionend, handler: TransitionEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(eventName: transitionend, handler: TransitionEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(eventName: transitionend, handler: TransitionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(eventName: transitionend, handler: TransitionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionrun(eventName: transitionrun, handler: TransitionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(
    eventName: transitionrun,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(
    eventName: transitionrun,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(
    eventName: transitionrun,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionstart(eventName: transitionstart, handler: TransitionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_unhandledrejection(eventName: unhandledrejection, handler: PromiseRejectionEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_unhandledrejection(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_unhandledrejection(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_unhandledrejection(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_unload(eventName: unload, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_unload(eventName: unload, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_unload(eventName: unload, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_unload(eventName: unload, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_visibilitychange(eventName: visibilitychange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange(eventName: visibilitychange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_volumechange(eventName: volumechange, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(
    eventName: volumechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(eventName: volumechange, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(eventName: volumechange, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(eventName: volumechange, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(
    eventName: volumechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(
    eventName: volumechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(eventName: volumechange, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(eventName: volumechange, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_waiting(eventName: waiting, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(
    eventName: waiting,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(eventName: waiting, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(eventName: waiting, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(eventName: waiting, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(
    eventName: waiting,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(
    eventName: waiting,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(eventName: waiting, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(eventName: waiting, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationend(eventName: webkitanimationend, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(
    eventName: webkitanimationend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(eventName: webkitanimationend, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(eventName: webkitanimationend, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(eventName: webkitanimationend, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(
    eventName: webkitanimationend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(
    eventName: webkitanimationend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(eventName: webkitanimationend, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(eventName: webkitanimationend, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationiteration(eventName: webkitanimationiteration, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(
    eventName: webkitanimationiteration,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(eventName: webkitanimationiteration, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(eventName: webkitanimationiteration, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(eventName: webkitanimationiteration, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(
    eventName: webkitanimationiteration,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(
    eventName: webkitanimationiteration,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(eventName: webkitanimationiteration, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(eventName: webkitanimationiteration, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationstart(eventName: webkitanimationstart, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(
    eventName: webkitanimationstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(eventName: webkitanimationstart, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(eventName: webkitanimationstart, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(eventName: webkitanimationstart, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(
    eventName: webkitanimationstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(
    eventName: webkitanimationstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(eventName: webkitanimationstart, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(eventName: webkitanimationstart, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkittransitionend(eventName: webkittransitionend, handler: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(
    eventName: webkittransitionend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(eventName: webkittransitionend, handler: Event, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(eventName: webkittransitionend, handler: Event, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(eventName: webkittransitionend, handler: Event, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(
    eventName: webkittransitionend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(
    eventName: webkittransitionend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(eventName: webkittransitionend, handler: Event, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(eventName: webkittransitionend, handler: Event, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_wheel(eventName: wheel, handler: WheelEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(eventName: wheel, handler: WheelEvent, element: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(eventName: wheel, handler: WheelEvent, element: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(eventName: wheel, handler: WheelEvent, element: Document, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(eventName: wheel, handler: WheelEvent, element: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(eventName: wheel, handler: WheelEvent, element: Window, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Inlined std.Pick<std.AddEventListenerOptions, 'capture' | 'passive' | 'once'> */
  trait Options extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
}
