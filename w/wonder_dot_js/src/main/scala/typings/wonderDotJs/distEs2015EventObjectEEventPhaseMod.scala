package typings.wonderDotJs

import org.scalablytyped.runtime.TopLevel
import typings.wonderDotJs.distEs2015EventObjectEEventPhaseMod.EEventPhase
import typings.wonderDotJs.distEs2015EventObjectEEventPhaseMod.EEventPhase.BROADCAST
import typings.wonderDotJs.distEs2015EventObjectEEventPhaseMod.EEventPhase.EMIT
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventPhase with Double] = js.native
    /* 0 */ @js.native
    object BROADCAST extends TopLevel[BROADCAST with Double]
    
    /* 1 */ @js.native
    object EMIT extends TopLevel[EMIT with Double]
    
  }
  
}

