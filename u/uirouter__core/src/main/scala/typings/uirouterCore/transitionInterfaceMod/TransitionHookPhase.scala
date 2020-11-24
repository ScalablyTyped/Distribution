package typings.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitionHookPhase extends js.Object
@JSImport("@uirouter/core/lib/transition/interface", "TransitionHookPhase")
@js.native
object TransitionHookPhase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitionHookPhase with Double] = js.native
  
  @js.native
  sealed trait BEFORE extends TransitionHookPhase
  /* 1 */ @js.native
  object BEFORE extends TopLevel[BEFORE with Double]
  
  @js.native
  sealed trait CREATE extends TransitionHookPhase
  /* 0 */ @js.native
  object CREATE extends TopLevel[CREATE with Double]
  
  @js.native
  sealed trait ERROR extends TransitionHookPhase
  /* 4 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait RUN extends TransitionHookPhase
  /* 2 */ @js.native
  object RUN extends TopLevel[RUN with Double]
  
  @js.native
  sealed trait SUCCESS extends TransitionHookPhase
  /* 3 */ @js.native
  object SUCCESS extends TopLevel[SUCCESS with Double]
}
