package typings.vanillaColorful

import typings.std.AddEventListenerOptions
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListenerOptions
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
import typings.vanillaColorful.anon.Value
import typings.vanillaColorful.libComponentsAlphaColorPickerMod.AlphaColorPicker
import typings.vanillaColorful.libTypesMod.ColorPickerEventListener
import typings.vanillaColorful.vanillaColorfulStrings.`color-changed`
import typings.vanillaColorful.vanillaColorfulStrings.abort
import typings.vanillaColorful.vanillaColorfulStrings.animationcancel
import typings.vanillaColorful.vanillaColorfulStrings.animationend
import typings.vanillaColorful.vanillaColorfulStrings.animationiteration
import typings.vanillaColorful.vanillaColorfulStrings.animationstart
import typings.vanillaColorful.vanillaColorfulStrings.auxclick
import typings.vanillaColorful.vanillaColorfulStrings.beforeinput
import typings.vanillaColorful.vanillaColorfulStrings.blur
import typings.vanillaColorful.vanillaColorfulStrings.cancel
import typings.vanillaColorful.vanillaColorfulStrings.canplay
import typings.vanillaColorful.vanillaColorfulStrings.canplaythrough
import typings.vanillaColorful.vanillaColorfulStrings.change
import typings.vanillaColorful.vanillaColorfulStrings.click
import typings.vanillaColorful.vanillaColorfulStrings.close
import typings.vanillaColorful.vanillaColorfulStrings.compositionend
import typings.vanillaColorful.vanillaColorfulStrings.compositionstart
import typings.vanillaColorful.vanillaColorfulStrings.compositionupdate
import typings.vanillaColorful.vanillaColorfulStrings.contextmenu
import typings.vanillaColorful.vanillaColorfulStrings.copy
import typings.vanillaColorful.vanillaColorfulStrings.cuechange
import typings.vanillaColorful.vanillaColorfulStrings.cut
import typings.vanillaColorful.vanillaColorfulStrings.dblclick
import typings.vanillaColorful.vanillaColorfulStrings.drag
import typings.vanillaColorful.vanillaColorfulStrings.dragend
import typings.vanillaColorful.vanillaColorfulStrings.dragenter
import typings.vanillaColorful.vanillaColorfulStrings.dragleave
import typings.vanillaColorful.vanillaColorfulStrings.dragover
import typings.vanillaColorful.vanillaColorfulStrings.dragstart
import typings.vanillaColorful.vanillaColorfulStrings.drop
import typings.vanillaColorful.vanillaColorfulStrings.durationchange
import typings.vanillaColorful.vanillaColorfulStrings.emptied
import typings.vanillaColorful.vanillaColorfulStrings.ended
import typings.vanillaColorful.vanillaColorfulStrings.error
import typings.vanillaColorful.vanillaColorfulStrings.focus
import typings.vanillaColorful.vanillaColorfulStrings.focusin
import typings.vanillaColorful.vanillaColorfulStrings.focusout
import typings.vanillaColorful.vanillaColorfulStrings.formdata
import typings.vanillaColorful.vanillaColorfulStrings.fullscreenchange
import typings.vanillaColorful.vanillaColorfulStrings.fullscreenerror
import typings.vanillaColorful.vanillaColorfulStrings.gotpointercapture
import typings.vanillaColorful.vanillaColorfulStrings.input
import typings.vanillaColorful.vanillaColorfulStrings.invalid
import typings.vanillaColorful.vanillaColorfulStrings.keydown
import typings.vanillaColorful.vanillaColorfulStrings.keypress
import typings.vanillaColorful.vanillaColorfulStrings.keyup
import typings.vanillaColorful.vanillaColorfulStrings.load
import typings.vanillaColorful.vanillaColorfulStrings.loadeddata
import typings.vanillaColorful.vanillaColorfulStrings.loadedmetadata
import typings.vanillaColorful.vanillaColorfulStrings.loadstart
import typings.vanillaColorful.vanillaColorfulStrings.lostpointercapture
import typings.vanillaColorful.vanillaColorfulStrings.mousedown
import typings.vanillaColorful.vanillaColorfulStrings.mouseenter
import typings.vanillaColorful.vanillaColorfulStrings.mouseleave
import typings.vanillaColorful.vanillaColorfulStrings.mousemove
import typings.vanillaColorful.vanillaColorfulStrings.mouseout
import typings.vanillaColorful.vanillaColorfulStrings.mouseover
import typings.vanillaColorful.vanillaColorfulStrings.mouseup
import typings.vanillaColorful.vanillaColorfulStrings.paste
import typings.vanillaColorful.vanillaColorfulStrings.pause
import typings.vanillaColorful.vanillaColorfulStrings.play
import typings.vanillaColorful.vanillaColorfulStrings.playing
import typings.vanillaColorful.vanillaColorfulStrings.pointercancel
import typings.vanillaColorful.vanillaColorfulStrings.pointerdown
import typings.vanillaColorful.vanillaColorfulStrings.pointerenter
import typings.vanillaColorful.vanillaColorfulStrings.pointerleave
import typings.vanillaColorful.vanillaColorfulStrings.pointermove
import typings.vanillaColorful.vanillaColorfulStrings.pointerout
import typings.vanillaColorful.vanillaColorfulStrings.pointerover
import typings.vanillaColorful.vanillaColorfulStrings.pointerup
import typings.vanillaColorful.vanillaColorfulStrings.progress
import typings.vanillaColorful.vanillaColorfulStrings.ratechange
import typings.vanillaColorful.vanillaColorfulStrings.reset
import typings.vanillaColorful.vanillaColorfulStrings.resize
import typings.vanillaColorful.vanillaColorfulStrings.scroll
import typings.vanillaColorful.vanillaColorfulStrings.securitypolicyviolation
import typings.vanillaColorful.vanillaColorfulStrings.seeked
import typings.vanillaColorful.vanillaColorfulStrings.seeking
import typings.vanillaColorful.vanillaColorfulStrings.select
import typings.vanillaColorful.vanillaColorfulStrings.selectionchange
import typings.vanillaColorful.vanillaColorfulStrings.selectstart
import typings.vanillaColorful.vanillaColorfulStrings.slotchange
import typings.vanillaColorful.vanillaColorfulStrings.stalled
import typings.vanillaColorful.vanillaColorfulStrings.submit
import typings.vanillaColorful.vanillaColorfulStrings.suspend
import typings.vanillaColorful.vanillaColorfulStrings.timeupdate
import typings.vanillaColorful.vanillaColorfulStrings.toggle
import typings.vanillaColorful.vanillaColorfulStrings.touchcancel
import typings.vanillaColorful.vanillaColorfulStrings.touchend
import typings.vanillaColorful.vanillaColorfulStrings.touchmove
import typings.vanillaColorful.vanillaColorfulStrings.touchstart
import typings.vanillaColorful.vanillaColorfulStrings.transitioncancel
import typings.vanillaColorful.vanillaColorfulStrings.transitionend
import typings.vanillaColorful.vanillaColorfulStrings.transitionrun
import typings.vanillaColorful.vanillaColorfulStrings.transitionstart
import typings.vanillaColorful.vanillaColorfulStrings.volumechange
import typings.vanillaColorful.vanillaColorfulStrings.waiting
import typings.vanillaColorful.vanillaColorfulStrings.webkitanimationend
import typings.vanillaColorful.vanillaColorfulStrings.webkitanimationiteration
import typings.vanillaColorful.vanillaColorfulStrings.webkitanimationstart
import typings.vanillaColorful.vanillaColorfulStrings.webkittransitionend
import typings.vanillaColorful.vanillaColorfulStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEntrypointsHsvaStringMod {
  
  @JSImport("vanilla-colorful/lib/entrypoints/hsva-string", "HsvaStringBase")
  @js.native
  open class HsvaStringBase () extends AlphaColorPicker[String] {
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: ColorPickerEventListener[UIEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: ColorPickerEventListener[UIEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: ColorPickerEventListener[UIEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(`type`: animationcancel, listener: ColorPickerEventListener[AnimationEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(`type`: animationcancel, listener: ColorPickerEventListener[AnimationEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: ColorPickerEventListener[AnimationEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, listener: ColorPickerEventListener[AnimationEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, listener: ColorPickerEventListener[AnimationEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: ColorPickerEventListener[AnimationEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(`type`: animationiteration, listener: ColorPickerEventListener[AnimationEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(`type`: animationiteration, listener: ColorPickerEventListener[AnimationEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: ColorPickerEventListener[AnimationEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(`type`: animationstart, listener: ColorPickerEventListener[AnimationEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(`type`: animationstart, listener: ColorPickerEventListener[AnimationEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: ColorPickerEventListener[AnimationEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: ColorPickerEventListener[MouseEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(`type`: beforeinput, listener: ColorPickerEventListener[InputEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(`type`: beforeinput, listener: ColorPickerEventListener[InputEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_beforeinput(
      `type`: beforeinput,
      listener: ColorPickerEventListener[InputEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: ColorPickerEventListener[FocusEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: ColorPickerEventListener[FocusEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: ColorPickerEventListener[FocusEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(`type`: cancel, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(`type`: cancel, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(`type`: cancel, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(`type`: canplaythrough, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(`type`: canplaythrough, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: ColorPickerEventListener[MouseEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_colorchanged(`type`: `color-changed`, listener: ColorPickerEventListener[CustomEvent[Value]]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_colorchanged(`type`: `color-changed`, listener: ColorPickerEventListener[CustomEvent[Value]], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_colorchanged(
      `type`: `color-changed`,
      listener: ColorPickerEventListener[CustomEvent[Value]],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(`type`: compositionend, listener: ColorPickerEventListener[CompositionEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(`type`: compositionend, listener: ColorPickerEventListener[CompositionEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionend(
      `type`: compositionend,
      listener: ColorPickerEventListener[CompositionEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(`type`: compositionstart, listener: ColorPickerEventListener[CompositionEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(`type`: compositionstart, listener: ColorPickerEventListener[CompositionEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionstart(
      `type`: compositionstart,
      listener: ColorPickerEventListener[CompositionEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(`type`: compositionupdate, listener: ColorPickerEventListener[CompositionEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(`type`: compositionupdate, listener: ColorPickerEventListener[CompositionEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: ColorPickerEventListener[CompositionEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(`type`: contextmenu, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(`type`: contextmenu, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: ColorPickerEventListener[MouseEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(`type`: copy, listener: ColorPickerEventListener[ClipboardEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(`type`: copy, listener: ColorPickerEventListener[ClipboardEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(`type`: copy, listener: ColorPickerEventListener[ClipboardEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(`type`: cut, listener: ColorPickerEventListener[ClipboardEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(`type`: cut, listener: ColorPickerEventListener[ClipboardEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(`type`: cut, listener: ColorPickerEventListener[ClipboardEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: ColorPickerEventListener[MouseEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: ColorPickerEventListener[DragEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: ColorPickerEventListener[DragEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: ColorPickerEventListener[DragEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: ColorPickerEventListener[DragEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: ColorPickerEventListener[DragEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: ColorPickerEventListener[DragEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: ColorPickerEventListener[DragEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(`type`: durationchange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(`type`: durationchange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: ColorPickerEventListener[ErrorEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: ColorPickerEventListener[ErrorEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: ColorPickerEventListener[ErrorEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: ColorPickerEventListener[FocusEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: ColorPickerEventListener[FocusEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: ColorPickerEventListener[FocusEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: ColorPickerEventListener[FocusEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: ColorPickerEventListener[FocusEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: ColorPickerEventListener[FocusEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: ColorPickerEventListener[FocusEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: ColorPickerEventListener[FocusEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: ColorPickerEventListener[FocusEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(`type`: formdata, listener: ColorPickerEventListener[FormDataEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(`type`: formdata, listener: ColorPickerEventListener[FormDataEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_formdata(
      `type`: formdata,
      listener: ColorPickerEventListener[FormDataEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(`type`: gotpointercapture, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(`type`: gotpointercapture, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(`type`: keydown, listener: ColorPickerEventListener[KeyboardEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(`type`: keydown, listener: ColorPickerEventListener[KeyboardEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: ColorPickerEventListener[KeyboardEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(`type`: keypress, listener: ColorPickerEventListener[KeyboardEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(`type`: keypress, listener: ColorPickerEventListener[KeyboardEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: ColorPickerEventListener[KeyboardEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: ColorPickerEventListener[KeyboardEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: ColorPickerEventListener[KeyboardEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: ColorPickerEventListener[KeyboardEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(`type`: lostpointercapture, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(`type`: lostpointercapture, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: ColorPickerEventListener[MouseEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: ColorPickerEventListener[MouseEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: ColorPickerEventListener[MouseEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: ColorPickerEventListener[MouseEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: ColorPickerEventListener[MouseEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: ColorPickerEventListener[MouseEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: ColorPickerEventListener[MouseEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(`type`: paste, listener: ColorPickerEventListener[ClipboardEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(`type`: paste, listener: ColorPickerEventListener[ClipboardEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: ColorPickerEventListener[ClipboardEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(`type`: pointercancel, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(`type`: pointercancel, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: ColorPickerEventListener[PointerEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(`type`: progress, listener: ColorPickerEventListener[ProgressEvent[EventTarget]]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(`type`: progress, listener: ColorPickerEventListener[ProgressEvent[EventTarget]], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: ColorPickerEventListener[ProgressEvent[EventTarget]],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(`type`: resize, listener: ColorPickerEventListener[UIEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(`type`: resize, listener: ColorPickerEventListener[UIEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(`type`: resize, listener: ColorPickerEventListener[UIEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(`type`: scroll, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(`type`: scroll, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(`type`: scroll, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(`type`: securitypolicyviolation, listener: ColorPickerEventListener[SecurityPolicyViolationEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: ColorPickerEventListener[SecurityPolicyViolationEvent],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: ColorPickerEventListener[SecurityPolicyViolationEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(`type`: selectionchange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(`type`: selectionchange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(`type`: slotchange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(`type`: slotchange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_slotchange(`type`: slotchange, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: ColorPickerEventListener[SubmitEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: ColorPickerEventListener[SubmitEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: ColorPickerEventListener[SubmitEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: ColorPickerEventListener[TouchEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: ColorPickerEventListener[TouchEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: ColorPickerEventListener[TouchEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: ColorPickerEventListener[TouchEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: ColorPickerEventListener[TouchEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: ColorPickerEventListener[TouchEvent], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(`type`: touchmove, listener: ColorPickerEventListener[TouchEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(`type`: touchmove, listener: ColorPickerEventListener[TouchEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: ColorPickerEventListener[TouchEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(`type`: touchstart, listener: ColorPickerEventListener[TouchEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(`type`: touchstart, listener: ColorPickerEventListener[TouchEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: ColorPickerEventListener[TouchEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(`type`: transitioncancel, listener: ColorPickerEventListener[TransitionEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(`type`: transitioncancel, listener: ColorPickerEventListener[TransitionEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: ColorPickerEventListener[TransitionEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(`type`: transitionend, listener: ColorPickerEventListener[TransitionEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(`type`: transitionend, listener: ColorPickerEventListener[TransitionEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: ColorPickerEventListener[TransitionEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(`type`: transitionrun, listener: ColorPickerEventListener[TransitionEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(`type`: transitionrun, listener: ColorPickerEventListener[TransitionEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: ColorPickerEventListener[TransitionEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(`type`: transitionstart, listener: ColorPickerEventListener[TransitionEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(`type`: transitionstart, listener: ColorPickerEventListener[TransitionEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: ColorPickerEventListener[TransitionEvent],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: ColorPickerEventListener[Event], options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(`type`: webkitanimationend, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(`type`: webkitanimationend, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(`type`: webkitanimationiteration, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(`type`: webkitanimationiteration, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(`type`: webkitanimationstart, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(`type`: webkitanimationstart, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(`type`: webkittransitionend, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(`type`: webkittransitionend, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: ColorPickerEventListener[Event],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: ColorPickerEventListener[WheelEvent]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: ColorPickerEventListener[WheelEvent], options: Boolean): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: ColorPickerEventListener[WheelEvent], options: AddEventListenerOptions): Unit = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: ColorPickerEventListener[UIEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: ColorPickerEventListener[UIEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: ColorPickerEventListener[UIEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(`type`: animationcancel, listener: ColorPickerEventListener[AnimationEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(`type`: animationcancel, listener: ColorPickerEventListener[AnimationEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: ColorPickerEventListener[AnimationEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, listener: ColorPickerEventListener[AnimationEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, listener: ColorPickerEventListener[AnimationEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: ColorPickerEventListener[AnimationEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(`type`: animationiteration, listener: ColorPickerEventListener[AnimationEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(`type`: animationiteration, listener: ColorPickerEventListener[AnimationEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: ColorPickerEventListener[AnimationEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(`type`: animationstart, listener: ColorPickerEventListener[AnimationEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(`type`: animationstart, listener: ColorPickerEventListener[AnimationEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: ColorPickerEventListener[AnimationEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(`type`: beforeinput, listener: ColorPickerEventListener[InputEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(`type`: beforeinput, listener: ColorPickerEventListener[InputEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_beforeinput(`type`: beforeinput, listener: ColorPickerEventListener[InputEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: ColorPickerEventListener[FocusEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: ColorPickerEventListener[FocusEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: ColorPickerEventListener[FocusEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(`type`: cancel, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(`type`: cancel, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(`type`: cancel, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_colorchanged(`type`: `color-changed`, listener: ColorPickerEventListener[CustomEvent[Value]]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_colorchanged(`type`: `color-changed`, listener: ColorPickerEventListener[CustomEvent[Value]], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_colorchanged(
      `type`: `color-changed`,
      listener: ColorPickerEventListener[CustomEvent[Value]],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(`type`: compositionend, listener: ColorPickerEventListener[CompositionEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(`type`: compositionend, listener: ColorPickerEventListener[CompositionEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionend(
      `type`: compositionend,
      listener: ColorPickerEventListener[CompositionEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(`type`: compositionstart, listener: ColorPickerEventListener[CompositionEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(`type`: compositionstart, listener: ColorPickerEventListener[CompositionEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionstart(
      `type`: compositionstart,
      listener: ColorPickerEventListener[CompositionEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(`type`: compositionupdate, listener: ColorPickerEventListener[CompositionEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(`type`: compositionupdate, listener: ColorPickerEventListener[CompositionEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_compositionupdate(
      `type`: compositionupdate,
      listener: ColorPickerEventListener[CompositionEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(`type`: copy, listener: ColorPickerEventListener[ClipboardEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(`type`: copy, listener: ColorPickerEventListener[ClipboardEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(`type`: copy, listener: ColorPickerEventListener[ClipboardEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(`type`: cut, listener: ColorPickerEventListener[ClipboardEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(`type`: cut, listener: ColorPickerEventListener[ClipboardEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(`type`: cut, listener: ColorPickerEventListener[ClipboardEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: ColorPickerEventListener[DragEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: ColorPickerEventListener[DragEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: ColorPickerEventListener[DragEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: ColorPickerEventListener[DragEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: ColorPickerEventListener[DragEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: ColorPickerEventListener[DragEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: ColorPickerEventListener[DragEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: ColorPickerEventListener[DragEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: ColorPickerEventListener[DragEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: ColorPickerEventListener[ErrorEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: ColorPickerEventListener[ErrorEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: ColorPickerEventListener[ErrorEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: ColorPickerEventListener[FocusEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: ColorPickerEventListener[FocusEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: ColorPickerEventListener[FocusEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: ColorPickerEventListener[FocusEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: ColorPickerEventListener[FocusEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: ColorPickerEventListener[FocusEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: ColorPickerEventListener[FocusEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: ColorPickerEventListener[FocusEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: ColorPickerEventListener[FocusEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(`type`: formdata, listener: ColorPickerEventListener[FormDataEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(`type`: formdata, listener: ColorPickerEventListener[FormDataEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_formdata(`type`: formdata, listener: ColorPickerEventListener[FormDataEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(`type`: gotpointercapture, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(`type`: gotpointercapture, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: ColorPickerEventListener[KeyboardEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: ColorPickerEventListener[KeyboardEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: ColorPickerEventListener[KeyboardEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(`type`: keypress, listener: ColorPickerEventListener[KeyboardEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(`type`: keypress, listener: ColorPickerEventListener[KeyboardEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(`type`: keypress, listener: ColorPickerEventListener[KeyboardEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: ColorPickerEventListener[KeyboardEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: ColorPickerEventListener[KeyboardEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: ColorPickerEventListener[KeyboardEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(`type`: lostpointercapture, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(`type`: lostpointercapture, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: ColorPickerEventListener[MouseEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: ColorPickerEventListener[MouseEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: ColorPickerEventListener[MouseEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(`type`: paste, listener: ColorPickerEventListener[ClipboardEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(`type`: paste, listener: ColorPickerEventListener[ClipboardEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(`type`: paste, listener: ColorPickerEventListener[ClipboardEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(`type`: pointercancel, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(`type`: pointercancel, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: ColorPickerEventListener[PointerEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: ColorPickerEventListener[PointerEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: ColorPickerEventListener[PointerEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: ColorPickerEventListener[PointerEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(`type`: progress, listener: ColorPickerEventListener[ProgressEvent[EventTarget]]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(`type`: progress, listener: ColorPickerEventListener[ProgressEvent[EventTarget]], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: ColorPickerEventListener[ProgressEvent[EventTarget]],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(`type`: resize, listener: ColorPickerEventListener[UIEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(`type`: resize, listener: ColorPickerEventListener[UIEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(`type`: resize, listener: ColorPickerEventListener[UIEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(`type`: scroll, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(`type`: scroll, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(`type`: scroll, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(`type`: securitypolicyviolation, listener: ColorPickerEventListener[SecurityPolicyViolationEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: ColorPickerEventListener[SecurityPolicyViolationEvent],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: ColorPickerEventListener[SecurityPolicyViolationEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(`type`: slotchange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(`type`: slotchange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_slotchange(`type`: slotchange, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: ColorPickerEventListener[SubmitEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: ColorPickerEventListener[SubmitEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: ColorPickerEventListener[SubmitEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: ColorPickerEventListener[TouchEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: ColorPickerEventListener[TouchEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: ColorPickerEventListener[TouchEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: ColorPickerEventListener[TouchEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: ColorPickerEventListener[TouchEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: ColorPickerEventListener[TouchEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: ColorPickerEventListener[TouchEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: ColorPickerEventListener[TouchEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: ColorPickerEventListener[TouchEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: ColorPickerEventListener[TouchEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: ColorPickerEventListener[TouchEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: ColorPickerEventListener[TouchEvent], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(`type`: transitioncancel, listener: ColorPickerEventListener[TransitionEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(`type`: transitioncancel, listener: ColorPickerEventListener[TransitionEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: ColorPickerEventListener[TransitionEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(`type`: transitionend, listener: ColorPickerEventListener[TransitionEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(`type`: transitionend, listener: ColorPickerEventListener[TransitionEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: ColorPickerEventListener[TransitionEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(`type`: transitionrun, listener: ColorPickerEventListener[TransitionEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(`type`: transitionrun, listener: ColorPickerEventListener[TransitionEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: ColorPickerEventListener[TransitionEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(`type`: transitionstart, listener: ColorPickerEventListener[TransitionEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(`type`: transitionstart, listener: ColorPickerEventListener[TransitionEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: ColorPickerEventListener[TransitionEvent],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: ColorPickerEventListener[Event], options: EventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(`type`: webkitanimationend, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(`type`: webkitanimationend, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationend(
      `type`: webkitanimationend,
      listener: ColorPickerEventListener[Event],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(`type`: webkitanimationiteration, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(`type`: webkitanimationiteration, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationiteration(
      `type`: webkitanimationiteration,
      listener: ColorPickerEventListener[Event],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(`type`: webkitanimationstart, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(`type`: webkitanimationstart, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkitanimationstart(
      `type`: webkitanimationstart,
      listener: ColorPickerEventListener[Event],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(`type`: webkittransitionend, listener: ColorPickerEventListener[Event]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(`type`: webkittransitionend, listener: ColorPickerEventListener[Event], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_webkittransitionend(
      `type`: webkittransitionend,
      listener: ColorPickerEventListener[Event],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: ColorPickerEventListener[WheelEvent]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: ColorPickerEventListener[WheelEvent], options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: ColorPickerEventListener[WheelEvent], options: EventListenerOptions): Unit = js.native
  }
}
