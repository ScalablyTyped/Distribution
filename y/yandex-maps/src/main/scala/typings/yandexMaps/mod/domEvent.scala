package typings.yandexMaps.mod

import typings.std.AnimationEvent
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domEvent {
  
  @js.native
  trait manager extends StObject {
    
    @JSName("add")
    @scala.annotation.targetName("add_blur")
    def add(htmlElement: Document, types: "blur", callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragstart")
    def add(htmlElement: Document, types: "dragstart", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_change")
    def add(htmlElement: Document, types: "change", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionstart")
    def add(
      htmlElement: Document,
      types: "compositionstart",
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionend")
    def add(
      htmlElement: Document,
      types: "transitionend",
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cuechange")
    def add(htmlElement: Document, types: "cuechange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationstart")
    def add(
      htmlElement: Document,
      types: "animationstart",
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragover")
    def add(htmlElement: Document, types: "dragover", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cancel")
    def add(htmlElement: Document, types: "cancel", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationend")
    def add(
      htmlElement: Document,
      types: "animationend",
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_securitypolicyviolation")
    def add(
      htmlElement: Document,
      types: "securitypolicyviolation",
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_invalid")
    def add(htmlElement: Document, types: "invalid", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_contextmenu")
    def add(htmlElement: Document, types: "contextmenu", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_formdata")
    def add(htmlElement: Document, types: "formdata", callback: js.Function1[/* event */ FormDataEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationstart")
    def add(
      htmlElement: Document,
      types: "webkitanimationstart",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionend")
    def add(
      htmlElement: Document,
      types: "compositionend",
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerout")
    def add(htmlElement: Document, types: "pointerout", callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_play")
    def add(htmlElement: Document, types: "play", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadeddata")
    def add(htmlElement: Document, types: "loadeddata", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_toggle")
    def add(htmlElement: Document, types: "toggle", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseleave")
    def add(htmlElement: Document, types: "mouseleave", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitioncancel")
    def add(
      htmlElement: Document,
      types: "transitioncancel",
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseout")
    def add(htmlElement: Document, types: "mouseout", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousedown")
    def add(htmlElement: Document, types: "mousedown", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationend")
    def add(
      htmlElement: Document,
      types: "webkitanimationend",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drag")
    def add(htmlElement: Document, types: "drag", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_select")
    def add(htmlElement: Document, types: "select", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pause")
    def add(htmlElement: Document, types: "pause", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drop")
    def add(htmlElement: Document, types: "drop", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplaythrough")
    def add(htmlElement: Document, types: "canplaythrough", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_scroll")
    def add(htmlElement: Document, types: "scroll", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_error")
    def add(htmlElement: Document, types: "error", callback: js.Function1[/* event */ ErrorEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragend")
    def add(htmlElement: Document, types: "dragend", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchstart")
    def add(htmlElement: Document, types: "touchstart", callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusout")
    def add(htmlElement: Document, types: "focusout", callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_waiting")
    def add(htmlElement: Document, types: "waiting", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_emptied")
    def add(htmlElement: Document, types: "emptied", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_auxclick")
    def add(htmlElement: Document, types: "auxclick", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerdown")
    def add(
      htmlElement: Document,
      types: "pointerdown",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerover")
    def add(
      htmlElement: Document,
      types: "pointerover",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerup")
    def add(htmlElement: Document, types: "pointerup", callback: js.Function1[/* event */ PointerEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_click")
    def add(htmlElement: Document, types: "click", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_gotpointercapture")
    def add(
      htmlElement: Document,
      types: "gotpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_durationchange")
    def add(htmlElement: Document, types: "durationchange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationiteration")
    def add(
      htmlElement: Document,
      types: "animationiteration",
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_playing")
    def add(htmlElement: Document, types: "playing", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keypress")
    def add(htmlElement: Document, types: "keypress", callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseover")
    def add(htmlElement: Document, types: "mouseover", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_input")
    def add(htmlElement: Document, types: "input", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectstart")
    def add(htmlElement: Document, types: "selectstart", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationcancel")
    def add(
      htmlElement: Document,
      types: "animationcancel",
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keyup")
    def add(htmlElement: Document, types: "keyup", callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ended")
    def add(htmlElement: Document, types: "ended", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_timeupdate")
    def add(htmlElement: Document, types: "timeupdate", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ratechange")
    def add(htmlElement: Document, types: "ratechange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousemove")
    def add(htmlElement: Document, types: "mousemove", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_close")
    def add(htmlElement: Document, types: "close", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseup")
    def add(htmlElement: Document, types: "mouseup", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionrun")
    def add(
      htmlElement: Document,
      types: "transitionrun",
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_progress")
    def add(
      htmlElement: Document,
      types: "progress",
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointermove")
    def add(
      htmlElement: Document,
      types: "pointermove",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeking")
    def add(htmlElement: Document, types: "seeking", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkittransitionend")
    def add(
      htmlElement: Document,
      types: "webkittransitionend",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerleave")
    def add(
      htmlElement: Document,
      types: "pointerleave",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragenter")
    def add(htmlElement: Document, types: "dragenter", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionupdate")
    def add(
      htmlElement: Document,
      types: "compositionupdate",
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_lostpointercapture")
    def add(
      htmlElement: Document,
      types: "lostpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchend")
    def add(htmlElement: Document, types: "touchend", callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadstart")
    def add(htmlElement: Document, types: "loadstart", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_slotchange")
    def add(htmlElement: Document, types: "slotchange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeked")
    def add(htmlElement: Document, types: "seeked", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragleave")
    def add(htmlElement: Document, types: "dragleave", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_stalled")
    def add(htmlElement: Document, types: "stalled", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_suspend")
    def add(htmlElement: Document, types: "suspend", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keydown")
    def add(htmlElement: Document, types: "keydown", callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointercancel")
    def add(
      htmlElement: Document,
      types: "pointercancel",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionstart")
    def add(
      htmlElement: Document,
      types: "transitionstart",
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_beforeinput")
    def add(htmlElement: Document, types: "beforeinput", callback: js.Function1[/* event */ InputEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focus")
    def add(htmlElement: Document, types: "focus", callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseenter")
    def add(htmlElement: Document, types: "mouseenter", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerenter")
    def add(
      htmlElement: Document,
      types: "pointerenter",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_abort")
    def add(htmlElement: Document, types: "abort", callback: js.Function1[/* event */ UIEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadedmetadata")
    def add(htmlElement: Document, types: "loadedmetadata", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectionchange")
    def add(htmlElement: Document, types: "selectionchange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_resize")
    def add(htmlElement: Document, types: "resize", callback: js.Function1[/* event */ UIEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_submit")
    def add(htmlElement: Document, types: "submit", callback: js.Function1[/* event */ SubmitEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchmove")
    def add(htmlElement: Document, types: "touchmove", callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dblclick")
    def add(htmlElement: Document, types: "dblclick", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_load")
    def add(htmlElement: Document, types: "load", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplay")
    def add(htmlElement: Document, types: "canplay", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchcancel")
    def add(htmlElement: Document, types: "touchcancel", callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_wheel")
    def add(htmlElement: Document, types: "wheel", callback: js.Function1[/* event */ WheelEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_volumechange")
    def add(htmlElement: Document, types: "volumechange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusin")
    def add(htmlElement: Document, types: "focusin", callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationiteration")
    def add(
      htmlElement: Document,
      types: "webkitanimationiteration",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_reset")
    def add(htmlElement: Document, types: "reset", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerenter")
    def add(
      htmlElement: Document,
      types: "pointerenter",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_play")
    def add(
      htmlElement: Document,
      types: "play",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusin")
    def add(
      htmlElement: Document,
      types: "focusin",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkittransitionend")
    def add(
      htmlElement: Document,
      types: "webkittransitionend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_resize")
    def add(
      htmlElement: Document,
      types: "resize",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchmove")
    def add(
      htmlElement: Document,
      types: "touchmove",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_playing")
    def add(
      htmlElement: Document,
      types: "playing",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_timeupdate")
    def add(
      htmlElement: Document,
      types: "timeupdate",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_click")
    def add(
      htmlElement: Document,
      types: "click",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ended")
    def add(
      htmlElement: Document,
      types: "ended",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusout")
    def add(
      htmlElement: Document,
      types: "focusout",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_change")
    def add(
      htmlElement: Document,
      types: "change",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointercancel")
    def add(
      htmlElement: Document,
      types: "pointercancel",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cancel")
    def add(
      htmlElement: Document,
      types: "cancel",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pause")
    def add(
      htmlElement: Document,
      types: "pause",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_lostpointercapture")
    def add(
      htmlElement: Document,
      types: "lostpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationstart")
    def add(
      htmlElement: Document,
      types: "animationstart",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerup")
    def add(
      htmlElement: Document,
      types: "pointerup",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keydown")
    def add(
      htmlElement: Document,
      types: "keydown",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drop")
    def add(
      htmlElement: Document,
      types: "drop",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionend")
    def add(
      htmlElement: Document,
      types: "compositionend",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_progress")
    def add(
      htmlElement: Document,
      types: "progress",
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_abort")
    def add(
      htmlElement: Document,
      types: "abort",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_blur")
    def add(
      htmlElement: Document,
      types: "blur",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragenter")
    def add(
      htmlElement: Document,
      types: "dragenter",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseenter")
    def add(
      htmlElement: Document,
      types: "mouseenter",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_stalled")
    def add(
      htmlElement: Document,
      types: "stalled",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseleave")
    def add(
      htmlElement: Document,
      types: "mouseleave",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousedown")
    def add(
      htmlElement: Document,
      types: "mousedown",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_scroll")
    def add(
      htmlElement: Document,
      types: "scroll",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplay")
    def add(
      htmlElement: Document,
      types: "canplay",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadstart")
    def add(
      htmlElement: Document,
      types: "loadstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drag")
    def add(
      htmlElement: Document,
      types: "drag",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_durationchange")
    def add(
      htmlElement: Document,
      types: "durationchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationiteration")
    def add(
      htmlElement: Document,
      types: "webkitanimationiteration",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationend")
    def add(
      htmlElement: Document,
      types: "animationend",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseout")
    def add(
      htmlElement: Document,
      types: "mouseout",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focus")
    def add(
      htmlElement: Document,
      types: "focus",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionstart")
    def add(
      htmlElement: Document,
      types: "transitionstart",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_emptied")
    def add(
      htmlElement: Document,
      types: "emptied",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_beforeinput")
    def add(
      htmlElement: Document,
      types: "beforeinput",
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragstart")
    def add(
      htmlElement: Document,
      types: "dragstart",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_load")
    def add(
      htmlElement: Document,
      types: "load",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_input")
    def add(
      htmlElement: Document,
      types: "input",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_waiting")
    def add(
      htmlElement: Document,
      types: "waiting",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_securitypolicyviolation")
    def add(
      htmlElement: Document,
      types: "securitypolicyviolation",
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_contextmenu")
    def add(
      htmlElement: Document,
      types: "contextmenu",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchend")
    def add(
      htmlElement: Document,
      types: "touchend",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectstart")
    def add(
      htmlElement: Document,
      types: "selectstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_reset")
    def add(
      htmlElement: Document,
      types: "reset",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerover")
    def add(
      htmlElement: Document,
      types: "pointerover",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_submit")
    def add(
      htmlElement: Document,
      types: "submit",
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_formdata")
    def add(
      htmlElement: Document,
      types: "formdata",
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_suspend")
    def add(
      htmlElement: Document,
      types: "suspend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionend")
    def add(
      htmlElement: Document,
      types: "transitionend",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitioncancel")
    def add(
      htmlElement: Document,
      types: "transitioncancel",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keyup")
    def add(
      htmlElement: Document,
      types: "keyup",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplaythrough")
    def add(
      htmlElement: Document,
      types: "canplaythrough",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionrun")
    def add(
      htmlElement: Document,
      types: "transitionrun",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragover")
    def add(
      htmlElement: Document,
      types: "dragover",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragend")
    def add(
      htmlElement: Document,
      types: "dragend",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationcancel")
    def add(
      htmlElement: Document,
      types: "animationcancel",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionstart")
    def add(
      htmlElement: Document,
      types: "compositionstart",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeked")
    def add(
      htmlElement: Document,
      types: "seeked",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_wheel")
    def add(
      htmlElement: Document,
      types: "wheel",
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerout")
    def add(
      htmlElement: Document,
      types: "pointerout",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_gotpointercapture")
    def add(
      htmlElement: Document,
      types: "gotpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_invalid")
    def add(
      htmlElement: Document,
      types: "invalid",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_error")
    def add(
      htmlElement: Document,
      types: "error",
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cuechange")
    def add(
      htmlElement: Document,
      types: "cuechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_auxclick")
    def add(
      htmlElement: Document,
      types: "auxclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keypress")
    def add(
      htmlElement: Document,
      types: "keypress",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationend")
    def add(
      htmlElement: Document,
      types: "webkitanimationend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchstart")
    def add(
      htmlElement: Document,
      types: "touchstart",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousemove")
    def add(
      htmlElement: Document,
      types: "mousemove",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dblclick")
    def add(
      htmlElement: Document,
      types: "dblclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseover")
    def add(
      htmlElement: Document,
      types: "mouseover",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerleave")
    def add(
      htmlElement: Document,
      types: "pointerleave",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ratechange")
    def add(
      htmlElement: Document,
      types: "ratechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationiteration")
    def add(
      htmlElement: Document,
      types: "animationiteration",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_toggle")
    def add(
      htmlElement: Document,
      types: "toggle",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeking")
    def add(
      htmlElement: Document,
      types: "seeking",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_volumechange")
    def add(
      htmlElement: Document,
      types: "volumechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationstart")
    def add(
      htmlElement: Document,
      types: "webkitanimationstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_select")
    def add(
      htmlElement: Document,
      types: "select",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionupdate")
    def add(
      htmlElement: Document,
      types: "compositionupdate",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchcancel")
    def add(
      htmlElement: Document,
      types: "touchcancel",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadedmetadata")
    def add(
      htmlElement: Document,
      types: "loadedmetadata",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragleave")
    def add(
      htmlElement: Document,
      types: "dragleave",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointermove")
    def add(
      htmlElement: Document,
      types: "pointermove",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_close")
    def add(
      htmlElement: Document,
      types: "close",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerdown")
    def add(
      htmlElement: Document,
      types: "pointerdown",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseup")
    def add(
      htmlElement: Document,
      types: "mouseup",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_slotchange")
    def add(
      htmlElement: Document,
      types: "slotchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectionchange")
    def add(
      htmlElement: Document,
      types: "selectionchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadeddata")
    def add(
      htmlElement: Document,
      types: "loadeddata",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cancel")
    def add(
      htmlElement: Document,
      types: "cancel",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_auxclick")
    def add(
      htmlElement: Document,
      types: "auxclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_error")
    def add(
      htmlElement: Document,
      types: "error",
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadeddata")
    def add(
      htmlElement: Document,
      types: "loadeddata",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseenter")
    def add(
      htmlElement: Document,
      types: "mouseenter",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_playing")
    def add(
      htmlElement: Document,
      types: "playing",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerout")
    def add(
      htmlElement: Document,
      types: "pointerout",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkittransitionend")
    def add(
      htmlElement: Document,
      types: "webkittransitionend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragover")
    def add(
      htmlElement: Document,
      types: "dragover",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dblclick")
    def add(
      htmlElement: Document,
      types: "dblclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_volumechange")
    def add(
      htmlElement: Document,
      types: "volumechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointercancel")
    def add(
      htmlElement: Document,
      types: "pointercancel",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationend")
    def add(
      htmlElement: Document,
      types: "webkitanimationend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionend")
    def add(
      htmlElement: Document,
      types: "transitionend",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_click")
    def add(
      htmlElement: Document,
      types: "click",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_contextmenu")
    def add(
      htmlElement: Document,
      types: "contextmenu",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchend")
    def add(
      htmlElement: Document,
      types: "touchend",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_reset")
    def add(
      htmlElement: Document,
      types: "reset",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_input")
    def add(
      htmlElement: Document,
      types: "input",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchstart")
    def add(
      htmlElement: Document,
      types: "touchstart",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drag")
    def add(
      htmlElement: Document,
      types: "drag",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionstart")
    def add(
      htmlElement: Document,
      types: "compositionstart",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseout")
    def add(
      htmlElement: Document,
      types: "mouseout",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadedmetadata")
    def add(
      htmlElement: Document,
      types: "loadedmetadata",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointermove")
    def add(
      htmlElement: Document,
      types: "pointermove",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_beforeinput")
    def add(
      htmlElement: Document,
      types: "beforeinput",
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragleave")
    def add(
      htmlElement: Document,
      types: "dragleave",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionrun")
    def add(
      htmlElement: Document,
      types: "transitionrun",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_wheel")
    def add(
      htmlElement: Document,
      types: "wheel",
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pause")
    def add(
      htmlElement: Document,
      types: "pause",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_scroll")
    def add(
      htmlElement: Document,
      types: "scroll",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationiteration")
    def add(
      htmlElement: Document,
      types: "webkitanimationiteration",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionend")
    def add(
      htmlElement: Document,
      types: "compositionend",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_stalled")
    def add(
      htmlElement: Document,
      types: "stalled",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusin")
    def add(
      htmlElement: Document,
      types: "focusin",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ratechange")
    def add(
      htmlElement: Document,
      types: "ratechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_blur")
    def add(
      htmlElement: Document,
      types: "blur",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_gotpointercapture")
    def add(
      htmlElement: Document,
      types: "gotpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keypress")
    def add(
      htmlElement: Document,
      types: "keypress",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerup")
    def add(
      htmlElement: Document,
      types: "pointerup",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeking")
    def add(
      htmlElement: Document,
      types: "seeking",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationend")
    def add(
      htmlElement: Document,
      types: "animationend",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_waiting")
    def add(
      htmlElement: Document,
      types: "waiting",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationstart")
    def add(
      htmlElement: Document,
      types: "webkitanimationstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragstart")
    def add(
      htmlElement: Document,
      types: "dragstart",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_load")
    def add(
      htmlElement: Document,
      types: "load",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplay")
    def add(
      htmlElement: Document,
      types: "canplay",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cuechange")
    def add(
      htmlElement: Document,
      types: "cuechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplaythrough")
    def add(
      htmlElement: Document,
      types: "canplaythrough",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectstart")
    def add(
      htmlElement: Document,
      types: "selectstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keyup")
    def add(
      htmlElement: Document,
      types: "keyup",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadstart")
    def add(
      htmlElement: Document,
      types: "loadstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectionchange")
    def add(
      htmlElement: Document,
      types: "selectionchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_submit")
    def add(
      htmlElement: Document,
      types: "submit",
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitioncancel")
    def add(
      htmlElement: Document,
      types: "transitioncancel",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_invalid")
    def add(
      htmlElement: Document,
      types: "invalid",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_select")
    def add(
      htmlElement: Document,
      types: "select",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerover")
    def add(
      htmlElement: Document,
      types: "pointerover",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_securitypolicyviolation")
    def add(
      htmlElement: Document,
      types: "securitypolicyviolation",
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_play")
    def add(
      htmlElement: Document,
      types: "play",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchcancel")
    def add(
      htmlElement: Document,
      types: "touchcancel",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationcancel")
    def add(
      htmlElement: Document,
      types: "animationcancel",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragend")
    def add(
      htmlElement: Document,
      types: "dragend",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_lostpointercapture")
    def add(
      htmlElement: Document,
      types: "lostpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerleave")
    def add(
      htmlElement: Document,
      types: "pointerleave",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drop")
    def add(
      htmlElement: Document,
      types: "drop",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusout")
    def add(
      htmlElement: Document,
      types: "focusout",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousemove")
    def add(
      htmlElement: Document,
      types: "mousemove",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchmove")
    def add(
      htmlElement: Document,
      types: "touchmove",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationstart")
    def add(
      htmlElement: Document,
      types: "animationstart",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_formdata")
    def add(
      htmlElement: Document,
      types: "formdata",
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerdown")
    def add(
      htmlElement: Document,
      types: "pointerdown",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerenter")
    def add(
      htmlElement: Document,
      types: "pointerenter",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionstart")
    def add(
      htmlElement: Document,
      types: "transitionstart",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragenter")
    def add(
      htmlElement: Document,
      types: "dragenter",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_toggle")
    def add(
      htmlElement: Document,
      types: "toggle",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_durationchange")
    def add(
      htmlElement: Document,
      types: "durationchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keydown")
    def add(
      htmlElement: Document,
      types: "keydown",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_timeupdate")
    def add(
      htmlElement: Document,
      types: "timeupdate",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ended")
    def add(
      htmlElement: Document,
      types: "ended",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeked")
    def add(
      htmlElement: Document,
      types: "seeked",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focus")
    def add(
      htmlElement: Document,
      types: "focus",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseover")
    def add(
      htmlElement: Document,
      types: "mouseover",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_progress")
    def add(
      htmlElement: Document,
      types: "progress",
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_change")
    def add(
      htmlElement: Document,
      types: "change",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionupdate")
    def add(
      htmlElement: Document,
      types: "compositionupdate",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_close")
    def add(
      htmlElement: Document,
      types: "close",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_emptied")
    def add(
      htmlElement: Document,
      types: "emptied",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_slotchange")
    def add(
      htmlElement: Document,
      types: "slotchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_suspend")
    def add(
      htmlElement: Document,
      types: "suspend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_resize")
    def add(
      htmlElement: Document,
      types: "resize",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationiteration")
    def add(
      htmlElement: Document,
      types: "animationiteration",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseleave")
    def add(
      htmlElement: Document,
      types: "mouseleave",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseup")
    def add(
      htmlElement: Document,
      types: "mouseup",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousedown")
    def add(
      htmlElement: Document,
      types: "mousedown",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_abort")
    def add(
      htmlElement: Document,
      types: "abort",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_durationchange")
    def add(
      htmlElement: Document,
      types: "durationchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_playing")
    def add(
      htmlElement: Document,
      types: "playing",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusin")
    def add(
      htmlElement: Document,
      types: "focusin",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchcancel")
    def add(
      htmlElement: Document,
      types: "touchcancel",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focus")
    def add(
      htmlElement: Document,
      types: "focus",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionrun")
    def add(
      htmlElement: Document,
      types: "transitionrun",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitioncancel")
    def add(
      htmlElement: Document,
      types: "transitioncancel",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_beforeinput")
    def add(
      htmlElement: Document,
      types: "beforeinput",
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_auxclick")
    def add(
      htmlElement: Document,
      types: "auxclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationend")
    def add(
      htmlElement: Document,
      types: "animationend",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_select")
    def add(
      htmlElement: Document,
      types: "select",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadedmetadata")
    def add(
      htmlElement: Document,
      types: "loadedmetadata",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_volumechange")
    def add(
      htmlElement: Document,
      types: "volumechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationstart")
    def add(
      htmlElement: Document,
      types: "webkitanimationstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplaythrough")
    def add(
      htmlElement: Document,
      types: "canplaythrough",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerup")
    def add(
      htmlElement: Document,
      types: "pointerup",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_input")
    def add(
      htmlElement: Document,
      types: "input",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_formdata")
    def add(
      htmlElement: Document,
      types: "formdata",
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionstart")
    def add(
      htmlElement: Document,
      types: "transitionstart",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_wheel")
    def add(
      htmlElement: Document,
      types: "wheel",
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionupdate")
    def add(
      htmlElement: Document,
      types: "compositionupdate",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeked")
    def add(
      htmlElement: Document,
      types: "seeked",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_suspend")
    def add(
      htmlElement: Document,
      types: "suspend",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_lostpointercapture")
    def add(
      htmlElement: Document,
      types: "lostpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationstart")
    def add(
      htmlElement: Document,
      types: "animationstart",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_invalid")
    def add(
      htmlElement: Document,
      types: "invalid",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousemove")
    def add(
      htmlElement: Document,
      types: "mousemove",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragover")
    def add(
      htmlElement: Document,
      types: "dragover",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseup")
    def add(
      htmlElement: Document,
      types: "mouseup",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keydown")
    def add(
      htmlElement: Document,
      types: "keydown",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerdown")
    def add(
      htmlElement: Document,
      types: "pointerdown",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_error")
    def add(
      htmlElement: Document,
      types: "error",
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keypress")
    def add(
      htmlElement: Document,
      types: "keypress",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationiteration")
    def add(
      htmlElement: Document,
      types: "animationiteration",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_progress")
    def add(
      htmlElement: Document,
      types: "progress",
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_load")
    def add(
      htmlElement: Document,
      types: "load",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkittransitionend")
    def add(
      htmlElement: Document,
      types: "webkittransitionend",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keyup")
    def add(
      htmlElement: Document,
      types: "keyup",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_toggle")
    def add(
      htmlElement: Document,
      types: "toggle",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadstart")
    def add(
      htmlElement: Document,
      types: "loadstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_emptied")
    def add(
      htmlElement: Document,
      types: "emptied",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_reset")
    def add(
      htmlElement: Document,
      types: "reset",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_securitypolicyviolation")
    def add(
      htmlElement: Document,
      types: "securitypolicyviolation",
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ratechange")
    def add(
      htmlElement: Document,
      types: "ratechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusout")
    def add(
      htmlElement: Document,
      types: "focusout",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cuechange")
    def add(
      htmlElement: Document,
      types: "cuechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_close")
    def add(
      htmlElement: Document,
      types: "close",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragend")
    def add(
      htmlElement: Document,
      types: "dragend",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointermove")
    def add(
      htmlElement: Document,
      types: "pointermove",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionend")
    def add(
      htmlElement: Document,
      types: "transitionend",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseleave")
    def add(
      htmlElement: Document,
      types: "mouseleave",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_change")
    def add(
      htmlElement: Document,
      types: "change",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cancel")
    def add(
      htmlElement: Document,
      types: "cancel",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_contextmenu")
    def add(
      htmlElement: Document,
      types: "contextmenu",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchend")
    def add(
      htmlElement: Document,
      types: "touchend",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_play")
    def add(
      htmlElement: Document,
      types: "play",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseover")
    def add(
      htmlElement: Document,
      types: "mouseover",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_click")
    def add(
      htmlElement: Document,
      types: "click",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadeddata")
    def add(
      htmlElement: Document,
      types: "loadeddata",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerleave")
    def add(
      htmlElement: Document,
      types: "pointerleave",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_resize")
    def add(
      htmlElement: Document,
      types: "resize",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_timeupdate")
    def add(
      htmlElement: Document,
      types: "timeupdate",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerout")
    def add(
      htmlElement: Document,
      types: "pointerout",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionstart")
    def add(
      htmlElement: Document,
      types: "compositionstart",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectstart")
    def add(
      htmlElement: Document,
      types: "selectstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointercancel")
    def add(
      htmlElement: Document,
      types: "pointercancel",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationend")
    def add(
      htmlElement: Document,
      types: "webkitanimationend",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousedown")
    def add(
      htmlElement: Document,
      types: "mousedown",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplay")
    def add(
      htmlElement: Document,
      types: "canplay",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseenter")
    def add(
      htmlElement: Document,
      types: "mouseenter",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_stalled")
    def add(
      htmlElement: Document,
      types: "stalled",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragstart")
    def add(
      htmlElement: Document,
      types: "dragstart",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_submit")
    def add(
      htmlElement: Document,
      types: "submit",
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerenter")
    def add(
      htmlElement: Document,
      types: "pointerenter",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_waiting")
    def add(
      htmlElement: Document,
      types: "waiting",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_slotchange")
    def add(
      htmlElement: Document,
      types: "slotchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectionchange")
    def add(
      htmlElement: Document,
      types: "selectionchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dblclick")
    def add(
      htmlElement: Document,
      types: "dblclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_gotpointercapture")
    def add(
      htmlElement: Document,
      types: "gotpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationcancel")
    def add(
      htmlElement: Document,
      types: "animationcancel",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_scroll")
    def add(
      htmlElement: Document,
      types: "scroll",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drag")
    def add(
      htmlElement: Document,
      types: "drag",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pause")
    def add(
      htmlElement: Document,
      types: "pause",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_abort")
    def add(
      htmlElement: Document,
      types: "abort",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerover")
    def add(
      htmlElement: Document,
      types: "pointerover",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_blur")
    def add(
      htmlElement: Document,
      types: "blur",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ended")
    def add(
      htmlElement: Document,
      types: "ended",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragenter")
    def add(
      htmlElement: Document,
      types: "dragenter",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationiteration")
    def add(
      htmlElement: Document,
      types: "webkitanimationiteration",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseout")
    def add(
      htmlElement: Document,
      types: "mouseout",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchmove")
    def add(
      htmlElement: Document,
      types: "touchmove",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragleave")
    def add(
      htmlElement: Document,
      types: "dragleave",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchstart")
    def add(
      htmlElement: Document,
      types: "touchstart",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeking")
    def add(
      htmlElement: Document,
      types: "seeking",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drop")
    def add(
      htmlElement: Document,
      types: "drop",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionend")
    def add(
      htmlElement: Document,
      types: "compositionend",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
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
    @JSName("add")
    @scala.annotation.targetName("add_slotchange")
    def add(htmlElement: HTMLElement, types: "slotchange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_click")
    def add(htmlElement: HTMLElement, types: "click", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drop")
    def add(htmlElement: HTMLElement, types: "drop", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_wheel")
    def add(htmlElement: HTMLElement, types: "wheel", callback: js.Function1[/* event */ WheelEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drag")
    def add(htmlElement: HTMLElement, types: "drag", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseout")
    def add(htmlElement: HTMLElement, types: "mouseout", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeking")
    def add(htmlElement: HTMLElement, types: "seeking", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_toggle")
    def add(htmlElement: HTMLElement, types: "toggle", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_gotpointercapture")
    def add(
      htmlElement: HTMLElement,
      types: "gotpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragover")
    def add(htmlElement: HTMLElement, types: "dragover", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionstart")
    def add(
      htmlElement: HTMLElement,
      types: "transitionstart",
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_abort")
    def add(htmlElement: HTMLElement, types: "abort", callback: js.Function1[/* event */ UIEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ratechange")
    def add(htmlElement: HTMLElement, types: "ratechange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkittransitionend")
    def add(
      htmlElement: HTMLElement,
      types: "webkittransitionend",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectionchange")
    def add(
      htmlElement: HTMLElement,
      types: "selectionchange",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_waiting")
    def add(htmlElement: HTMLElement, types: "waiting", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchcancel")
    def add(
      htmlElement: HTMLElement,
      types: "touchcancel",
      callback: js.Function1[/* event */ TouchEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationcancel")
    def add(
      htmlElement: HTMLElement,
      types: "animationcancel",
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keypress")
    def add(
      htmlElement: HTMLElement,
      types: "keypress",
      callback: js.Function1[/* event */ KeyboardEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pause")
    def add(htmlElement: HTMLElement, types: "pause", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_error")
    def add(htmlElement: HTMLElement, types: "error", callback: js.Function1[/* event */ ErrorEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_emptied")
    def add(htmlElement: HTMLElement, types: "emptied", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_playing")
    def add(htmlElement: HTMLElement, types: "playing", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseover")
    def add(htmlElement: HTMLElement, types: "mouseover", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_reset")
    def add(htmlElement: HTMLElement, types: "reset", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cancel")
    def add(htmlElement: HTMLElement, types: "cancel", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_resize")
    def add(htmlElement: HTMLElement, types: "resize", callback: js.Function1[/* event */ UIEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchend")
    def add(htmlElement: HTMLElement, types: "touchend", callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keydown")
    def add(
      htmlElement: HTMLElement,
      types: "keydown",
      callback: js.Function1[/* event */ KeyboardEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadeddata")
    def add(htmlElement: HTMLElement, types: "loadeddata", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_select")
    def add(htmlElement: HTMLElement, types: "select", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationiteration")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationiteration",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_durationchange")
    def add(htmlElement: HTMLElement, types: "durationchange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_lostpointercapture")
    def add(
      htmlElement: HTMLElement,
      types: "lostpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_input")
    def add(htmlElement: HTMLElement, types: "input", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionstart")
    def add(
      htmlElement: HTMLElement,
      types: "compositionstart",
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchstart")
    def add(
      htmlElement: HTMLElement,
      types: "touchstart",
      callback: js.Function1[/* event */ TouchEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionend")
    def add(
      htmlElement: HTMLElement,
      types: "transitionend",
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousedown")
    def add(htmlElement: HTMLElement, types: "mousedown", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerleave")
    def add(
      htmlElement: HTMLElement,
      types: "pointerleave",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_load")
    def add(htmlElement: HTMLElement, types: "load", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dblclick")
    def add(htmlElement: HTMLElement, types: "dblclick", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragstart")
    def add(htmlElement: HTMLElement, types: "dragstart", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplay")
    def add(htmlElement: HTMLElement, types: "canplay", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseleave")
    def add(
      htmlElement: HTMLElement,
      types: "mouseleave",
      callback: js.Function1[/* event */ MouseEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerover")
    def add(
      htmlElement: HTMLElement,
      types: "pointerover",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragleave")
    def add(htmlElement: HTMLElement, types: "dragleave", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadstart")
    def add(htmlElement: HTMLElement, types: "loadstart", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointercancel")
    def add(
      htmlElement: HTMLElement,
      types: "pointercancel",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_beforeinput")
    def add(
      htmlElement: HTMLElement,
      types: "beforeinput",
      callback: js.Function1[/* event */ InputEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseenter")
    def add(
      htmlElement: HTMLElement,
      types: "mouseenter",
      callback: js.Function1[/* event */ MouseEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationstart")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationstart",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_auxclick")
    def add(htmlElement: HTMLElement, types: "auxclick", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationiteration")
    def add(
      htmlElement: HTMLElement,
      types: "animationiteration",
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointermove")
    def add(
      htmlElement: HTMLElement,
      types: "pointermove",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusout")
    def add(htmlElement: HTMLElement, types: "focusout", callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseup")
    def add(htmlElement: HTMLElement, types: "mouseup", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusin")
    def add(htmlElement: HTMLElement, types: "focusin", callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplaythrough")
    def add(htmlElement: HTMLElement, types: "canplaythrough", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_progress")
    def add(
      htmlElement: HTMLElement,
      types: "progress",
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_volumechange")
    def add(htmlElement: HTMLElement, types: "volumechange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationend")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationend",
      callback: js.Function1[/* event */ Event, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_invalid")
    def add(htmlElement: HTMLElement, types: "invalid", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_play")
    def add(htmlElement: HTMLElement, types: "play", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_change")
    def add(htmlElement: HTMLElement, types: "change", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragend")
    def add(htmlElement: HTMLElement, types: "dragend", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_formdata")
    def add(
      htmlElement: HTMLElement,
      types: "formdata",
      callback: js.Function1[/* event */ FormDataEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchmove")
    def add(htmlElement: HTMLElement, types: "touchmove", callback: js.Function1[/* event */ TouchEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerout")
    def add(
      htmlElement: HTMLElement,
      types: "pointerout",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragenter")
    def add(htmlElement: HTMLElement, types: "dragenter", callback: js.Function1[/* event */ DragEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousemove")
    def add(htmlElement: HTMLElement, types: "mousemove", callback: js.Function1[/* event */ MouseEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ended")
    def add(htmlElement: HTMLElement, types: "ended", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionend")
    def add(
      htmlElement: HTMLElement,
      types: "compositionend",
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_submit")
    def add(htmlElement: HTMLElement, types: "submit", callback: js.Function1[/* event */ SubmitEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationend")
    def add(
      htmlElement: HTMLElement,
      types: "animationend",
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_timeupdate")
    def add(htmlElement: HTMLElement, types: "timeupdate", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerup")
    def add(
      htmlElement: HTMLElement,
      types: "pointerup",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_close")
    def add(htmlElement: HTMLElement, types: "close", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keyup")
    def add(htmlElement: HTMLElement, types: "keyup", callback: js.Function1[/* event */ KeyboardEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionrun")
    def add(
      htmlElement: HTMLElement,
      types: "transitionrun",
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadedmetadata")
    def add(htmlElement: HTMLElement, types: "loadedmetadata", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectstart")
    def add(htmlElement: HTMLElement, types: "selectstart", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitioncancel")
    def add(
      htmlElement: HTMLElement,
      types: "transitioncancel",
      callback: js.Function1[/* event */ TransitionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_suspend")
    def add(htmlElement: HTMLElement, types: "suspend", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_scroll")
    def add(htmlElement: HTMLElement, types: "scroll", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeked")
    def add(htmlElement: HTMLElement, types: "seeked", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cuechange")
    def add(htmlElement: HTMLElement, types: "cuechange", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_stalled")
    def add(htmlElement: HTMLElement, types: "stalled", callback: js.Function1[/* event */ Event, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionupdate")
    def add(
      htmlElement: HTMLElement,
      types: "compositionupdate",
      callback: js.Function1[/* event */ CompositionEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_securitypolicyviolation")
    def add(
      htmlElement: HTMLElement,
      types: "securitypolicyviolation",
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerdown")
    def add(
      htmlElement: HTMLElement,
      types: "pointerdown",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationstart")
    def add(
      htmlElement: HTMLElement,
      types: "animationstart",
      callback: js.Function1[/* event */ AnimationEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focus")
    def add(htmlElement: HTMLElement, types: "focus", callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_contextmenu")
    def add(
      htmlElement: HTMLElement,
      types: "contextmenu",
      callback: js.Function1[/* event */ MouseEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_blur")
    def add(htmlElement: HTMLElement, types: "blur", callback: js.Function1[/* event */ FocusEvent, Unit]): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerenter")
    def add(
      htmlElement: HTMLElement,
      types: "pointerenter",
      callback: js.Function1[/* event */ PointerEvent, Unit]
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keypress")
    def add(
      htmlElement: HTMLElement,
      types: "keypress",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationend")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationcancel")
    def add(
      htmlElement: HTMLElement,
      types: "animationcancel",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseenter")
    def add(
      htmlElement: HTMLElement,
      types: "mouseenter",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drag")
    def add(
      htmlElement: HTMLElement,
      types: "drag",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeking")
    def add(
      htmlElement: HTMLElement,
      types: "seeking",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_beforeinput")
    def add(
      htmlElement: HTMLElement,
      types: "beforeinput",
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_gotpointercapture")
    def add(
      htmlElement: HTMLElement,
      types: "gotpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplaythrough")
    def add(
      htmlElement: HTMLElement,
      types: "canplaythrough",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadedmetadata")
    def add(
      htmlElement: HTMLElement,
      types: "loadedmetadata",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_volumechange")
    def add(
      htmlElement: HTMLElement,
      types: "volumechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointermove")
    def add(
      htmlElement: HTMLElement,
      types: "pointermove",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragleave")
    def add(
      htmlElement: HTMLElement,
      types: "dragleave",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_progress")
    def add(
      htmlElement: HTMLElement,
      types: "progress",
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseleave")
    def add(
      htmlElement: HTMLElement,
      types: "mouseleave",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionstart")
    def add(
      htmlElement: HTMLElement,
      types: "compositionstart",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationiteration")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationiteration",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_toggle")
    def add(
      htmlElement: HTMLElement,
      types: "toggle",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_durationchange")
    def add(
      htmlElement: HTMLElement,
      types: "durationchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ratechange")
    def add(
      htmlElement: HTMLElement,
      types: "ratechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_input")
    def add(
      htmlElement: HTMLElement,
      types: "input",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_reset")
    def add(
      htmlElement: HTMLElement,
      types: "reset",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionupdate")
    def add(
      htmlElement: HTMLElement,
      types: "compositionupdate",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_emptied")
    def add(
      htmlElement: HTMLElement,
      types: "emptied",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseover")
    def add(
      htmlElement: HTMLElement,
      types: "mouseover",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_change")
    def add(
      htmlElement: HTMLElement,
      types: "change",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationiteration")
    def add(
      htmlElement: HTMLElement,
      types: "animationiteration",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkittransitionend")
    def add(
      htmlElement: HTMLElement,
      types: "webkittransitionend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointercancel")
    def add(
      htmlElement: HTMLElement,
      types: "pointercancel",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_stalled")
    def add(
      htmlElement: HTMLElement,
      types: "stalled",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_submit")
    def add(
      htmlElement: HTMLElement,
      types: "submit",
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_blur")
    def add(
      htmlElement: HTMLElement,
      types: "blur",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragenter")
    def add(
      htmlElement: HTMLElement,
      types: "dragenter",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_error")
    def add(
      htmlElement: HTMLElement,
      types: "error",
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focus")
    def add(
      htmlElement: HTMLElement,
      types: "focus",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_load")
    def add(
      htmlElement: HTMLElement,
      types: "load",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationstart")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_timeupdate")
    def add(
      htmlElement: HTMLElement,
      types: "timeupdate",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cuechange")
    def add(
      htmlElement: HTMLElement,
      types: "cuechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_securitypolicyviolation")
    def add(
      htmlElement: HTMLElement,
      types: "securitypolicyviolation",
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionstart")
    def add(
      htmlElement: HTMLElement,
      types: "transitionstart",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplay")
    def add(
      htmlElement: HTMLElement,
      types: "canplay",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dblclick")
    def add(
      htmlElement: HTMLElement,
      types: "dblclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pause")
    def add(
      htmlElement: HTMLElement,
      types: "pause",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keyup")
    def add(
      htmlElement: HTMLElement,
      types: "keyup",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_playing")
    def add(
      htmlElement: HTMLElement,
      types: "playing",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerdown")
    def add(
      htmlElement: HTMLElement,
      types: "pointerdown",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerenter")
    def add(
      htmlElement: HTMLElement,
      types: "pointerenter",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragstart")
    def add(
      htmlElement: HTMLElement,
      types: "dragstart",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_resize")
    def add(
      htmlElement: HTMLElement,
      types: "resize",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerup")
    def add(
      htmlElement: HTMLElement,
      types: "pointerup",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drop")
    def add(
      htmlElement: HTMLElement,
      types: "drop",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_select")
    def add(
      htmlElement: HTMLElement,
      types: "select",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerout")
    def add(
      htmlElement: HTMLElement,
      types: "pointerout",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_contextmenu")
    def add(
      htmlElement: HTMLElement,
      types: "contextmenu",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchend")
    def add(
      htmlElement: HTMLElement,
      types: "touchend",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_auxclick")
    def add(
      htmlElement: HTMLElement,
      types: "auxclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchcancel")
    def add(
      htmlElement: HTMLElement,
      types: "touchcancel",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchstart")
    def add(
      htmlElement: HTMLElement,
      types: "touchstart",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadeddata")
    def add(
      htmlElement: HTMLElement,
      types: "loadeddata",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_suspend")
    def add(
      htmlElement: HTMLElement,
      types: "suspend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ended")
    def add(
      htmlElement: HTMLElement,
      types: "ended",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keydown")
    def add(
      htmlElement: HTMLElement,
      types: "keydown",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusout")
    def add(
      htmlElement: HTMLElement,
      types: "focusout",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cancel")
    def add(
      htmlElement: HTMLElement,
      types: "cancel",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousemove")
    def add(
      htmlElement: HTMLElement,
      types: "mousemove",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeked")
    def add(
      htmlElement: HTMLElement,
      types: "seeked",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitioncancel")
    def add(
      htmlElement: HTMLElement,
      types: "transitioncancel",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationend")
    def add(
      htmlElement: HTMLElement,
      types: "animationend",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionend")
    def add(
      htmlElement: HTMLElement,
      types: "compositionend",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationstart")
    def add(
      htmlElement: HTMLElement,
      types: "animationstart",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_abort")
    def add(
      htmlElement: HTMLElement,
      types: "abort",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseup")
    def add(
      htmlElement: HTMLElement,
      types: "mouseup",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_wheel")
    def add(
      htmlElement: HTMLElement,
      types: "wheel",
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerleave")
    def add(
      htmlElement: HTMLElement,
      types: "pointerleave",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousedown")
    def add(
      htmlElement: HTMLElement,
      types: "mousedown",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusin")
    def add(
      htmlElement: HTMLElement,
      types: "focusin",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_lostpointercapture")
    def add(
      htmlElement: HTMLElement,
      types: "lostpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionend")
    def add(
      htmlElement: HTMLElement,
      types: "transitionend",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectstart")
    def add(
      htmlElement: HTMLElement,
      types: "selectstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragover")
    def add(
      htmlElement: HTMLElement,
      types: "dragover",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_invalid")
    def add(
      htmlElement: HTMLElement,
      types: "invalid",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerover")
    def add(
      htmlElement: HTMLElement,
      types: "pointerover",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchmove")
    def add(
      htmlElement: HTMLElement,
      types: "touchmove",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_play")
    def add(
      htmlElement: HTMLElement,
      types: "play",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_click")
    def add(
      htmlElement: HTMLElement,
      types: "click",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadstart")
    def add(
      htmlElement: HTMLElement,
      types: "loadstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_slotchange")
    def add(
      htmlElement: HTMLElement,
      types: "slotchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectionchange")
    def add(
      htmlElement: HTMLElement,
      types: "selectionchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseout")
    def add(
      htmlElement: HTMLElement,
      types: "mouseout",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragend")
    def add(
      htmlElement: HTMLElement,
      types: "dragend",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_scroll")
    def add(
      htmlElement: HTMLElement,
      types: "scroll",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionrun")
    def add(
      htmlElement: HTMLElement,
      types: "transitionrun",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_close")
    def add(
      htmlElement: HTMLElement,
      types: "close",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_waiting")
    def add(
      htmlElement: HTMLElement,
      types: "waiting",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_formdata")
    def add(
      htmlElement: HTMLElement,
      types: "formdata",
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: js.Object
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ended")
    def add(
      htmlElement: HTMLElement,
      types: "ended",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectionchange")
    def add(
      htmlElement: HTMLElement,
      types: "selectionchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_input")
    def add(
      htmlElement: HTMLElement,
      types: "input",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_toggle")
    def add(
      htmlElement: HTMLElement,
      types: "toggle",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionupdate")
    def add(
      htmlElement: HTMLElement,
      types: "compositionupdate",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_slotchange")
    def add(
      htmlElement: HTMLElement,
      types: "slotchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerdown")
    def add(
      htmlElement: HTMLElement,
      types: "pointerdown",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragover")
    def add(
      htmlElement: HTMLElement,
      types: "dragover",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionstart")
    def add(
      htmlElement: HTMLElement,
      types: "compositionstart",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationend")
    def add(
      htmlElement: HTMLElement,
      types: "animationend",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationcancel")
    def add(
      htmlElement: HTMLElement,
      types: "animationcancel",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationiteration")
    def add(
      htmlElement: HTMLElement,
      types: "animationiteration",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_submit")
    def add(
      htmlElement: HTMLElement,
      types: "submit",
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_volumechange")
    def add(
      htmlElement: HTMLElement,
      types: "volumechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchstart")
    def add(
      htmlElement: HTMLElement,
      types: "touchstart",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplay")
    def add(
      htmlElement: HTMLElement,
      types: "canplay",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionend")
    def add(
      htmlElement: HTMLElement,
      types: "compositionend",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionrun")
    def add(
      htmlElement: HTMLElement,
      types: "transitionrun",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectstart")
    def add(
      htmlElement: HTMLElement,
      types: "selectstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_playing")
    def add(
      htmlElement: HTMLElement,
      types: "playing",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionstart")
    def add(
      htmlElement: HTMLElement,
      types: "transitionstart",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerleave")
    def add(
      htmlElement: HTMLElement,
      types: "pointerleave",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keydown")
    def add(
      htmlElement: HTMLElement,
      types: "keydown",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerup")
    def add(
      htmlElement: HTMLElement,
      types: "pointerup",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusin")
    def add(
      htmlElement: HTMLElement,
      types: "focusin",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_gotpointercapture")
    def add(
      htmlElement: HTMLElement,
      types: "gotpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointermove")
    def add(
      htmlElement: HTMLElement,
      types: "pointermove",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadeddata")
    def add(
      htmlElement: HTMLElement,
      types: "loadeddata",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseup")
    def add(
      htmlElement: HTMLElement,
      types: "mouseup",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_click")
    def add(
      htmlElement: HTMLElement,
      types: "click",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseleave")
    def add(
      htmlElement: HTMLElement,
      types: "mouseleave",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ratechange")
    def add(
      htmlElement: HTMLElement,
      types: "ratechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_beforeinput")
    def add(
      htmlElement: HTMLElement,
      types: "beforeinput",
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_progress")
    def add(
      htmlElement: HTMLElement,
      types: "progress",
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseover")
    def add(
      htmlElement: HTMLElement,
      types: "mouseover",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keyup")
    def add(
      htmlElement: HTMLElement,
      types: "keyup",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationstart")
    def add(
      htmlElement: HTMLElement,
      types: "animationstart",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_blur")
    def add(
      htmlElement: HTMLElement,
      types: "blur",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeked")
    def add(
      htmlElement: HTMLElement,
      types: "seeked",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkittransitionend")
    def add(
      htmlElement: HTMLElement,
      types: "webkittransitionend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_wheel")
    def add(
      htmlElement: HTMLElement,
      types: "wheel",
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadstart")
    def add(
      htmlElement: HTMLElement,
      types: "loadstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerenter")
    def add(
      htmlElement: HTMLElement,
      types: "pointerenter",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragenter")
    def add(
      htmlElement: HTMLElement,
      types: "dragenter",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cuechange")
    def add(
      htmlElement: HTMLElement,
      types: "cuechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_stalled")
    def add(
      htmlElement: HTMLElement,
      types: "stalled",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_play")
    def add(
      htmlElement: HTMLElement,
      types: "play",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_select")
    def add(
      htmlElement: HTMLElement,
      types: "select",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerover")
    def add(
      htmlElement: HTMLElement,
      types: "pointerover",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keypress")
    def add(
      htmlElement: HTMLElement,
      types: "keypress",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_auxclick")
    def add(
      htmlElement: HTMLElement,
      types: "auxclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseout")
    def add(
      htmlElement: HTMLElement,
      types: "mouseout",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragend")
    def add(
      htmlElement: HTMLElement,
      types: "dragend",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_invalid")
    def add(
      htmlElement: HTMLElement,
      types: "invalid",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cancel")
    def add(
      htmlElement: HTMLElement,
      types: "cancel",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_timeupdate")
    def add(
      htmlElement: HTMLElement,
      types: "timeupdate",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drop")
    def add(
      htmlElement: HTMLElement,
      types: "drop",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pause")
    def add(
      htmlElement: HTMLElement,
      types: "pause",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionend")
    def add(
      htmlElement: HTMLElement,
      types: "transitionend",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_securitypolicyviolation")
    def add(
      htmlElement: HTMLElement,
      types: "securitypolicyviolation",
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_waiting")
    def add(
      htmlElement: HTMLElement,
      types: "waiting",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeking")
    def add(
      htmlElement: HTMLElement,
      types: "seeking",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousemove")
    def add(
      htmlElement: HTMLElement,
      types: "mousemove",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchmove")
    def add(
      htmlElement: HTMLElement,
      types: "touchmove",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_abort")
    def add(
      htmlElement: HTMLElement,
      types: "abort",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadedmetadata")
    def add(
      htmlElement: HTMLElement,
      types: "loadedmetadata",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplaythrough")
    def add(
      htmlElement: HTMLElement,
      types: "canplaythrough",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationstart")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_reset")
    def add(
      htmlElement: HTMLElement,
      types: "reset",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_suspend")
    def add(
      htmlElement: HTMLElement,
      types: "suspend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_lostpointercapture")
    def add(
      htmlElement: HTMLElement,
      types: "lostpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerout")
    def add(
      htmlElement: HTMLElement,
      types: "pointerout",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseenter")
    def add(
      htmlElement: HTMLElement,
      types: "mouseenter",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragleave")
    def add(
      htmlElement: HTMLElement,
      types: "dragleave",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drag")
    def add(
      htmlElement: HTMLElement,
      types: "drag",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_formdata")
    def add(
      htmlElement: HTMLElement,
      types: "formdata",
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dblclick")
    def add(
      htmlElement: HTMLElement,
      types: "dblclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationend")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationend",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusout")
    def add(
      htmlElement: HTMLElement,
      types: "focusout",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchend")
    def add(
      htmlElement: HTMLElement,
      types: "touchend",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitioncancel")
    def add(
      htmlElement: HTMLElement,
      types: "transitioncancel",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousedown")
    def add(
      htmlElement: HTMLElement,
      types: "mousedown",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_contextmenu")
    def add(
      htmlElement: HTMLElement,
      types: "contextmenu",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_scroll")
    def add(
      htmlElement: HTMLElement,
      types: "scroll",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_close")
    def add(
      htmlElement: HTMLElement,
      types: "close",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_change")
    def add(
      htmlElement: HTMLElement,
      types: "change",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_durationchange")
    def add(
      htmlElement: HTMLElement,
      types: "durationchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_load")
    def add(
      htmlElement: HTMLElement,
      types: "load",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_resize")
    def add(
      htmlElement: HTMLElement,
      types: "resize",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focus")
    def add(
      htmlElement: HTMLElement,
      types: "focus",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_emptied")
    def add(
      htmlElement: HTMLElement,
      types: "emptied",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_error")
    def add(
      htmlElement: HTMLElement,
      types: "error",
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchcancel")
    def add(
      htmlElement: HTMLElement,
      types: "touchcancel",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationiteration")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationiteration",
      callback: js.Function1[/* event */ Event, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragstart")
    def add(
      htmlElement: HTMLElement,
      types: "dragstart",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointercancel")
    def add(
      htmlElement: HTMLElement,
      types: "pointercancel",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: js.Object,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionupdate")
    def add(
      htmlElement: HTMLElement,
      types: "compositionupdate",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragstart")
    def add(
      htmlElement: HTMLElement,
      types: "dragstart",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionstart")
    def add(
      htmlElement: HTMLElement,
      types: "transitionstart",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cuechange")
    def add(
      htmlElement: HTMLElement,
      types: "cuechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeking")
    def add(
      htmlElement: HTMLElement,
      types: "seeking",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_cancel")
    def add(
      htmlElement: HTMLElement,
      types: "cancel",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseleave")
    def add(
      htmlElement: HTMLElement,
      types: "mouseleave",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_waiting")
    def add(
      htmlElement: HTMLElement,
      types: "waiting",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_auxclick")
    def add(
      htmlElement: HTMLElement,
      types: "auxclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_securitypolicyviolation")
    def add(
      htmlElement: HTMLElement,
      types: "securitypolicyviolation",
      callback: js.Function1[/* event */ SecurityPolicyViolationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_stalled")
    def add(
      htmlElement: HTMLElement,
      types: "stalled",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ended")
    def add(
      htmlElement: HTMLElement,
      types: "ended",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusin")
    def add(
      htmlElement: HTMLElement,
      types: "focusin",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_emptied")
    def add(
      htmlElement: HTMLElement,
      types: "emptied",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationiteration")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationiteration",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerenter")
    def add(
      htmlElement: HTMLElement,
      types: "pointerenter",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keydown")
    def add(
      htmlElement: HTMLElement,
      types: "keydown",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadstart")
    def add(
      htmlElement: HTMLElement,
      types: "loadstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationstart")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchend")
    def add(
      htmlElement: HTMLElement,
      types: "touchend",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_progress")
    def add(
      htmlElement: HTMLElement,
      types: "progress",
      callback: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerleave")
    def add(
      htmlElement: HTMLElement,
      types: "pointerleave",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseup")
    def add(
      htmlElement: HTMLElement,
      types: "mouseup",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitioncancel")
    def add(
      htmlElement: HTMLElement,
      types: "transitioncancel",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_close")
    def add(
      htmlElement: HTMLElement,
      types: "close",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointermove")
    def add(
      htmlElement: HTMLElement,
      types: "pointermove",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousemove")
    def add(
      htmlElement: HTMLElement,
      types: "mousemove",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerout")
    def add(
      htmlElement: HTMLElement,
      types: "pointerout",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseover")
    def add(
      htmlElement: HTMLElement,
      types: "mouseover",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationcancel")
    def add(
      htmlElement: HTMLElement,
      types: "animationcancel",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplaythrough")
    def add(
      htmlElement: HTMLElement,
      types: "canplaythrough",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keyup")
    def add(
      htmlElement: HTMLElement,
      types: "keyup",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationstart")
    def add(
      htmlElement: HTMLElement,
      types: "animationstart",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_formdata")
    def add(
      htmlElement: HTMLElement,
      types: "formdata",
      callback: js.Function1[/* event */ FormDataEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mousedown")
    def add(
      htmlElement: HTMLElement,
      types: "mousedown",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focusout")
    def add(
      htmlElement: HTMLElement,
      types: "focusout",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerover")
    def add(
      htmlElement: HTMLElement,
      types: "pointerover",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseout")
    def add(
      htmlElement: HTMLElement,
      types: "mouseout",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointercancel")
    def add(
      htmlElement: HTMLElement,
      types: "pointercancel",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_timeupdate")
    def add(
      htmlElement: HTMLElement,
      types: "timeupdate",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkittransitionend")
    def add(
      htmlElement: HTMLElement,
      types: "webkittransitionend",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_abort")
    def add(
      htmlElement: HTMLElement,
      types: "abort",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragover")
    def add(
      htmlElement: HTMLElement,
      types: "dragover",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dblclick")
    def add(
      htmlElement: HTMLElement,
      types: "dblclick",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationend")
    def add(
      htmlElement: HTMLElement,
      types: "animationend",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_click")
    def add(
      htmlElement: HTMLElement,
      types: "click",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_gotpointercapture")
    def add(
      htmlElement: HTMLElement,
      types: "gotpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_scroll")
    def add(
      htmlElement: HTMLElement,
      types: "scroll",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionstart")
    def add(
      htmlElement: HTMLElement,
      types: "compositionstart",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drop")
    def add(
      htmlElement: HTMLElement,
      types: "drop",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragleave")
    def add(
      htmlElement: HTMLElement,
      types: "dragleave",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_keypress")
    def add(
      htmlElement: HTMLElement,
      types: "keypress",
      callback: js.Function1[/* event */ KeyboardEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_toggle")
    def add(
      htmlElement: HTMLElement,
      types: "toggle",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchmove")
    def add(
      htmlElement: HTMLElement,
      types: "touchmove",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchstart")
    def add(
      htmlElement: HTMLElement,
      types: "touchstart",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_slotchange")
    def add(
      htmlElement: HTMLElement,
      types: "slotchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_input")
    def add(
      htmlElement: HTMLElement,
      types: "input",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_compositionend")
    def add(
      htmlElement: HTMLElement,
      types: "compositionend",
      callback: js.Function1[/* event */ CompositionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_invalid")
    def add(
      htmlElement: HTMLElement,
      types: "invalid",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_seeked")
    def add(
      htmlElement: HTMLElement,
      types: "seeked",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_reset")
    def add(
      htmlElement: HTMLElement,
      types: "reset",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_change")
    def add(
      htmlElement: HTMLElement,
      types: "change",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadedmetadata")
    def add(
      htmlElement: HTMLElement,
      types: "loadedmetadata",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_suspend")
    def add(
      htmlElement: HTMLElement,
      types: "suspend",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectionchange")
    def add(
      htmlElement: HTMLElement,
      types: "selectionchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_volumechange")
    def add(
      htmlElement: HTMLElement,
      types: "volumechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_playing")
    def add(
      htmlElement: HTMLElement,
      types: "playing",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_canplay")
    def add(
      htmlElement: HTMLElement,
      types: "canplay",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_submit")
    def add(
      htmlElement: HTMLElement,
      types: "submit",
      callback: js.Function1[/* event */ SubmitEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragend")
    def add(
      htmlElement: HTMLElement,
      types: "dragend",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_durationchange")
    def add(
      htmlElement: HTMLElement,
      types: "durationchange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_blur")
    def add(
      htmlElement: HTMLElement,
      types: "blur",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerup")
    def add(
      htmlElement: HTMLElement,
      types: "pointerup",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_error")
    def add(
      htmlElement: HTMLElement,
      types: "error",
      callback: js.Function1[/* event */ ErrorEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_wheel")
    def add(
      htmlElement: HTMLElement,
      types: "wheel",
      callback: js.Function1[/* event */ WheelEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_play")
    def add(
      htmlElement: HTMLElement,
      types: "play",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pause")
    def add(
      htmlElement: HTMLElement,
      types: "pause",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_ratechange")
    def add(
      htmlElement: HTMLElement,
      types: "ratechange",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_beforeinput")
    def add(
      htmlElement: HTMLElement,
      types: "beforeinput",
      callback: js.Function1[/* event */ InputEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_lostpointercapture")
    def add(
      htmlElement: HTMLElement,
      types: "lostpointercapture",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionend")
    def add(
      htmlElement: HTMLElement,
      types: "transitionend",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_focus")
    def add(
      htmlElement: HTMLElement,
      types: "focus",
      callback: js.Function1[/* event */ FocusEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_resize")
    def add(
      htmlElement: HTMLElement,
      types: "resize",
      callback: js.Function1[/* event */ UIEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_pointerdown")
    def add(
      htmlElement: HTMLElement,
      types: "pointerdown",
      callback: js.Function1[/* event */ PointerEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_contextmenu")
    def add(
      htmlElement: HTMLElement,
      types: "contextmenu",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_webkitanimationend")
    def add(
      htmlElement: HTMLElement,
      types: "webkitanimationend",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_dragenter")
    def add(
      htmlElement: HTMLElement,
      types: "dragenter",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_load")
    def add(
      htmlElement: HTMLElement,
      types: "load",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_mouseenter")
    def add(
      htmlElement: HTMLElement,
      types: "mouseenter",
      callback: js.Function1[/* event */ MouseEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_loadeddata")
    def add(
      htmlElement: HTMLElement,
      types: "loadeddata",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_select")
    def add(
      htmlElement: HTMLElement,
      types: "select",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_touchcancel")
    def add(
      htmlElement: HTMLElement,
      types: "touchcancel",
      callback: js.Function1[/* event */ TouchEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_selectstart")
    def add(
      htmlElement: HTMLElement,
      types: "selectstart",
      callback: js.Function1[/* event */ Event, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_drag")
    def add(
      htmlElement: HTMLElement,
      types: "drag",
      callback: js.Function1[/* event */ DragEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_animationiteration")
    def add(
      htmlElement: HTMLElement,
      types: "animationiteration",
      callback: js.Function1[/* event */ AnimationEvent, Unit],
      context: Unit,
      capture: Boolean
    ): this.type = js.native
    @JSName("add")
    @scala.annotation.targetName("add_transitionrun")
    def add(
      htmlElement: HTMLElement,
      types: "transitionrun",
      callback: js.Function1[/* event */ TransitionEvent, Unit],
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
