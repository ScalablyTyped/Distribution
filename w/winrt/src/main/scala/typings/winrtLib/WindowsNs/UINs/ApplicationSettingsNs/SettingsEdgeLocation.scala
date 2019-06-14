package typings
package winrtLib.WindowsNs.UINs.ApplicationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SettingsEdgeLocation extends js.Object

@JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
@js.native
object SettingsEdgeLocation extends js.Object {
  @js.native
  sealed trait left
    extends winrtLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation
  
  @js.native
  sealed trait right
    extends winrtLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation
  
  /* 1 */ val left: left with scala.Double = js.native
  /* 0 */ val right: right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation with scala.Double
  ] = js.native
}

