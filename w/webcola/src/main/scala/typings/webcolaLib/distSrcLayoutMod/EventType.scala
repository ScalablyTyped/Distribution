package typings
package webcolaLib.distSrcLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSImport("webcola/dist/src/layout", "EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait end
    extends webcolaLib.distSrcLayoutMod.EventType
  
  @js.native
  sealed trait start
    extends webcolaLib.distSrcLayoutMod.EventType
  
  @js.native
  sealed trait tick
    extends webcolaLib.distSrcLayoutMod.EventType
  
  /* 2 */ val end: end with scala.Double = js.native
  /* 0 */ val start: start with scala.Double = js.native
  /* 1 */ val tick: tick with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webcolaLib.distSrcLayoutMod.EventType with scala.Double] = js.native
}

