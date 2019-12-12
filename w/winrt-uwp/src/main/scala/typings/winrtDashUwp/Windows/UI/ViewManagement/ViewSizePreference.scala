package typings.winrtDashUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.ViewManagement.ViewSizePreference.default
import typings.winrtDashUwp.Windows.UI.ViewManagement.ViewSizePreference.useHalf
import typings.winrtDashUwp.Windows.UI.ViewManagement.ViewSizePreference.useLess
import typings.winrtDashUwp.Windows.UI.ViewManagement.ViewSizePreference.useMinimum
import typings.winrtDashUwp.Windows.UI.ViewManagement.ViewSizePreference.useMore
import typings.winrtDashUwp.Windows.UI.ViewManagement.ViewSizePreference.useNone
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewSizePreference with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 2 */ @js.native
  object useHalf extends TopLevel[useHalf with Double]
  
  /* 1 */ @js.native
  object useLess extends TopLevel[useLess with Double]
  
  /* 4 */ @js.native
  object useMinimum extends TopLevel[useMinimum with Double]
  
  /* 3 */ @js.native
  object useMore extends TopLevel[useMore with Double]
  
  /* 5 */ @js.native
  object useNone extends TopLevel[useNone with Double]
  
}

