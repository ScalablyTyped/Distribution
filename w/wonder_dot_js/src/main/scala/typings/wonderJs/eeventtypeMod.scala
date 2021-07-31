package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eeventtypeMod {
  
  @js.native
  sealed trait EEventType extends StObject
  @JSImport("wonder.js/dist/es2015/event/object/EEventType", "EEventType")
  @js.native
  object EEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventType & Double] = js.native
    
    @js.native
    sealed trait CUSTOM
      extends StObject
         with EEventType
    /* 4 */ val CUSTOM: typings.wonderJs.eeventtypeMod.EEventType.CUSTOM & Double = js.native
    
    @js.native
    sealed trait KEYBOARD
      extends StObject
         with EEventType
    /* 3 */ val KEYBOARD: typings.wonderJs.eeventtypeMod.EEventType.KEYBOARD & Double = js.native
    
    @js.native
    sealed trait MOUSE
      extends StObject
         with EEventType
    /* 0 */ val MOUSE: typings.wonderJs.eeventtypeMod.EEventType.MOUSE & Double = js.native
    
    @js.native
    sealed trait POINT
      extends StObject
         with EEventType
    /* 2 */ val POINT: typings.wonderJs.eeventtypeMod.EEventType.POINT & Double = js.native
    
    @js.native
    sealed trait TOUCH
      extends StObject
         with EEventType
    /* 1 */ val TOUCH: typings.wonderJs.eeventtypeMod.EEventType.TOUCH & Double = js.native
  }
}
