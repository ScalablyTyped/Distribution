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
  
  val consolidateViews: consolidateViews with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val skipAnimation: skipAnimation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewSwitchingOptions with java.lang.String
  ] = js.native
}

