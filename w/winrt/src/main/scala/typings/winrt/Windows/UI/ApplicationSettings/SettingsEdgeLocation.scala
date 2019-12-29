package typings.winrt.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SettingsEdgeLocation with Double] = js.native
  /* 1 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 0 */ @js.native
  object right extends TopLevel[right with Double]
  
}

