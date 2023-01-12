package typings.vegaTypings

import typings.vegaTypings.typesSpecExprMod.Expr
import typings.vegaTypings.typesSpecMarktypeMod.MarkType
import typings.vegaTypings.typesSpecOnEventsMod.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecStreamMod {
  
  trait DerivedStream
    extends StObject
       with StreamParameters
       with Stream {
    
    var stream: Stream
  }
  object DerivedStream {
    
    inline def apply(stream: Stream): DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[DerivedStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DerivedStream] (val x: Self) extends AnyVal {
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.view
    - typings.vegaTypings.vegaTypingsStrings.scope
    - scala.Unit
    - typings.vegaTypings.vegaTypingsStrings.window
  */
  type EventSource = js.UndefOr[_EventSource]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.anon.sourceviewscopeundefinedt
    - typings.vegaTypings.anon.sourcewindowtypeWindowEveBetween
  */
  trait EventStream
    extends StObject
       with Stream
  object EventStream {
    
    inline def sourceviewscopeundefinedt(`type`: EventType): typings.vegaTypings.anon.sourceviewscopeundefinedt = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.sourceviewscopeundefinedt]
    }
    
    inline def sourcewindowtypeWindowEveBetween(`type`: WindowEventType): typings.vegaTypings.anon.sourcewindowtypeWindowEveBetween = {
      val __obj = js.Dynamic.literal(source = "window")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.sourcewindowtypeWindowEveBetween]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.click
    - typings.vegaTypings.vegaTypingsStrings.dblclick
    - typings.vegaTypings.vegaTypingsStrings.dragenter
    - typings.vegaTypings.vegaTypingsStrings.dragleave
    - typings.vegaTypings.vegaTypingsStrings.dragover
    - typings.vegaTypings.vegaTypingsStrings.keydown
    - typings.vegaTypings.vegaTypingsStrings.keypress
    - typings.vegaTypings.vegaTypingsStrings.keyup
    - typings.vegaTypings.vegaTypingsStrings.mousedown
    - typings.vegaTypings.vegaTypingsStrings.mousemove
    - typings.vegaTypings.vegaTypingsStrings.mouseout
    - typings.vegaTypings.vegaTypingsStrings.mouseover
    - typings.vegaTypings.vegaTypingsStrings.mouseup
    - typings.vegaTypings.vegaTypingsStrings.mousewheel
    - typings.vegaTypings.vegaTypingsStrings.timer
    - typings.vegaTypings.vegaTypingsStrings.touchend
    - typings.vegaTypings.vegaTypingsStrings.touchmove
    - typings.vegaTypings.vegaTypingsStrings.touchstart
    - typings.vegaTypings.vegaTypingsStrings.wheel
  */
  trait EventType extends StObject
  object EventType {
    
    inline def click: typings.vegaTypings.vegaTypingsStrings.click = "click".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.click]
    
    inline def dblclick: typings.vegaTypings.vegaTypingsStrings.dblclick = "dblclick".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dblclick]
    
    inline def dragenter: typings.vegaTypings.vegaTypingsStrings.dragenter = "dragenter".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dragenter]
    
    inline def dragleave: typings.vegaTypings.vegaTypingsStrings.dragleave = "dragleave".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dragleave]
    
    inline def dragover: typings.vegaTypings.vegaTypingsStrings.dragover = "dragover".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dragover]
    
    inline def keydown: typings.vegaTypings.vegaTypingsStrings.keydown = "keydown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.keydown]
    
    inline def keypress: typings.vegaTypings.vegaTypingsStrings.keypress = "keypress".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.keypress]
    
    inline def keyup: typings.vegaTypings.vegaTypingsStrings.keyup = "keyup".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.keyup]
    
    inline def mousedown: typings.vegaTypings.vegaTypingsStrings.mousedown = "mousedown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mousedown]
    
    inline def mousemove: typings.vegaTypings.vegaTypingsStrings.mousemove = "mousemove".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mousemove]
    
    inline def mouseout: typings.vegaTypings.vegaTypingsStrings.mouseout = "mouseout".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mouseout]
    
    inline def mouseover: typings.vegaTypings.vegaTypingsStrings.mouseover = "mouseover".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mouseover]
    
    inline def mouseup: typings.vegaTypings.vegaTypingsStrings.mouseup = "mouseup".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mouseup]
    
    inline def mousewheel: typings.vegaTypings.vegaTypingsStrings.mousewheel = "mousewheel".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mousewheel]
    
    inline def timer: typings.vegaTypings.vegaTypingsStrings.timer = "timer".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.timer]
    
    inline def touchend: typings.vegaTypings.vegaTypingsStrings.touchend = "touchend".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.touchend]
    
    inline def touchmove: typings.vegaTypings.vegaTypingsStrings.touchmove = "touchmove".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.touchmove]
    
    inline def touchstart: typings.vegaTypings.vegaTypingsStrings.touchstart = "touchstart".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.touchstart]
    
    inline def wheel: typings.vegaTypings.vegaTypingsStrings.wheel = "wheel".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.wheel]
  }
  
  trait MergedStream
    extends StObject
       with StreamParameters
       with Stream {
    
    var merge: js.Array[Stream]
  }
  object MergedStream {
    
    inline def apply(merge: js.Array[Stream]): MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergedStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergedStream] (val x: Self) extends AnyVal {
      
      inline def setMerge(value: js.Array[Stream]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeVarargs(value: Stream*): Self = StObject.set(x, "merge", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.typesSpecStreamMod.EventStream
    - typings.vegaTypings.typesSpecStreamMod.DerivedStream
    - typings.vegaTypings.typesSpecStreamMod.MergedStream
  */
  trait Stream
    extends StObject
       with EventListener
  object Stream {
    
    inline def DerivedStream(stream: Stream): typings.vegaTypings.typesSpecStreamMod.DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecStreamMod.DerivedStream]
    }
    
    inline def MergedStream(merge: js.Array[Stream]): typings.vegaTypings.typesSpecStreamMod.MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecStreamMod.MergedStream]
    }
    
    inline def sourceviewscopeundefinedt(`type`: EventType): typings.vegaTypings.anon.sourceviewscopeundefinedt = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.sourceviewscopeundefinedt]
    }
    
    inline def sourcewindowtypeWindowEveBetween(`type`: WindowEventType): typings.vegaTypings.anon.sourcewindowtypeWindowEveBetween = {
      val __obj = js.Dynamic.literal(source = "window")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.sourcewindowtypeWindowEveBetween]
    }
  }
  
  trait StreamParameters extends StObject {
    
    var between: js.UndefOr[js.Array[Stream]] = js.undefined
    
    var consume: js.UndefOr[Boolean] = js.undefined
    
    var debounce: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[Expr | js.Array[Expr]] = js.undefined
    
    var markname: js.UndefOr[String] = js.undefined
    
    var marktype: js.UndefOr[MarkType] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
  }
  object StreamParameters {
    
    inline def apply(): StreamParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamParameters] (val x: Self) extends AnyVal {
      
      inline def setBetween(value: js.Array[Stream]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      inline def setBetweenVarargs(value: Stream*): Self = StObject.set(x, "between", js.Array(value*))
      
      inline def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
      
      inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setFilter(value: Expr | js.Array[Expr]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: Expr*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setMarkname(value: String): Self = StObject.set(x, "markname", value.asInstanceOf[js.Any])
      
      inline def setMarknameUndefined: Self = StObject.set(x, "markname", js.undefined)
      
      inline def setMarktype(value: MarkType): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      inline def setMarktypeUndefined: Self = StObject.set(x, "marktype", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  type WindowEventType = EventType | String
  
  trait _EventSource extends StObject
}
