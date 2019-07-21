package typings
package unlDashCoreLib.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSImport("unl-core", "Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait East
    extends unlDashCoreLib.unlDashCoreMod.Direction
  
  @js.native
  sealed trait North
    extends unlDashCoreLib.unlDashCoreMod.Direction
  
  @js.native
  sealed trait South
    extends unlDashCoreLib.unlDashCoreMod.Direction
  
  @js.native
  sealed trait West
    extends unlDashCoreLib.unlDashCoreMod.Direction
  
  /* "E" */ val East: East with java.lang.String = js.native
  /* "N" */ val North: North with java.lang.String = js.native
  /* "S" */ val South: South with java.lang.String = js.native
  /* "W" */ val West: West with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[unlDashCoreLib.unlDashCoreMod.Direction with java.lang.String] = js.native
}

