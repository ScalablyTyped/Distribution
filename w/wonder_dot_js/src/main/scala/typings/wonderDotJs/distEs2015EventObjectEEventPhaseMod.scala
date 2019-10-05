package typings.wonderDotJs

import typings.wonderDotJs.distEs2015EventObjectEEventPhaseMod.EEventPhase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/EEventPhase", JSImport.Namespace)
@js.native
object distEs2015EventObjectEEventPhaseMod extends js.Object {
  @js.native
  sealed trait EEventPhase extends js.Object
  
  @js.native
  object EEventPhase extends js.Object {
    @js.native
    sealed trait BROADCAST extends EEventPhase
    
    @js.native
    sealed trait EMIT extends EEventPhase
    
    /* 0 */ val BROADCAST: typings.wonderDotJs.distEs2015EventObjectEEventPhaseMod.EEventPhase.BROADCAST with Double = js.native
    /* 1 */ val EMIT: typings.wonderDotJs.distEs2015EventObjectEEventPhaseMod.EEventPhase.EMIT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventPhase with Double] = js.native
  }
  
}

