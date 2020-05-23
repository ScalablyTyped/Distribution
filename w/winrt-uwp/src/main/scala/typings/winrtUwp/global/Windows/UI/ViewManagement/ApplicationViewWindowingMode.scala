package typings.winrtUwp.global.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines constants that specify whether the app window is auto-sized, full-screen, or set to a specific size on launch. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewWindowingMode")
@js.native
object ApplicationViewWindowingMode extends js.Object {
  /* 0 */ val auto: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.auto with Double = js.native
  /* 2 */ val fullScreen: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.fullScreen with Double = js.native
  /* 1 */ val preferredLaunchViewSize: typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.preferredLaunchViewSize with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode with Double
  ] = js.native
}

