package typings.winrtDashUwp.Windows.UI.ViewManagement

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
  
  /* 2 */ val consolidateViews: typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.consolidateViews with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.default with Double = js.native
  /* 1 */ val skipAnimation: typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewSwitchingOptions.skipAnimation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewSwitchingOptions with Double] = js.native
}

