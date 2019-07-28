package typings.winrtDashUwp.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileOptions extends js.Object

/** Specifies options available to a secondary tile. */
@JSGlobal("Windows.UI.StartScreen.TileOptions")
@js.native
object TileOptions extends js.Object {
  /** CopyOnDeployment may be altered or unavailable for releases after Windows 8.1. Instead, use the RoamingEnabled property. */
  @js.native
  sealed trait copyOnDeployment extends TileOptions
  
  /** None may be altered or unavailable for releases after Windows 8.1. Instead, use these properties individually: */
  @js.native
  sealed trait none extends TileOptions
  
  /** ShowNameOnLogo may be altered or unavailable for releases after Windows 8.1. Instead, use the SecondaryTileVisualElements.ShowNameOnSquare150x150Logo property. */
  @js.native
  sealed trait showNameOnLogo extends TileOptions
  
  /** ShowNameOnWideLogo may be altered or unavailable for releases after Windows 8.1. Instead, use the SecondaryTileVisualElements.ShowNameOnWide310x150Logo property. */
  @js.native
  sealed trait showNameOnWideLogo extends TileOptions
  
  /* 3 */ val copyOnDeployment: typings.winrtDashUwp.WindowsNs.UINs.StartScreenNs.TileOptions.copyOnDeployment with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.UINs.StartScreenNs.TileOptions.none with Double = js.native
  /* 1 */ val showNameOnLogo: typings.winrtDashUwp.WindowsNs.UINs.StartScreenNs.TileOptions.showNameOnLogo with Double = js.native
  /* 2 */ val showNameOnWideLogo: typings.winrtDashUwp.WindowsNs.UINs.StartScreenNs.TileOptions.showNameOnWideLogo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileOptions with Double] = js.native
}

