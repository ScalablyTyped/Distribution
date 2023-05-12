package typings.yandexMaps.mod

import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.Document
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
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
import typings.yandexMaps.mod.event.Group
import typings.yandexMaps.yandexMapsStrings.abort
import typings.yandexMaps.yandexMapsStrings.animationcancel
import typings.yandexMaps.yandexMapsStrings.animationend
import typings.yandexMaps.yandexMapsStrings.animationiteration
import typings.yandexMaps.yandexMapsStrings.animationstart
import typings.yandexMaps.yandexMapsStrings.auxclick
import typings.yandexMaps.yandexMapsStrings.beforeinput
import typings.yandexMaps.yandexMapsStrings.blur
import typings.yandexMaps.yandexMapsStrings.cancel
import typings.yandexMaps.yandexMapsStrings.canplay
import typings.yandexMaps.yandexMapsStrings.canplaythrough
import typings.yandexMaps.yandexMapsStrings.change
import typings.yandexMaps.yandexMapsStrings.click
import typings.yandexMaps.yandexMapsStrings.close
import typings.yandexMaps.yandexMapsStrings.compositionend
import typings.yandexMaps.yandexMapsStrings.compositionstart
import typings.yandexMaps.yandexMapsStrings.compositionupdate
import typings.yandexMaps.yandexMapsStrings.contextmenu
import typings.yandexMaps.yandexMapsStrings.copy
import typings.yandexMaps.yandexMapsStrings.cuechange
import typings.yandexMaps.yandexMapsStrings.cut
import typings.yandexMaps.yandexMapsStrings.dblclick
import typings.yandexMaps.yandexMapsStrings.drag
import typings.yandexMaps.yandexMapsStrings.dragend
import typings.yandexMaps.yandexMapsStrings.dragenter
import typings.yandexMaps.yandexMapsStrings.dragleave
import typings.yandexMaps.yandexMapsStrings.dragover
import typings.yandexMaps.yandexMapsStrings.dragstart
import typings.yandexMaps.yandexMapsStrings.drop
import typings.yandexMaps.yandexMapsStrings.durationchange
import typings.yandexMaps.yandexMapsStrings.emptied
import typings.yandexMaps.yandexMapsStrings.ended
import typings.yandexMaps.yandexMapsStrings.error
import typings.yandexMaps.yandexMapsStrings.focus
import typings.yandexMaps.yandexMapsStrings.focusin
import typings.yandexMaps.yandexMapsStrings.focusout
import typings.yandexMaps.yandexMapsStrings.formdata
import typings.yandexMaps.yandexMapsStrings.gotpointercapture
import typings.yandexMaps.yandexMapsStrings.input
import typings.yandexMaps.yandexMapsStrings.invalid
import typings.yandexMaps.yandexMapsStrings.keydown
import typings.yandexMaps.yandexMapsStrings.keypress
import typings.yandexMaps.yandexMapsStrings.keyup
import typings.yandexMaps.yandexMapsStrings.load
import typings.yandexMaps.yandexMapsStrings.loadeddata
import typings.yandexMaps.yandexMapsStrings.loadedmetadata
import typings.yandexMaps.yandexMapsStrings.loadstart
import typings.yandexMaps.yandexMapsStrings.lostpointercapture
import typings.yandexMaps.yandexMapsStrings.mousedown
import typings.yandexMaps.yandexMapsStrings.mouseenter
import typings.yandexMaps.yandexMapsStrings.mouseleave
import typings.yandexMaps.yandexMapsStrings.mousemove
import typings.yandexMaps.yandexMapsStrings.mouseout
import typings.yandexMaps.yandexMapsStrings.mouseover
import typings.yandexMaps.yandexMapsStrings.mouseup
import typings.yandexMaps.yandexMapsStrings.paste
import typings.yandexMaps.yandexMapsStrings.pause
import typings.yandexMaps.yandexMapsStrings.play
import typings.yandexMaps.yandexMapsStrings.playing
import typings.yandexMaps.yandexMapsStrings.pointercancel
import typings.yandexMaps.yandexMapsStrings.pointerdown
import typings.yandexMaps.yandexMapsStrings.pointerenter
import typings.yandexMaps.yandexMapsStrings.pointerleave
import typings.yandexMaps.yandexMapsStrings.pointermove
import typings.yandexMaps.yandexMapsStrings.pointerout
import typings.yandexMaps.yandexMapsStrings.pointerover
import typings.yandexMaps.yandexMapsStrings.pointerup
import typings.yandexMaps.yandexMapsStrings.progress
import typings.yandexMaps.yandexMapsStrings.ratechange
import typings.yandexMaps.yandexMapsStrings.reset
import typings.yandexMaps.yandexMapsStrings.resize
import typings.yandexMaps.yandexMapsStrings.scroll
import typings.yandexMaps.yandexMapsStrings.securitypolicyviolation
import typings.yandexMaps.yandexMapsStrings.seeked
import typings.yandexMaps.yandexMapsStrings.seeking
import typings.yandexMaps.yandexMapsStrings.select
import typings.yandexMaps.yandexMapsStrings.selectionchange
import typings.yandexMaps.yandexMapsStrings.selectstart
import typings.yandexMaps.yandexMapsStrings.slotchange
import typings.yandexMaps.yandexMapsStrings.stalled
import typings.yandexMaps.yandexMapsStrings.submit
import typings.yandexMaps.yandexMapsStrings.suspend
import typings.yandexMaps.yandexMapsStrings.timeupdate
import typings.yandexMaps.yandexMapsStrings.toggle
import typings.yandexMaps.yandexMapsStrings.touchcancel
import typings.yandexMaps.yandexMapsStrings.touchend
import typings.yandexMaps.yandexMapsStrings.touchmove
import typings.yandexMaps.yandexMapsStrings.touchstart
import typings.yandexMaps.yandexMapsStrings.transitioncancel
import typings.yandexMaps.yandexMapsStrings.transitionend
import typings.yandexMaps.yandexMapsStrings.transitionrun
import typings.yandexMaps.yandexMapsStrings.transitionstart
import typings.yandexMaps.yandexMapsStrings.volumechange
import typings.yandexMaps.yandexMapsStrings.waiting
import typings.yandexMaps.yandexMapsStrings.webkitanimationend
import typings.yandexMaps.yandexMapsStrings.webkitanimationiteration
import typings.yandexMaps.yandexMapsStrings.webkitanimationstart
import typings.yandexMaps.yandexMapsStrings.webkittransitionend
import typings.yandexMaps.yandexMapsStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domEvent {
  
  @js.native
  trait manager extends StObject {
    
    def add(htmlElement: Document, types: String, callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    def add(
      htmlElement: Document,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      htmlElement: Document,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def add(
      htmlElement: Document,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    def add(htmlElement: Document, types: js.Array[String], callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    def add(
      htmlElement: Document,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      htmlElement: Document,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def add(
      htmlElement: Document,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    def add(htmlElement: HTMLElement, types: String, callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    def add(
      htmlElement: HTMLElement,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      htmlElement: HTMLElement,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def add(
      htmlElement: HTMLElement,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    def add(htmlElement: HTMLElement, types: js.Array[String], callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    def add(
      htmlElement: HTMLElement,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      htmlElement: HTMLElement,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def add(
      htmlElement: HTMLElement,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_abort(htmlElement: Document, types: abort, callback: js.Function1[/* event */ UIEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_abort(
      htmlElement: Document,
      types: abort,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_abort(
      htmlElement: Document,
      types: abort,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_abort(
      htmlElement: Document,
      types: abort,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_abort(htmlElement: HTMLElement, types: abort, callback: js.Function1[/* event */ UIEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_abort(
      htmlElement: HTMLElement,
      types: abort,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_abort(
      htmlElement: HTMLElement,
      types: abort,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_abort(
      htmlElement: HTMLElement,
      types: abort,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationcancel(
      htmlElement: Document,
      types: animationcancel,
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_animationcancel(
      htmlElement: Document,
      types: animationcancel,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_animationcancel(
      htmlElement: Document,
      types: animationcancel,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationcancel(
      htmlElement: Document,
      types: animationcancel,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationcancel(
      htmlElement: HTMLElement,
      types: animationcancel,
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_animationcancel(
      htmlElement: HTMLElement,
      types: animationcancel,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_animationcancel(
      htmlElement: HTMLElement,
      types: animationcancel,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationcancel(
      htmlElement: HTMLElement,
      types: animationcancel,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationend(
      htmlElement: Document,
      types: animationend,
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_animationend(
      htmlElement: Document,
      types: animationend,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_animationend(
      htmlElement: Document,
      types: animationend,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationend(
      htmlElement: Document,
      types: animationend,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationend(
      htmlElement: HTMLElement,
      types: animationend,
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_animationend(
      htmlElement: HTMLElement,
      types: animationend,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_animationend(
      htmlElement: HTMLElement,
      types: animationend,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationend(
      htmlElement: HTMLElement,
      types: animationend,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationiteration(
      htmlElement: Document,
      types: animationiteration,
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_animationiteration(
      htmlElement: Document,
      types: animationiteration,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_animationiteration(
      htmlElement: Document,
      types: animationiteration,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationiteration(
      htmlElement: Document,
      types: animationiteration,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationiteration(
      htmlElement: HTMLElement,
      types: animationiteration,
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_animationiteration(
      htmlElement: HTMLElement,
      types: animationiteration,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_animationiteration(
      htmlElement: HTMLElement,
      types: animationiteration,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationiteration(
      htmlElement: HTMLElement,
      types: animationiteration,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationstart(
      htmlElement: Document,
      types: animationstart,
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_animationstart(
      htmlElement: Document,
      types: animationstart,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_animationstart(
      htmlElement: Document,
      types: animationstart,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationstart(
      htmlElement: Document,
      types: animationstart,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationstart(
      htmlElement: HTMLElement,
      types: animationstart,
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_animationstart(
      htmlElement: HTMLElement,
      types: animationstart,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_animationstart(
      htmlElement: HTMLElement,
      types: animationstart,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_animationstart(
      htmlElement: HTMLElement,
      types: animationstart,
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_auxclick(htmlElement: Document, types: auxclick, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_auxclick(
      htmlElement: Document,
      types: auxclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_auxclick(
      htmlElement: Document,
      types: auxclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_auxclick(
      htmlElement: Document,
      types: auxclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_auxclick(htmlElement: HTMLElement, types: auxclick, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_auxclick(
      htmlElement: HTMLElement,
      types: auxclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_auxclick(
      htmlElement: HTMLElement,
      types: auxclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_auxclick(
      htmlElement: HTMLElement,
      types: auxclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_beforeinput(htmlElement: Document, types: beforeinput, callback: js.Function1[/* event */ InputEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_beforeinput(
      htmlElement: Document,
      types: beforeinput,
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_beforeinput(
      htmlElement: Document,
      types: beforeinput,
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_beforeinput(
      htmlElement: Document,
      types: beforeinput,
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_beforeinput(htmlElement: HTMLElement, types: beforeinput, callback: js.Function1[/* event */ InputEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_beforeinput(
      htmlElement: HTMLElement,
      types: beforeinput,
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_beforeinput(
      htmlElement: HTMLElement,
      types: beforeinput,
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_beforeinput(
      htmlElement: HTMLElement,
      types: beforeinput,
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_blur(htmlElement: Document, types: blur, callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_blur(
      htmlElement: Document,
      types: blur,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_blur(
      htmlElement: Document,
      types: blur,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_blur(
      htmlElement: Document,
      types: blur,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_blur(htmlElement: HTMLElement, types: blur, callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_blur(
      htmlElement: HTMLElement,
      types: blur,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_blur(
      htmlElement: HTMLElement,
      types: blur,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_blur(
      htmlElement: HTMLElement,
      types: blur,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cancel(htmlElement: Document, types: cancel, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_cancel(
      htmlElement: Document,
      types: cancel,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_cancel(
      htmlElement: Document,
      types: cancel,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cancel(
      htmlElement: Document,
      types: cancel,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cancel(htmlElement: HTMLElement, types: cancel, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_cancel(
      htmlElement: HTMLElement,
      types: cancel,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_cancel(
      htmlElement: HTMLElement,
      types: cancel,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cancel(
      htmlElement: HTMLElement,
      types: cancel,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_canplay(htmlElement: Document, types: canplay, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_canplay(
      htmlElement: Document,
      types: canplay,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_canplay(
      htmlElement: Document,
      types: canplay,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_canplay(
      htmlElement: Document,
      types: canplay,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_canplay(htmlElement: HTMLElement, types: canplay, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_canplay(
      htmlElement: HTMLElement,
      types: canplay,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_canplay(
      htmlElement: HTMLElement,
      types: canplay,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_canplay(
      htmlElement: HTMLElement,
      types: canplay,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_canplaythrough(htmlElement: Document, types: canplaythrough, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_canplaythrough(
      htmlElement: Document,
      types: canplaythrough,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_canplaythrough(
      htmlElement: Document,
      types: canplaythrough,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_canplaythrough(
      htmlElement: Document,
      types: canplaythrough,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_canplaythrough(htmlElement: HTMLElement, types: canplaythrough, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_canplaythrough(
      htmlElement: HTMLElement,
      types: canplaythrough,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_canplaythrough(
      htmlElement: HTMLElement,
      types: canplaythrough,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_canplaythrough(
      htmlElement: HTMLElement,
      types: canplaythrough,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_change(htmlElement: Document, types: change, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_change(
      htmlElement: Document,
      types: change,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_change(
      htmlElement: Document,
      types: change,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_change(
      htmlElement: Document,
      types: change,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_change(htmlElement: HTMLElement, types: change, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_change(
      htmlElement: HTMLElement,
      types: change,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_change(
      htmlElement: HTMLElement,
      types: change,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_change(
      htmlElement: HTMLElement,
      types: change,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_click(htmlElement: Document, types: click, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_click(
      htmlElement: Document,
      types: click,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_click(
      htmlElement: Document,
      types: click,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_click(
      htmlElement: Document,
      types: click,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_click(htmlElement: HTMLElement, types: click, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_click(
      htmlElement: HTMLElement,
      types: click,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_click(
      htmlElement: HTMLElement,
      types: click,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_click(
      htmlElement: HTMLElement,
      types: click,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_close(htmlElement: Document, types: close, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_close(
      htmlElement: Document,
      types: close,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_close(
      htmlElement: Document,
      types: close,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_close(
      htmlElement: Document,
      types: close,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_close(htmlElement: HTMLElement, types: close, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_close(
      htmlElement: HTMLElement,
      types: close,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_close(
      htmlElement: HTMLElement,
      types: close,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_close(
      htmlElement: HTMLElement,
      types: close,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionend(
      htmlElement: Document,
      types: compositionend,
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_compositionend(
      htmlElement: Document,
      types: compositionend,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_compositionend(
      htmlElement: Document,
      types: compositionend,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionend(
      htmlElement: Document,
      types: compositionend,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionend(
      htmlElement: HTMLElement,
      types: compositionend,
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_compositionend(
      htmlElement: HTMLElement,
      types: compositionend,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_compositionend(
      htmlElement: HTMLElement,
      types: compositionend,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionend(
      htmlElement: HTMLElement,
      types: compositionend,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionstart(
      htmlElement: Document,
      types: compositionstart,
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_compositionstart(
      htmlElement: Document,
      types: compositionstart,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_compositionstart(
      htmlElement: Document,
      types: compositionstart,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionstart(
      htmlElement: Document,
      types: compositionstart,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionstart(
      htmlElement: HTMLElement,
      types: compositionstart,
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_compositionstart(
      htmlElement: HTMLElement,
      types: compositionstart,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_compositionstart(
      htmlElement: HTMLElement,
      types: compositionstart,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionstart(
      htmlElement: HTMLElement,
      types: compositionstart,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionupdate(
      htmlElement: Document,
      types: compositionupdate,
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_compositionupdate(
      htmlElement: Document,
      types: compositionupdate,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_compositionupdate(
      htmlElement: Document,
      types: compositionupdate,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionupdate(
      htmlElement: Document,
      types: compositionupdate,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionupdate(
      htmlElement: HTMLElement,
      types: compositionupdate,
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_compositionupdate(
      htmlElement: HTMLElement,
      types: compositionupdate,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_compositionupdate(
      htmlElement: HTMLElement,
      types: compositionupdate,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_compositionupdate(
      htmlElement: HTMLElement,
      types: compositionupdate,
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_contextmenu(htmlElement: Document, types: contextmenu, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_contextmenu(
      htmlElement: Document,
      types: contextmenu,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_contextmenu(
      htmlElement: Document,
      types: contextmenu,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_contextmenu(
      htmlElement: Document,
      types: contextmenu,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_contextmenu(htmlElement: HTMLElement, types: contextmenu, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_contextmenu(
      htmlElement: HTMLElement,
      types: contextmenu,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_contextmenu(
      htmlElement: HTMLElement,
      types: contextmenu,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_contextmenu(
      htmlElement: HTMLElement,
      types: contextmenu,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_copy(htmlElement: Document, types: copy, callback: js.Function1[/* event */ ClipboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_copy(
      htmlElement: Document,
      types: copy,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_copy(
      htmlElement: Document,
      types: copy,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_copy(
      htmlElement: Document,
      types: copy,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_copy(htmlElement: HTMLElement, types: copy, callback: js.Function1[/* event */ ClipboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_copy(
      htmlElement: HTMLElement,
      types: copy,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_copy(
      htmlElement: HTMLElement,
      types: copy,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_copy(
      htmlElement: HTMLElement,
      types: copy,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cuechange(htmlElement: Document, types: cuechange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_cuechange(
      htmlElement: Document,
      types: cuechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_cuechange(
      htmlElement: Document,
      types: cuechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cuechange(
      htmlElement: Document,
      types: cuechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cuechange(htmlElement: HTMLElement, types: cuechange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_cuechange(
      htmlElement: HTMLElement,
      types: cuechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_cuechange(
      htmlElement: HTMLElement,
      types: cuechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cuechange(
      htmlElement: HTMLElement,
      types: cuechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cut(htmlElement: Document, types: cut, callback: js.Function1[/* event */ ClipboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_cut(
      htmlElement: Document,
      types: cut,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_cut(
      htmlElement: Document,
      types: cut,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cut(
      htmlElement: Document,
      types: cut,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cut(htmlElement: HTMLElement, types: cut, callback: js.Function1[/* event */ ClipboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_cut(
      htmlElement: HTMLElement,
      types: cut,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_cut(
      htmlElement: HTMLElement,
      types: cut,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_cut(
      htmlElement: HTMLElement,
      types: cut,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dblclick(htmlElement: Document, types: dblclick, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dblclick(
      htmlElement: Document,
      types: dblclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dblclick(
      htmlElement: Document,
      types: dblclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dblclick(
      htmlElement: Document,
      types: dblclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dblclick(htmlElement: HTMLElement, types: dblclick, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dblclick(
      htmlElement: HTMLElement,
      types: dblclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dblclick(
      htmlElement: HTMLElement,
      types: dblclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dblclick(
      htmlElement: HTMLElement,
      types: dblclick,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_drag(htmlElement: Document, types: drag, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_drag(
      htmlElement: Document,
      types: drag,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_drag(
      htmlElement: Document,
      types: drag,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_drag(
      htmlElement: Document,
      types: drag,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_drag(htmlElement: HTMLElement, types: drag, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_drag(
      htmlElement: HTMLElement,
      types: drag,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_drag(
      htmlElement: HTMLElement,
      types: drag,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_drag(
      htmlElement: HTMLElement,
      types: drag,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragend(htmlElement: Document, types: dragend, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragend(
      htmlElement: Document,
      types: dragend,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragend(
      htmlElement: Document,
      types: dragend,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragend(
      htmlElement: Document,
      types: dragend,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragend(htmlElement: HTMLElement, types: dragend, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragend(
      htmlElement: HTMLElement,
      types: dragend,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragend(
      htmlElement: HTMLElement,
      types: dragend,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragend(
      htmlElement: HTMLElement,
      types: dragend,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragenter(htmlElement: Document, types: dragenter, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragenter(
      htmlElement: Document,
      types: dragenter,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragenter(
      htmlElement: Document,
      types: dragenter,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragenter(
      htmlElement: Document,
      types: dragenter,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragenter(htmlElement: HTMLElement, types: dragenter, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragenter(
      htmlElement: HTMLElement,
      types: dragenter,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragenter(
      htmlElement: HTMLElement,
      types: dragenter,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragenter(
      htmlElement: HTMLElement,
      types: dragenter,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragleave(htmlElement: Document, types: dragleave, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragleave(
      htmlElement: Document,
      types: dragleave,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragleave(
      htmlElement: Document,
      types: dragleave,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragleave(
      htmlElement: Document,
      types: dragleave,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragleave(htmlElement: HTMLElement, types: dragleave, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragleave(
      htmlElement: HTMLElement,
      types: dragleave,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragleave(
      htmlElement: HTMLElement,
      types: dragleave,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragleave(
      htmlElement: HTMLElement,
      types: dragleave,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragover(htmlElement: Document, types: dragover, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragover(
      htmlElement: Document,
      types: dragover,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragover(
      htmlElement: Document,
      types: dragover,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragover(
      htmlElement: Document,
      types: dragover,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragover(htmlElement: HTMLElement, types: dragover, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragover(
      htmlElement: HTMLElement,
      types: dragover,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragover(
      htmlElement: HTMLElement,
      types: dragover,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragover(
      htmlElement: HTMLElement,
      types: dragover,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragstart(htmlElement: Document, types: dragstart, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragstart(
      htmlElement: Document,
      types: dragstart,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragstart(
      htmlElement: Document,
      types: dragstart,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragstart(
      htmlElement: Document,
      types: dragstart,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragstart(htmlElement: HTMLElement, types: dragstart, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_dragstart(
      htmlElement: HTMLElement,
      types: dragstart,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_dragstart(
      htmlElement: HTMLElement,
      types: dragstart,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_dragstart(
      htmlElement: HTMLElement,
      types: dragstart,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_drop(htmlElement: Document, types: drop, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_drop(
      htmlElement: Document,
      types: drop,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_drop(
      htmlElement: Document,
      types: drop,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_drop(
      htmlElement: Document,
      types: drop,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_drop(htmlElement: HTMLElement, types: drop, callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_drop(
      htmlElement: HTMLElement,
      types: drop,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_drop(
      htmlElement: HTMLElement,
      types: drop,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_drop(
      htmlElement: HTMLElement,
      types: drop,
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_durationchange(htmlElement: Document, types: durationchange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_durationchange(
      htmlElement: Document,
      types: durationchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_durationchange(
      htmlElement: Document,
      types: durationchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_durationchange(
      htmlElement: Document,
      types: durationchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_durationchange(htmlElement: HTMLElement, types: durationchange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_durationchange(
      htmlElement: HTMLElement,
      types: durationchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_durationchange(
      htmlElement: HTMLElement,
      types: durationchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_durationchange(
      htmlElement: HTMLElement,
      types: durationchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_emptied(htmlElement: Document, types: emptied, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_emptied(
      htmlElement: Document,
      types: emptied,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_emptied(
      htmlElement: Document,
      types: emptied,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_emptied(
      htmlElement: Document,
      types: emptied,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_emptied(htmlElement: HTMLElement, types: emptied, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_emptied(
      htmlElement: HTMLElement,
      types: emptied,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_emptied(
      htmlElement: HTMLElement,
      types: emptied,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_emptied(
      htmlElement: HTMLElement,
      types: emptied,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_ended(htmlElement: Document, types: ended, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_ended(
      htmlElement: Document,
      types: ended,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_ended(
      htmlElement: Document,
      types: ended,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_ended(
      htmlElement: Document,
      types: ended,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_ended(htmlElement: HTMLElement, types: ended, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_ended(
      htmlElement: HTMLElement,
      types: ended,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_ended(
      htmlElement: HTMLElement,
      types: ended,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_ended(
      htmlElement: HTMLElement,
      types: ended,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_error(htmlElement: Document, types: error, callback: js.Function1[/* event */ ErrorEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_error(
      htmlElement: Document,
      types: error,
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_error(
      htmlElement: Document,
      types: error,
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_error(
      htmlElement: Document,
      types: error,
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_error(htmlElement: HTMLElement, types: error, callback: js.Function1[/* event */ ErrorEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_error(
      htmlElement: HTMLElement,
      types: error,
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_error(
      htmlElement: HTMLElement,
      types: error,
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_error(
      htmlElement: HTMLElement,
      types: error,
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focus(htmlElement: Document, types: focus, callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_focus(
      htmlElement: Document,
      types: focus,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_focus(
      htmlElement: Document,
      types: focus,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focus(
      htmlElement: Document,
      types: focus,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focus(htmlElement: HTMLElement, types: focus, callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_focus(
      htmlElement: HTMLElement,
      types: focus,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_focus(
      htmlElement: HTMLElement,
      types: focus,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focus(
      htmlElement: HTMLElement,
      types: focus,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focusin(htmlElement: Document, types: focusin, callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_focusin(
      htmlElement: Document,
      types: focusin,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_focusin(
      htmlElement: Document,
      types: focusin,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focusin(
      htmlElement: Document,
      types: focusin,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focusin(htmlElement: HTMLElement, types: focusin, callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_focusin(
      htmlElement: HTMLElement,
      types: focusin,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_focusin(
      htmlElement: HTMLElement,
      types: focusin,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focusin(
      htmlElement: HTMLElement,
      types: focusin,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focusout(htmlElement: Document, types: focusout, callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_focusout(
      htmlElement: Document,
      types: focusout,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_focusout(
      htmlElement: Document,
      types: focusout,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focusout(
      htmlElement: Document,
      types: focusout,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focusout(htmlElement: HTMLElement, types: focusout, callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_focusout(
      htmlElement: HTMLElement,
      types: focusout,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_focusout(
      htmlElement: HTMLElement,
      types: focusout,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_focusout(
      htmlElement: HTMLElement,
      types: focusout,
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_formdata(htmlElement: Document, types: formdata, callback: js.Function1[/* event */ FormDataEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_formdata(
      htmlElement: Document,
      types: formdata,
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_formdata(
      htmlElement: Document,
      types: formdata,
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_formdata(
      htmlElement: Document,
      types: formdata,
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_formdata(htmlElement: HTMLElement, types: formdata, callback: js.Function1[/* event */ FormDataEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_formdata(
      htmlElement: HTMLElement,
      types: formdata,
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_formdata(
      htmlElement: HTMLElement,
      types: formdata,
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_formdata(
      htmlElement: HTMLElement,
      types: formdata,
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_gotpointercapture(
      htmlElement: Document,
      types: gotpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_gotpointercapture(
      htmlElement: Document,
      types: gotpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_gotpointercapture(
      htmlElement: Document,
      types: gotpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_gotpointercapture(
      htmlElement: Document,
      types: gotpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_gotpointercapture(
      htmlElement: HTMLElement,
      types: gotpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_gotpointercapture(
      htmlElement: HTMLElement,
      types: gotpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_gotpointercapture(
      htmlElement: HTMLElement,
      types: gotpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_gotpointercapture(
      htmlElement: HTMLElement,
      types: gotpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_input(htmlElement: Document, types: input, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_input(
      htmlElement: Document,
      types: input,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_input(
      htmlElement: Document,
      types: input,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_input(
      htmlElement: Document,
      types: input,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_input(htmlElement: HTMLElement, types: input, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_input(
      htmlElement: HTMLElement,
      types: input,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_input(
      htmlElement: HTMLElement,
      types: input,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_input(
      htmlElement: HTMLElement,
      types: input,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_invalid(htmlElement: Document, types: invalid, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_invalid(
      htmlElement: Document,
      types: invalid,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_invalid(
      htmlElement: Document,
      types: invalid,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_invalid(
      htmlElement: Document,
      types: invalid,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_invalid(htmlElement: HTMLElement, types: invalid, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_invalid(
      htmlElement: HTMLElement,
      types: invalid,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_invalid(
      htmlElement: HTMLElement,
      types: invalid,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_invalid(
      htmlElement: HTMLElement,
      types: invalid,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keydown(htmlElement: Document, types: keydown, callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_keydown(
      htmlElement: Document,
      types: keydown,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_keydown(
      htmlElement: Document,
      types: keydown,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keydown(
      htmlElement: Document,
      types: keydown,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keydown(htmlElement: HTMLElement, types: keydown, callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_keydown(
      htmlElement: HTMLElement,
      types: keydown,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_keydown(
      htmlElement: HTMLElement,
      types: keydown,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keydown(
      htmlElement: HTMLElement,
      types: keydown,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keypress(htmlElement: Document, types: keypress, callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_keypress(
      htmlElement: Document,
      types: keypress,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_keypress(
      htmlElement: Document,
      types: keypress,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keypress(
      htmlElement: Document,
      types: keypress,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keypress(htmlElement: HTMLElement, types: keypress, callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_keypress(
      htmlElement: HTMLElement,
      types: keypress,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_keypress(
      htmlElement: HTMLElement,
      types: keypress,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keypress(
      htmlElement: HTMLElement,
      types: keypress,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keyup(htmlElement: Document, types: keyup, callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_keyup(
      htmlElement: Document,
      types: keyup,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_keyup(
      htmlElement: Document,
      types: keyup,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keyup(
      htmlElement: Document,
      types: keyup,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keyup(htmlElement: HTMLElement, types: keyup, callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_keyup(
      htmlElement: HTMLElement,
      types: keyup,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_keyup(
      htmlElement: HTMLElement,
      types: keyup,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_keyup(
      htmlElement: HTMLElement,
      types: keyup,
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_load(htmlElement: Document, types: load, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_load(
      htmlElement: Document,
      types: load,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_load(
      htmlElement: Document,
      types: load,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_load(
      htmlElement: Document,
      types: load,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_load(htmlElement: HTMLElement, types: load, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_load(
      htmlElement: HTMLElement,
      types: load,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_load(
      htmlElement: HTMLElement,
      types: load,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_load(
      htmlElement: HTMLElement,
      types: load,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadeddata(htmlElement: Document, types: loadeddata, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_loadeddata(
      htmlElement: Document,
      types: loadeddata,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_loadeddata(
      htmlElement: Document,
      types: loadeddata,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadeddata(
      htmlElement: Document,
      types: loadeddata,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadeddata(htmlElement: HTMLElement, types: loadeddata, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_loadeddata(
      htmlElement: HTMLElement,
      types: loadeddata,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_loadeddata(
      htmlElement: HTMLElement,
      types: loadeddata,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadeddata(
      htmlElement: HTMLElement,
      types: loadeddata,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadedmetadata(htmlElement: Document, types: loadedmetadata, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_loadedmetadata(
      htmlElement: Document,
      types: loadedmetadata,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_loadedmetadata(
      htmlElement: Document,
      types: loadedmetadata,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadedmetadata(
      htmlElement: Document,
      types: loadedmetadata,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadedmetadata(htmlElement: HTMLElement, types: loadedmetadata, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_loadedmetadata(
      htmlElement: HTMLElement,
      types: loadedmetadata,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_loadedmetadata(
      htmlElement: HTMLElement,
      types: loadedmetadata,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadedmetadata(
      htmlElement: HTMLElement,
      types: loadedmetadata,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadstart(htmlElement: Document, types: loadstart, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_loadstart(
      htmlElement: Document,
      types: loadstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_loadstart(
      htmlElement: Document,
      types: loadstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadstart(
      htmlElement: Document,
      types: loadstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadstart(htmlElement: HTMLElement, types: loadstart, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_loadstart(
      htmlElement: HTMLElement,
      types: loadstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_loadstart(
      htmlElement: HTMLElement,
      types: loadstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_loadstart(
      htmlElement: HTMLElement,
      types: loadstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_lostpointercapture(
      htmlElement: Document,
      types: lostpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_lostpointercapture(
      htmlElement: Document,
      types: lostpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_lostpointercapture(
      htmlElement: Document,
      types: lostpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_lostpointercapture(
      htmlElement: Document,
      types: lostpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_lostpointercapture(
      htmlElement: HTMLElement,
      types: lostpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_lostpointercapture(
      htmlElement: HTMLElement,
      types: lostpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_lostpointercapture(
      htmlElement: HTMLElement,
      types: lostpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_lostpointercapture(
      htmlElement: HTMLElement,
      types: lostpointercapture,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mousedown(htmlElement: Document, types: mousedown, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mousedown(
      htmlElement: Document,
      types: mousedown,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mousedown(
      htmlElement: Document,
      types: mousedown,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mousedown(
      htmlElement: Document,
      types: mousedown,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mousedown(htmlElement: HTMLElement, types: mousedown, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mousedown(
      htmlElement: HTMLElement,
      types: mousedown,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mousedown(
      htmlElement: HTMLElement,
      types: mousedown,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mousedown(
      htmlElement: HTMLElement,
      types: mousedown,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseenter(htmlElement: Document, types: mouseenter, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseenter(
      htmlElement: Document,
      types: mouseenter,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseenter(
      htmlElement: Document,
      types: mouseenter,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseenter(
      htmlElement: Document,
      types: mouseenter,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseenter(htmlElement: HTMLElement, types: mouseenter, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseenter(
      htmlElement: HTMLElement,
      types: mouseenter,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseenter(
      htmlElement: HTMLElement,
      types: mouseenter,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseenter(
      htmlElement: HTMLElement,
      types: mouseenter,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseleave(htmlElement: Document, types: mouseleave, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseleave(
      htmlElement: Document,
      types: mouseleave,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseleave(
      htmlElement: Document,
      types: mouseleave,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseleave(
      htmlElement: Document,
      types: mouseleave,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseleave(htmlElement: HTMLElement, types: mouseleave, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseleave(
      htmlElement: HTMLElement,
      types: mouseleave,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseleave(
      htmlElement: HTMLElement,
      types: mouseleave,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseleave(
      htmlElement: HTMLElement,
      types: mouseleave,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mousemove(htmlElement: Document, types: mousemove, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mousemove(
      htmlElement: Document,
      types: mousemove,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mousemove(
      htmlElement: Document,
      types: mousemove,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mousemove(
      htmlElement: Document,
      types: mousemove,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mousemove(htmlElement: HTMLElement, types: mousemove, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mousemove(
      htmlElement: HTMLElement,
      types: mousemove,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mousemove(
      htmlElement: HTMLElement,
      types: mousemove,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mousemove(
      htmlElement: HTMLElement,
      types: mousemove,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseout(htmlElement: Document, types: mouseout, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseout(
      htmlElement: Document,
      types: mouseout,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseout(
      htmlElement: Document,
      types: mouseout,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseout(
      htmlElement: Document,
      types: mouseout,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseout(htmlElement: HTMLElement, types: mouseout, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseout(
      htmlElement: HTMLElement,
      types: mouseout,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseout(
      htmlElement: HTMLElement,
      types: mouseout,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseout(
      htmlElement: HTMLElement,
      types: mouseout,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseover(htmlElement: Document, types: mouseover, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseover(
      htmlElement: Document,
      types: mouseover,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseover(
      htmlElement: Document,
      types: mouseover,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseover(
      htmlElement: Document,
      types: mouseover,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseover(htmlElement: HTMLElement, types: mouseover, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseover(
      htmlElement: HTMLElement,
      types: mouseover,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseover(
      htmlElement: HTMLElement,
      types: mouseover,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseover(
      htmlElement: HTMLElement,
      types: mouseover,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseup(htmlElement: Document, types: mouseup, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseup(
      htmlElement: Document,
      types: mouseup,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseup(
      htmlElement: Document,
      types: mouseup,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseup(
      htmlElement: Document,
      types: mouseup,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseup(htmlElement: HTMLElement, types: mouseup, callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_mouseup(
      htmlElement: HTMLElement,
      types: mouseup,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_mouseup(
      htmlElement: HTMLElement,
      types: mouseup,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_mouseup(
      htmlElement: HTMLElement,
      types: mouseup,
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_paste(htmlElement: Document, types: paste, callback: js.Function1[/* event */ ClipboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_paste(
      htmlElement: Document,
      types: paste,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_paste(
      htmlElement: Document,
      types: paste,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_paste(
      htmlElement: Document,
      types: paste,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_paste(htmlElement: HTMLElement, types: paste, callback: js.Function1[/* event */ ClipboardEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_paste(
      htmlElement: HTMLElement,
      types: paste,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_paste(
      htmlElement: HTMLElement,
      types: paste,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_paste(
      htmlElement: HTMLElement,
      types: paste,
      callback: js.Function1[/* event */ ClipboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pause(htmlElement: Document, types: pause, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_pause(
      htmlElement: Document,
      types: pause,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pause(
      htmlElement: Document,
      types: pause,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pause(
      htmlElement: Document,
      types: pause,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pause(htmlElement: HTMLElement, types: pause, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_pause(
      htmlElement: HTMLElement,
      types: pause,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pause(
      htmlElement: HTMLElement,
      types: pause,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pause(
      htmlElement: HTMLElement,
      types: pause,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_play(htmlElement: Document, types: play, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_play(
      htmlElement: Document,
      types: play,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_play(
      htmlElement: Document,
      types: play,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_play(
      htmlElement: Document,
      types: play,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_play(htmlElement: HTMLElement, types: play, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_play(
      htmlElement: HTMLElement,
      types: play,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_play(
      htmlElement: HTMLElement,
      types: play,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_play(
      htmlElement: HTMLElement,
      types: play,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_playing(htmlElement: Document, types: playing, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_playing(
      htmlElement: Document,
      types: playing,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_playing(
      htmlElement: Document,
      types: playing,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_playing(
      htmlElement: Document,
      types: playing,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_playing(htmlElement: HTMLElement, types: playing, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_playing(
      htmlElement: HTMLElement,
      types: playing,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_playing(
      htmlElement: HTMLElement,
      types: playing,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_playing(
      htmlElement: HTMLElement,
      types: playing,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointercancel(
      htmlElement: Document,
      types: pointercancel,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_pointercancel(
      htmlElement: Document,
      types: pointercancel,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointercancel(
      htmlElement: Document,
      types: pointercancel,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointercancel(
      htmlElement: Document,
      types: pointercancel,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointercancel(
      htmlElement: HTMLElement,
      types: pointercancel,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_pointercancel(
      htmlElement: HTMLElement,
      types: pointercancel,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointercancel(
      htmlElement: HTMLElement,
      types: pointercancel,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointercancel(
      htmlElement: HTMLElement,
      types: pointercancel,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerdown(htmlElement: Document, types: pointerdown, callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_pointerdown(
      htmlElement: Document,
      types: pointerdown,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerdown(
      htmlElement: Document,
      types: pointerdown,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerdown(
      htmlElement: Document,
      types: pointerdown,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerdown(
      htmlElement: HTMLElement,
      types: pointerdown,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_pointerdown(
      htmlElement: HTMLElement,
      types: pointerdown,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerdown(
      htmlElement: HTMLElement,
      types: pointerdown,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerdown(
      htmlElement: HTMLElement,
      types: pointerdown,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerenter(htmlElement: Document, types: pointerenter, callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_pointerenter(
      htmlElement: Document,
      types: pointerenter,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerenter(
      htmlElement: Document,
      types: pointerenter,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerenter(
      htmlElement: Document,
      types: pointerenter,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerenter(
      htmlElement: HTMLElement,
      types: pointerenter,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_pointerenter(
      htmlElement: HTMLElement,
      types: pointerenter,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerenter(
      htmlElement: HTMLElement,
      types: pointerenter,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerenter(
      htmlElement: HTMLElement,
      types: pointerenter,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerleave(htmlElement: Document, types: pointerleave, callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_pointerleave(
      htmlElement: Document,
      types: pointerleave,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerleave(
      htmlElement: Document,
      types: pointerleave,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerleave(
      htmlElement: Document,
      types: pointerleave,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerleave(
      htmlElement: HTMLElement,
      types: pointerleave,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_pointerleave(
      htmlElement: HTMLElement,
      types: pointerleave,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerleave(
      htmlElement: HTMLElement,
      types: pointerleave,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerleave(
      htmlElement: HTMLElement,
      types: pointerleave,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointermove(htmlElement: Document, types: pointermove, callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_pointermove(
      htmlElement: Document,
      types: pointermove,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointermove(
      htmlElement: Document,
      types: pointermove,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointermove(
      htmlElement: Document,
      types: pointermove,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointermove(
      htmlElement: HTMLElement,
      types: pointermove,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_pointermove(
      htmlElement: HTMLElement,
      types: pointermove,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointermove(
      htmlElement: HTMLElement,
      types: pointermove,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointermove(
      htmlElement: HTMLElement,
      types: pointermove,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerout(htmlElement: Document, types: pointerout, callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_pointerout(
      htmlElement: Document,
      types: pointerout,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerout(
      htmlElement: Document,
      types: pointerout,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerout(
      htmlElement: Document,
      types: pointerout,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerout(
      htmlElement: HTMLElement,
      types: pointerout,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_pointerout(
      htmlElement: HTMLElement,
      types: pointerout,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerout(
      htmlElement: HTMLElement,
      types: pointerout,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerout(
      htmlElement: HTMLElement,
      types: pointerout,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerover(htmlElement: Document, types: pointerover, callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_pointerover(
      htmlElement: Document,
      types: pointerover,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerover(
      htmlElement: Document,
      types: pointerover,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerover(
      htmlElement: Document,
      types: pointerover,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerover(
      htmlElement: HTMLElement,
      types: pointerover,
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_pointerover(
      htmlElement: HTMLElement,
      types: pointerover,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerover(
      htmlElement: HTMLElement,
      types: pointerover,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerover(
      htmlElement: HTMLElement,
      types: pointerover,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerup(htmlElement: Document, types: pointerup, callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_pointerup(
      htmlElement: Document,
      types: pointerup,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerup(
      htmlElement: Document,
      types: pointerup,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerup(
      htmlElement: Document,
      types: pointerup,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerup(htmlElement: HTMLElement, types: pointerup, callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_pointerup(
      htmlElement: HTMLElement,
      types: pointerup,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_pointerup(
      htmlElement: HTMLElement,
      types: pointerup,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_pointerup(
      htmlElement: HTMLElement,
      types: pointerup,
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_progress(
      htmlElement: Document,
      types: progress,
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): this.type = js.native
    @JSName("add")
    def add_progress(
      htmlElement: Document,
      types: progress,
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_progress(
      htmlElement: Document,
      types: progress,
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_progress(
      htmlElement: Document,
      types: progress,
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_progress(
      htmlElement: HTMLElement,
      types: progress,
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): this.type = js.native
    @JSName("add")
    def add_progress(
      htmlElement: HTMLElement,
      types: progress,
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_progress(
      htmlElement: HTMLElement,
      types: progress,
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_progress(
      htmlElement: HTMLElement,
      types: progress,
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_ratechange(htmlElement: Document, types: ratechange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_ratechange(
      htmlElement: Document,
      types: ratechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_ratechange(
      htmlElement: Document,
      types: ratechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_ratechange(
      htmlElement: Document,
      types: ratechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_ratechange(htmlElement: HTMLElement, types: ratechange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_ratechange(
      htmlElement: HTMLElement,
      types: ratechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_ratechange(
      htmlElement: HTMLElement,
      types: ratechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_ratechange(
      htmlElement: HTMLElement,
      types: ratechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_reset(htmlElement: Document, types: reset, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_reset(
      htmlElement: Document,
      types: reset,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_reset(
      htmlElement: Document,
      types: reset,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_reset(
      htmlElement: Document,
      types: reset,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_reset(htmlElement: HTMLElement, types: reset, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_reset(
      htmlElement: HTMLElement,
      types: reset,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_reset(
      htmlElement: HTMLElement,
      types: reset,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_reset(
      htmlElement: HTMLElement,
      types: reset,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_resize(htmlElement: Document, types: resize, callback: js.Function1[/* event */ UIEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_resize(
      htmlElement: Document,
      types: resize,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_resize(
      htmlElement: Document,
      types: resize,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_resize(
      htmlElement: Document,
      types: resize,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_resize(htmlElement: HTMLElement, types: resize, callback: js.Function1[/* event */ UIEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_resize(
      htmlElement: HTMLElement,
      types: resize,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_resize(
      htmlElement: HTMLElement,
      types: resize,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_resize(
      htmlElement: HTMLElement,
      types: resize,
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_scroll(htmlElement: Document, types: scroll, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_scroll(
      htmlElement: Document,
      types: scroll,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_scroll(
      htmlElement: Document,
      types: scroll,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_scroll(
      htmlElement: Document,
      types: scroll,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_scroll(htmlElement: HTMLElement, types: scroll, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_scroll(
      htmlElement: HTMLElement,
      types: scroll,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_scroll(
      htmlElement: HTMLElement,
      types: scroll,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_scroll(
      htmlElement: HTMLElement,
      types: scroll,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_securitypolicyviolation(
      htmlElement: Document,
      types: securitypolicyviolation,
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_securitypolicyviolation(
      htmlElement: Document,
      types: securitypolicyviolation,
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_securitypolicyviolation(
      htmlElement: Document,
      types: securitypolicyviolation,
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_securitypolicyviolation(
      htmlElement: Document,
      types: securitypolicyviolation,
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_securitypolicyviolation(
      htmlElement: HTMLElement,
      types: securitypolicyviolation,
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_securitypolicyviolation(
      htmlElement: HTMLElement,
      types: securitypolicyviolation,
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_securitypolicyviolation(
      htmlElement: HTMLElement,
      types: securitypolicyviolation,
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_securitypolicyviolation(
      htmlElement: HTMLElement,
      types: securitypolicyviolation,
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_seeked(htmlElement: Document, types: seeked, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_seeked(
      htmlElement: Document,
      types: seeked,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_seeked(
      htmlElement: Document,
      types: seeked,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_seeked(
      htmlElement: Document,
      types: seeked,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_seeked(htmlElement: HTMLElement, types: seeked, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_seeked(
      htmlElement: HTMLElement,
      types: seeked,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_seeked(
      htmlElement: HTMLElement,
      types: seeked,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_seeked(
      htmlElement: HTMLElement,
      types: seeked,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_seeking(htmlElement: Document, types: seeking, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_seeking(
      htmlElement: Document,
      types: seeking,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_seeking(
      htmlElement: Document,
      types: seeking,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_seeking(
      htmlElement: Document,
      types: seeking,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_seeking(htmlElement: HTMLElement, types: seeking, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_seeking(
      htmlElement: HTMLElement,
      types: seeking,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_seeking(
      htmlElement: HTMLElement,
      types: seeking,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_seeking(
      htmlElement: HTMLElement,
      types: seeking,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_select(htmlElement: Document, types: select, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_select(
      htmlElement: Document,
      types: select,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_select(
      htmlElement: Document,
      types: select,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_select(
      htmlElement: Document,
      types: select,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_select(htmlElement: HTMLElement, types: select, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_select(
      htmlElement: HTMLElement,
      types: select,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_select(
      htmlElement: HTMLElement,
      types: select,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_select(
      htmlElement: HTMLElement,
      types: select,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_selectionchange(htmlElement: Document, types: selectionchange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_selectionchange(
      htmlElement: Document,
      types: selectionchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_selectionchange(
      htmlElement: Document,
      types: selectionchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_selectionchange(
      htmlElement: Document,
      types: selectionchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_selectionchange(htmlElement: HTMLElement, types: selectionchange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_selectionchange(
      htmlElement: HTMLElement,
      types: selectionchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_selectionchange(
      htmlElement: HTMLElement,
      types: selectionchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_selectionchange(
      htmlElement: HTMLElement,
      types: selectionchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_selectstart(htmlElement: Document, types: selectstart, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_selectstart(
      htmlElement: Document,
      types: selectstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_selectstart(
      htmlElement: Document,
      types: selectstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_selectstart(
      htmlElement: Document,
      types: selectstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_selectstart(htmlElement: HTMLElement, types: selectstart, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_selectstart(
      htmlElement: HTMLElement,
      types: selectstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_selectstart(
      htmlElement: HTMLElement,
      types: selectstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_selectstart(
      htmlElement: HTMLElement,
      types: selectstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_slotchange(htmlElement: Document, types: slotchange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_slotchange(
      htmlElement: Document,
      types: slotchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_slotchange(
      htmlElement: Document,
      types: slotchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_slotchange(
      htmlElement: Document,
      types: slotchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_slotchange(htmlElement: HTMLElement, types: slotchange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_slotchange(
      htmlElement: HTMLElement,
      types: slotchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_slotchange(
      htmlElement: HTMLElement,
      types: slotchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_slotchange(
      htmlElement: HTMLElement,
      types: slotchange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_stalled(htmlElement: Document, types: stalled, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_stalled(
      htmlElement: Document,
      types: stalled,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_stalled(
      htmlElement: Document,
      types: stalled,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_stalled(
      htmlElement: Document,
      types: stalled,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_stalled(htmlElement: HTMLElement, types: stalled, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_stalled(
      htmlElement: HTMLElement,
      types: stalled,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_stalled(
      htmlElement: HTMLElement,
      types: stalled,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_stalled(
      htmlElement: HTMLElement,
      types: stalled,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_submit(htmlElement: Document, types: submit, callback: js.Function1[/* event */ SubmitEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_submit(
      htmlElement: Document,
      types: submit,
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_submit(
      htmlElement: Document,
      types: submit,
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_submit(
      htmlElement: Document,
      types: submit,
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_submit(htmlElement: HTMLElement, types: submit, callback: js.Function1[/* event */ SubmitEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_submit(
      htmlElement: HTMLElement,
      types: submit,
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_submit(
      htmlElement: HTMLElement,
      types: submit,
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_submit(
      htmlElement: HTMLElement,
      types: submit,
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_suspend(htmlElement: Document, types: suspend, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_suspend(
      htmlElement: Document,
      types: suspend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_suspend(
      htmlElement: Document,
      types: suspend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_suspend(
      htmlElement: Document,
      types: suspend,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_suspend(htmlElement: HTMLElement, types: suspend, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_suspend(
      htmlElement: HTMLElement,
      types: suspend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_suspend(
      htmlElement: HTMLElement,
      types: suspend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_suspend(
      htmlElement: HTMLElement,
      types: suspend,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_timeupdate(htmlElement: Document, types: timeupdate, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_timeupdate(
      htmlElement: Document,
      types: timeupdate,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_timeupdate(
      htmlElement: Document,
      types: timeupdate,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_timeupdate(
      htmlElement: Document,
      types: timeupdate,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_timeupdate(htmlElement: HTMLElement, types: timeupdate, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_timeupdate(
      htmlElement: HTMLElement,
      types: timeupdate,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_timeupdate(
      htmlElement: HTMLElement,
      types: timeupdate,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_timeupdate(
      htmlElement: HTMLElement,
      types: timeupdate,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_toggle(htmlElement: Document, types: toggle, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_toggle(
      htmlElement: Document,
      types: toggle,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_toggle(
      htmlElement: Document,
      types: toggle,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_toggle(
      htmlElement: Document,
      types: toggle,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_toggle(htmlElement: HTMLElement, types: toggle, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_toggle(
      htmlElement: HTMLElement,
      types: toggle,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_toggle(
      htmlElement: HTMLElement,
      types: toggle,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_toggle(
      htmlElement: HTMLElement,
      types: toggle,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchcancel(htmlElement: Document, types: touchcancel, callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_touchcancel(
      htmlElement: Document,
      types: touchcancel,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_touchcancel(
      htmlElement: Document,
      types: touchcancel,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchcancel(
      htmlElement: Document,
      types: touchcancel,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchcancel(htmlElement: HTMLElement, types: touchcancel, callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_touchcancel(
      htmlElement: HTMLElement,
      types: touchcancel,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_touchcancel(
      htmlElement: HTMLElement,
      types: touchcancel,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchcancel(
      htmlElement: HTMLElement,
      types: touchcancel,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchend(htmlElement: Document, types: touchend, callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_touchend(
      htmlElement: Document,
      types: touchend,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_touchend(
      htmlElement: Document,
      types: touchend,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchend(
      htmlElement: Document,
      types: touchend,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchend(htmlElement: HTMLElement, types: touchend, callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_touchend(
      htmlElement: HTMLElement,
      types: touchend,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_touchend(
      htmlElement: HTMLElement,
      types: touchend,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchend(
      htmlElement: HTMLElement,
      types: touchend,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchmove(htmlElement: Document, types: touchmove, callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_touchmove(
      htmlElement: Document,
      types: touchmove,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_touchmove(
      htmlElement: Document,
      types: touchmove,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchmove(
      htmlElement: Document,
      types: touchmove,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchmove(htmlElement: HTMLElement, types: touchmove, callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_touchmove(
      htmlElement: HTMLElement,
      types: touchmove,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_touchmove(
      htmlElement: HTMLElement,
      types: touchmove,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchmove(
      htmlElement: HTMLElement,
      types: touchmove,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchstart(htmlElement: Document, types: touchstart, callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_touchstart(
      htmlElement: Document,
      types: touchstart,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_touchstart(
      htmlElement: Document,
      types: touchstart,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchstart(
      htmlElement: Document,
      types: touchstart,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchstart(htmlElement: HTMLElement, types: touchstart, callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_touchstart(
      htmlElement: HTMLElement,
      types: touchstart,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_touchstart(
      htmlElement: HTMLElement,
      types: touchstart,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_touchstart(
      htmlElement: HTMLElement,
      types: touchstart,
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitioncancel(
      htmlElement: Document,
      types: transitioncancel,
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_transitioncancel(
      htmlElement: Document,
      types: transitioncancel,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_transitioncancel(
      htmlElement: Document,
      types: transitioncancel,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitioncancel(
      htmlElement: Document,
      types: transitioncancel,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitioncancel(
      htmlElement: HTMLElement,
      types: transitioncancel,
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_transitioncancel(
      htmlElement: HTMLElement,
      types: transitioncancel,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_transitioncancel(
      htmlElement: HTMLElement,
      types: transitioncancel,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitioncancel(
      htmlElement: HTMLElement,
      types: transitioncancel,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionend(
      htmlElement: Document,
      types: transitionend,
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_transitionend(
      htmlElement: Document,
      types: transitionend,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_transitionend(
      htmlElement: Document,
      types: transitionend,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionend(
      htmlElement: Document,
      types: transitionend,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionend(
      htmlElement: HTMLElement,
      types: transitionend,
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_transitionend(
      htmlElement: HTMLElement,
      types: transitionend,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_transitionend(
      htmlElement: HTMLElement,
      types: transitionend,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionend(
      htmlElement: HTMLElement,
      types: transitionend,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionrun(
      htmlElement: Document,
      types: transitionrun,
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_transitionrun(
      htmlElement: Document,
      types: transitionrun,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_transitionrun(
      htmlElement: Document,
      types: transitionrun,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionrun(
      htmlElement: Document,
      types: transitionrun,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionrun(
      htmlElement: HTMLElement,
      types: transitionrun,
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_transitionrun(
      htmlElement: HTMLElement,
      types: transitionrun,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_transitionrun(
      htmlElement: HTMLElement,
      types: transitionrun,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionrun(
      htmlElement: HTMLElement,
      types: transitionrun,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionstart(
      htmlElement: Document,
      types: transitionstart,
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_transitionstart(
      htmlElement: Document,
      types: transitionstart,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_transitionstart(
      htmlElement: Document,
      types: transitionstart,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionstart(
      htmlElement: Document,
      types: transitionstart,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionstart(
      htmlElement: HTMLElement,
      types: transitionstart,
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_transitionstart(
      htmlElement: HTMLElement,
      types: transitionstart,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_transitionstart(
      htmlElement: HTMLElement,
      types: transitionstart,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_transitionstart(
      htmlElement: HTMLElement,
      types: transitionstart,
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_volumechange(htmlElement: Document, types: volumechange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_volumechange(
      htmlElement: Document,
      types: volumechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_volumechange(
      htmlElement: Document,
      types: volumechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_volumechange(
      htmlElement: Document,
      types: volumechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_volumechange(htmlElement: HTMLElement, types: volumechange, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_volumechange(
      htmlElement: HTMLElement,
      types: volumechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_volumechange(
      htmlElement: HTMLElement,
      types: volumechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_volumechange(
      htmlElement: HTMLElement,
      types: volumechange,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_waiting(htmlElement: Document, types: waiting, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_waiting(
      htmlElement: Document,
      types: waiting,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_waiting(
      htmlElement: Document,
      types: waiting,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_waiting(
      htmlElement: Document,
      types: waiting,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_waiting(htmlElement: HTMLElement, types: waiting, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_waiting(
      htmlElement: HTMLElement,
      types: waiting,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_waiting(
      htmlElement: HTMLElement,
      types: waiting,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_waiting(
      htmlElement: HTMLElement,
      types: waiting,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationend(htmlElement: Document, types: webkitanimationend, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_webkitanimationend(
      htmlElement: Document,
      types: webkitanimationend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationend(
      htmlElement: Document,
      types: webkitanimationend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationend(
      htmlElement: Document,
      types: webkitanimationend,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationend(
      htmlElement: HTMLElement,
      types: webkitanimationend,
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationend(
      htmlElement: HTMLElement,
      types: webkitanimationend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationend(
      htmlElement: HTMLElement,
      types: webkitanimationend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationend(
      htmlElement: HTMLElement,
      types: webkitanimationend,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationiteration(
      htmlElement: Document,
      types: webkitanimationiteration,
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationiteration(
      htmlElement: Document,
      types: webkitanimationiteration,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationiteration(
      htmlElement: Document,
      types: webkitanimationiteration,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationiteration(
      htmlElement: Document,
      types: webkitanimationiteration,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationiteration(
      htmlElement: HTMLElement,
      types: webkitanimationiteration,
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationiteration(
      htmlElement: HTMLElement,
      types: webkitanimationiteration,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationiteration(
      htmlElement: HTMLElement,
      types: webkitanimationiteration,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationiteration(
      htmlElement: HTMLElement,
      types: webkitanimationiteration,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationstart(
      htmlElement: Document,
      types: webkitanimationstart,
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationstart(
      htmlElement: Document,
      types: webkitanimationstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationstart(
      htmlElement: Document,
      types: webkitanimationstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationstart(
      htmlElement: Document,
      types: webkitanimationstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationstart(
      htmlElement: HTMLElement,
      types: webkitanimationstart,
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationstart(
      htmlElement: HTMLElement,
      types: webkitanimationstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationstart(
      htmlElement: HTMLElement,
      types: webkitanimationstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkitanimationstart(
      htmlElement: HTMLElement,
      types: webkitanimationstart,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkittransitionend(htmlElement: Document, types: webkittransitionend, callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    def add_webkittransitionend(
      htmlElement: Document,
      types: webkittransitionend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_webkittransitionend(
      htmlElement: Document,
      types: webkittransitionend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkittransitionend(
      htmlElement: Document,
      types: webkittransitionend,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkittransitionend(
      htmlElement: HTMLElement,
      types: webkittransitionend,
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    def add_webkittransitionend(
      htmlElement: HTMLElement,
      types: webkittransitionend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_webkittransitionend(
      htmlElement: HTMLElement,
      types: webkittransitionend,
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_webkittransitionend(
      htmlElement: HTMLElement,
      types: webkittransitionend,
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_wheel(htmlElement: Document, types: wheel, callback: js.Function1[/* event */ WheelEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_wheel(
      htmlElement: Document,
      types: wheel,
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_wheel(
      htmlElement: Document,
      types: wheel,
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_wheel(
      htmlElement: Document,
      types: wheel,
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_wheel(htmlElement: HTMLElement, types: wheel, callback: js.Function1[/* event */ WheelEvent, Unit]): this.type = js.native
    @JSName("add")
    def add_wheel(
      htmlElement: HTMLElement,
      types: wheel,
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    def add_wheel(
      htmlElement: HTMLElement,
      types: wheel,
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    def add_wheel(
      htmlElement: HTMLElement,
      types: wheel,
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    
    def group(htmlElement: Document): Group = js.native
    def group(htmlElement: Document, capture: Boolean): Group = js.native
    def group(htmlElement: HTMLElement): Group = js.native
    def group(htmlElement: HTMLElement, capture: Boolean): Group = js.native
    
    def remove(htmlElement: Document, types: String, callback: String): this.type = js.native
    def remove(htmlElement: Document, types: String, callback: String, context: js.Object): this.type = js.native
    def remove(htmlElement: Document, types: String, callback: String, context: js.Object, capture: Boolean): this.type = js.native
    def remove(htmlElement: Document, types: String, callback: String, context: Unit, capture: Boolean): this.type = js.native
    def remove(htmlElement: Document, types: String, callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    def remove(
      htmlElement: Document,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      htmlElement: Document,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def remove(
      htmlElement: Document,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    def remove(htmlElement: Document, types: js.Array[String], callback: String): this.type = js.native
    def remove(htmlElement: Document, types: js.Array[String], callback: String, context: js.Object): this.type = js.native
    def remove(
      htmlElement: Document,
      types: js.Array[String],
      callback: String,
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def remove(htmlElement: Document, types: js.Array[String], callback: String, context: Unit, capture: Boolean): this.type = js.native
    def remove(htmlElement: Document, types: js.Array[String], callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    def remove(
      htmlElement: Document,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      htmlElement: Document,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def remove(
      htmlElement: Document,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    def remove(htmlElement: HTMLElement, types: String, callback: String): this.type = js.native
    def remove(htmlElement: HTMLElement, types: String, callback: String, context: js.Object): this.type = js.native
    def remove(htmlElement: HTMLElement, types: String, callback: String, context: js.Object, capture: Boolean): this.type = js.native
    def remove(htmlElement: HTMLElement, types: String, callback: String, context: Unit, capture: Boolean): this.type = js.native
    def remove(htmlElement: HTMLElement, types: String, callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    def remove(
      htmlElement: HTMLElement,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      htmlElement: HTMLElement,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def remove(
      htmlElement: HTMLElement,
      types: String,
      callback: js.Function1[/* event */ Any, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    def remove(htmlElement: HTMLElement, types: js.Array[String], callback: String): this.type = js.native
    def remove(htmlElement: HTMLElement, types: js.Array[String], callback: String, context: js.Object): this.type = js.native
    def remove(
      htmlElement: HTMLElement,
      types: js.Array[String],
      callback: String,
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def remove(
      htmlElement: HTMLElement,
      types: js.Array[String],
      callback: String,
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    def remove(htmlElement: HTMLElement, types: js.Array[String], callback: js.Function1[/* event */ Any, Unit]): this.type = js.native
    def remove(
      htmlElement: HTMLElement,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      htmlElement: HTMLElement,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    def remove(
      htmlElement: HTMLElement,
      types: js.Array[String],
      callback: js.Function1[/* event */ Any, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
  }
}
