package typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SettingsEdgeLocation extends js.Object

/** Specifies the edge of the screen where the Settings charms appear. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
@js.native
object SettingsEdgeLocation extends js.Object {
  /** The Settings charm appears on the left edge of the screen. */
  @js.native
  sealed trait left extends SettingsEdgeLocation
  
  /** The Settings charm appears on the right edge of the screen. */
  @js.native
  sealed trait right extends SettingsEdgeLocation
  
  /* 1 */ val left: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation.left with Double = js.native
  /* 0 */ val right: typings.winrtDashUwp.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SettingsEdgeLocation with Double] = js.native
}

