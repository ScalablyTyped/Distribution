package typings.unlDashCore.unlDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.unlDashCore.unlDashCoreMod.Direction.East
import typings.unlDashCore.unlDashCoreMod.Direction.North
import typings.unlDashCore.unlDashCoreMod.Direction.South
import typings.unlDashCore.unlDashCoreMod.Direction.West
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction with String] = js.native
  /* "E" */ @js.native
  object East extends TopLevel[East with String]
  
  /* "N" */ @js.native
  object North extends TopLevel[North with String]
  
  /* "S" */ @js.native
  object South extends TopLevel[South with String]
  
  /* "W" */ @js.native
  object West extends TopLevel[West with String]
  
}

