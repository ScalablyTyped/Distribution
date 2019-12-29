package typings.winrtDashUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SettingsEdgeLocation with Double] = js.native
  /* 1 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 0 */ @js.native
  object right extends TopLevel[right with Double]
  
}

