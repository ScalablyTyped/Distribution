package typings
package wonderDotJsLib.distEs2015EventObjectEEventPhaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EEventPhase extends js.Object

@JSImport("wonder.js/dist/es2015/event/object/EEventPhase", "EEventPhase")
@js.native
object EEventPhase extends js.Object {
  @js.native
  sealed trait BROADCAST
    extends wonderDotJsLib.distEs2015EventObjectEEventPhaseMod.EEventPhase
  
  @js.native
  sealed trait EMIT
    extends wonderDotJsLib.distEs2015EventObjectEEventPhaseMod.EEventPhase
  
  /* 0 */ val BROADCAST: BROADCAST with scala.Double = js.native
  /* 1 */ val EMIT: EMIT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDotJsLib.distEs2015EventObjectEEventPhaseMod.EEventPhase with scala.Double] = js.native
}

