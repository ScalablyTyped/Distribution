package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewSwitchingOptions extends js.Object

/** Defines a set of options for window (app view) switching behaviors. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewSwitchingOptions")
@js.native
object ApplicationViewSwitchingOptions extends js.Object {
  /** Close the initial window and remove it from the list of recently used apps, and display the window to which the app is switching. */
  @js.native
  sealed trait consolidateViews
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewSwitchingOptions
  
  /** Perform the standard animated transition between windows upon switching. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewSwitchingOptions
  
  /** Immediately transition between windows without animation. */
  @js.native
  sealed trait skipAnimation
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewSwitchingOptions
  
  /* 2 */ val consolidateViews: consolidateViews with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val skipAnimation: skipAnimation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewSwitchingOptions with scala.Double
  ] = js.native
}

