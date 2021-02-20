package typings.subscribeUiEvent

import typings.subscribeUiEvent.mod.EventType
import typings.subscribeUiEvent.mod.TouchEventType
import typings.subscribeUiEvent.mod.UIEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeUiEventStrings {
  
  @js.native
  sealed trait _empty extends StObject
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait resize
    extends EventType
       with UIEventType
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait resizeEnd
    extends EventType
       with UIEventType
  @scala.inline
  def resizeEnd: resizeEnd = "resizeEnd".asInstanceOf[resizeEnd]
  
  @js.native
  sealed trait resizeStart
    extends EventType
       with UIEventType
  @scala.inline
  def resizeStart: resizeStart = "resizeStart".asInstanceOf[resizeStart]
  
  @js.native
  sealed trait scroll
    extends EventType
       with UIEventType
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait scrollEnd
    extends EventType
       with UIEventType
  @scala.inline
  def scrollEnd: scrollEnd = "scrollEnd".asInstanceOf[scrollEnd]
  
  @js.native
  sealed trait scrollStart
    extends EventType
       with UIEventType
  @scala.inline
  def scrollStart: scrollStart = "scrollStart".asInstanceOf[scrollStart]
  
  @js.native
  sealed trait touchend
    extends EventType
       with TouchEventType
  @scala.inline
  def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @js.native
  sealed trait touchmove
    extends EventType
       with TouchEventType
  @scala.inline
  def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  
  @js.native
  sealed trait touchmoveEnd
    extends EventType
       with TouchEventType
  @scala.inline
  def touchmoveEnd: touchmoveEnd = "touchmoveEnd".asInstanceOf[touchmoveEnd]
  
  @js.native
  sealed trait touchmoveStart
    extends EventType
       with TouchEventType
  @scala.inline
  def touchmoveStart: touchmoveStart = "touchmoveStart".asInstanceOf[touchmoveStart]
  
  @js.native
  sealed trait touchstart
    extends EventType
       with TouchEventType
  @scala.inline
  def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @js.native
  sealed trait visibilitychange
    extends EventType
       with UIEventType
  @scala.inline
  def visibilitychange: visibilitychange = "visibilitychange".asInstanceOf[visibilitychange]
  
  @js.native
  sealed trait x extends StObject
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}
