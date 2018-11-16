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
  
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation with java.lang.String
  ] = js.native
}

