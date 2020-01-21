package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewWindowingMode with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 2 */ @js.native
  object fullScreen extends TopLevel[fullScreen with Double]
  
  /* 1 */ @js.native
  object preferredLaunchViewSize extends TopLevel[preferredLaunchViewSize with Double]
  
}

