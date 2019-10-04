package typings.vueDashLs.vueDashLsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Types extends js.Object

@JSImport("vue-ls", "Types")
@js.native
object Types extends js.Object {
  @js.native
  sealed trait Local extends Types
  
  @js.native
  sealed trait Memory extends Types
  
  @js.native
  sealed trait Session extends Types
  
  /* "local" */ val Local: typings.vueDashLs.vueDashLsMod.Types.Local with String = js.native
  /* "memory" */ val Memory: typings.vueDashLs.vueDashLsMod.Types.Memory with String = js.native
  /* "session" */ val Session: typings.vueDashLs.vueDashLsMod.Types.Session with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Types with String] = js.native
}

