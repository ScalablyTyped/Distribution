package typings.wonderDotJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/EventNameHandler", JSImport.Namespace)
@js.native
object distEs2015EventObjectEventNameHandlerMod extends js.Object {
  @js.native
  sealed trait EEventName extends js.Object
  
  @js.native
  class EventNameHandler () extends js.Object
  
  @js.native
  object EEventName extends js.Object {
    @js.native
    sealed trait CLICK extends EEventName
    
    @js.native
    sealed trait KEYDOWN extends EEventName
    
    @js.native
    sealed trait KEYPRESS extends EEventName
    
    @js.native
    sealed trait KEYUP extends EEventName
    
    @js.native
    sealed trait MOUSEDOWN extends EEventName
    
    @js.native
    sealed trait MOUSEDRAG extends EEventName
    
    @js.native
    sealed trait MOUSEMOVE extends EEventName
    
    @js.native
    sealed trait MOUSEOUT extends EEventName
    
    @js.native
    sealed trait MOUSEOVER extends EEventName
    
    @js.native
    sealed trait MOUSEUP extends EEventName
    
    @js.native
    sealed trait MOUSEWHEEL extends EEventName
    
    @js.native
    sealed trait TOUCHDOWN extends EEventName
    
    @js.native
    sealed trait TOUCHMOVE extends EEventName
    
    @js.native
    sealed trait TOUCHUP extends EEventName
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventName with Double] = js.native
    /* 0 */ @js.native
    object CLICK extends TopLevel[CLICK with Double]
    
    /* 11 */ @js.native
    object KEYDOWN extends TopLevel[KEYDOWN with Double]
    
    /* 13 */ @js.native
    object KEYPRESS extends TopLevel[KEYPRESS with Double]
    
    /* 12 */ @js.native
    object KEYUP extends TopLevel[KEYUP with Double]
    
    /* 5 */ @js.native
    object MOUSEDOWN extends TopLevel[MOUSEDOWN with Double]
    
    /* 7 */ @js.native
    object MOUSEDRAG extends TopLevel[MOUSEDRAG with Double]
    
    /* 4 */ @js.native
    object MOUSEMOVE extends TopLevel[MOUSEMOVE with Double]
    
    /* 3 */ @js.native
    object MOUSEOUT extends TopLevel[MOUSEOUT with Double]
    
    /* 1 */ @js.native
    object MOUSEOVER extends TopLevel[MOUSEOVER with Double]
    
    /* 2 */ @js.native
    object MOUSEUP extends TopLevel[MOUSEUP with Double]
    
    /* 6 */ @js.native
    object MOUSEWHEEL extends TopLevel[MOUSEWHEEL with Double]
    
    /* 10 */ @js.native
    object TOUCHDOWN extends TopLevel[TOUCHDOWN with Double]
    
    /* 9 */ @js.native
    object TOUCHMOVE extends TopLevel[TOUCHMOVE with Double]
    
    /* 8 */ @js.native
    object TOUCHUP extends TopLevel[TOUCHUP with Double]
    
  }
  
  /* static members */
  @js.native
  object EventNameHandler extends js.Object {
    def handleEventName(domEventName: EEventName): js.Any = js.native
  }
  
}

