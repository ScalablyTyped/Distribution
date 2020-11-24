package typings.tizenCommonWeb.tvwindowMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ZPosition extends js.Object
@JSImport("tizen-common-web/tvwindow", "ZPosition")
@js.native
object ZPosition extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ZPosition with String] = js.native
  
  @js.native
  sealed trait BEHIND extends ZPosition
  /* "BEHIND" */ @js.native
  object BEHIND extends TopLevel[BEHIND with String]
  
  @js.native
  sealed trait FRONT extends ZPosition
  /* "FRONT" */ @js.native
  object FRONT extends TopLevel[FRONT with String]
}
