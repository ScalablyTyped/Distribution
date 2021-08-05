package typings.vegaTypings

import typings.vegaTypings.anon.Source
import typings.vegaTypings.anon.Type
import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.marktypeMod.MarkType
import typings.vegaTypings.onEventsMod._EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  trait DerivedStream
    extends StObject
       with StreamParameters
       with _Stream {
    
    var stream: Stream
  }
  object DerivedStream {
    
    inline def apply(stream: Stream): DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[DerivedStream]
    }
    
    extension [Self <: DerivedStream](x: Self) {
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type EventSource = (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) & js.Object
  
  type EventStream = StreamParameters & (Source | Type)
  
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
       with _Stream {
    
    var merge: js.Array[Stream]
  }
  object MergedStream {
    
    inline def apply(merge: js.Array[Stream]): MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergedStream]
    }
    
    extension [Self <: MergedStream](x: Self) {
      
      inline def setMerge(value: js.Array[Stream]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeVarargs(value: Stream*): Self = StObject.set(x, "merge", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.streamMod.EventStream
    - typings.vegaTypings.streamMod.DerivedStream
    - typings.vegaTypings.streamMod.MergedStream
  */
  type Stream = _Stream | EventStream
  
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
    
    extension [Self <: StreamParameters](x: Self) {
      
      inline def setBetween(value: js.Array[Stream]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      inline def setBetweenVarargs(value: Stream*): Self = StObject.set(x, "between", js.Array(value :_*))
      
      inline def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
      
      inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setFilter(value: Expr | js.Array[Expr]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: Expr*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      inline def setMarkname(value: String): Self = StObject.set(x, "markname", value.asInstanceOf[js.Any])
      
      inline def setMarknameUndefined: Self = StObject.set(x, "markname", js.undefined)
      
      inline def setMarktype(value: MarkType): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      inline def setMarktypeUndefined: Self = StObject.set(x, "marktype", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  type WindowEventType = EventType | String
  
  trait _Stream
    extends StObject
       with _EventListener
  object _Stream {
    
    inline def DerivedStream(stream: Stream): typings.vegaTypings.streamMod.DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.streamMod.DerivedStream]
    }
    
    inline def MergedStream(merge: js.Array[Stream]): typings.vegaTypings.streamMod.MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.streamMod.MergedStream]
    }
  }
}
