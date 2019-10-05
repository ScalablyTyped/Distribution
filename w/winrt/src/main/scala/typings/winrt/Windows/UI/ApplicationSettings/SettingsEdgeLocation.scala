package typings.winrt.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SettingsEdgeLocation extends js.Object

@JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
@js.native
object SettingsEdgeLocation extends js.Object {
  @js.native
  sealed trait left extends SettingsEdgeLocation
  
  @js.native
  sealed trait right extends SettingsEdgeLocation
  
  /* 1 */ val left: typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.left with Double = js.native
  /* 0 */ val right: typings.winrt.Windows.UI.ApplicationSettings.SettingsEdgeLocation.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SettingsEdgeLocation with Double] = js.native
}

