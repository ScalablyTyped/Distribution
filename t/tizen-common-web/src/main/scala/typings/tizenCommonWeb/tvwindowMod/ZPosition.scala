package typings.tizenCommonWeb.tvwindowMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZPosition extends js.Object

@JSImport("tizen-common-web/tvwindow", "ZPosition")
@js.native
object ZPosition extends js.Object {
  @js.native
  sealed trait BEHIND extends ZPosition
  
  @js.native
  sealed trait FRONT extends ZPosition
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ZPosition with String] = js.native
  /* "BEHIND" */ @js.native
  object BEHIND extends TopLevel[BEHIND with String]
  
  /* "FRONT" */ @js.native
  object FRONT extends TopLevel[FRONT with String]
  
}

