package typings
package winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs

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
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation
  
  /** The Settings charm appears on the right edge of the screen. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation
  
  /* 1 */ val left: left with scala.Double = js.native
  /* 0 */ val right: right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation with scala.Double
  ] = js.native
}

