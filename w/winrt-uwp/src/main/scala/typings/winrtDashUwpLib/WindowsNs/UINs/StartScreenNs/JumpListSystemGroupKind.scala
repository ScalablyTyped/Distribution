package typings
package winrtDashUwpLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JumpListSystemGroupKind extends js.Object

/** Indicates the kind of system group used by an app's jump list. */
@JSGlobal("Windows.UI.StartScreen.JumpListSystemGroupKind")
@js.native
object JumpListSystemGroupKind extends js.Object {
  /** Specifies that the system managed frequent group be used in the jump list. */
  @js.native
  sealed trait frequent
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListSystemGroupKind
  
  /** Specifies that no system managed group be used in the jump list. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListSystemGroupKind
  
  /** Specifies that the system managed recent group be used in the jump list. */
  @js.native
  sealed trait recent
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListSystemGroupKind
  
  /* 1 */ val frequent: frequent with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val recent: recent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.JumpListSystemGroupKind with scala.Double
  ] = js.native
}

