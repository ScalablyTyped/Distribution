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
  
  val default: default with java.lang.String = js.native
  val useHalf: useHalf with java.lang.String = js.native
  val useLess: useLess with java.lang.String = js.native
  val useMinimum: useMinimum with java.lang.String = js.native
  val useMore: useMore with java.lang.String = js.native
  val useNone: useNone with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ViewSizePreference with java.lang.String
  ] = js.native
}

