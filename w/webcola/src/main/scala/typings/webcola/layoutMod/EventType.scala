package typings.webcola.layoutMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
  /* 2 */ @js.native
  object end extends TopLevel[end with Double]
  
  /* 0 */ @js.native
  object start extends TopLevel[start with Double]
  
  /* 1 */ @js.native
  object tick extends TopLevel[tick with Double]
  
}

