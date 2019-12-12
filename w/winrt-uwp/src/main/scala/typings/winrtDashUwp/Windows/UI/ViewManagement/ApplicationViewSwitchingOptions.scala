package typings.winrtDashUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.consolidateViews
import typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.default
import typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.skipAnimation
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
  sealed trait consolidateViews extends ApplicationViewSwitchingOptions
  
  /** Perform the standard animated transition between windows upon switching. */
  @js.native
  sealed trait default extends ApplicationViewSwitchingOptions
  
  /** Immediately transition between windows without animation. */
  @js.native
  sealed trait skipAnimation extends ApplicationViewSwitchingOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewSwitchingOptions with Double] = js.native
  /* 2 */ @js.native
  object consolidateViews extends TopLevel[consolidateViews with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object skipAnimation extends TopLevel[skipAnimation with Double]
  
}

