package typings.wonderJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/EEngineEvent", JSImport.Namespace)
@js.native
object eengineeventMod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEngineEvent with Double] = js.native
    /* 1 */ @js.native
    object ENDLOOP extends TopLevel[ENDLOOP with Double]
    
    /* 3 */ @js.native
    object POINT_DOWN extends TopLevel[POINT_DOWN with Double]
    
    /* 9 */ @js.native
    object POINT_DRAG extends TopLevel[POINT_DRAG with Double]
    
    /* 5 */ @js.native
    object POINT_MOVE extends TopLevel[POINT_MOVE with Double]
    
    /* 7 */ @js.native
    object POINT_OUT extends TopLevel[POINT_OUT with Double]
    
    /* 6 */ @js.native
    object POINT_OVER extends TopLevel[POINT_OVER with Double]
    
    /* 8 */ @js.native
    object POINT_SCALE extends TopLevel[POINT_SCALE with Double]
    
    /* 2 */ @js.native
    object POINT_TAP extends TopLevel[POINT_TAP with Double]
    
    /* 4 */ @js.native
    object POINT_UP extends TopLevel[POINT_UP with Double]
    
    /* 0 */ @js.native
    object STARTLOOP extends TopLevel[STARTLOOP with Double]
    
    /* 11 */ @js.native
    object TRANSFORM_ROTATE extends TopLevel[TRANSFORM_ROTATE with Double]
    
    /* 12 */ @js.native
    object TRANSFORM_SCALE extends TopLevel[TRANSFORM_SCALE with Double]
    
    /* 10 */ @js.native
    object TRANSFORM_TRANSLATE extends TopLevel[TRANSFORM_TRANSLATE with Double]
    
  }
  
}

