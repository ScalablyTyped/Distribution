package typings.subscribeUiEvent

import typings.subscribeUiEvent.mod.EventType
import typings.subscribeUiEvent.mod.TouchEventType
import typings.subscribeUiEvent.mod.UIEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscribeUiEventStrings {
  
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  
  @scala.inline
  def resizeEnd: resizeEnd = "resizeEnd".asInstanceOf[resizeEnd]
  
  @scala.inline
  def resizeStart: resizeStart = "resizeStart".asInstanceOf[resizeStart]
  
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @scala.inline
  def scrollEnd: scrollEnd = "scrollEnd".asInstanceOf[scrollEnd]
  
  @scala.inline
  def scrollStart: scrollStart = "scrollStart".asInstanceOf[scrollStart]
  
  @scala.inline
  def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @scala.inline
  def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  
  @scala.inline
  def touchmoveEnd: touchmoveEnd = "touchmoveEnd".asInstanceOf[touchmoveEnd]
  
  @scala.inline
  def touchmoveStart: touchmoveStart = "touchmoveStart".asInstanceOf[touchmoveStart]
  
  @scala.inline
  def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @scala.inline
  def visibilitychange: visibilitychange = "visibilitychange".asInstanceOf[visibilitychange]
  
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait resize
    extends EventType
       with UIEventType
  
  @js.native
  sealed trait resizeEnd
    extends EventType
       with UIEventType
  
  @js.native
  sealed trait resizeStart
    extends EventType
       with UIEventType
  
  @js.native
  sealed trait scroll
    extends EventType
       with UIEventType
  
  @js.native
  sealed trait scrollEnd
    extends EventType
       with UIEventType
  
  @js.native
  sealed trait scrollStart
    extends EventType
       with UIEventType
  
  @js.native
  sealed trait touchend
    extends EventType
       with TouchEventType
  
  @js.native
  sealed trait touchmove
    extends EventType
       with TouchEventType
  
  @js.native
  sealed trait touchmoveEnd
    extends EventType
       with TouchEventType
  
  @js.native
  sealed trait touchmoveStart
    extends EventType
       with TouchEventType
  
  @js.native
  sealed trait touchstart
    extends EventType
       with TouchEventType
  
  @js.native
  sealed trait visibilitychange
    extends EventType
       with UIEventType
  
  @js.native
  sealed trait x extends js.Object
  
  @js.native
  sealed trait y extends js.Object
}
