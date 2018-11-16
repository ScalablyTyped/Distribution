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
  
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.ApplicationSettingsNs.SettingsEdgeLocation with java.lang.String
  ] = js.native
}

