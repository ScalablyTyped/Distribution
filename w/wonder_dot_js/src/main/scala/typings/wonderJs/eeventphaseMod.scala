package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eeventphaseMod {
  
  @js.native
  sealed trait EEventPhase extends StObject
  @JSImport("wonder.js/dist/es2015/event/object/EEventPhase", "EEventPhase")
  @js.native
  object EEventPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventPhase & Double] = js.native
    
    @js.native
    sealed trait BROADCAST
      extends StObject
         with EEventPhase
    /* 0 */ val BROADCAST: typings.wonderJs.eeventphaseMod.EEventPhase.BROADCAST & Double = js.native
    
    @js.native
    sealed trait EMIT
      extends StObject
         with EEventPhase
    /* 1 */ val EMIT: typings.wonderJs.eeventphaseMod.EEventPhase.EMIT & Double = js.native
  }
}
