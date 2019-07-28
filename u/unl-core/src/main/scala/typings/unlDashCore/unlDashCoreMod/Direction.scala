package typings.unlDashCore.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSImport("unl-core", "Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait East extends Direction
  
  @js.native
  sealed trait North extends Direction
  
  @js.native
  sealed trait South extends Direction
  
  @js.native
  sealed trait West extends Direction
  
  /* "E" */ val East: typings.unlDashCore.unlDashCoreMod.Direction.East with String = js.native
  /* "N" */ val North: typings.unlDashCore.unlDashCoreMod.Direction.North with String = js.native
  /* "S" */ val South: typings.unlDashCore.unlDashCoreMod.Direction.South with String = js.native
  /* "W" */ val West: typings.unlDashCore.unlDashCoreMod.Direction.West with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction with String] = js.native
}

