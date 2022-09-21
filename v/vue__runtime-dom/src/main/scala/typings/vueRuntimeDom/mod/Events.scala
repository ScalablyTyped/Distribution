package typings.vueRuntimeDom.mod

import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  // media events
  var onAbort: Event
  
  var onAnimationend: AnimationEvent
  
  var onAnimationiteration: AnimationEvent
  
  // animation events
  var onAnimationstart: AnimationEvent
  
  // mouse events
  var onAuxclick: MouseEvent
  
  var onBeforeinput: Event
  
  var onBlur: FocusEvent
  
  var onCanplay: Event
  
  var onCanplaythrough: Event
  
  // form events
  var onChange: Event
  
  var onClick: MouseEvent
  
  // composition events
  var onCompositionend: CompositionEvent
  
  var onCompositionstart: CompositionEvent
  
  var onCompositionupdate: CompositionEvent
  
  var onContextmenu: MouseEvent
  
  // clipboard events
  var onCopy: ClipboardEvent
  
  var onCut: ClipboardEvent
  
  var onDblclick: MouseEvent
  
  // drag drop events
  var onDrag: DragEvent
  
  var onDragend: DragEvent
  
  var onDragenter: DragEvent
  
  var onDragexit: DragEvent
  
  var onDragleave: DragEvent
  
  var onDragover: DragEvent
  
  var onDragstart: DragEvent
  
  var onDrop: DragEvent
  
  var onDurationchange: Event
  
  var onEmptied: Event
  
  var onEncrypted: Event
  
  var onEnded: Event
  
  var onError: Event
  
  // focus events
  var onFocus: FocusEvent
  
  var onFocusin: FocusEvent
  
  var onFocusout: FocusEvent
  
  var onInput: Event
  
  var onInvalid: Event
  
  // keyboard events
  var onKeydown: KeyboardEvent
  
  var onKeypress: KeyboardEvent
  
  var onKeyup: KeyboardEvent
  
  // image events
  var onLoad: Event
  
  var onLoadeddata: Event
  
  var onLoadedmetadata: Event
  
  var onLoadstart: Event
  
  var onMousedown: MouseEvent
  
  var onMouseenter: MouseEvent
  
  var onMouseleave: MouseEvent
  
  var onMousemove: MouseEvent
  
  var onMouseout: MouseEvent
  
  var onMouseover: MouseEvent
  
  var onMouseup: MouseEvent
  
  var onPaste: ClipboardEvent
  
  var onPause: Event
  
  var onPlay: Event
  
  var onPlaying: Event
  
  var onPointercancel: PointerEvent
  
  // pointer events
  var onPointerdown: PointerEvent
  
  var onPointerenter: PointerEvent
  
  var onPointerleave: PointerEvent
  
  var onPointermove: PointerEvent
  
  var onPointerout: PointerEvent
  
  var onPointerover: PointerEvent
  
  var onPointerup: PointerEvent
  
  var onProgress: Event
  
  var onRatechange: Event
  
  var onReset: Event
  
  // UI events
  var onScroll: UIEvent
  
  var onSeeked: Event
  
  var onSeeking: Event
  
  // selection events
  var onSelect: Event
  
  var onStalled: Event
  
  var onSubmit: Event
  
  var onSuspend: Event
  
  var onTimeupdate: Event
  
  // touch events
  var onTouchcancel: TouchEvent
  
  var onTouchend: TouchEvent
  
  var onTouchmove: TouchEvent
  
  var onTouchstart: TouchEvent
  
  // transition events
  var onTransitionend: TransitionEvent
  
  var onTransitionstart: TransitionEvent
  
  var onVolumechange: Event
  
  var onWaiting: Event
  
  // wheel events
  var onWheel: WheelEvent
}
object Events {
  
  inline def apply(
    onAbort: Event,
    onAnimationend: AnimationEvent,
    onAnimationiteration: AnimationEvent,
    onAnimationstart: AnimationEvent,
    onAuxclick: MouseEvent,
    onBeforeinput: Event,
    onBlur: FocusEvent,
    onCanplay: Event,
    onCanplaythrough: Event,
    onChange: Event,
    onClick: MouseEvent,
    onCompositionend: CompositionEvent,
    onCompositionstart: CompositionEvent,
    onCompositionupdate: CompositionEvent,
    onContextmenu: MouseEvent,
    onCopy: ClipboardEvent,
    onCut: ClipboardEvent,
    onDblclick: MouseEvent,
    onDrag: DragEvent,
    onDragend: DragEvent,
    onDragenter: DragEvent,
    onDragexit: DragEvent,
    onDragleave: DragEvent,
    onDragover: DragEvent,
    onDragstart: DragEvent,
    onDrop: DragEvent,
    onDurationchange: Event,
    onEmptied: Event,
    onEncrypted: Event,
    onEnded: Event,
    onError: Event,
    onFocus: FocusEvent,
    onFocusin: FocusEvent,
    onFocusout: FocusEvent,
    onInput: Event,
    onInvalid: Event,
    onKeydown: KeyboardEvent,
    onKeypress: KeyboardEvent,
    onKeyup: KeyboardEvent,
    onLoad: Event,
    onLoadeddata: Event,
    onLoadedmetadata: Event,
    onLoadstart: Event,
    onMousedown: MouseEvent,
    onMouseenter: MouseEvent,
    onMouseleave: MouseEvent,
    onMousemove: MouseEvent,
    onMouseout: MouseEvent,
    onMouseover: MouseEvent,
    onMouseup: MouseEvent,
    onPaste: ClipboardEvent,
    onPause: Event,
    onPlay: Event,
    onPlaying: Event,
    onPointercancel: PointerEvent,
    onPointerdown: PointerEvent,
    onPointerenter: PointerEvent,
    onPointerleave: PointerEvent,
    onPointermove: PointerEvent,
    onPointerout: PointerEvent,
    onPointerover: PointerEvent,
    onPointerup: PointerEvent,
    onProgress: Event,
    onRatechange: Event,
    onReset: Event,
    onScroll: UIEvent,
    onSeeked: Event,
    onSeeking: Event,
    onSelect: Event,
    onStalled: Event,
    onSubmit: Event,
    onSuspend: Event,
    onTimeupdate: Event,
    onTouchcancel: TouchEvent,
    onTouchend: TouchEvent,
    onTouchmove: TouchEvent,
    onTouchstart: TouchEvent,
    onTransitionend: TransitionEvent,
    onTransitionstart: TransitionEvent,
    onVolumechange: Event,
    onWaiting: Event,
    onWheel: WheelEvent
  ): Events = {
    val __obj = js.Dynamic.literal(onAbort = onAbort.asInstanceOf[js.Any], onAnimationend = onAnimationend.asInstanceOf[js.Any], onAnimationiteration = onAnimationiteration.asInstanceOf[js.Any], onAnimationstart = onAnimationstart.asInstanceOf[js.Any], onAuxclick = onAuxclick.asInstanceOf[js.Any], onBeforeinput = onBeforeinput.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onCanplay = onCanplay.asInstanceOf[js.Any], onCanplaythrough = onCanplaythrough.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onCompositionend = onCompositionend.asInstanceOf[js.Any], onCompositionstart = onCompositionstart.asInstanceOf[js.Any], onCompositionupdate = onCompositionupdate.asInstanceOf[js.Any], onContextmenu = onContextmenu.asInstanceOf[js.Any], onCopy = onCopy.asInstanceOf[js.Any], onCut = onCut.asInstanceOf[js.Any], onDblclick = onDblclick.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any], onDragend = onDragend.asInstanceOf[js.Any], onDragenter = onDragenter.asInstanceOf[js.Any], onDragexit = onDragexit.asInstanceOf[js.Any], onDragleave = onDragleave.asInstanceOf[js.Any], onDragover = onDragover.asInstanceOf[js.Any], onDragstart = onDragstart.asInstanceOf[js.Any], onDrop = onDrop.asInstanceOf[js.Any], onDurationchange = onDurationchange.asInstanceOf[js.Any], onEmptied = onEmptied.asInstanceOf[js.Any], onEncrypted = onEncrypted.asInstanceOf[js.Any], onEnded = onEnded.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onFocusin = onFocusin.asInstanceOf[js.Any], onFocusout = onFocusout.asInstanceOf[js.Any], onInput = onInput.asInstanceOf[js.Any], onInvalid = onInvalid.asInstanceOf[js.Any], onKeydown = onKeydown.asInstanceOf[js.Any], onKeypress = onKeypress.asInstanceOf[js.Any], onKeyup = onKeyup.asInstanceOf[js.Any], onLoad = onLoad.asInstanceOf[js.Any], onLoadeddata = onLoadeddata.asInstanceOf[js.Any], onLoadedmetadata = onLoadedmetadata.asInstanceOf[js.Any], onLoadstart = onLoadstart.asInstanceOf[js.Any], onMousedown = onMousedown.asInstanceOf[js.Any], onMouseenter = onMouseenter.asInstanceOf[js.Any], onMouseleave = onMouseleave.asInstanceOf[js.Any], onMousemove = onMousemove.asInstanceOf[js.Any], onMouseout = onMouseout.asInstanceOf[js.Any], onMouseover = onMouseover.asInstanceOf[js.Any], onMouseup = onMouseup.asInstanceOf[js.Any], onPaste = onPaste.asInstanceOf[js.Any], onPause = onPause.asInstanceOf[js.Any], onPlay = onPlay.asInstanceOf[js.Any], onPlaying = onPlaying.asInstanceOf[js.Any], onPointercancel = onPointercancel.asInstanceOf[js.Any], onPointerdown = onPointerdown.asInstanceOf[js.Any], onPointerenter = onPointerenter.asInstanceOf[js.Any], onPointerleave = onPointerleave.asInstanceOf[js.Any], onPointermove = onPointermove.asInstanceOf[js.Any], onPointerout = onPointerout.asInstanceOf[js.Any], onPointerover = onPointerover.asInstanceOf[js.Any], onPointerup = onPointerup.asInstanceOf[js.Any], onProgress = onProgress.asInstanceOf[js.Any], onRatechange = onRatechange.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], onSeeked = onSeeked.asInstanceOf[js.Any], onSeeking = onSeeking.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], onStalled = onStalled.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], onSuspend = onSuspend.asInstanceOf[js.Any], onTimeupdate = onTimeupdate.asInstanceOf[js.Any], onTouchcancel = onTouchcancel.asInstanceOf[js.Any], onTouchend = onTouchend.asInstanceOf[js.Any], onTouchmove = onTouchmove.asInstanceOf[js.Any], onTouchstart = onTouchstart.asInstanceOf[js.Any], onTransitionend = onTransitionend.asInstanceOf[js.Any], onTransitionstart = onTransitionstart.asInstanceOf[js.Any], onVolumechange = onVolumechange.asInstanceOf[js.Any], onWaiting = onWaiting.asInstanceOf[js.Any], onWheel = onWheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setOnAbort(value: Event): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationend(value: AnimationEvent): Self = StObject.set(x, "onAnimationend", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationiteration(value: AnimationEvent): Self = StObject.set(x, "onAnimationiteration", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationstart(value: AnimationEvent): Self = StObject.set(x, "onAnimationstart", value.asInstanceOf[js.Any])
    
    inline def setOnAuxclick(value: MouseEvent): Self = StObject.set(x, "onAuxclick", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeinput(value: Event): Self = StObject.set(x, "onBeforeinput", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: FocusEvent): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnCanplay(value: Event): Self = StObject.set(x, "onCanplay", value.asInstanceOf[js.Any])
    
    inline def setOnCanplaythrough(value: Event): Self = StObject.set(x, "onCanplaythrough", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Event): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionend(value: CompositionEvent): Self = StObject.set(x, "onCompositionend", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionstart(value: CompositionEvent): Self = StObject.set(x, "onCompositionstart", value.asInstanceOf[js.Any])
    
    inline def setOnCompositionupdate(value: CompositionEvent): Self = StObject.set(x, "onCompositionupdate", value.asInstanceOf[js.Any])
    
    inline def setOnContextmenu(value: MouseEvent): Self = StObject.set(x, "onContextmenu", value.asInstanceOf[js.Any])
    
    inline def setOnCopy(value: ClipboardEvent): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    inline def setOnCut(value: ClipboardEvent): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
    
    inline def setOnDblclick(value: MouseEvent): Self = StObject.set(x, "onDblclick", value.asInstanceOf[js.Any])
    
    inline def setOnDrag(value: DragEvent): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    inline def setOnDragend(value: DragEvent): Self = StObject.set(x, "onDragend", value.asInstanceOf[js.Any])
    
    inline def setOnDragenter(value: DragEvent): Self = StObject.set(x, "onDragenter", value.asInstanceOf[js.Any])
    
    inline def setOnDragexit(value: DragEvent): Self = StObject.set(x, "onDragexit", value.asInstanceOf[js.Any])
    
    inline def setOnDragleave(value: DragEvent): Self = StObject.set(x, "onDragleave", value.asInstanceOf[js.Any])
    
    inline def setOnDragover(value: DragEvent): Self = StObject.set(x, "onDragover", value.asInstanceOf[js.Any])
    
    inline def setOnDragstart(value: DragEvent): Self = StObject.set(x, "onDragstart", value.asInstanceOf[js.Any])
    
    inline def setOnDrop(value: DragEvent): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
    
    inline def setOnDurationchange(value: Event): Self = StObject.set(x, "onDurationchange", value.asInstanceOf[js.Any])
    
    inline def setOnEmptied(value: Event): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
    
    inline def setOnEncrypted(value: Event): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
    
    inline def setOnEnded(value: Event): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: Event): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: FocusEvent): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusin(value: FocusEvent): Self = StObject.set(x, "onFocusin", value.asInstanceOf[js.Any])
    
    inline def setOnFocusout(value: FocusEvent): Self = StObject.set(x, "onFocusout", value.asInstanceOf[js.Any])
    
    inline def setOnInput(value: Event): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    inline def setOnInvalid(value: Event): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
    
    inline def setOnKeydown(value: KeyboardEvent): Self = StObject.set(x, "onKeydown", value.asInstanceOf[js.Any])
    
    inline def setOnKeypress(value: KeyboardEvent): Self = StObject.set(x, "onKeypress", value.asInstanceOf[js.Any])
    
    inline def setOnKeyup(value: KeyboardEvent): Self = StObject.set(x, "onKeyup", value.asInstanceOf[js.Any])
    
    inline def setOnLoad(value: Event): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadeddata(value: Event): Self = StObject.set(x, "onLoadeddata", value.asInstanceOf[js.Any])
    
    inline def setOnLoadedmetadata(value: Event): Self = StObject.set(x, "onLoadedmetadata", value.asInstanceOf[js.Any])
    
    inline def setOnLoadstart(value: Event): Self = StObject.set(x, "onLoadstart", value.asInstanceOf[js.Any])
    
    inline def setOnMousedown(value: MouseEvent): Self = StObject.set(x, "onMousedown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseenter(value: MouseEvent): Self = StObject.set(x, "onMouseenter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseleave(value: MouseEvent): Self = StObject.set(x, "onMouseleave", value.asInstanceOf[js.Any])
    
    inline def setOnMousemove(value: MouseEvent): Self = StObject.set(x, "onMousemove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseout(value: MouseEvent): Self = StObject.set(x, "onMouseout", value.asInstanceOf[js.Any])
    
    inline def setOnMouseover(value: MouseEvent): Self = StObject.set(x, "onMouseover", value.asInstanceOf[js.Any])
    
    inline def setOnMouseup(value: MouseEvent): Self = StObject.set(x, "onMouseup", value.asInstanceOf[js.Any])
    
    inline def setOnPaste(value: ClipboardEvent): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
    
    inline def setOnPause(value: Event): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPlay(value: Event): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    inline def setOnPlaying(value: Event): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    inline def setOnPointercancel(value: PointerEvent): Self = StObject.set(x, "onPointercancel", value.asInstanceOf[js.Any])
    
    inline def setOnPointerdown(value: PointerEvent): Self = StObject.set(x, "onPointerdown", value.asInstanceOf[js.Any])
    
    inline def setOnPointerenter(value: PointerEvent): Self = StObject.set(x, "onPointerenter", value.asInstanceOf[js.Any])
    
    inline def setOnPointerleave(value: PointerEvent): Self = StObject.set(x, "onPointerleave", value.asInstanceOf[js.Any])
    
    inline def setOnPointermove(value: PointerEvent): Self = StObject.set(x, "onPointermove", value.asInstanceOf[js.Any])
    
    inline def setOnPointerout(value: PointerEvent): Self = StObject.set(x, "onPointerout", value.asInstanceOf[js.Any])
    
    inline def setOnPointerover(value: PointerEvent): Self = StObject.set(x, "onPointerover", value.asInstanceOf[js.Any])
    
    inline def setOnPointerup(value: PointerEvent): Self = StObject.set(x, "onPointerup", value.asInstanceOf[js.Any])
    
    inline def setOnProgress(value: Event): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    inline def setOnRatechange(value: Event): Self = StObject.set(x, "onRatechange", value.asInstanceOf[js.Any])
    
    inline def setOnReset(value: Event): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
    
    inline def setOnScroll(value: UIEvent): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnSeeked(value: Event): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
    
    inline def setOnSeeking(value: Event): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: Event): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnStalled(value: Event): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
    
    inline def setOnSubmit(value: Event): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    inline def setOnSuspend(value: Event): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
    
    inline def setOnTimeupdate(value: Event): Self = StObject.set(x, "onTimeupdate", value.asInstanceOf[js.Any])
    
    inline def setOnTouchcancel(value: TouchEvent): Self = StObject.set(x, "onTouchcancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchend(value: TouchEvent): Self = StObject.set(x, "onTouchend", value.asInstanceOf[js.Any])
    
    inline def setOnTouchmove(value: TouchEvent): Self = StObject.set(x, "onTouchmove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchstart(value: TouchEvent): Self = StObject.set(x, "onTouchstart", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionend(value: TransitionEvent): Self = StObject.set(x, "onTransitionend", value.asInstanceOf[js.Any])
    
    inline def setOnTransitionstart(value: TransitionEvent): Self = StObject.set(x, "onTransitionstart", value.asInstanceOf[js.Any])
    
    inline def setOnVolumechange(value: Event): Self = StObject.set(x, "onVolumechange", value.asInstanceOf[js.Any])
    
    inline def setOnWaiting(value: Event): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    inline def setOnWheel(value: WheelEvent): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
  }
}
