package typings.tizenCommonWeb.tvwindowMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WindowType extends js.Object
@JSImport("tizen-common-web/tvwindow", "WindowType")
@js.native
object WindowType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WindowType with String] = js.native
  
  @js.native
  sealed trait MAIN extends WindowType
  /* "MAIN" */ @js.native
  object MAIN extends TopLevel[MAIN with String]
}
