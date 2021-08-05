package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventNameHandlerMod {
  
  @js.native
  sealed trait EEventName extends StObject
  @JSImport("wonder.js/dist/es2015/event/object/EventNameHandler", "EEventName")
  @js.native
  object EEventName extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventName & Double] = js.native
    
    @js.native
    sealed trait CLICK
      extends StObject
         with EEventName
    /* 0 */ val CLICK: typings.wonderJs.eventNameHandlerMod.EEventName.CLICK & Double = js.native
    
    @js.native
    sealed trait KEYDOWN
      extends StObject
         with EEventName
    /* 11 */ val KEYDOWN: typings.wonderJs.eventNameHandlerMod.EEventName.KEYDOWN & Double = js.native
    
    @js.native
    sealed trait KEYPRESS
      extends StObject
         with EEventName
    /* 13 */ val KEYPRESS: typings.wonderJs.eventNameHandlerMod.EEventName.KEYPRESS & Double = js.native
    
    @js.native
    sealed trait KEYUP
      extends StObject
         with EEventName
    /* 12 */ val KEYUP: typings.wonderJs.eventNameHandlerMod.EEventName.KEYUP & Double = js.native
    
    @js.native
    sealed trait MOUSEDOWN
      extends StObject
         with EEventName
    /* 5 */ val MOUSEDOWN: typings.wonderJs.eventNameHandlerMod.EEventName.MOUSEDOWN & Double = js.native
    
    @js.native
    sealed trait MOUSEDRAG
      extends StObject
         with EEventName
    /* 7 */ val MOUSEDRAG: typings.wonderJs.eventNameHandlerMod.EEventName.MOUSEDRAG & Double = js.native
    
    @js.native
    sealed trait MOUSEMOVE
      extends StObject
         with EEventName
    /* 4 */ val MOUSEMOVE: typings.wonderJs.eventNameHandlerMod.EEventName.MOUSEMOVE & Double = js.native
    
    @js.native
    sealed trait MOUSEOUT
      extends StObject
         with EEventName
    /* 3 */ val MOUSEOUT: typings.wonderJs.eventNameHandlerMod.EEventName.MOUSEOUT & Double = js.native
    
    @js.native
    sealed trait MOUSEOVER
      extends StObject
         with EEventName
    /* 1 */ val MOUSEOVER: typings.wonderJs.eventNameHandlerMod.EEventName.MOUSEOVER & Double = js.native
    
    @js.native
    sealed trait MOUSEUP
      extends StObject
         with EEventName
    /* 2 */ val MOUSEUP: typings.wonderJs.eventNameHandlerMod.EEventName.MOUSEUP & Double = js.native
    
    @js.native
    sealed trait MOUSEWHEEL
      extends StObject
         with EEventName
    /* 6 */ val MOUSEWHEEL: typings.wonderJs.eventNameHandlerMod.EEventName.MOUSEWHEEL & Double = js.native
    
    @js.native
    sealed trait TOUCHDOWN
      extends StObject
         with EEventName
    /* 10 */ val TOUCHDOWN: typings.wonderJs.eventNameHandlerMod.EEventName.TOUCHDOWN & Double = js.native
    
    @js.native
    sealed trait TOUCHMOVE
      extends StObject
         with EEventName
    /* 9 */ val TOUCHMOVE: typings.wonderJs.eventNameHandlerMod.EEventName.TOUCHMOVE & Double = js.native
    
    @js.native
    sealed trait TOUCHUP
      extends StObject
         with EEventName
    /* 8 */ val TOUCHUP: typings.wonderJs.eventNameHandlerMod.EEventName.TOUCHUP & Double = js.native
  }
  
  @JSImport("wonder.js/dist/es2015/event/object/EventNameHandler", "EventNameHandler")
  @js.native
  class EventNameHandler () extends StObject
  /* static members */
  object EventNameHandler {
    
    @JSImport("wonder.js/dist/es2015/event/object/EventNameHandler", "EventNameHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handleEventName(domEventName: EEventName): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEventName")(domEventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
