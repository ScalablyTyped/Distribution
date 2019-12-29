package typings.atUirouterCore.libTransitionInterfaceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitionHookPhase extends js.Object

@JSImport("@uirouter/core/lib/transition/interface", "TransitionHookPhase")
@js.native
object TransitionHookPhase extends js.Object {
  @js.native
  sealed trait BEFORE extends TransitionHookPhase
  
  @js.native
  sealed trait CREATE extends TransitionHookPhase
  
  @js.native
  sealed trait ERROR extends TransitionHookPhase
  
  @js.native
  sealed trait RUN extends TransitionHookPhase
  
  @js.native
  sealed trait SUCCESS extends TransitionHookPhase
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitionHookPhase with Double] = js.native
  /* 1 */ @js.native
  object BEFORE extends TopLevel[BEFORE with Double]
  
  /* 0 */ @js.native
  object CREATE extends TopLevel[CREATE with Double]
  
  /* 4 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 2 */ @js.native
  object RUN extends TopLevel[RUN with Double]
  
  /* 3 */ @js.native
  object SUCCESS extends TopLevel[SUCCESS with Double]
  
}

