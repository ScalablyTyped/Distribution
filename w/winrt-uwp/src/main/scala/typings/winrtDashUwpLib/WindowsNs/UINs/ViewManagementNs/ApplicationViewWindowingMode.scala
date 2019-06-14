package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewWindowingMode extends js.Object

/** Defines constants that specify whether the app window is auto-sized, full-screen, or set to a specific size on launch. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewWindowingMode")
@js.native
object ApplicationViewWindowingMode extends js.Object {
  /** The system sizes the app window automatically. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewWindowingMode
  
  /** The window is full-screen. */
  @js.native
  sealed trait fullScreen
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewWindowingMode
  
  /** The window is sized as specified by the ApplicationView.PreferredLaunchViewSize property. */
  @js.native
  sealed trait preferredLaunchViewSize
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewWindowingMode
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 2 */ val fullScreen: fullScreen with scala.Double = js.native
  /* 1 */ val preferredLaunchViewSize: preferredLaunchViewSize with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewWindowingMode with scala.Double
  ] = js.native
}

