package typings.winrtUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TileOptions extends StObject
/** Specifies options available to a secondary tile. */
@JSGlobal("Windows.UI.StartScreen.TileOptions")
@js.native
object TileOptions extends StObject {
  
  /** CopyOnDeployment may be altered or unavailable for releases after Windows 8.1. Instead, use the RoamingEnabled property. */
  @js.native
  sealed trait copyOnDeployment
    extends StObject
       with TileOptions
  
  /** None may be altered or unavailable for releases after Windows 8.1. Instead, use these properties individually: */
  @js.native
  sealed trait none
    extends StObject
       with TileOptions
  
  /** ShowNameOnLogo may be altered or unavailable for releases after Windows 8.1. Instead, use the SecondaryTileVisualElements.ShowNameOnSquare150x150Logo property. */
  @js.native
  sealed trait showNameOnLogo
    extends StObject
       with TileOptions
  
  /** ShowNameOnWideLogo may be altered or unavailable for releases after Windows 8.1. Instead, use the SecondaryTileVisualElements.ShowNameOnWide310x150Logo property. */
  @js.native
  sealed trait showNameOnWideLogo
    extends StObject
       with TileOptions
}
