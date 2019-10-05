package typings.winrtDashUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewWindowingMode extends js.Object

/** Defines constants that specify whether the app window is auto-sized, full-screen, or set to a specific size on launch. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewWindowingMode")
@js.native
object ApplicationViewWindowingMode extends js.Object {
  /** The system sizes the app window automatically. */
  @js.native
  sealed trait auto extends ApplicationViewWindowingMode
  
  /** The window is full-screen. */
  @js.native
  sealed trait fullScreen extends ApplicationViewWindowingMode
  
  /** The window is sized as specified by the ApplicationView.PreferredLaunchViewSize property. */
  @js.native
  sealed trait preferredLaunchViewSize extends ApplicationViewWindowingMode
  
  /* 0 */ val auto: typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.auto with Double = js.native
  /* 2 */ val fullScreen: typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.fullScreen with Double = js.native
  /* 1 */ val preferredLaunchViewSize: typings.winrtDashUwp.Windows.UI.ViewManagement.ApplicationViewWindowingMode.preferredLaunchViewSize with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewWindowingMode with Double] = js.native
}

