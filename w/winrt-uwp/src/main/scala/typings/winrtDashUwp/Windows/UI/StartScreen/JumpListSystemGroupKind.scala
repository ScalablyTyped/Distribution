package typings.winrtDashUwp.Windows.UI.StartScreen

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
  sealed trait frequent extends JumpListSystemGroupKind
  
  /** Specifies that no system managed group be used in the jump list. */
  @js.native
  sealed trait none extends JumpListSystemGroupKind
  
  /** Specifies that the system managed recent group be used in the jump list. */
  @js.native
  sealed trait recent extends JumpListSystemGroupKind
  
  /* 1 */ val frequent: typings.winrtDashUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.frequent with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.none with Double = js.native
  /* 2 */ val recent: typings.winrtDashUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.recent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JumpListSystemGroupKind with Double] = js.native
}

