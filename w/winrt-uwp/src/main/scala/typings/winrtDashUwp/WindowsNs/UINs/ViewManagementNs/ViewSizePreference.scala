package typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs

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
  sealed trait default extends ViewSizePreference
  
  /** The window uses 50% (half) of the available horizontal screen pixels. */
  @js.native
  sealed trait useHalf extends ViewSizePreference
  
  /** The window uses less than 50% of the available horizontal screen pixels. */
  @js.native
  sealed trait useLess extends ViewSizePreference
  
  /** The window uses the minimum horizontal pixel width (either 320 or 500 pixels) specifies in the app's manifest (such as package.appxmanifest). */
  @js.native
  sealed trait useMinimum extends ViewSizePreference
  
  /** The window uses more than 50% of the available horizontal screen pixels. */
  @js.native
  sealed trait useMore extends ViewSizePreference
  
  /** The window has no visible component. */
  @js.native
  sealed trait useNone extends ViewSizePreference
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.default with Double = js.native
  /* 2 */ val useHalf: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useHalf with Double = js.native
  /* 1 */ val useLess: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useLess with Double = js.native
  /* 4 */ val useMinimum: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useMinimum with Double = js.native
  /* 3 */ val useMore: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useMore with Double = js.native
  /* 5 */ val useNone: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ViewSizePreference.useNone with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewSizePreference with Double] = js.native
}

