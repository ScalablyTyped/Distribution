package typings.vanillaColorful

import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElementEventMap
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
import typings.vanillaColorful.anon.ValueT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type AnyColor = String | ObjectColor
  
  type ColorChangedEventListener[T] = js.Function1[/* evt */ T, Unit]
  
  trait ColorChangedEventListenerObject[T] extends StObject {
    
    def handleEvent(evt: T): Unit
  }
  object ColorChangedEventListenerObject {
    
    inline def apply[T](handleEvent: T => Unit): ColorChangedEventListenerObject[T] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[ColorChangedEventListenerObject[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorChangedEventListenerObject[?], T] (val x: Self & ColorChangedEventListenerObject[T]) extends AnyVal {
      
      inline def setHandleEvent(value: T => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait ColorModel[T /* <: AnyColor */] extends StObject {
    
    var defaultColor: T
    
    def equal(first: T, second: T): Boolean
    
    def fromAttr(attr: String): T
    
    def fromHsva(hsva: HsvaColor): T
    
    def toHsva(color: T): HsvaColor
  }
  object ColorModel {
    
    inline def apply[T /* <: AnyColor */](
      defaultColor: T,
      equal: (T, T) => Boolean,
      fromAttr: String => T,
      fromHsva: HsvaColor => T,
      toHsva: T => HsvaColor
    ): ColorModel[T] = {
      val __obj = js.Dynamic.literal(defaultColor = defaultColor.asInstanceOf[js.Any], equal = js.Any.fromFunction2(equal), fromAttr = js.Any.fromFunction1(fromAttr), fromHsva = js.Any.fromFunction1(fromHsva), toHsva = js.Any.fromFunction1(toHsva))
      __obj.asInstanceOf[ColorModel[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorModel[?], T /* <: AnyColor */] (val x: Self & ColorModel[T]) extends AnyVal {
      
      inline def setDefaultColor(value: T): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      inline def setEqual(value: (T, T) => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
      
      inline def setFromAttr(value: String => T): Self = StObject.set(x, "fromAttr", js.Any.fromFunction1(value))
      
      inline def setFromHsva(value: HsvaColor => T): Self = StObject.set(x, "fromHsva", js.Any.fromFunction1(value))
      
      inline def setToHsva(value: T => HsvaColor): Self = StObject.set(x, "toHsva", js.Any.fromFunction1(value))
    }
  }
  
  type ColorPickerEventListener[T] = ColorChangedEventListener[T] | ColorChangedEventListenerObject[T]
  
  trait ColorPickerEventMap[T]
    extends StObject
       with HTMLElementEventMap {
    
    var `color-changed`: CustomEvent[ValueT[T]]
  }
  object ColorPickerEventMap {
    
    inline def apply[T](
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      `color-changed`: CustomEvent[ValueT[T]],
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent[EventTarget],
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ColorPickerEventMap[T] = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.updateDynamic("color-changed")(`color-changed`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPickerEventMap[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPickerEventMap[?], T] (val x: Self & ColorPickerEventMap[T]) extends AnyVal {
      
      inline def `setColor-changed`(value: CustomEvent[ValueT[T]]): Self = StObject.set(x, "color-changed", value.asInstanceOf[js.Any])
    }
  }
  
  trait HslColor
    extends StObject
       with ObjectColor {
    
    var h: Double
    
    var l: Double
    
    var s: Double
  }
  object HslColor {
    
    inline def apply(h: Double, l: Double, s: Double): HslColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HslColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HslColor] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vanillaColorful.libTypesMod.ObjectColor because Already inherited */ trait HslaColor
    extends StObject
       with HslColor {
    
    var a: Double
  }
  object HslaColor {
    
    inline def apply(a: Double, h: Double, l: Double, s: Double): HslaColor = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HslaColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HslaColor] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  trait HsvColor
    extends StObject
       with ObjectColor {
    
    var h: Double
    
    var s: Double
    
    var v: Double
  }
  object HsvColor {
    
    inline def apply(h: Double, s: Double, v: Double): HsvColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HsvColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HsvColor] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vanillaColorful.libTypesMod.ObjectColor because Already inherited */ trait HsvaColor
    extends StObject
       with HsvColor {
    
    var a: Double
  }
  object HsvaColor {
    
    inline def apply(a: Double, h: Double, s: Double, v: Double): HsvaColor = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HsvaColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HsvaColor] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vanillaColorful.libTypesMod.RgbColor
    - typings.vanillaColorful.libTypesMod.HslColor
    - typings.vanillaColorful.libTypesMod.HsvColor
    - typings.vanillaColorful.libTypesMod.RgbaColor
    - typings.vanillaColorful.libTypesMod.HslaColor
    - typings.vanillaColorful.libTypesMod.HsvaColor
  */
  trait ObjectColor extends StObject
  object ObjectColor {
    
    inline def HslColor(h: Double, l: Double, s: Double): typings.vanillaColorful.libTypesMod.HslColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vanillaColorful.libTypesMod.HslColor]
    }
    
    inline def HslaColor(a: Double, h: Double, l: Double, s: Double): typings.vanillaColorful.libTypesMod.HslaColor = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vanillaColorful.libTypesMod.HslaColor]
    }
    
    inline def HsvColor(h: Double, s: Double, v: Double): typings.vanillaColorful.libTypesMod.HsvColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vanillaColorful.libTypesMod.HsvColor]
    }
    
    inline def HsvaColor(a: Double, h: Double, s: Double, v: Double): typings.vanillaColorful.libTypesMod.HsvaColor = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vanillaColorful.libTypesMod.HsvaColor]
    }
    
    inline def RgbColor(b: Double, g: Double, r: Double): typings.vanillaColorful.libTypesMod.RgbColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vanillaColorful.libTypesMod.RgbColor]
    }
    
    inline def RgbaColor(a: Double, b: Double, g: Double, r: Double): typings.vanillaColorful.libTypesMod.RgbaColor = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vanillaColorful.libTypesMod.RgbaColor]
    }
  }
  
  trait RgbColor
    extends StObject
       with ObjectColor {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RgbColor {
    
    inline def apply(b: Double, g: Double, r: Double): RgbColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RgbColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RgbColor] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vanillaColorful.libTypesMod.ObjectColor because Already inherited */ trait RgbaColor
    extends StObject
       with RgbColor {
    
    var a: Double
  }
  object RgbaColor {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): RgbaColor = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RgbaColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RgbaColor] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
}
