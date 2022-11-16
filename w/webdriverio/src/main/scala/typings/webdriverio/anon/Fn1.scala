package typings.webdriverio.anon

import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElement
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.webdriverio.webdriverioStrings.abort
import typings.webdriverio.webdriverioStrings.animationcancel
import typings.webdriverio.webdriverioStrings.animationend
import typings.webdriverio.webdriverioStrings.animationiteration
import typings.webdriverio.webdriverioStrings.animationstart
import typings.webdriverio.webdriverioStrings.auxclick
import typings.webdriverio.webdriverioStrings.beforeinput
import typings.webdriverio.webdriverioStrings.blur
import typings.webdriverio.webdriverioStrings.cancel
import typings.webdriverio.webdriverioStrings.canplay
import typings.webdriverio.webdriverioStrings.canplaythrough
import typings.webdriverio.webdriverioStrings.change
import typings.webdriverio.webdriverioStrings.click
import typings.webdriverio.webdriverioStrings.close
import typings.webdriverio.webdriverioStrings.compositionend
import typings.webdriverio.webdriverioStrings.compositionstart
import typings.webdriverio.webdriverioStrings.compositionupdate
import typings.webdriverio.webdriverioStrings.contextmenu
import typings.webdriverio.webdriverioStrings.copy
import typings.webdriverio.webdriverioStrings.cuechange
import typings.webdriverio.webdriverioStrings.cut
import typings.webdriverio.webdriverioStrings.dblclick
import typings.webdriverio.webdriverioStrings.drag
import typings.webdriverio.webdriverioStrings.dragend
import typings.webdriverio.webdriverioStrings.dragenter
import typings.webdriverio.webdriverioStrings.dragleave
import typings.webdriverio.webdriverioStrings.dragover
import typings.webdriverio.webdriverioStrings.dragstart
import typings.webdriverio.webdriverioStrings.drop
import typings.webdriverio.webdriverioStrings.durationchange
import typings.webdriverio.webdriverioStrings.emptied
import typings.webdriverio.webdriverioStrings.ended
import typings.webdriverio.webdriverioStrings.error
import typings.webdriverio.webdriverioStrings.focus
import typings.webdriverio.webdriverioStrings.focusin
import typings.webdriverio.webdriverioStrings.focusout
import typings.webdriverio.webdriverioStrings.formdata
import typings.webdriverio.webdriverioStrings.fullscreenchange
import typings.webdriverio.webdriverioStrings.fullscreenerror
import typings.webdriverio.webdriverioStrings.gotpointercapture
import typings.webdriverio.webdriverioStrings.input
import typings.webdriverio.webdriverioStrings.invalid
import typings.webdriverio.webdriverioStrings.keydown_
import typings.webdriverio.webdriverioStrings.keypress
import typings.webdriverio.webdriverioStrings.keyup_
import typings.webdriverio.webdriverioStrings.load
import typings.webdriverio.webdriverioStrings.loadeddata
import typings.webdriverio.webdriverioStrings.loadedmetadata
import typings.webdriverio.webdriverioStrings.loadstart
import typings.webdriverio.webdriverioStrings.lostpointercapture
import typings.webdriverio.webdriverioStrings.mousedown
import typings.webdriverio.webdriverioStrings.mouseenter
import typings.webdriverio.webdriverioStrings.mouseleave
import typings.webdriverio.webdriverioStrings.mousemove
import typings.webdriverio.webdriverioStrings.mouseout
import typings.webdriverio.webdriverioStrings.mouseover
import typings.webdriverio.webdriverioStrings.mouseup
import typings.webdriverio.webdriverioStrings.paste
import typings.webdriverio.webdriverioStrings.pause
import typings.webdriverio.webdriverioStrings.play
import typings.webdriverio.webdriverioStrings.playing
import typings.webdriverio.webdriverioStrings.pointercancel_
import typings.webdriverio.webdriverioStrings.pointerdown_
import typings.webdriverio.webdriverioStrings.pointerenter
import typings.webdriverio.webdriverioStrings.pointerleave
import typings.webdriverio.webdriverioStrings.pointermove_
import typings.webdriverio.webdriverioStrings.pointerout
import typings.webdriverio.webdriverioStrings.pointerover
import typings.webdriverio.webdriverioStrings.pointerup_
import typings.webdriverio.webdriverioStrings.progress
import typings.webdriverio.webdriverioStrings.ratechange
import typings.webdriverio.webdriverioStrings.reset
import typings.webdriverio.webdriverioStrings.resize
import typings.webdriverio.webdriverioStrings.scroll
import typings.webdriverio.webdriverioStrings.securitypolicyviolation
import typings.webdriverio.webdriverioStrings.seeked
import typings.webdriverio.webdriverioStrings.seeking
import typings.webdriverio.webdriverioStrings.select
import typings.webdriverio.webdriverioStrings.selectionchange
import typings.webdriverio.webdriverioStrings.selectstart
import typings.webdriverio.webdriverioStrings.slotchange
import typings.webdriverio.webdriverioStrings.stalled
import typings.webdriverio.webdriverioStrings.submit
import typings.webdriverio.webdriverioStrings.suspend
import typings.webdriverio.webdriverioStrings.timeupdate
import typings.webdriverio.webdriverioStrings.toggle
import typings.webdriverio.webdriverioStrings.touchcancel
import typings.webdriverio.webdriverioStrings.touchend
import typings.webdriverio.webdriverioStrings.touchmove_
import typings.webdriverio.webdriverioStrings.touchstart
import typings.webdriverio.webdriverioStrings.transitioncancel
import typings.webdriverio.webdriverioStrings.transitionend
import typings.webdriverio.webdriverioStrings.transitionrun
import typings.webdriverio.webdriverioStrings.transitionstart
import typings.webdriverio.webdriverioStrings.volumechange
import typings.webdriverio.webdriverioStrings.waiting
import typings.webdriverio.webdriverioStrings.webkitanimationend
import typings.webdriverio.webdriverioStrings.webkitanimationiteration
import typings.webdriverio.webdriverioStrings.webkitanimationstart
import typings.webdriverio.webdriverioStrings.webkittransitionend
import typings.webdriverio.webdriverioStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn1 extends StObject {
  
  def apply(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def apply(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def apply(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  def apply(`type`: abort, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]): Unit = js.native
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: auxclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: beforeinput, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any]): Unit = js.native
  def apply(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: blur, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  def apply(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: cancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: canplay, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: change, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: click, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: contextmenu, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: copy, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  def apply(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: cuechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: cut, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  def apply(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: dblclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: drag, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: drop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: durationchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: emptied, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: ended, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: error, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any]): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: focusin, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: focus, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  def apply(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: focusout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  def apply(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: formdata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any]): Unit = js.native
  def apply(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: input, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: invalid, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: keydown_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  def apply(
    `type`: keydown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: keydown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: keypress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: keyup_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  def apply(
    `type`: keyup_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: keyup_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: loadeddata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: load, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: loadstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: mousedown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: mousemove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: paste, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  def apply(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: pause, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: playing, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: play, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointercancel_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointercancel_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointercancel_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointerdown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointerdown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerdown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointermove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointermove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointermove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: pointerout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: pointerup_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]): Unit = js.native
  def apply(
    `type`: pointerup_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerup_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  def apply(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: ratechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: reset, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: resize, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]): Unit = js.native
  def apply(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: scroll, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: seeked, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: seeking, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: selectionchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: select, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: selectstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: slotchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: stalled, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: submit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any]): Unit = js.native
  def apply(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: suspend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: timeupdate, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: toggle, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: touchcancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  def apply(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: touchend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  def apply(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: touchmove_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  def apply(
    `type`: touchmove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: touchmove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: touchstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  def apply(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: volumechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: waiting, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  def apply(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  def apply(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  def apply(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  def apply(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(`type`: wheel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any]): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
