package typings.vegaTypings

import typings.vegaTypings.anon.Source
import typings.vegaTypings.anon.Type
import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.marktypeMod.MarkType
import typings.vegaTypings.onEventsMod._EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @js.native
  trait DerivedStream
    extends _Stream
       with StreamParameters {
    
    var stream: Stream = js.native
  }
  object DerivedStream {
    
    @scala.inline
    def apply(stream: Stream): DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[DerivedStream]
    }
    
    @scala.inline
    implicit class DerivedStreamMutableBuilder[Self <: DerivedStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type EventSource = (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) with js.Object
  
  type EventStream = StreamParameters with (Source | Type)
  
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
    
    @scala.inline
    def click: typings.vegaTypings.vegaTypingsStrings.click = "click".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.click]
    
    @scala.inline
    def dblclick: typings.vegaTypings.vegaTypingsStrings.dblclick = "dblclick".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dblclick]
    
    @scala.inline
    def dragenter: typings.vegaTypings.vegaTypingsStrings.dragenter = "dragenter".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dragenter]
    
    @scala.inline
    def dragleave: typings.vegaTypings.vegaTypingsStrings.dragleave = "dragleave".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dragleave]
    
    @scala.inline
    def dragover: typings.vegaTypings.vegaTypingsStrings.dragover = "dragover".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dragover]
    
    @scala.inline
    def keydown: typings.vegaTypings.vegaTypingsStrings.keydown = "keydown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.keydown]
    
    @scala.inline
    def keypress: typings.vegaTypings.vegaTypingsStrings.keypress = "keypress".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.keypress]
    
    @scala.inline
    def keyup: typings.vegaTypings.vegaTypingsStrings.keyup = "keyup".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.keyup]
    
    @scala.inline
    def mousedown: typings.vegaTypings.vegaTypingsStrings.mousedown = "mousedown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mousedown]
    
    @scala.inline
    def mousemove: typings.vegaTypings.vegaTypingsStrings.mousemove = "mousemove".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mousemove]
    
    @scala.inline
    def mouseout: typings.vegaTypings.vegaTypingsStrings.mouseout = "mouseout".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mouseout]
    
    @scala.inline
    def mouseover: typings.vegaTypings.vegaTypingsStrings.mouseover = "mouseover".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mouseover]
    
    @scala.inline
    def mouseup: typings.vegaTypings.vegaTypingsStrings.mouseup = "mouseup".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mouseup]
    
    @scala.inline
    def mousewheel: typings.vegaTypings.vegaTypingsStrings.mousewheel = "mousewheel".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mousewheel]
    
    @scala.inline
    def timer: typings.vegaTypings.vegaTypingsStrings.timer = "timer".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.timer]
    
    @scala.inline
    def touchend: typings.vegaTypings.vegaTypingsStrings.touchend = "touchend".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.touchend]
    
    @scala.inline
    def touchmove: typings.vegaTypings.vegaTypingsStrings.touchmove = "touchmove".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.touchmove]
    
    @scala.inline
    def touchstart: typings.vegaTypings.vegaTypingsStrings.touchstart = "touchstart".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.touchstart]
    
    @scala.inline
    def wheel: typings.vegaTypings.vegaTypingsStrings.wheel = "wheel".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.wheel]
  }
  
  @js.native
  trait MergedStream
    extends _Stream
       with StreamParameters {
    
    var merge: js.Array[Stream] = js.native
  }
  object MergedStream {
    
    @scala.inline
    def apply(merge: js.Array[Stream]): MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergedStream]
    }
    
    @scala.inline
    implicit class MergedStreamMutableBuilder[Self <: MergedStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMerge(value: js.Array[Stream]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeVarargs(value: Stream*): Self = StObject.set(x, "merge", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.streamMod.EventStream
    - typings.vegaTypings.streamMod.DerivedStream
    - typings.vegaTypings.streamMod.MergedStream
  */
  type Stream = _Stream | EventStream
  
  @js.native
  trait StreamParameters extends StObject {
    
    var between: js.UndefOr[js.Array[Stream]] = js.native
    
    var consume: js.UndefOr[Boolean] = js.native
    
    var debounce: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[Expr | js.Array[Expr]] = js.native
    
    var markname: js.UndefOr[String] = js.native
    
    var marktype: js.UndefOr[MarkType] = js.native
    
    var throttle: js.UndefOr[Double] = js.native
  }
  object StreamParameters {
    
    @scala.inline
    def apply(): StreamParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamParameters]
    }
    
    @scala.inline
    implicit class StreamParametersMutableBuilder[Self <: StreamParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBetween(value: js.Array[Stream]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      @scala.inline
      def setBetweenVarargs(value: Stream*): Self = StObject.set(x, "between", js.Array(value :_*))
      
      @scala.inline
      def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
      
      @scala.inline
      def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      @scala.inline
      def setFilter(value: Expr | js.Array[Expr]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: Expr*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setMarkname(value: String): Self = StObject.set(x, "markname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarknameUndefined: Self = StObject.set(x, "markname", js.undefined)
      
      @scala.inline
      def setMarktype(value: MarkType): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarktypeUndefined: Self = StObject.set(x, "marktype", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  type WindowEventType = EventType | String
  
  trait _Stream extends _EventListener
  object _Stream {
    
    @scala.inline
    def DerivedStream(stream: Stream): typings.vegaTypings.streamMod.DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.streamMod.DerivedStream]
    }
    
    @scala.inline
    def MergedStream(merge: js.Array[Stream]): typings.vegaTypings.streamMod.MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.streamMod.MergedStream]
    }
  }
}
