package typings.wonderDotJs

import typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/EEngineEvent", JSImport.Namespace)
@js.native
object distEs2015EventEEngineEventMod extends js.Object {
  @js.native
  sealed trait EEngineEvent extends js.Object
  
  @js.native
  object EEngineEvent extends js.Object {
    @js.native
    sealed trait ENDLOOP extends EEngineEvent
    
    @js.native
    sealed trait POINT_DOWN extends EEngineEvent
    
    @js.native
    sealed trait POINT_DRAG extends EEngineEvent
    
    @js.native
    sealed trait POINT_MOVE extends EEngineEvent
    
    @js.native
    sealed trait POINT_OUT extends EEngineEvent
    
    @js.native
    sealed trait POINT_OVER extends EEngineEvent
    
    @js.native
    sealed trait POINT_SCALE extends EEngineEvent
    
    @js.native
    sealed trait POINT_TAP extends EEngineEvent
    
    @js.native
    sealed trait POINT_UP extends EEngineEvent
    
    @js.native
    sealed trait STARTLOOP extends EEngineEvent
    
    @js.native
    sealed trait TRANSFORM_ROTATE extends EEngineEvent
    
    @js.native
    sealed trait TRANSFORM_SCALE extends EEngineEvent
    
    @js.native
    sealed trait TRANSFORM_TRANSLATE extends EEngineEvent
    
    /* 1 */ val ENDLOOP: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.ENDLOOP with Double = js.native
    /* 3 */ val POINT_DOWN: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.POINT_DOWN with Double = js.native
    /* 9 */ val POINT_DRAG: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.POINT_DRAG with Double = js.native
    /* 5 */ val POINT_MOVE: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.POINT_MOVE with Double = js.native
    /* 7 */ val POINT_OUT: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.POINT_OUT with Double = js.native
    /* 6 */ val POINT_OVER: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.POINT_OVER with Double = js.native
    /* 8 */ val POINT_SCALE: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.POINT_SCALE with Double = js.native
    /* 2 */ val POINT_TAP: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.POINT_TAP with Double = js.native
    /* 4 */ val POINT_UP: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.POINT_UP with Double = js.native
    /* 0 */ val STARTLOOP: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.STARTLOOP with Double = js.native
    /* 11 */ val TRANSFORM_ROTATE: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.TRANSFORM_ROTATE with Double = js.native
    /* 12 */ val TRANSFORM_SCALE: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.TRANSFORM_SCALE with Double = js.native
    /* 10 */ val TRANSFORM_TRANSLATE: typings.wonderDotJs.distEs2015EventEEngineEventMod.EEngineEvent.TRANSFORM_TRANSLATE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEngineEvent with Double] = js.native
  }
  
}

