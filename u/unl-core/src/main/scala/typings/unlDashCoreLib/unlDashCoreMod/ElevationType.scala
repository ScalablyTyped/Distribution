package typings
package unlDashCoreLib.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElevationType extends js.Object

@JSImport("unl-core", "ElevationType")
@js.native
object ElevationType extends js.Object {
  @js.native
  sealed trait floor
    extends unlDashCoreLib.unlDashCoreMod.ElevationType
  
  @js.native
  sealed trait heightincm
    extends unlDashCoreLib.unlDashCoreMod.ElevationType
  
  /* "floor" */ val floor: floor with java.lang.String = js.native
  /* "heightincm" */ val heightincm: heightincm with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[unlDashCoreLib.unlDashCoreMod.ElevationType with java.lang.String] = js.native
}

