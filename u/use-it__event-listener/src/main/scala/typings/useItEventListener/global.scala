package typings.useItEventListener

import typings.std.AnimationEvent
import typings.std.BeforeUnloadEvent
import typings.std.ClipboardEvent
import typings.std.DeviceLightEvent
import typings.std.DeviceMotionEvent
import typings.std.DeviceOrientationEvent
import typings.std.Document
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.HashChangeEvent
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
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.std.Window
import typings.useItEventListener.mod.Options
import typings.useItEventListener.useItEventListenerStrings.MSGestureChange
import typings.useItEventListener.useItEventListenerStrings.MSGestureDoubleTap
import typings.useItEventListener.useItEventListenerStrings.MSGestureEnd
import typings.useItEventListener.useItEventListenerStrings.MSGestureHold
import typings.useItEventListener.useItEventListenerStrings.MSGestureStart
import typings.useItEventListener.useItEventListenerStrings.MSGestureTap
import typings.useItEventListener.useItEventListenerStrings.MSInertiaStart
import typings.useItEventListener.useItEventListenerStrings.MSPointerCancel
import typings.useItEventListener.useItEventListenerStrings.MSPointerDown
import typings.useItEventListener.useItEventListenerStrings.MSPointerEnter
import typings.useItEventListener.useItEventListenerStrings.MSPointerLeave
import typings.useItEventListener.useItEventListenerStrings.MSPointerMove
import typings.useItEventListener.useItEventListenerStrings.MSPointerOut
import typings.useItEventListener.useItEventListenerStrings.MSPointerOver
import typings.useItEventListener.useItEventListenerStrings.MSPointerUp
import typings.useItEventListener.useItEventListenerStrings.abort
import typings.useItEventListener.useItEventListenerStrings.afterprint
import typings.useItEventListener.useItEventListenerStrings.animationcancel
import typings.useItEventListener.useItEventListenerStrings.animationend
import typings.useItEventListener.useItEventListenerStrings.animationiteration
import typings.useItEventListener.useItEventListenerStrings.animationstart
import typings.useItEventListener.useItEventListenerStrings.auxclick
import typings.useItEventListener.useItEventListenerStrings.beforeprint
import typings.useItEventListener.useItEventListenerStrings.beforeunload
import typings.useItEventListener.useItEventListenerStrings.blur
import typings.useItEventListener.useItEventListenerStrings.cancel
import typings.useItEventListener.useItEventListenerStrings.canplay
import typings.useItEventListener.useItEventListenerStrings.canplaythrough
import typings.useItEventListener.useItEventListenerStrings.change
import typings.useItEventListener.useItEventListenerStrings.click
import typings.useItEventListener.useItEventListenerStrings.close
import typings.useItEventListener.useItEventListenerStrings.compassneedscalibration
import typings.useItEventListener.useItEventListenerStrings.contextmenu
import typings.useItEventListener.useItEventListenerStrings.copy
import typings.useItEventListener.useItEventListenerStrings.cuechange
import typings.useItEventListener.useItEventListenerStrings.cut
import typings.useItEventListener.useItEventListenerStrings.dblclick
import typings.useItEventListener.useItEventListenerStrings.devicelight
import typings.useItEventListener.useItEventListenerStrings.devicemotion
import typings.useItEventListener.useItEventListenerStrings.deviceorientation
import typings.useItEventListener.useItEventListenerStrings.deviceorientationabsolute
import typings.useItEventListener.useItEventListenerStrings.drag
import typings.useItEventListener.useItEventListenerStrings.dragend
import typings.useItEventListener.useItEventListenerStrings.dragenter
import typings.useItEventListener.useItEventListenerStrings.dragexit
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
import typings.useItEventListener.useItEventListenerStrings.fullscreenchange
import typings.useItEventListener.useItEventListenerStrings.fullscreenerror
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
import typings.useItEventListener.useItEventListenerStrings.mousewheel
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
import typings.useItEventListener.useItEventListenerStrings.vrdisplayactivate
import typings.useItEventListener.useItEventListenerStrings.vrdisplayblur
import typings.useItEventListener.useItEventListenerStrings.vrdisplayconnect
import typings.useItEventListener.useItEventListenerStrings.vrdisplaydeactivate
import typings.useItEventListener.useItEventListenerStrings.vrdisplaydisconnect
import typings.useItEventListener.useItEventListenerStrings.vrdisplayfocus
import typings.useItEventListener.useItEventListenerStrings.vrdisplaypointerrestricted
import typings.useItEventListener.useItEventListenerStrings.vrdisplaypointerunrestricted
import typings.useItEventListener.useItEventListenerStrings.vrdisplaypresentchange
import typings.useItEventListener.useItEventListenerStrings.waiting
import typings.useItEventListener.useItEventListenerStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def useEventListener(eventName: String, handler: EventListenerOrEventListenerObject): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventName: String, handler: EventListenerOrEventListenerObject, element: Null, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventName: String, handler: EventListenerOrEventListenerObject, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventName: String, handler: EventListenerOrEventListenerObject, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventName: String,
    handler: EventListenerOrEventListenerObject,
    element: Document,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventName: String, handler: EventListenerOrEventListenerObject, element: HTMLElement): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventName: String,
    handler: EventListenerOrEventListenerObject,
    element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventName: String, handler: EventListenerOrEventListenerObject, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventName: String, handler: EventListenerOrEventListenerObject, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ]
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Unit,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Document
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Document,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Window
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener[K /* <: /* keyof std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 143 */ js.Any */](
    eventName: K,
    handler: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap & std.DocumentEventMap & std.WindowEventMap[K] */ /* event */ js.Any, 
      Unit
    ],
    element: Window,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSGestureChange(eventName: MSGestureChange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureChange(eventName: MSGestureChange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureChange(eventName: MSGestureChange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureChange(eventName: MSGestureChange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSGestureDoubleTap(eventName: MSGestureDoubleTap, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureDoubleTap(eventName: MSGestureDoubleTap, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureDoubleTap(eventName: MSGestureDoubleTap, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureDoubleTap(eventName: MSGestureDoubleTap, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSGestureEnd(eventName: MSGestureEnd, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureEnd(eventName: MSGestureEnd, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureEnd(eventName: MSGestureEnd, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureEnd(eventName: MSGestureEnd, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSGestureHold(eventName: MSGestureHold, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureHold(eventName: MSGestureHold, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureHold(eventName: MSGestureHold, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureHold(eventName: MSGestureHold, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSGestureStart(eventName: MSGestureStart, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureStart(eventName: MSGestureStart, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureStart(eventName: MSGestureStart, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureStart(eventName: MSGestureStart, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSGestureTap(eventName: MSGestureTap, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureTap(eventName: MSGestureTap, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureTap(eventName: MSGestureTap, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSGestureTap(eventName: MSGestureTap, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSInertiaStart(eventName: MSInertiaStart, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSInertiaStart(eventName: MSInertiaStart, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSInertiaStart(eventName: MSInertiaStart, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSInertiaStart(eventName: MSInertiaStart, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSPointerCancel(eventName: MSPointerCancel, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerCancel(eventName: MSPointerCancel, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerCancel(eventName: MSPointerCancel, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerCancel(eventName: MSPointerCancel, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSPointerDown(eventName: MSPointerDown, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerDown(eventName: MSPointerDown, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerDown(eventName: MSPointerDown, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerDown(eventName: MSPointerDown, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSPointerEnter(eventName: MSPointerEnter, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerEnter(eventName: MSPointerEnter, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerEnter(eventName: MSPointerEnter, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerEnter(eventName: MSPointerEnter, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSPointerLeave(eventName: MSPointerLeave, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerLeave(eventName: MSPointerLeave, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerLeave(eventName: MSPointerLeave, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerLeave(eventName: MSPointerLeave, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSPointerMove(eventName: MSPointerMove, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerMove(eventName: MSPointerMove, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerMove(eventName: MSPointerMove, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerMove(eventName: MSPointerMove, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSPointerOut(eventName: MSPointerOut, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerOut(eventName: MSPointerOut, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerOut(eventName: MSPointerOut, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerOut(eventName: MSPointerOut, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSPointerOver(eventName: MSPointerOver, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerOver(eventName: MSPointerOver, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerOver(eventName: MSPointerOver, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerOver(eventName: MSPointerOver, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_MSPointerUp(eventName: MSPointerUp, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerUp(eventName: MSPointerUp, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerUp(eventName: MSPointerUp, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_MSPointerUp(eventName: MSPointerUp, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_abort(eventName: abort, handler: UIEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, handler: UIEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, handler: UIEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, handler: UIEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, handler: UIEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(eventName: abort, handler: UIEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_afterprint(eventName: afterprint, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_afterprint(eventName: afterprint, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_afterprint(eventName: afterprint, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_afterprint(eventName: afterprint, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationcancel(eventName: animationcancel, handler: AnimationEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(
    eventName: animationcancel,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(
    eventName: animationcancel,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(
    eventName: animationcancel,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(eventName: animationcancel, handler: AnimationEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationend(eventName: animationend, handler: AnimationEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(eventName: animationend, handler: AnimationEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(eventName: animationend, handler: AnimationEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(eventName: animationend, handler: AnimationEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(eventName: animationend, handler: AnimationEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(eventName: animationend, handler: AnimationEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationiteration(eventName: animationiteration, handler: AnimationEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(eventName: animationiteration, handler: AnimationEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationstart(eventName: animationstart, handler: AnimationEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(eventName: animationstart, handler: AnimationEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(eventName: animationstart, handler: AnimationEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(eventName: animationstart, handler: AnimationEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(eventName: animationstart, handler: AnimationEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(eventName: animationstart, handler: AnimationEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_auxclick(eventName: auxclick, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(
    eventName: auxclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(
    eventName: auxclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(
    eventName: auxclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(eventName: auxclick, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeprint(eventName: beforeprint, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeprint(eventName: beforeprint, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeprint(eventName: beforeprint, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeprint(eventName: beforeprint, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeunload(eventName: beforeunload, handler: BeforeUnloadEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeunload(eventName: beforeunload, handler: BeforeUnloadEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeunload(eventName: beforeunload, handler: BeforeUnloadEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeunload(eventName: beforeunload, handler: BeforeUnloadEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_blur(eventName: blur, handler: FocusEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(
    eventName: blur,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, handler: FocusEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, handler: FocusEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, handler: FocusEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(
    eventName: blur,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(
    eventName: blur,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, handler: FocusEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(eventName: blur, handler: FocusEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cancel(eventName: cancel, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel(
    eventName: cancel,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel(eventName: cancel, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel(eventName: cancel, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel(eventName: cancel, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel(
    eventName: cancel,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel(
    eventName: cancel,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel(eventName: cancel, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel(eventName: cancel, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_canplay(eventName: canplay, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(
    eventName: canplay,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(
    eventName: canplay,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(
    eventName: canplay,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(eventName: canplay, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_canplaythrough(eventName: canplaythrough, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(
    eventName: canplaythrough,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(
    eventName: canplaythrough,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(
    eventName: canplaythrough,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(eventName: canplaythrough, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_change(eventName: change, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(
    eventName: change,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(
    eventName: change,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(
    eventName: change,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(eventName: change, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_click(eventName: click, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(
    eventName: click,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(
    eventName: click,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(
    eventName: click,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(eventName: click, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_close(eventName: close, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(
    eventName: close,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(
    eventName: close,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(
    eventName: close,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(eventName: close, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compassneedscalibration(eventName: compassneedscalibration, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compassneedscalibration(eventName: compassneedscalibration, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compassneedscalibration(eventName: compassneedscalibration, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compassneedscalibration(eventName: compassneedscalibration, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_contextmenu(eventName: contextmenu, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(
    eventName: contextmenu,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(
    eventName: contextmenu,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(
    eventName: contextmenu,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(eventName: contextmenu, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_copy(eventName: copy, handler: ClipboardEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy(
    eventName: copy,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy(eventName: copy, handler: ClipboardEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy(eventName: copy, handler: ClipboardEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy(
    eventName: copy,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy(
    eventName: copy,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cuechange(eventName: cuechange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(eventName: cuechange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cut(eventName: cut, handler: ClipboardEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut(eventName: cut, handler: ClipboardEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut(eventName: cut, handler: ClipboardEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut(
    eventName: cut,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dblclick(eventName: dblclick, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(
    eventName: dblclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(
    eventName: dblclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(
    eventName: dblclick,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(eventName: dblclick, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_devicelight(eventName: devicelight, handler: DeviceLightEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicelight(eventName: devicelight, handler: DeviceLightEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicelight(eventName: devicelight, handler: DeviceLightEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicelight(eventName: devicelight, handler: DeviceLightEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_devicemotion(eventName: devicemotion, handler: DeviceMotionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicemotion(eventName: devicemotion, handler: DeviceMotionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicemotion(eventName: devicemotion, handler: DeviceMotionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicemotion(eventName: devicemotion, handler: DeviceMotionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_deviceorientation(eventName: deviceorientation, handler: DeviceOrientationEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientation(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientation(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientation(eventName: deviceorientation, handler: DeviceOrientationEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_deviceorientationabsolute(eventName: deviceorientationabsolute, handler: DeviceOrientationEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientationabsolute(
    eventName: deviceorientationabsolute,
    handler: DeviceOrientationEvent,
    element: Unit,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientationabsolute(eventName: deviceorientationabsolute, handler: DeviceOrientationEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientationabsolute(
    eventName: deviceorientationabsolute,
    handler: DeviceOrientationEvent,
    element: Window,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_drag(eventName: drag, handler: DragEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(
    eventName: drag,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, handler: DragEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, handler: DragEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, handler: DragEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(
    eventName: drag,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(
    eventName: drag,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, handler: DragEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(eventName: drag, handler: DragEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragend(eventName: dragend, handler: DragEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(
    eventName: dragend,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, handler: DragEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, handler: DragEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, handler: DragEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(
    eventName: dragend,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(
    eventName: dragend,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, handler: DragEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(eventName: dragend, handler: DragEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragenter(eventName: dragenter, handler: DragEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(
    eventName: dragenter,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, handler: DragEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, handler: DragEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, handler: DragEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(
    eventName: dragenter,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(
    eventName: dragenter,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, handler: DragEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(eventName: dragenter, handler: DragEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragexit(eventName: dragexit, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragexit(
    eventName: dragexit,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragexit(eventName: dragexit, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragexit(eventName: dragexit, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragexit(eventName: dragexit, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragexit(
    eventName: dragexit,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragexit(
    eventName: dragexit,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragexit(eventName: dragexit, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragexit(eventName: dragexit, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragleave(eventName: dragleave, handler: DragEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, handler: DragEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, handler: DragEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, handler: DragEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, handler: DragEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(eventName: dragleave, handler: DragEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragover(eventName: dragover, handler: DragEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(
    eventName: dragover,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, handler: DragEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, handler: DragEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, handler: DragEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(
    eventName: dragover,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(
    eventName: dragover,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, handler: DragEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(eventName: dragover, handler: DragEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragstart(eventName: dragstart, handler: DragEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(
    eventName: dragstart,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, handler: DragEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, handler: DragEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, handler: DragEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(
    eventName: dragstart,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(
    eventName: dragstart,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, handler: DragEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(eventName: dragstart, handler: DragEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_drop(eventName: drop, handler: DragEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, handler: DragEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, handler: DragEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, handler: DragEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, handler: DragEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(eventName: drop, handler: DragEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_durationchange(eventName: durationchange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(
    eventName: durationchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(
    eventName: durationchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(
    eventName: durationchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(eventName: durationchange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_emptied(eventName: emptied, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(
    eventName: emptied,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(
    eventName: emptied,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(
    eventName: emptied,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(eventName: emptied, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_ended(eventName: ended, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(
    eventName: ended,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(
    eventName: ended,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(
    eventName: ended,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(eventName: ended, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_error(eventName: error, handler: ErrorEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, handler: ErrorEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, handler: ErrorEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, handler: ErrorEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, handler: ErrorEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(eventName: error, handler: ErrorEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focus(eventName: focus, handler: FocusEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, handler: FocusEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, handler: FocusEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, handler: FocusEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(
    eventName: focus,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, handler: FocusEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(eventName: focus, handler: FocusEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focusin(eventName: focusin, handler: FocusEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(
    eventName: focusin,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, handler: FocusEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, handler: FocusEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, handler: FocusEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(
    eventName: focusin,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(
    eventName: focusin,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, handler: FocusEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(eventName: focusin, handler: FocusEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focusout(eventName: focusout, handler: FocusEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(
    eventName: focusout,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, handler: FocusEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, handler: FocusEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, handler: FocusEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(
    eventName: focusout,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(
    eventName: focusout,
    handler: FocusEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, handler: FocusEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(eventName: focusout, handler: FocusEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A custom React Hook that provides a declarative useEventListener.
    */
  inline def useEventListener_fullscreenchange(eventName: fullscreenchange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange(eventName: fullscreenchange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange(eventName: fullscreenchange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_fullscreenerror(eventName: fullscreenerror, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror(eventName: fullscreenerror, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror(eventName: fullscreenerror, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(
    eventName: gotpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(
    eventName: gotpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(
    eventName: gotpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(eventName: gotpointercapture, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_hashchange(eventName: hashchange, handler: HashChangeEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_hashchange(eventName: hashchange, handler: HashChangeEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_hashchange(eventName: hashchange, handler: HashChangeEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_hashchange(eventName: hashchange, handler: HashChangeEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_input(eventName: input, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(
    eventName: input,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(eventName: input, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_invalid(eventName: invalid, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(
    eventName: invalid,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(
    eventName: invalid,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(
    eventName: invalid,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(eventName: invalid, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keydown(eventName: keydown, handler: KeyboardEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(
    eventName: keydown,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, handler: KeyboardEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, handler: KeyboardEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, handler: KeyboardEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(
    eventName: keydown,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(
    eventName: keydown,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, handler: KeyboardEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(eventName: keydown, handler: KeyboardEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keypress(eventName: keypress, handler: KeyboardEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(
    eventName: keypress,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, handler: KeyboardEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, handler: KeyboardEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, handler: KeyboardEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(
    eventName: keypress,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(
    eventName: keypress,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, handler: KeyboardEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(eventName: keypress, handler: KeyboardEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keyup(eventName: keyup, handler: KeyboardEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, handler: KeyboardEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, handler: KeyboardEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, handler: KeyboardEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, handler: KeyboardEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(eventName: keyup, handler: KeyboardEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_languagechange(eventName: languagechange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_languagechange(eventName: languagechange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_languagechange(eventName: languagechange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_languagechange(eventName: languagechange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_load(eventName: load, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(
    eventName: load,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(
    eventName: load,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(
    eventName: load,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(eventName: load, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadeddata(eventName: loadeddata, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(
    eventName: loadeddata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(
    eventName: loadeddata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(
    eventName: loadeddata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(eventName: loadeddata, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(
    eventName: loadedmetadata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(
    eventName: loadedmetadata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(
    eventName: loadedmetadata,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadstart(eventName: loadstart, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(
    eventName: loadstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(
    eventName: loadstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(
    eventName: loadstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(eventName: loadstart, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(
    eventName: lostpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(
    eventName: lostpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(
    eventName: lostpointercapture,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(eventName: lostpointercapture, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_message(eventName: message, handler: MessageEvent[js.Any]): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_message(eventName: message, handler: MessageEvent[js.Any], element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_message(eventName: message, handler: MessageEvent[js.Any], element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_message(eventName: message, handler: MessageEvent[js.Any], element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_messageerror(eventName: messageerror, handler: MessageEvent[js.Any]): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_messageerror(eventName: messageerror, handler: MessageEvent[js.Any], element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_messageerror(eventName: messageerror, handler: MessageEvent[js.Any], element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_messageerror(eventName: messageerror, handler: MessageEvent[js.Any], element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousedown(eventName: mousedown, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(
    eventName: mousedown,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(
    eventName: mousedown,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(
    eventName: mousedown,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(eventName: mousedown, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseenter(eventName: mouseenter, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(
    eventName: mouseenter,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(
    eventName: mouseenter,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(
    eventName: mouseenter,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(eventName: mouseenter, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseleave(eventName: mouseleave, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(
    eventName: mouseleave,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(
    eventName: mouseleave,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(
    eventName: mouseleave,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(eventName: mouseleave, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousemove(eventName: mousemove, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(
    eventName: mousemove,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(
    eventName: mousemove,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(
    eventName: mousemove,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(eventName: mousemove, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseout(eventName: mouseout, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(eventName: mouseout, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseover(eventName: mouseover, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(
    eventName: mouseover,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(
    eventName: mouseover,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(
    eventName: mouseover,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(eventName: mouseover, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseup(eventName: mouseup, handler: MouseEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(
    eventName: mouseup,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, handler: MouseEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, handler: MouseEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, handler: MouseEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(
    eventName: mouseup,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(
    eventName: mouseup,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, handler: MouseEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(eventName: mouseup, handler: MouseEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousewheel(eventName: mousewheel, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousewheel(eventName: mousewheel, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousewheel(eventName: mousewheel, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousewheel(eventName: mousewheel, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_offline(eventName: offline, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_offline(eventName: offline, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_offline(eventName: offline, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_offline(eventName: offline, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_online(eventName: online, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_online(eventName: online, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_online(eventName: online, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_online(eventName: online, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_orientationchange(eventName: orientationchange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_orientationchange(eventName: orientationchange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_orientationchange(eventName: orientationchange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_orientationchange(eventName: orientationchange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pagehide(eventName: pagehide, handler: PageTransitionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pagehide(eventName: pagehide, handler: PageTransitionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pagehide(eventName: pagehide, handler: PageTransitionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pagehide(eventName: pagehide, handler: PageTransitionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pageshow(eventName: pageshow, handler: PageTransitionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pageshow(eventName: pageshow, handler: PageTransitionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pageshow(eventName: pageshow, handler: PageTransitionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pageshow(eventName: pageshow, handler: PageTransitionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_paste(eventName: paste, handler: ClipboardEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste(eventName: paste, handler: ClipboardEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste(eventName: paste, handler: ClipboardEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste(
    eventName: paste,
    handler: ClipboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pause(eventName: pause, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(eventName: pause, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_play(eventName: play, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(
    eventName: play,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(
    eventName: play,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(
    eventName: play,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(eventName: play, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_playing(eventName: playing, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(
    eventName: playing,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(
    eventName: playing,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(
    eventName: playing,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(eventName: playing, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointercancel(eventName: pointercancel, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(eventName: pointercancel, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerdown(eventName: pointerdown, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(
    eventName: pointerdown,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(
    eventName: pointerdown,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(
    eventName: pointerdown,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(eventName: pointerdown, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerenter(eventName: pointerenter, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(
    eventName: pointerenter,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(
    eventName: pointerenter,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(
    eventName: pointerenter,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(eventName: pointerenter, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerleave(eventName: pointerleave, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(
    eventName: pointerleave,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(
    eventName: pointerleave,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(
    eventName: pointerleave,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(eventName: pointerleave, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerlockchange(eventName: pointerlockchange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockchange(eventName: pointerlockchange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerlockerror(eventName: pointerlockerror, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockerror(eventName: pointerlockerror, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointermove(eventName: pointermove, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(
    eventName: pointermove,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(eventName: pointermove, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(eventName: pointermove, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(eventName: pointermove, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(
    eventName: pointermove,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(
    eventName: pointermove,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(eventName: pointermove, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(eventName: pointermove, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerout(eventName: pointerout, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(
    eventName: pointerout,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(eventName: pointerout, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerover(eventName: pointerover, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(
    eventName: pointerover,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(eventName: pointerover, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(eventName: pointerover, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(eventName: pointerover, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(
    eventName: pointerover,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(
    eventName: pointerover,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(eventName: pointerover, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(eventName: pointerover, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerup(eventName: pointerup, handler: PointerEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(
    eventName: pointerup,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, handler: PointerEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, handler: PointerEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, handler: PointerEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(
    eventName: pointerup,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(
    eventName: pointerup,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, handler: PointerEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(eventName: pointerup, handler: PointerEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_popstate(eventName: popstate, handler: PopStateEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_popstate(eventName: popstate, handler: PopStateEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_popstate(eventName: popstate, handler: PopStateEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_popstate(eventName: popstate, handler: PopStateEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_progress(eventName: progress, handler: ProgressEvent[EventTarget | Window]): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, handler: ProgressEvent[Window], element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, handler: ProgressEvent[EventTarget], element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, handler: ProgressEvent[EventTarget], element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, handler: ProgressEvent[Window], element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(eventName: progress, handler: ProgressEvent[Window], element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_ratechange(eventName: ratechange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(
    eventName: ratechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(
    eventName: ratechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(
    eventName: ratechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(eventName: ratechange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_readystatechange(eventName: readystatechange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange(eventName: readystatechange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange(eventName: readystatechange, handler: ProgressEvent[Window]): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange(eventName: readystatechange, handler: ProgressEvent[Window], element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange(eventName: readystatechange, handler: ProgressEvent[Window], element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange(eventName: readystatechange, handler: ProgressEvent[Window], element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_rejectionhandled(eventName: rejectionhandled, handler: PromiseRejectionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_rejectionhandled(eventName: rejectionhandled, handler: PromiseRejectionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_rejectionhandled(eventName: rejectionhandled, handler: PromiseRejectionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_rejectionhandled(eventName: rejectionhandled, handler: PromiseRejectionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_reset(eventName: reset, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(
    eventName: reset,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(
    eventName: reset,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(
    eventName: reset,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(eventName: reset, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_resize(eventName: resize, handler: UIEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(
    eventName: resize,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, handler: UIEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, handler: UIEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, handler: UIEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(
    eventName: resize,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(
    eventName: resize,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, handler: UIEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(eventName: resize, handler: UIEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_scroll(eventName: scroll, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(
    eventName: scroll,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(
    eventName: scroll,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(
    eventName: scroll,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(eventName: scroll, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_securitypolicyviolation(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: Unit,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: Document,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(eventName: securitypolicyviolation, handler: SecurityPolicyViolationEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: SecurityPolicyViolationEvent,
    element: Window,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_seeked(eventName: seeked, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(
    eventName: seeked,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(
    eventName: seeked,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(
    eventName: seeked,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(eventName: seeked, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_seeking(eventName: seeking, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(
    eventName: seeking,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(
    eventName: seeking,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(
    eventName: seeking,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(eventName: seeking, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_select(eventName: select, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(
    eventName: select,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(
    eventName: select,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(
    eventName: select,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(eventName: select, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_selectionchange(eventName: selectionchange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(
    eventName: selectionchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(
    eventName: selectionchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(
    eventName: selectionchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(eventName: selectionchange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_selectstart(eventName: selectstart, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(
    eventName: selectstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(
    eventName: selectstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(
    eventName: selectstart,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(eventName: selectstart, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_stalled(eventName: stalled, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(
    eventName: stalled,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(
    eventName: stalled,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(
    eventName: stalled,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(eventName: stalled, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_storage(eventName: storage, handler: StorageEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_storage(eventName: storage, handler: StorageEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_storage(eventName: storage, handler: StorageEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_storage(eventName: storage, handler: StorageEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_submit(eventName: submit, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(
    eventName: submit,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(
    eventName: submit,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(
    eventName: submit,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(eventName: submit, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_suspend(eventName: suspend, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(
    eventName: suspend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(
    eventName: suspend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(
    eventName: suspend,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(eventName: suspend, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_timeupdate(eventName: timeupdate, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(
    eventName: timeupdate,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(
    eventName: timeupdate,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(
    eventName: timeupdate,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(eventName: timeupdate, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_toggle(eventName: toggle, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(
    eventName: toggle,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(
    eventName: toggle,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(
    eventName: toggle,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(eventName: toggle, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchcancel(eventName: touchcancel, handler: TouchEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(
    eventName: touchcancel,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(
    eventName: touchcancel,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(
    eventName: touchcancel,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(eventName: touchcancel, handler: TouchEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchend(eventName: touchend, handler: TouchEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(
    eventName: touchend,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, handler: TouchEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, handler: TouchEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, handler: TouchEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(
    eventName: touchend,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(
    eventName: touchend,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, handler: TouchEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(eventName: touchend, handler: TouchEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchmove(eventName: touchmove, handler: TouchEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, handler: TouchEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, handler: TouchEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, handler: TouchEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, handler: TouchEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(eventName: touchmove, handler: TouchEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchstart(eventName: touchstart, handler: TouchEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, handler: TouchEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, handler: TouchEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, handler: TouchEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, handler: TouchEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(eventName: touchstart, handler: TouchEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitioncancel(eventName: transitioncancel, handler: TransitionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(
    eventName: transitioncancel,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(eventName: transitioncancel, handler: TransitionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionend(eventName: transitionend, handler: TransitionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(eventName: transitionend, handler: TransitionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(eventName: transitionend, handler: TransitionEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(eventName: transitionend, handler: TransitionEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(eventName: transitionend, handler: TransitionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(eventName: transitionend, handler: TransitionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionrun(eventName: transitionrun, handler: TransitionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(
    eventName: transitionrun,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(
    eventName: transitionrun,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(
    eventName: transitionrun,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(eventName: transitionrun, handler: TransitionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionstart(eventName: transitionstart, handler: TransitionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(eventName: transitionstart, handler: TransitionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_unhandledrejection(eventName: unhandledrejection, handler: PromiseRejectionEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unhandledrejection(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unhandledrejection(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unhandledrejection(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_unload(eventName: unload, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unload(eventName: unload, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unload(eventName: unload, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unload(eventName: unload, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_visibilitychange(eventName: visibilitychange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_visibilitychange(eventName: visibilitychange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_volumechange(eventName: volumechange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(
    eventName: volumechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(
    eventName: volumechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(
    eventName: volumechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(eventName: volumechange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplayactivate(eventName: vrdisplayactivate, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayactivate(eventName: vrdisplayactivate, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayactivate(eventName: vrdisplayactivate, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayactivate(eventName: vrdisplayactivate, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplayblur(eventName: vrdisplayblur, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayblur(eventName: vrdisplayblur, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayblur(eventName: vrdisplayblur, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayblur(eventName: vrdisplayblur, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplayconnect(eventName: vrdisplayconnect, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayconnect(eventName: vrdisplayconnect, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayconnect(eventName: vrdisplayconnect, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayconnect(eventName: vrdisplayconnect, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplaydeactivate(eventName: vrdisplaydeactivate, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaydeactivate(eventName: vrdisplaydeactivate, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaydeactivate(eventName: vrdisplaydeactivate, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaydeactivate(eventName: vrdisplaydeactivate, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplaydisconnect(eventName: vrdisplaydisconnect, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaydisconnect(eventName: vrdisplaydisconnect, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaydisconnect(eventName: vrdisplaydisconnect, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaydisconnect(eventName: vrdisplaydisconnect, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplayfocus(eventName: vrdisplayfocus, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayfocus(eventName: vrdisplayfocus, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayfocus(eventName: vrdisplayfocus, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplayfocus(eventName: vrdisplayfocus, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplaypointerrestricted(eventName: vrdisplaypointerrestricted, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypointerrestricted(eventName: vrdisplaypointerrestricted, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypointerrestricted(eventName: vrdisplaypointerrestricted, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypointerrestricted(eventName: vrdisplaypointerrestricted, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplaypointerunrestricted(eventName: vrdisplaypointerunrestricted, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypointerunrestricted(eventName: vrdisplaypointerunrestricted, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypointerunrestricted(eventName: vrdisplaypointerunrestricted, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypointerunrestricted(eventName: vrdisplaypointerunrestricted, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_vrdisplaypresentchange(eventName: vrdisplaypresentchange, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypresentchange(eventName: vrdisplaypresentchange, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypresentchange(eventName: vrdisplaypresentchange, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_vrdisplaypresentchange(eventName: vrdisplaypresentchange, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_waiting(eventName: waiting, handler: Event): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(
    eventName: waiting,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, handler: Event, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, handler: Event, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, handler: Event, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(
    eventName: waiting,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(
    eventName: waiting,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, handler: Event, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(eventName: waiting, handler: Event, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_wheel(eventName: wheel, handler: WheelEvent): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, handler: WheelEvent, element: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, handler: WheelEvent, element: Document): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, handler: WheelEvent, element: Document, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(
    eventName: wheel,
    handler: WheelEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, handler: WheelEvent, element: Window): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(eventName: wheel, handler: WheelEvent, element: Window, options: Options): Unit = (js.Dynamic.global.applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
