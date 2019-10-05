package typings.winrtDashUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIColorType extends js.Object

/** Defines constants that specify known system color values. */
@JSGlobal("Windows.UI.ViewManagement.UIColorType")
@js.native
object UIColorType extends js.Object {
  /** The accent color. */
  @js.native
  sealed trait accent extends UIColorType
  
  /** The dark accent color. */
  @js.native
  sealed trait accentDark1 extends UIColorType
  
  /** The darker accent color. */
  @js.native
  sealed trait accentDark2 extends UIColorType
  
  /** The darkest accent color. */
  @js.native
  sealed trait accentDark3 extends UIColorType
  
  /** The light accent color. */
  @js.native
  sealed trait accentLight1 extends UIColorType
  
  /** The lighter accent color. */
  @js.native
  sealed trait accentLight2 extends UIColorType
  
  /** The lightest accent color. */
  @js.native
  sealed trait accentLight3 extends UIColorType
  
  /** The background color. */
  @js.native
  sealed trait background extends UIColorType
  
  /** The complement color. */
  @js.native
  sealed trait complement extends UIColorType
  
  /** The foreground color. */
  @js.native
  sealed trait foreground extends UIColorType
  
  /* 5 */ val accent: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.accent with Double = js.native
  /* 4 */ val accentDark1: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.accentDark1 with Double = js.native
  /* 3 */ val accentDark2: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.accentDark2 with Double = js.native
  /* 2 */ val accentDark3: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.accentDark3 with Double = js.native
  /* 6 */ val accentLight1: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.accentLight1 with Double = js.native
  /* 7 */ val accentLight2: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.accentLight2 with Double = js.native
  /* 8 */ val accentLight3: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.accentLight3 with Double = js.native
  /* 0 */ val background: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.background with Double = js.native
  /* 9 */ val complement: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.complement with Double = js.native
  /* 1 */ val foreground: typings.winrtDashUwp.Windows.UI.ViewManagement.UIColorType.foreground with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIColorType with Double] = js.native
}

