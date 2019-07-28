package typings.unlDashCore.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElevationType extends js.Object

@JSImport("unl-core", "ElevationType")
@js.native
object ElevationType extends js.Object {
  @js.native
  sealed trait floor extends ElevationType
  
  @js.native
  sealed trait heightincm extends ElevationType
  
  /* "floor" */ val floor: typings.unlDashCore.unlDashCoreMod.ElevationType.floor with String = js.native
  /* "heightincm" */ val heightincm: typings.unlDashCore.unlDashCoreMod.ElevationType.heightincm with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ElevationType with String] = js.native
}

