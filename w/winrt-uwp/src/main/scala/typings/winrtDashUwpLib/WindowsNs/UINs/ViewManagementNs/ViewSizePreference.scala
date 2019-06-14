package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewSizePreference extends js.Object

/** Defines the set of possible general window (app view) size preferences. */
@JSGlobal("Windows.UI.ViewManagement.ViewSizePreference")
@js.native
object ViewSizePreference extends js.Object {
  /** The app does not have a window size preference specified. Windows, rather than the app, sets the size preference, which defaults to UseHalf. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  /** The window uses 50% (half) of the available horizontal screen pixels. */
  @js.native
  sealed trait useHalf
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  /** The window uses less than 50% of the available horizontal screen pixels. */
  @js.native
  sealed trait useLess
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  /** The window uses the minimum horizontal pixel width (either 320 or 500 pixels) specifies in the app's manifest (such as package.appxmanifest). */
  @js.native
  sealed trait useMinimum
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  /** The window uses more than 50% of the available horizontal screen pixels. */
  @js.native
  sealed trait useMore
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  /** The window has no visible component. */
  @js.native
  sealed trait useNone
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 2 */ val useHalf: useHalf with scala.Double = js.native
  /* 1 */ val useLess: useLess with scala.Double = js.native
  /* 4 */ val useMinimum: useMinimum with scala.Double = js.native
  /* 3 */ val useMore: useMore with scala.Double = js.native
  /* 5 */ val useNone: useNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference with scala.Double
  ] = js.native
}

