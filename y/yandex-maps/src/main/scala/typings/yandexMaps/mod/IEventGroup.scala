package typings.yandexMaps.mod

import typings.std.AnimationEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventGroup extends StObject {
  
  @JSName("add")
  @scala.annotation.targetName("add_dragenter")
  def add(
    types: "dragenter",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationiteration")
  def add(
    types: "animationiteration",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerover")
  def add(
    types: "pointerover",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragstart")
  def add(
    types: "dragstart",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_ended")
  def add(types: "ended", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focus")
  def add(
    types: "focus",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_beforeinput")
  def add(
    types: "beforeinput",
    callback: js.Function1[/* event */ InputEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_ratechange")
  def add(
    types: "ratechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionupdate")
  def add(
    types: "compositionupdate",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_abort")
  def add(types: "abort", callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_blur")
  def add(
    types: "blur",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadedmetadata")
  def add(
    types: "loadedmetadata",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_drop")
  def add(
    types: "drop",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_submit")
  def add(
    types: "submit",
    callback: js.Function1[/* event */ SubmitEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointercancel")
  def add(
    types: "pointercancel",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_seeking")
  def add(types: "seeking", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mousedown")
  def add(
    types: "mousedown",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_cuechange")
  def add(
    types: "cuechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_toggle")
  def add(types: "toggle", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_wheel")
  def add(
    types: "wheel",
    callback: js.Function1[/* event */ WheelEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pause")
  def add(types: "pause", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationstart")
  def add(
    types: "animationstart",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keyup")
  def add(
    types: "keyup",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_slotchange")
  def add(
    types: "slotchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_contextmenu")
  def add(
    types: "contextmenu",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerleave")
  def add(
    types: "pointerleave",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerdown")
  def add(
    types: "pointerdown",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_canplay")
  def add(types: "canplay", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_resize")
  def add(
    types: "resize",
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_selectstart")
  def add(
    types: "selectstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragover")
  def add(
    types: "dragover",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_volumechange")
  def add(
    types: "volumechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mousemove")
  def add(
    types: "mousemove",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionend")
  def add(
    types: "transitionend",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionstart")
  def add(
    types: "compositionstart",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitioncancel")
  def add(
    types: "transitioncancel",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_gotpointercapture")
  def add(
    types: "gotpointercapture",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragend")
  def add(
    types: "dragend",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseover")
  def add(
    types: "mouseover",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerout")
  def add(
    types: "pointerout",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_click")
  def add(
    types: "click",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_selectionchange")
  def add(
    types: "selectionchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationend")
  def add(
    types: "animationend",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_input")
  def add(types: "input", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionrun")
  def add(
    types: "transitionrun",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseup")
  def add(
    types: "mouseup",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keydown")
  def add(
    types: "keydown",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_error")
  def add(
    types: "error",
    callback: js.Function1[/* event */ ErrorEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_load")
  def add(types: "load", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_progress")
  def add(
    types: "progress",
    callback: js.Function1[/* event */ ProgressEvent[EventTarget] | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keypress")
  def add(
    types: "keypress",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationend")
  def add(
    types: "webkitanimationend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragleave")
  def add(
    types: "dragleave",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_emptied")
  def add(types: "emptied", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_change")
  def add(types: "change", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadeddata")
  def add(
    types: "loadeddata",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseout")
  def add(
    types: "mouseout",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationiteration")
  def add(
    types: "webkitanimationiteration",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchmove")
  def add(
    types: "touchmove",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseleave")
  def add(
    types: "mouseleave",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationcancel")
  def add(
    types: "animationcancel",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_reset")
  def add(types: "reset", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_close")
  def add(types: "close", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_scroll")
  def add(types: "scroll", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_drag")
  def add(
    types: "drag",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_seeked")
  def add(types: "seeked", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_playing")
  def add(types: "playing", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_invalid")
  def add(types: "invalid", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchstart")
  def add(
    types: "touchstart",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_cancel")
  def add(types: "cancel", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionstart")
  def add(
    types: "transitionstart",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_formdata")
  def add(
    types: "formdata",
    callback: js.Function1[/* event */ FormDataEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerenter")
  def add(
    types: "pointerenter",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focusout")
  def add(
    types: "focusout",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationstart")
  def add(
    types: "webkitanimationstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkittransitionend")
  def add(
    types: "webkittransitionend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerup")
  def add(
    types: "pointerup",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchend")
  def add(
    types: "touchend",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadstart")
  def add(
    types: "loadstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_securitypolicyviolation")
  def add(
    types: "securitypolicyviolation",
    callback: js.Function1[/* event */ SecurityPolicyViolationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_auxclick")
  def add(
    types: "auxclick",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_canplaythrough")
  def add(
    types: "canplaythrough",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchcancel")
  def add(
    types: "touchcancel",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_stalled")
  def add(types: "stalled", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_lostpointercapture")
  def add(
    types: "lostpointercapture",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionend")
  def add(
    types: "compositionend",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focusin")
  def add(
    types: "focusin",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dblclick")
  def add(
    types: "dblclick",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_play")
  def add(types: "play", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_suspend")
  def add(types: "suspend", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_timeupdate")
  def add(
    types: "timeupdate",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_select")
  def add(types: "select", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_durationchange")
  def add(
    types: "durationchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseenter")
  def add(
    types: "mouseenter",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_waiting")
  def add(types: "waiting", callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointermove")
  def add(
    types: "pointermove",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_resize")
  def add(
    types: "resize",
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focusin")
  def add(
    types: "focusin",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationend")
  def add(
    types: "animationend",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_seeked")
  def add(
    types: "seeked",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseup")
  def add(
    types: "mouseup",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationstart")
  def add(
    types: "webkitanimationstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadstart")
  def add(
    types: "loadstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keypress")
  def add(
    types: "keypress",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragover")
  def add(
    types: "dragover",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_drag")
  def add(
    types: "drag",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_cancel")
  def add(
    types: "cancel",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_toggle")
  def add(
    types: "toggle",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchstart")
  def add(
    types: "touchstart",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_click")
  def add(
    types: "click",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseout")
  def add(
    types: "mouseout",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_stalled")
  def add(
    types: "stalled",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_change")
  def add(
    types: "change",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_gotpointercapture")
  def add(
    types: "gotpointercapture",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_error")
  def add(
    types: "error",
    callback: js.Function1[/* event */ ErrorEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationiteration")
  def add(
    types: "animationiteration",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_load")
  def add(
    types: "load",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionstart")
  def add(
    types: "transitionstart",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_auxclick")
  def add(
    types: "auxclick",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_scroll")
  def add(
    types: "scroll",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionupdate")
  def add(
    types: "compositionupdate",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionend")
  def add(
    types: "transitionend",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_progress")
  def add(
    types: "progress",
    callback: js.Function1[/* event */ ProgressEvent[EventTarget] | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_timeupdate")
  def add(
    types: "timeupdate",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_submit")
  def add(
    types: "submit",
    callback: js.Function1[/* event */ SubmitEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseleave")
  def add(
    types: "mouseleave",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_blur")
  def add(
    types: "blur",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerenter")
  def add(
    types: "pointerenter",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchcancel")
  def add(
    types: "touchcancel",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_waiting")
  def add(
    types: "waiting",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_wheel")
  def add(
    types: "wheel",
    callback: js.Function1[/* event */ WheelEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadeddata")
  def add(
    types: "loadeddata",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mousedown")
  def add(
    types: "mousedown",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionend")
  def add(
    types: "compositionend",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationend")
  def add(
    types: "webkitanimationend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pause")
  def add(
    types: "pause",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_canplaythrough")
  def add(
    types: "canplaythrough",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkittransitionend")
  def add(
    types: "webkittransitionend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_reset")
  def add(
    types: "reset",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_ratechange")
  def add(
    types: "ratechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchend")
  def add(
    types: "touchend",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_formdata")
  def add(
    types: "formdata",
    callback: js.Function1[/* event */ FormDataEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationcancel")
  def add(
    types: "animationcancel",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_abort")
  def add(
    types: "abort",
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_play")
  def add(
    types: "play",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointercancel")
  def add(
    types: "pointercancel",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_seeking")
  def add(
    types: "seeking",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mousemove")
  def add(
    types: "mousemove",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_input")
  def add(
    types: "input",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragleave")
  def add(
    types: "dragleave",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionrun")
  def add(
    types: "transitionrun",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragstart")
  def add(
    types: "dragstart",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_ended")
  def add(
    types: "ended",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_contextmenu")
  def add(
    types: "contextmenu",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerleave")
  def add(
    types: "pointerleave",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationiteration")
  def add(
    types: "webkitanimationiteration",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dblclick")
  def add(
    types: "dblclick",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keydown")
  def add(
    types: "keydown",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationstart")
  def add(
    types: "animationstart",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_invalid")
  def add(
    types: "invalid",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerout")
  def add(
    types: "pointerout",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_emptied")
  def add(
    types: "emptied",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerdown")
  def add(
    types: "pointerdown",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_playing")
  def add(
    types: "playing",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionstart")
  def add(
    types: "compositionstart",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitioncancel")
  def add(
    types: "transitioncancel",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_volumechange")
  def add(
    types: "volumechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_select")
  def add(
    types: "select",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_lostpointercapture")
  def add(
    types: "lostpointercapture",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerup")
  def add(
    types: "pointerup",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focusout")
  def add(
    types: "focusout",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchmove")
  def add(
    types: "touchmove",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragenter")
  def add(
    types: "dragenter",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_selectstart")
  def add(
    types: "selectstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_selectionchange")
  def add(
    types: "selectionchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerover")
  def add(
    types: "pointerover",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_cuechange")
  def add(
    types: "cuechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_suspend")
  def add(
    types: "suspend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_canplay")
  def add(
    types: "canplay",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseenter")
  def add(
    types: "mouseenter",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_close")
  def add(
    types: "close",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_slotchange")
  def add(
    types: "slotchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_durationchange")
  def add(
    types: "durationchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointermove")
  def add(
    types: "pointermove",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keyup")
  def add(
    types: "keyup",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadedmetadata")
  def add(
    types: "loadedmetadata",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_securitypolicyviolation")
  def add(
    types: "securitypolicyviolation",
    callback: js.Function1[/* event */ SecurityPolicyViolationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_drop")
  def add(
    types: "drop",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_beforeinput")
  def add(
    types: "beforeinput",
    callback: js.Function1[/* event */ InputEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragend")
  def add(
    types: "dragend",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focus")
  def add(
    types: "focus",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseover")
  def add(
    types: "mouseover",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationiteration")
  def add(
    types: "webkitanimationiteration",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseup")
  def add(
    types: "mouseup",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragstart")
  def add(
    types: "dragstart",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_ended")
  def add(
    types: "ended",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationstart")
  def add(
    types: "animationstart",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationend")
  def add(
    types: "webkitanimationend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionstart")
  def add(
    types: "transitionstart",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_formdata")
  def add(
    types: "formdata",
    callback: js.Function1[/* event */ FormDataEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keypress")
  def add(
    types: "keypress",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focus")
  def add(
    types: "focus",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_selectionchange")
  def add(
    types: "selectionchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchmove")
  def add(
    types: "touchmove",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_securitypolicyviolation")
  def add(
    types: "securitypolicyviolation",
    callback: js.Function1[/* event */ SecurityPolicyViolationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mousedown")
  def add(
    types: "mousedown",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerup")
  def add(
    types: "pointerup",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_stalled")
  def add(
    types: "stalled",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchcancel")
  def add(
    types: "touchcancel",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationiteration")
  def add(
    types: "animationiteration",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keyup")
  def add(
    types: "keyup",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_toggle")
  def add(
    types: "toggle",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_error")
  def add(
    types: "error",
    callback: js.Function1[/* event */ ErrorEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchstart")
  def add(
    types: "touchstart",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_blur")
  def add(
    types: "blur",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerdown")
  def add(
    types: "pointerdown",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_progress")
  def add(
    types: "progress",
    callback: js.Function1[/* event */ ProgressEvent[EventTarget] | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_suspend")
  def add(
    types: "suspend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_play")
  def add(
    types: "play",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_click")
  def add(
    types: "click",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_playing")
  def add(
    types: "playing",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerout")
  def add(
    types: "pointerout",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_select")
  def add(
    types: "select",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_cancel")
  def add(
    types: "cancel",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focusout")
  def add(
    types: "focusout",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_ratechange")
  def add(
    types: "ratechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerenter")
  def add(
    types: "pointerenter",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_scroll")
  def add(
    types: "scroll",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_gotpointercapture")
  def add(
    types: "gotpointercapture",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragover")
  def add(
    types: "dragover",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadeddata")
  def add(
    types: "loadeddata",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchend")
  def add(
    types: "touchend",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationcancel")
  def add(
    types: "animationcancel",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focusin")
  def add(
    types: "focusin",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_auxclick")
  def add(
    types: "auxclick",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_canplay")
  def add(
    types: "canplay",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_selectstart")
  def add(
    types: "selectstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitioncancel")
  def add(
    types: "transitioncancel",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionend")
  def add(
    types: "compositionend",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_slotchange")
  def add(
    types: "slotchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_change")
  def add(
    types: "change",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_canplaythrough")
  def add(
    types: "canplaythrough",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_seeked")
  def add(
    types: "seeked",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_timeupdate")
  def add(
    types: "timeupdate",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_submit")
  def add(
    types: "submit",
    callback: js.Function1[/* event */ SubmitEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointercancel")
  def add(
    types: "pointercancel",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_durationchange")
  def add(
    types: "durationchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_cuechange")
  def add(
    types: "cuechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_abort")
  def add(
    types: "abort",
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseover")
  def add(
    types: "mouseover",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_beforeinput")
  def add(
    types: "beforeinput",
    callback: js.Function1[/* event */ InputEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerleave")
  def add(
    types: "pointerleave",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_input")
  def add(
    types: "input",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_load")
  def add(
    types: "load",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_drag")
  def add(
    types: "drag",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointermove")
  def add(
    types: "pointermove",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragenter")
  def add(
    types: "dragenter",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_volumechange")
  def add(
    types: "volumechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_contextmenu")
  def add(
    types: "contextmenu",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dblclick")
  def add(
    types: "dblclick",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionupdate")
  def add(
    types: "compositionupdate",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionrun")
  def add(
    types: "transitionrun",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_resize")
  def add(
    types: "resize",
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_reset")
  def add(
    types: "reset",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mousemove")
  def add(
    types: "mousemove",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_lostpointercapture")
  def add(
    types: "lostpointercapture",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkittransitionend")
  def add(
    types: "webkittransitionend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_seeking")
  def add(
    types: "seeking",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pause")
  def add(
    types: "pause",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_close")
  def add(
    types: "close",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_wheel")
  def add(
    types: "wheel",
    callback: js.Function1[/* event */ WheelEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseleave")
  def add(
    types: "mouseleave",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionstart")
  def add(
    types: "compositionstart",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_invalid")
  def add(
    types: "invalid",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionend")
  def add(
    types: "transitionend",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseenter")
  def add(
    types: "mouseenter",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseout")
  def add(
    types: "mouseout",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragend")
  def add(
    types: "dragend",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerover")
  def add(
    types: "pointerover",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationend")
  def add(
    types: "animationend",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadstart")
  def add(
    types: "loadstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationstart")
  def add(
    types: "webkitanimationstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_drop")
  def add(
    types: "drop",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadedmetadata")
  def add(
    types: "loadedmetadata",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragleave")
  def add(
    types: "dragleave",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_emptied")
  def add(
    types: "emptied",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keydown")
  def add(
    types: "keydown",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_waiting")
  def add(
    types: "waiting",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_securitypolicyviolation")
  def add(
    types: "securitypolicyviolation",
    callback: js.Function1[/* event */ SecurityPolicyViolationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadstart")
  def add(
    types: "loadstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragenter")
  def add(
    types: "dragenter",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_seeked")
  def add(
    types: "seeked",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_toggle")
  def add(
    types: "toggle",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_scroll")
  def add(
    types: "scroll",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationend")
  def add(
    types: "animationend",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_select")
  def add(
    types: "select",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragstart")
  def add(
    types: "dragstart",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionstart")
  def add(
    types: "transitionstart",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointermove")
  def add(
    types: "pointermove",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionrun")
  def add(
    types: "transitionrun",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_slotchange")
  def add(
    types: "slotchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseenter")
  def add(
    types: "mouseenter",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_playing")
  def add(
    types: "playing",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_volumechange")
  def add(
    types: "volumechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_waiting")
  def add(
    types: "waiting",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_drop")
  def add(
    types: "drop",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keyup")
  def add(
    types: "keyup",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_suspend")
  def add(
    types: "suspend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keypress")
  def add(
    types: "keypress",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragleave")
  def add(
    types: "dragleave",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationend")
  def add(
    types: "webkitanimationend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationstart")
  def add(
    types: "animationstart",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerleave")
  def add(
    types: "pointerleave",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseleave")
  def add(
    types: "mouseleave",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionend")
  def add(
    types: "compositionend",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkittransitionend")
  def add(
    types: "webkittransitionend",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_lostpointercapture")
  def add(
    types: "lostpointercapture",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_input")
  def add(
    types: "input",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_change")
  def add(
    types: "change",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseout")
  def add(
    types: "mouseout",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_reset")
  def add(
    types: "reset",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_submit")
  def add(
    types: "submit",
    callback: js.Function1[/* event */ SubmitEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_drag")
  def add(
    types: "drag",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationcancel")
  def add(
    types: "animationcancel",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_timeupdate")
  def add(
    types: "timeupdate",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_click")
  def add(
    types: "click",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_cancel")
  def add(
    types: "cancel",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_selectionchange")
  def add(
    types: "selectionchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pause")
  def add(
    types: "pause",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_ratechange")
  def add(
    types: "ratechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_wheel")
  def add(
    types: "wheel",
    callback: js.Function1[/* event */ WheelEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragover")
  def add(
    types: "dragover",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitionend")
  def add(
    types: "transitionend",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_contextmenu")
  def add(
    types: "contextmenu",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_animationiteration")
  def add(
    types: "animationiteration",
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerdown")
  def add(
    types: "pointerdown",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseover")
  def add(
    types: "mouseover",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadedmetadata")
  def add(
    types: "loadedmetadata",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_ended")
  def add(
    types: "ended",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchend")
  def add(
    types: "touchend",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerout")
  def add(
    types: "pointerout",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationiteration")
  def add(
    types: "webkitanimationiteration",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mouseup")
  def add(
    types: "mouseup",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointercancel")
  def add(
    types: "pointercancel",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_webkitanimationstart")
  def add(
    types: "webkitanimationstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_canplay")
  def add(
    types: "canplay",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_cuechange")
  def add(
    types: "cuechange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_beforeinput")
  def add(
    types: "beforeinput",
    callback: js.Function1[/* event */ InputEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionstart")
  def add(
    types: "compositionstart",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_transitioncancel")
  def add(
    types: "transitioncancel",
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_close")
  def add(
    types: "close",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dblclick")
  def add(
    types: "dblclick",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_abort")
  def add(
    types: "abort",
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchmove")
  def add(
    types: "touchmove",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_durationchange")
  def add(
    types: "durationchange",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_auxclick")
  def add(
    types: "auxclick",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_load")
  def add(
    types: "load",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerup")
  def add(
    types: "pointerup",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_emptied")
  def add(
    types: "emptied",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchcancel")
  def add(
    types: "touchcancel",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerover")
  def add(
    types: "pointerover",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_seeking")
  def add(
    types: "seeking",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_invalid")
  def add(
    types: "invalid",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_formdata")
  def add(
    types: "formdata",
    callback: js.Function1[/* event */ FormDataEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_canplaythrough")
  def add(
    types: "canplaythrough",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_blur")
  def add(
    types: "blur",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mousemove")
  def add(
    types: "mousemove",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focusout")
  def add(
    types: "focusout",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_mousedown")
  def add(
    types: "mousedown",
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_compositionupdate")
  def add(
    types: "compositionupdate",
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_pointerenter")
  def add(
    types: "pointerenter",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_keydown")
  def add(
    types: "keydown",
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_loadeddata")
  def add(
    types: "loadeddata",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_selectstart")
  def add(
    types: "selectstart",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_play")
  def add(
    types: "play",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_progress")
  def add(
    types: "progress",
    callback: js.Function1[/* event */ ProgressEvent[EventTarget] | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_error")
  def add(
    types: "error",
    callback: js.Function1[/* event */ ErrorEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focus")
  def add(
    types: "focus",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_focusin")
  def add(
    types: "focusin",
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_touchstart")
  def add(
    types: "touchstart",
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_gotpointercapture")
  def add(
    types: "gotpointercapture",
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_dragend")
  def add(
    types: "dragend",
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_resize")
  def add(
    types: "resize",
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  @scala.annotation.targetName("add_stalled")
  def add(
    types: "stalled",
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  
  def removeAll(): this.type = js.native
}
