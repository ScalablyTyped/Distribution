package typings.webcola.distSrcLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSImport("webcola/dist/src/layout", "EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait end extends EventType
  
  @js.native
  sealed trait start extends EventType
  
  @js.native
  sealed trait tick extends EventType
  
  /* 2 */ val end: typings.webcola.distSrcLayoutMod.EventType.end with Double = js.native
  /* 0 */ val start: typings.webcola.distSrcLayoutMod.EventType.start with Double = js.native
  /* 1 */ val tick: typings.webcola.distSrcLayoutMod.EventType.tick with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

