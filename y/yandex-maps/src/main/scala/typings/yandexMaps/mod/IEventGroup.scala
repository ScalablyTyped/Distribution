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
import typings.yandexMaps.yandexMapsStrings.abort
import typings.yandexMaps.yandexMapsStrings.animationcancel
import typings.yandexMaps.yandexMapsStrings.animationend
import typings.yandexMaps.yandexMapsStrings.animationiteration
import typings.yandexMaps.yandexMapsStrings.animationstart
import typings.yandexMaps.yandexMapsStrings.auxclick
import typings.yandexMaps.yandexMapsStrings.beforeinput
import typings.yandexMaps.yandexMapsStrings.blur
import typings.yandexMaps.yandexMapsStrings.canplay
import typings.yandexMaps.yandexMapsStrings.canplaythrough
import typings.yandexMaps.yandexMapsStrings.change
import typings.yandexMaps.yandexMapsStrings.click
import typings.yandexMaps.yandexMapsStrings.close
import typings.yandexMaps.yandexMapsStrings.compositionend
import typings.yandexMaps.yandexMapsStrings.compositionstart
import typings.yandexMaps.yandexMapsStrings.compositionupdate
import typings.yandexMaps.yandexMapsStrings.contextmenu
import typings.yandexMaps.yandexMapsStrings.cuechange
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

@js.native
trait IEventGroup extends StObject {
  
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
  @JSName("add")
  def add_abort(types: abort, callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_abort(
    types: abort,
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_abort(
    types: abort,
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_abort(
    types: abort,
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationcancel(
    types: animationcancel,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_animationcancel(
    types: animationcancel,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_animationcancel(
    types: animationcancel,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationcancel(
    types: animationcancel,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationend(
    types: animationend,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_animationend(
    types: animationend,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_animationend(
    types: animationend,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationend(
    types: animationend,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationiteration(
    types: animationiteration,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_animationiteration(
    types: animationiteration,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_animationiteration(
    types: animationiteration,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationiteration(
    types: animationiteration,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationstart(
    types: animationstart,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_animationstart(
    types: animationstart,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_animationstart(
    types: animationstart,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationstart(
    types: animationstart,
    callback: js.Function1[/* event */ AnimationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_auxclick(
    types: auxclick,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_auxclick(
    types: auxclick,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_auxclick(
    types: auxclick,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_auxclick(
    types: auxclick,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_beforeinput(
    types: beforeinput,
    callback: js.Function1[/* event */ InputEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_beforeinput(
    types: beforeinput,
    callback: js.Function1[/* event */ InputEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_beforeinput(
    types: beforeinput,
    callback: js.Function1[/* event */ InputEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_beforeinput(
    types: beforeinput,
    callback: js.Function1[/* event */ InputEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_blur(types: blur, callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_blur(
    types: blur,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_blur(
    types: blur,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_blur(
    types: blur,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_canplay(types: canplay, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_canplay(
    types: canplay,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_canplay(
    types: canplay,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_canplay(
    types: canplay,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_canplaythrough(
    types: canplaythrough,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_canplaythrough(
    types: canplaythrough,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_canplaythrough(
    types: canplaythrough,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_canplaythrough(
    types: canplaythrough,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_change(types: change, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_change(
    types: change,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_change(
    types: change,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_change(
    types: change,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_click(
    types: click,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_click(
    types: click,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_click(
    types: click,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_click(
    types: click,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_close(types: close, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_close(
    types: close,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_close(
    types: close,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_close(
    types: close,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionend(
    types: compositionend,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_compositionend(
    types: compositionend,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_compositionend(
    types: compositionend,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionend(
    types: compositionend,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionstart(
    types: compositionstart,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_compositionstart(
    types: compositionstart,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_compositionstart(
    types: compositionstart,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionstart(
    types: compositionstart,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionupdate(
    types: compositionupdate,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_compositionupdate(
    types: compositionupdate,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_compositionupdate(
    types: compositionupdate,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionupdate(
    types: compositionupdate,
    callback: js.Function1[/* event */ CompositionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_contextmenu(
    types: contextmenu,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_contextmenu(
    types: contextmenu,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_contextmenu(
    types: contextmenu,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_contextmenu(
    types: contextmenu,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_cuechange(types: cuechange, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_cuechange(
    types: cuechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_cuechange(
    types: cuechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_cuechange(
    types: cuechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dblclick(
    types: dblclick,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_dblclick(
    types: dblclick,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dblclick(
    types: dblclick,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dblclick(
    types: dblclick,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_drag(types: drag, callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_drag(
    types: drag,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_drag(
    types: drag,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_drag(
    types: drag,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragend(
    types: dragend,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_dragend(
    types: dragend,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragend(
    types: dragend,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragend(
    types: dragend,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragenter(
    types: dragenter,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_dragenter(
    types: dragenter,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragenter(
    types: dragenter,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragenter(
    types: dragenter,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragleave(
    types: dragleave,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_dragleave(
    types: dragleave,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragleave(
    types: dragleave,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragleave(
    types: dragleave,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragover(
    types: dragover,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_dragover(
    types: dragover,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragover(
    types: dragover,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragover(
    types: dragover,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragstart(
    types: dragstart,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_dragstart(
    types: dragstart,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragstart(
    types: dragstart,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragstart(
    types: dragstart,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_drop(types: drop, callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_drop(
    types: drop,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_drop(
    types: drop,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_drop(
    types: drop,
    callback: js.Function1[/* event */ DragEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_durationchange(
    types: durationchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_durationchange(
    types: durationchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_durationchange(
    types: durationchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_durationchange(
    types: durationchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_emptied(types: emptied, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_emptied(
    types: emptied,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_emptied(
    types: emptied,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_emptied(
    types: emptied,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_ended(types: ended, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_ended(
    types: ended,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_ended(
    types: ended,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_ended(
    types: ended,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_error(
    types: error,
    callback: js.Function1[/* event */ ErrorEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_error(
    types: error,
    callback: js.Function1[/* event */ ErrorEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_error(
    types: error,
    callback: js.Function1[/* event */ ErrorEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_error(
    types: error,
    callback: js.Function1[/* event */ ErrorEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focus(
    types: focus,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_focus(
    types: focus,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_focus(
    types: focus,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focus(
    types: focus,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focusin(
    types: focusin,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_focusin(
    types: focusin,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_focusin(
    types: focusin,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focusin(
    types: focusin,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focusout(
    types: focusout,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_focusout(
    types: focusout,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_focusout(
    types: focusout,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focusout(
    types: focusout,
    callback: js.Function1[/* event */ FocusEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_formdata(
    types: formdata,
    callback: js.Function1[/* event */ FormDataEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_formdata(
    types: formdata,
    callback: js.Function1[/* event */ FormDataEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_formdata(
    types: formdata,
    callback: js.Function1[/* event */ FormDataEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_formdata(
    types: formdata,
    callback: js.Function1[/* event */ FormDataEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_gotpointercapture(
    types: gotpointercapture,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_gotpointercapture(
    types: gotpointercapture,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_gotpointercapture(
    types: gotpointercapture,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_gotpointercapture(
    types: gotpointercapture,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_input(types: input, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_input(
    types: input,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_input(
    types: input,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_input(
    types: input,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_invalid(types: invalid, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_invalid(
    types: invalid,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_invalid(
    types: invalid,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_invalid(
    types: invalid,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keydown(
    types: keydown,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_keydown(
    types: keydown,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_keydown(
    types: keydown,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keydown(
    types: keydown,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keypress(
    types: keypress,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_keypress(
    types: keypress,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_keypress(
    types: keypress,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keypress(
    types: keypress,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keyup(
    types: keyup,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_keyup(
    types: keyup,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_keyup(
    types: keyup,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keyup(
    types: keyup,
    callback: js.Function1[/* event */ KeyboardEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_load(types: load, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_load(
    types: load,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_load(
    types: load,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_load(
    types: load,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadeddata(
    types: loadeddata,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_loadeddata(
    types: loadeddata,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_loadeddata(
    types: loadeddata,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadeddata(
    types: loadeddata,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadedmetadata(
    types: loadedmetadata,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_loadedmetadata(
    types: loadedmetadata,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_loadedmetadata(
    types: loadedmetadata,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadedmetadata(
    types: loadedmetadata,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadstart(types: loadstart, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_loadstart(
    types: loadstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_loadstart(
    types: loadstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadstart(
    types: loadstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_lostpointercapture(
    types: lostpointercapture,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_lostpointercapture(
    types: lostpointercapture,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_lostpointercapture(
    types: lostpointercapture,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_lostpointercapture(
    types: lostpointercapture,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseenter(
    types: mouseenter,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_mouseenter(
    types: mouseenter,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseenter(
    types: mouseenter,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseenter(
    types: mouseenter,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseleave(
    types: mouseleave,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_mouseleave(
    types: mouseleave,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseleave(
    types: mouseleave,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseleave(
    types: mouseleave,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousemove(
    types: mousemove,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_mousemove(
    types: mousemove,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mousemove(
    types: mousemove,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousemove(
    types: mousemove,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseout(
    types: mouseout,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_mouseout(
    types: mouseout,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseout(
    types: mouseout,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseout(
    types: mouseout,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseover(
    types: mouseover,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_mouseover(
    types: mouseover,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseover(
    types: mouseover,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseover(
    types: mouseover,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseup(
    types: mouseup,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_mouseup(
    types: mouseup,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseup(
    types: mouseup,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseup(
    types: mouseup,
    callback: js.Function1[/* event */ MouseEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pause(types: pause, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_pause(
    types: pause,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pause(
    types: pause,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pause(
    types: pause,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_play(types: play, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_play(
    types: play,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_play(
    types: play,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_play(
    types: play,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_playing(types: playing, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_playing(
    types: playing,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_playing(
    types: playing,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_playing(
    types: playing,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointercancel(
    types: pointercancel,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointercancel(
    types: pointercancel,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointercancel(
    types: pointercancel,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointercancel(
    types: pointercancel,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerdown(
    types: pointerdown,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointerdown(
    types: pointerdown,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerdown(
    types: pointerdown,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerdown(
    types: pointerdown,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerenter(
    types: pointerenter,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointerenter(
    types: pointerenter,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerenter(
    types: pointerenter,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerenter(
    types: pointerenter,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerleave(
    types: pointerleave,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointerleave(
    types: pointerleave,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerleave(
    types: pointerleave,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerleave(
    types: pointerleave,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointermove(
    types: pointermove,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointermove(
    types: pointermove,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointermove(
    types: pointermove,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointermove(
    types: pointermove,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerout(
    types: pointerout,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointerout(
    types: pointerout,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerout(
    types: pointerout,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerout(
    types: pointerout,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerover(
    types: pointerover,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointerover(
    types: pointerover,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerover(
    types: pointerover,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerover(
    types: pointerover,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerup(
    types: pointerup,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointerup(
    types: pointerup,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerup(
    types: pointerup,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerup(
    types: pointerup,
    callback: js.Function1[/* event */ PointerEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_progress(
    types: progress,
    callback: js.Function1[/* event */ ProgressEvent[EventTarget] | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_progress(
    types: progress,
    callback: js.Function1[/* event */ ProgressEvent[EventTarget] | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_progress(
    types: progress,
    callback: js.Function1[/* event */ ProgressEvent[EventTarget] | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_progress(
    types: progress,
    callback: js.Function1[/* event */ ProgressEvent[EventTarget] | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_ratechange(
    types: ratechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_ratechange(
    types: ratechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_ratechange(
    types: ratechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_ratechange(
    types: ratechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_reset(types: reset, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_reset(
    types: reset,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_reset(
    types: reset,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_reset(
    types: reset,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_resize(types: resize, callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_resize(
    types: resize,
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_resize(
    types: resize,
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_resize(
    types: resize,
    callback: js.Function1[/* event */ UIEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_scroll(types: scroll, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_scroll(
    types: scroll,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_scroll(
    types: scroll,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_scroll(
    types: scroll,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_securitypolicyviolation(
    types: securitypolicyviolation,
    callback: js.Function1[/* event */ SecurityPolicyViolationEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_securitypolicyviolation(
    types: securitypolicyviolation,
    callback: js.Function1[/* event */ SecurityPolicyViolationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_securitypolicyviolation(
    types: securitypolicyviolation,
    callback: js.Function1[/* event */ SecurityPolicyViolationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_securitypolicyviolation(
    types: securitypolicyviolation,
    callback: js.Function1[/* event */ SecurityPolicyViolationEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_seeked(types: seeked, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_seeked(
    types: seeked,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_seeked(
    types: seeked,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_seeked(
    types: seeked,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_seeking(types: seeking, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_seeking(
    types: seeking,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_seeking(
    types: seeking,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_seeking(
    types: seeking,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_select(types: select, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_select(
    types: select,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_select(
    types: select,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_select(
    types: select,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_selectionchange(
    types: selectionchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_selectionchange(
    types: selectionchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_selectionchange(
    types: selectionchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_selectionchange(
    types: selectionchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_selectstart(
    types: selectstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_selectstart(
    types: selectstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_selectstart(
    types: selectstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_selectstart(
    types: selectstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_slotchange(
    types: slotchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_slotchange(
    types: slotchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_slotchange(
    types: slotchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_slotchange(
    types: slotchange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_stalled(types: stalled, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_stalled(
    types: stalled,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_stalled(
    types: stalled,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_stalled(
    types: stalled,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_submit(
    types: submit,
    callback: js.Function1[/* event */ SubmitEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_submit(
    types: submit,
    callback: js.Function1[/* event */ SubmitEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_submit(
    types: submit,
    callback: js.Function1[/* event */ SubmitEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_submit(
    types: submit,
    callback: js.Function1[/* event */ SubmitEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_suspend(types: suspend, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_suspend(
    types: suspend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_suspend(
    types: suspend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_suspend(
    types: suspend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_timeupdate(
    types: timeupdate,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_timeupdate(
    types: timeupdate,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_timeupdate(
    types: timeupdate,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_timeupdate(
    types: timeupdate,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_toggle(types: toggle, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_toggle(
    types: toggle,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_toggle(
    types: toggle,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_toggle(
    types: toggle,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchcancel(
    types: touchcancel,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_touchcancel(
    types: touchcancel,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_touchcancel(
    types: touchcancel,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchcancel(
    types: touchcancel,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchend(
    types: touchend,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_touchend(
    types: touchend,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_touchend(
    types: touchend,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchend(
    types: touchend,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchmove(
    types: touchmove,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_touchmove(
    types: touchmove,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_touchmove(
    types: touchmove,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchmove(
    types: touchmove,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchstart(
    types: touchstart,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_touchstart(
    types: touchstart,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_touchstart(
    types: touchstart,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchstart(
    types: touchstart,
    callback: js.Function1[/* event */ TouchEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitioncancel(
    types: transitioncancel,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_transitioncancel(
    types: transitioncancel,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_transitioncancel(
    types: transitioncancel,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitioncancel(
    types: transitioncancel,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionend(
    types: transitionend,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_transitionend(
    types: transitionend,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_transitionend(
    types: transitionend,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionend(
    types: transitionend,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionrun(
    types: transitionrun,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_transitionrun(
    types: transitionrun,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_transitionrun(
    types: transitionrun,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionrun(
    types: transitionrun,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionstart(
    types: transitionstart,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_transitionstart(
    types: transitionstart,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_transitionstart(
    types: transitionstart,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionstart(
    types: transitionstart,
    callback: js.Function1[/* event */ TransitionEvent | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_volumechange(
    types: volumechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_volumechange(
    types: volumechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_volumechange(
    types: volumechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_volumechange(
    types: volumechange,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_waiting(types: waiting, callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]): this.type = js.native
  @JSName("add")
  def add_waiting(
    types: waiting,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_waiting(
    types: waiting,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_waiting(
    types: waiting,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationend(
    types: webkitanimationend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationend(
    types: webkitanimationend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationend(
    types: webkitanimationend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationend(
    types: webkitanimationend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationiteration(
    types: webkitanimationiteration,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationiteration(
    types: webkitanimationiteration,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationiteration(
    types: webkitanimationiteration,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationiteration(
    types: webkitanimationiteration,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationstart(
    types: webkitanimationstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationstart(
    types: webkitanimationstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationstart(
    types: webkitanimationstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationstart(
    types: webkitanimationstart,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkittransitionend(
    types: webkittransitionend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_webkittransitionend(
    types: webkittransitionend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_webkittransitionend(
    types: webkittransitionend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkittransitionend(
    types: webkittransitionend,
    callback: js.Function1[/* event */ Event | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_wheel(
    types: wheel,
    callback: js.Function1[/* event */ WheelEvent | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  @JSName("add")
  def add_wheel(
    types: wheel,
    callback: js.Function1[/* event */ WheelEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_wheel(
    types: wheel,
    callback: js.Function1[/* event */ WheelEvent | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_wheel(
    types: wheel,
    callback: js.Function1[/* event */ WheelEvent | (IEvent[js.Object, js.Object]), Unit],
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
