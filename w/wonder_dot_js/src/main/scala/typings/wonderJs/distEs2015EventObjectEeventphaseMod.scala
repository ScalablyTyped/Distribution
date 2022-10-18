package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectEeventphaseMod {
  
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
    /* 0 */ val BROADCAST: typings.wonderJs.distEs2015EventObjectEeventphaseMod.EEventPhase.BROADCAST & Double = js.native
    
    @js.native
    sealed trait EMIT
      extends StObject
         with EEventPhase
    /* 1 */ val EMIT: typings.wonderJs.distEs2015EventObjectEeventphaseMod.EEventPhase.EMIT & Double = js.native
  }
}
