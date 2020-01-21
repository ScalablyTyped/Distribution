package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewState extends js.Object

/** Specifies the set of app view state changes that can be handled. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
@js.native
object ApplicationViewState extends js.Object {
  /** The current app's view has been reduced to a partial screen view as the result of another app snapping. */
  @js.native
  sealed trait filled extends ApplicationViewState
  
  /** The current app's view is in full-screen (has no snapped app adjacent to it), and has changed to landscape orientation. */
  @js.native
  sealed trait fullScreenLandscape extends ApplicationViewState
  
  /** The current app's view is in full-screen (has no snapped app adjacent to it), and has changed to portrait orientation. */
  @js.native
  sealed trait fullScreenPortrait extends ApplicationViewState
  
  /** The current app's view has been snapped. */
  @js.native
  sealed trait snapped extends ApplicationViewState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewState with Double] = js.native
  /* 1 */ @js.native
  object filled extends TopLevel[filled with Double]
  
  /* 0 */ @js.native
  object fullScreenLandscape extends TopLevel[fullScreenLandscape with Double]
  
  /* 3 */ @js.native
  object fullScreenPortrait extends TopLevel[fullScreenPortrait with Double]
  
  /* 2 */ @js.native
  object snapped extends TopLevel[snapped with Double]
  
}

