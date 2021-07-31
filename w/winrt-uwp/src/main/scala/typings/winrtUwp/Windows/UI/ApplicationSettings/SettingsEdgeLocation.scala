package typings.winrtUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SettingsEdgeLocation extends StObject
/** Specifies the edge of the screen where the Settings charms appear. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
@js.native
object SettingsEdgeLocation extends StObject {
  
  /** The Settings charm appears on the left edge of the screen. */
  @js.native
  sealed trait left
    extends StObject
       with SettingsEdgeLocation
  
  /** The Settings charm appears on the right edge of the screen. */
  @js.native
  sealed trait right
    extends StObject
       with SettingsEdgeLocation
}
