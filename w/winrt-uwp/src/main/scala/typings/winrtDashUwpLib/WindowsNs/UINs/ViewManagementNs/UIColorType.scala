package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

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
  sealed trait accent
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The dark accent color. */
  @js.native
  sealed trait accentDark1
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The darker accent color. */
  @js.native
  sealed trait accentDark2
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The darkest accent color. */
  @js.native
  sealed trait accentDark3
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The light accent color. */
  @js.native
  sealed trait accentLight1
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The lighter accent color. */
  @js.native
  sealed trait accentLight2
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The lightest accent color. */
  @js.native
  sealed trait accentLight3
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The background color. */
  @js.native
  sealed trait background
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The complement color. */
  @js.native
  sealed trait complement
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  /** The foreground color. */
  @js.native
  sealed trait foreground
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType
  
  val accent: accent with java.lang.String = js.native
  val accentDark1: accentDark1 with java.lang.String = js.native
  val accentDark2: accentDark2 with java.lang.String = js.native
  val accentDark3: accentDark3 with java.lang.String = js.native
  val accentLight1: accentLight1 with java.lang.String = js.native
  val accentLight2: accentLight2 with java.lang.String = js.native
  val accentLight3: accentLight3 with java.lang.String = js.native
  val background: background with java.lang.String = js.native
  val complement: complement with java.lang.String = js.native
  val foreground: foreground with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UIColorType with java.lang.String
  ] = js.native
}

