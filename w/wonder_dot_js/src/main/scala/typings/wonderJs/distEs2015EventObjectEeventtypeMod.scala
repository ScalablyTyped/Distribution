package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectEeventtypeMod {
  
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
    /* 4 */ val CUSTOM: typings.wonderJs.distEs2015EventObjectEeventtypeMod.EEventType.CUSTOM & Double = js.native
    
    @js.native
    sealed trait KEYBOARD
      extends StObject
         with EEventType
    /* 3 */ val KEYBOARD: typings.wonderJs.distEs2015EventObjectEeventtypeMod.EEventType.KEYBOARD & Double = js.native
    
    @js.native
    sealed trait MOUSE
      extends StObject
         with EEventType
    /* 0 */ val MOUSE: typings.wonderJs.distEs2015EventObjectEeventtypeMod.EEventType.MOUSE & Double = js.native
    
    @js.native
    sealed trait POINT
      extends StObject
         with EEventType
    /* 2 */ val POINT: typings.wonderJs.distEs2015EventObjectEeventtypeMod.EEventType.POINT & Double = js.native
    
    @js.native
    sealed trait TOUCH
      extends StObject
         with EEventType
    /* 1 */ val TOUCH: typings.wonderJs.distEs2015EventObjectEeventtypeMod.EEventType.TOUCH & Double = js.native
  }
}
