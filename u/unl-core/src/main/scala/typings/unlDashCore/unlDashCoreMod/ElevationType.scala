package typings.unlDashCore.unlDashCoreMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ElevationType with String] = js.native
  /* "floor" */ @js.native
  object floor extends TopLevel[floor with String]
  
  /* "heightincm" */ @js.native
  object heightincm extends TopLevel[heightincm with String]
  
}

