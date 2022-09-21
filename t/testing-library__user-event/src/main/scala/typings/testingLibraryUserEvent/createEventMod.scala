package typings.testingLibraryUserEvent

import typings.std.AnimationEvent
import typings.std.ClipboardEvent
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
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.DOMContentLoaded
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.abort
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.animationcancel
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.animationend_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.animationiteration_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.animationstart_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.auxclick
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.beforeinput_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.blur
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.canplay_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.canplaythrough_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.change
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.click
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.close
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.compositionend_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.compositionstart_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.compositionupdate_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.contextmenu_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.copy
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.cuechange
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.cut
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.dblclick_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.drag
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.dragend_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.dragenter_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.dragleave_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.dragover_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.dragstart_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.drop
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.durationchange_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.emptied
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.ended
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.error
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.focus
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.focusin_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.focusout_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.formdata
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.fullscreenchange
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.fullscreenerror
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.gotpointercapture_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.input
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.invalid
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.keydown_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.keypress_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.keyup_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.load
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.loadeddata_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.loadedmetadata_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.loadstart_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.lostpointercapture_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.mousedown_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseenter_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseleave_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.mousemove_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseout_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseover_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseup_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.paste
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pause
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.play
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.playing
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointercancel_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerdown_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerenter_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerleave_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerlockchange
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerlockerror
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointermove_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerout_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerover_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerup_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.progress
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.ratechange_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.readystatechange
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.reset
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.resize
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.scroll
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.securitypolicyviolation
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.seeked
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.seeking
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.select
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.selectionchange
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.selectstart
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.slotchange
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.stalled
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.submit
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.suspend
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.timeupdate_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.toggle
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.touchcancel_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.touchend_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.touchmove_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.touchstart_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.transitioncancel_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.transitionend_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.transitionrun_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.transitionstart_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.visibilitychange
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.volumechange_
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.waiting
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationend
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationiteration
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationstart
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.webkittransitionend
import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.wheel
import typings.testingLibraryUserEvent.typesMod.EventTypeInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createEventMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/createEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEvent_DOMContentLoaded(`type`: DOMContentLoaded, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_DOMContentLoaded(`type`: DOMContentLoaded, target: Element, init: EventTypeInit[DOMContentLoaded]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_abort(`type`: abort, target: Element): UIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[UIEvent]
  inline def createEvent_abort(`type`: abort, target: Element, init: EventTypeInit[abort]): UIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[UIEvent]
  
  inline def createEvent_animationcancel(`type`: animationcancel, target: Element): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  inline def createEvent_animationcancel(`type`: animationcancel, target: Element, init: EventTypeInit[animationcancel]): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  
  inline def createEvent_animationend(`type`: animationend_, target: Element): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  inline def createEvent_animationend(`type`: animationend_, target: Element, init: EventTypeInit[animationend_]): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  
  inline def createEvent_animationiteration(`type`: animationiteration_, target: Element): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  inline def createEvent_animationiteration(`type`: animationiteration_, target: Element, init: EventTypeInit[animationiteration_]): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  
  inline def createEvent_animationstart(`type`: animationstart_, target: Element): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  inline def createEvent_animationstart(`type`: animationstart_, target: Element, init: EventTypeInit[animationstart_]): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  
  inline def createEvent_auxclick(`type`: auxclick, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_auxclick(`type`: auxclick, target: Element, init: EventTypeInit[auxclick]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_beforeinput(`type`: beforeinput_, target: Element): InputEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[InputEvent]
  inline def createEvent_beforeinput(`type`: beforeinput_, target: Element, init: EventTypeInit[beforeinput_]): InputEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[InputEvent]
  
  inline def createEvent_blur(`type`: blur, target: Element): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  inline def createEvent_blur(`type`: blur, target: Element, init: EventTypeInit[blur]): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  
  inline def createEvent_canplay(`type`: canplay_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_canplay(`type`: canplay_, target: Element, init: EventTypeInit[canplay_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_canplaythrough(`type`: canplaythrough_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_canplaythrough(`type`: canplaythrough_, target: Element, init: EventTypeInit[canplaythrough_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_change(`type`: change, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_change(`type`: change, target: Element, init: EventTypeInit[change]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_click(`type`: click, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_click(`type`: click, target: Element, init: EventTypeInit[click]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_close(`type`: close, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_close(`type`: close, target: Element, init: EventTypeInit[close]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_compositionend(`type`: compositionend_, target: Element): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  inline def createEvent_compositionend(`type`: compositionend_, target: Element, init: EventTypeInit[compositionend_]): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  
  inline def createEvent_compositionstart(`type`: compositionstart_, target: Element): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  inline def createEvent_compositionstart(`type`: compositionstart_, target: Element, init: EventTypeInit[compositionstart_]): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  
  inline def createEvent_compositionupdate(`type`: compositionupdate_, target: Element): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  inline def createEvent_compositionupdate(`type`: compositionupdate_, target: Element, init: EventTypeInit[compositionupdate_]): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  
  inline def createEvent_contextmenu(`type`: contextmenu_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_contextmenu(`type`: contextmenu_, target: Element, init: EventTypeInit[contextmenu_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_copy(`type`: copy, target: Element): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  inline def createEvent_copy(`type`: copy, target: Element, init: EventTypeInit[copy]): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  
  inline def createEvent_cuechange(`type`: cuechange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_cuechange(`type`: cuechange, target: Element, init: EventTypeInit[cuechange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_cut(`type`: cut, target: Element): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  inline def createEvent_cut(`type`: cut, target: Element, init: EventTypeInit[cut]): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  
  inline def createEvent_dblclick(`type`: dblclick_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_dblclick(`type`: dblclick_, target: Element, init: EventTypeInit[dblclick_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_drag(`type`: drag, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_drag(`type`: drag, target: Element, init: EventTypeInit[drag]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragend(`type`: dragend_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragend(`type`: dragend_, target: Element, init: EventTypeInit[dragend_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragenter(`type`: dragenter_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragenter(`type`: dragenter_, target: Element, init: EventTypeInit[dragenter_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragleave(`type`: dragleave_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragleave(`type`: dragleave_, target: Element, init: EventTypeInit[dragleave_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragover(`type`: dragover_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragover(`type`: dragover_, target: Element, init: EventTypeInit[dragover_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragstart(`type`: dragstart_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragstart(`type`: dragstart_, target: Element, init: EventTypeInit[dragstart_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_drop(`type`: drop, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_drop(`type`: drop, target: Element, init: EventTypeInit[drop]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_durationchange(`type`: durationchange_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_durationchange(`type`: durationchange_, target: Element, init: EventTypeInit[durationchange_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_emptied(`type`: emptied, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_emptied(`type`: emptied, target: Element, init: EventTypeInit[emptied]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_ended(`type`: ended, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_ended(`type`: ended, target: Element, init: EventTypeInit[ended]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_error(`type`: error, target: Element): ErrorEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ErrorEvent]
  inline def createEvent_error(`type`: error, target: Element, init: EventTypeInit[error]): ErrorEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ErrorEvent]
  
  inline def createEvent_focus(`type`: focus, target: Element): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  inline def createEvent_focus(`type`: focus, target: Element, init: EventTypeInit[focus]): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  
  inline def createEvent_focusin(`type`: focusin_, target: Element): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  inline def createEvent_focusin(`type`: focusin_, target: Element, init: EventTypeInit[focusin_]): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  
  inline def createEvent_focusout(`type`: focusout_, target: Element): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  inline def createEvent_focusout(`type`: focusout_, target: Element, init: EventTypeInit[focusout_]): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  
  inline def createEvent_formdata(`type`: formdata, target: Element): FormDataEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FormDataEvent]
  inline def createEvent_formdata(`type`: formdata, target: Element, init: EventTypeInit[formdata]): FormDataEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FormDataEvent]
  
  inline def createEvent_fullscreenchange(`type`: fullscreenchange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_fullscreenchange(`type`: fullscreenchange, target: Element, init: EventTypeInit[fullscreenchange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_fullscreenerror(`type`: fullscreenerror, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_fullscreenerror(`type`: fullscreenerror, target: Element, init: EventTypeInit[fullscreenerror]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_gotpointercapture(`type`: gotpointercapture_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_gotpointercapture(`type`: gotpointercapture_, target: Element, init: EventTypeInit[gotpointercapture_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_input(`type`: input, target: Element): InputEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[InputEvent]
  inline def createEvent_input(`type`: input, target: Element, init: EventTypeInit[input]): InputEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[InputEvent]
  
  inline def createEvent_invalid(`type`: invalid, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_invalid(`type`: invalid, target: Element, init: EventTypeInit[invalid]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_keydown(`type`: keydown_, target: Element): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  inline def createEvent_keydown(`type`: keydown_, target: Element, init: EventTypeInit[keydown_]): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  
  inline def createEvent_keypress(`type`: keypress_, target: Element): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  inline def createEvent_keypress(`type`: keypress_, target: Element, init: EventTypeInit[keypress_]): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  
  inline def createEvent_keyup(`type`: keyup_, target: Element): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  inline def createEvent_keyup(`type`: keyup_, target: Element, init: EventTypeInit[keyup_]): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  
  inline def createEvent_load(`type`: load, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_load(`type`: load, target: Element, init: EventTypeInit[load]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_loadeddata(`type`: loadeddata_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_loadeddata(`type`: loadeddata_, target: Element, init: EventTypeInit[loadeddata_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_loadedmetadata(`type`: loadedmetadata_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_loadedmetadata(`type`: loadedmetadata_, target: Element, init: EventTypeInit[loadedmetadata_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_loadstart(`type`: loadstart_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_loadstart(`type`: loadstart_, target: Element, init: EventTypeInit[loadstart_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_lostpointercapture(`type`: lostpointercapture_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_lostpointercapture(`type`: lostpointercapture_, target: Element, init: EventTypeInit[lostpointercapture_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_mousedown(`type`: mousedown_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mousedown(`type`: mousedown_, target: Element, init: EventTypeInit[mousedown_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseenter(`type`: mouseenter_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseenter(`type`: mouseenter_, target: Element, init: EventTypeInit[mouseenter_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseleave(`type`: mouseleave_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseleave(`type`: mouseleave_, target: Element, init: EventTypeInit[mouseleave_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mousemove(`type`: mousemove_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mousemove(`type`: mousemove_, target: Element, init: EventTypeInit[mousemove_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseout(`type`: mouseout_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseout(`type`: mouseout_, target: Element, init: EventTypeInit[mouseout_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseover(`type`: mouseover_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseover(`type`: mouseover_, target: Element, init: EventTypeInit[mouseover_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseup(`type`: mouseup_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseup(`type`: mouseup_, target: Element, init: EventTypeInit[mouseup_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_paste(`type`: paste, target: Element): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  inline def createEvent_paste(`type`: paste, target: Element, init: EventTypeInit[paste]): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  
  inline def createEvent_pause(`type`: pause, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_pause(`type`: pause, target: Element, init: EventTypeInit[pause]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_play(`type`: play, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_play(`type`: play, target: Element, init: EventTypeInit[play]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_playing(`type`: playing, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_playing(`type`: playing, target: Element, init: EventTypeInit[playing]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_pointercancel(`type`: pointercancel_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointercancel(`type`: pointercancel_, target: Element, init: EventTypeInit[pointercancel_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerdown(`type`: pointerdown_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerdown(`type`: pointerdown_, target: Element, init: EventTypeInit[pointerdown_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerenter(`type`: pointerenter_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerenter(`type`: pointerenter_, target: Element, init: EventTypeInit[pointerenter_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerleave(`type`: pointerleave_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerleave(`type`: pointerleave_, target: Element, init: EventTypeInit[pointerleave_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerlockchange(`type`: pointerlockchange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_pointerlockchange(`type`: pointerlockchange, target: Element, init: EventTypeInit[pointerlockchange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_pointerlockerror(`type`: pointerlockerror, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_pointerlockerror(`type`: pointerlockerror, target: Element, init: EventTypeInit[pointerlockerror]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_pointermove(`type`: pointermove_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointermove(`type`: pointermove_, target: Element, init: EventTypeInit[pointermove_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerout(`type`: pointerout_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerout(`type`: pointerout_, target: Element, init: EventTypeInit[pointerout_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerover(`type`: pointerover_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerover(`type`: pointerover_, target: Element, init: EventTypeInit[pointerover_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerup(`type`: pointerup_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerup(`type`: pointerup_, target: Element, init: EventTypeInit[pointerup_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_progress(`type`: progress, target: Element): ProgressEvent[EventTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ProgressEvent[EventTarget]]
  inline def createEvent_progress(`type`: progress, target: Element, init: EventTypeInit[progress]): ProgressEvent[EventTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ProgressEvent[EventTarget]]
  
  inline def createEvent_ratechange(`type`: ratechange_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_ratechange(`type`: ratechange_, target: Element, init: EventTypeInit[ratechange_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_readystatechange(`type`: readystatechange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_readystatechange(`type`: readystatechange, target: Element, init: EventTypeInit[readystatechange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_reset(`type`: reset, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_reset(`type`: reset, target: Element, init: EventTypeInit[reset]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_resize(`type`: resize, target: Element): UIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[UIEvent]
  inline def createEvent_resize(`type`: resize, target: Element, init: EventTypeInit[resize]): UIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[UIEvent]
  
  inline def createEvent_scroll(`type`: scroll, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_scroll(`type`: scroll, target: Element, init: EventTypeInit[scroll]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_securitypolicyviolation(`type`: securitypolicyviolation, target: Element): SecurityPolicyViolationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[SecurityPolicyViolationEvent]
  inline def createEvent_securitypolicyviolation(`type`: securitypolicyviolation, target: Element, init: EventTypeInit[securitypolicyviolation]): SecurityPolicyViolationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[SecurityPolicyViolationEvent]
  
  inline def createEvent_seeked(`type`: seeked, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_seeked(`type`: seeked, target: Element, init: EventTypeInit[seeked]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_seeking(`type`: seeking, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_seeking(`type`: seeking, target: Element, init: EventTypeInit[seeking]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_select(`type`: select, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_select(`type`: select, target: Element, init: EventTypeInit[select]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_selectionchange(`type`: selectionchange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_selectionchange(`type`: selectionchange, target: Element, init: EventTypeInit[selectionchange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_selectstart(`type`: selectstart, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_selectstart(`type`: selectstart, target: Element, init: EventTypeInit[selectstart]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_slotchange(`type`: slotchange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_slotchange(`type`: slotchange, target: Element, init: EventTypeInit[slotchange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_stalled(`type`: stalled, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_stalled(`type`: stalled, target: Element, init: EventTypeInit[stalled]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_submit(`type`: submit, target: Element): SubmitEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[SubmitEvent]
  inline def createEvent_submit(`type`: submit, target: Element, init: EventTypeInit[submit]): SubmitEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[SubmitEvent]
  
  inline def createEvent_suspend(`type`: suspend, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_suspend(`type`: suspend, target: Element, init: EventTypeInit[suspend]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_timeupdate(`type`: timeupdate_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_timeupdate(`type`: timeupdate_, target: Element, init: EventTypeInit[timeupdate_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_toggle(`type`: toggle, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_toggle(`type`: toggle, target: Element, init: EventTypeInit[toggle]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_touchcancel(`type`: touchcancel_, target: Element): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  inline def createEvent_touchcancel(`type`: touchcancel_, target: Element, init: EventTypeInit[touchcancel_]): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  
  inline def createEvent_touchend(`type`: touchend_, target: Element): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  inline def createEvent_touchend(`type`: touchend_, target: Element, init: EventTypeInit[touchend_]): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  
  inline def createEvent_touchmove(`type`: touchmove_, target: Element): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  inline def createEvent_touchmove(`type`: touchmove_, target: Element, init: EventTypeInit[touchmove_]): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  
  inline def createEvent_touchstart(`type`: touchstart_, target: Element): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  inline def createEvent_touchstart(`type`: touchstart_, target: Element, init: EventTypeInit[touchstart_]): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  
  inline def createEvent_transitioncancel(`type`: transitioncancel_, target: Element): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  inline def createEvent_transitioncancel(`type`: transitioncancel_, target: Element, init: EventTypeInit[transitioncancel_]): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  
  inline def createEvent_transitionend(`type`: transitionend_, target: Element): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  inline def createEvent_transitionend(`type`: transitionend_, target: Element, init: EventTypeInit[transitionend_]): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  
  inline def createEvent_transitionrun(`type`: transitionrun_, target: Element): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  inline def createEvent_transitionrun(`type`: transitionrun_, target: Element, init: EventTypeInit[transitionrun_]): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  
  inline def createEvent_transitionstart(`type`: transitionstart_, target: Element): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  inline def createEvent_transitionstart(`type`: transitionstart_, target: Element, init: EventTypeInit[transitionstart_]): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  
  inline def createEvent_visibilitychange(`type`: visibilitychange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_visibilitychange(`type`: visibilitychange, target: Element, init: EventTypeInit[visibilitychange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_volumechange(`type`: volumechange_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_volumechange(`type`: volumechange_, target: Element, init: EventTypeInit[volumechange_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_waiting(`type`: waiting, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_waiting(`type`: waiting, target: Element, init: EventTypeInit[waiting]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_webkitanimationend(`type`: webkitanimationend, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_webkitanimationend(`type`: webkitanimationend, target: Element, init: EventTypeInit[webkitanimationend]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_webkitanimationiteration(`type`: webkitanimationiteration, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_webkitanimationiteration(`type`: webkitanimationiteration, target: Element, init: EventTypeInit[webkitanimationiteration]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_webkitanimationstart(`type`: webkitanimationstart, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_webkitanimationstart(`type`: webkitanimationstart, target: Element, init: EventTypeInit[webkitanimationstart]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_webkittransitionend(`type`: webkittransitionend, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_webkittransitionend(`type`: webkittransitionend, target: Element, init: EventTypeInit[webkittransitionend]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_wheel(`type`: wheel, target: Element): WheelEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[WheelEvent]
  inline def createEvent_wheel(`type`: wheel, target: Element, init: EventTypeInit[wheel]): WheelEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[WheelEvent]
}
