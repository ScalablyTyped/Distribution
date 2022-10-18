package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventEengineeventMod {
  
  @js.native
  sealed trait EEngineEvent extends StObject
  @JSImport("wonder.js/dist/es2015/event/EEngineEvent", "EEngineEvent")
  @js.native
  object EEngineEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEngineEvent & Double] = js.native
    
    @js.native
    sealed trait ENDLOOP
      extends StObject
         with EEngineEvent
    /* 1 */ val ENDLOOP: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.ENDLOOP & Double = js.native
    
    @js.native
    sealed trait POINT_DOWN
      extends StObject
         with EEngineEvent
    /* 3 */ val POINT_DOWN: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.POINT_DOWN & Double = js.native
    
    @js.native
    sealed trait POINT_DRAG
      extends StObject
         with EEngineEvent
    /* 9 */ val POINT_DRAG: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.POINT_DRAG & Double = js.native
    
    @js.native
    sealed trait POINT_MOVE
      extends StObject
         with EEngineEvent
    /* 5 */ val POINT_MOVE: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.POINT_MOVE & Double = js.native
    
    @js.native
    sealed trait POINT_OUT
      extends StObject
         with EEngineEvent
    /* 7 */ val POINT_OUT: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.POINT_OUT & Double = js.native
    
    @js.native
    sealed trait POINT_OVER
      extends StObject
         with EEngineEvent
    /* 6 */ val POINT_OVER: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.POINT_OVER & Double = js.native
    
    @js.native
    sealed trait POINT_SCALE
      extends StObject
         with EEngineEvent
    /* 8 */ val POINT_SCALE: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.POINT_SCALE & Double = js.native
    
    @js.native
    sealed trait POINT_TAP
      extends StObject
         with EEngineEvent
    /* 2 */ val POINT_TAP: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.POINT_TAP & Double = js.native
    
    @js.native
    sealed trait POINT_UP
      extends StObject
         with EEngineEvent
    /* 4 */ val POINT_UP: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.POINT_UP & Double = js.native
    
    @js.native
    sealed trait STARTLOOP
      extends StObject
         with EEngineEvent
    /* 0 */ val STARTLOOP: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.STARTLOOP & Double = js.native
    
    @js.native
    sealed trait TRANSFORM_ROTATE
      extends StObject
         with EEngineEvent
    /* 11 */ val TRANSFORM_ROTATE: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.TRANSFORM_ROTATE & Double = js.native
    
    @js.native
    sealed trait TRANSFORM_SCALE
      extends StObject
         with EEngineEvent
    /* 12 */ val TRANSFORM_SCALE: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.TRANSFORM_SCALE & Double = js.native
    
    @js.native
    sealed trait TRANSFORM_TRANSLATE
      extends StObject
         with EEngineEvent
    /* 10 */ val TRANSFORM_TRANSLATE: typings.wonderJs.distEs2015EventEengineeventMod.EEngineEvent.TRANSFORM_TRANSLATE & Double = js.native
  }
}
