package typings.subscribeUiEvent

import typings.subscribeUiEvent.mod.EventType
import typings.subscribeUiEvent.mod.TouchEventType
import typings.subscribeUiEvent.mod.UIEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeUiEventStrings {
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait resize
    extends StObject
       with EventType
       with UIEventType
  inline def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait resizeEnd
    extends StObject
       with EventType
       with UIEventType
  inline def resizeEnd: resizeEnd = "resizeEnd".asInstanceOf[resizeEnd]
  
  @js.native
  sealed trait resizeStart
    extends StObject
       with EventType
       with UIEventType
  inline def resizeStart: resizeStart = "resizeStart".asInstanceOf[resizeStart]
  
  @js.native
  sealed trait scroll
    extends StObject
       with EventType
       with UIEventType
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait scrollEnd
    extends StObject
       with EventType
       with UIEventType
  inline def scrollEnd: scrollEnd = "scrollEnd".asInstanceOf[scrollEnd]
  
  @js.native
  sealed trait scrollStart
    extends StObject
       with EventType
       with UIEventType
  inline def scrollStart: scrollStart = "scrollStart".asInstanceOf[scrollStart]
  
  @js.native
  sealed trait touchend
    extends StObject
       with EventType
       with TouchEventType
  inline def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @js.native
  sealed trait touchmove
    extends StObject
       with EventType
       with TouchEventType
  inline def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  
  @js.native
  sealed trait touchmoveEnd
    extends StObject
       with EventType
       with TouchEventType
  inline def touchmoveEnd: touchmoveEnd = "touchmoveEnd".asInstanceOf[touchmoveEnd]
  
  @js.native
  sealed trait touchmoveStart
    extends StObject
       with EventType
       with TouchEventType
  inline def touchmoveStart: touchmoveStart = "touchmoveStart".asInstanceOf[touchmoveStart]
  
  @js.native
  sealed trait touchstart
    extends StObject
       with EventType
       with TouchEventType
  inline def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @js.native
  sealed trait visibilitychange
    extends StObject
       with EventType
       with UIEventType
  inline def visibilitychange: visibilitychange = "visibilitychange".asInstanceOf[visibilitychange]
  
  @js.native
  sealed trait x extends StObject
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  inline def y: y = "y".asInstanceOf[y]
}
