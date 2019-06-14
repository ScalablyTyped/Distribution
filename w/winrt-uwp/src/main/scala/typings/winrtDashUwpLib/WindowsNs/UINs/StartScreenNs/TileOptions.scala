package typings
package winrtDashUwpLib.WindowsNs.UINs.StartScreenNs

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
  sealed trait copyOnDeployment
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileOptions
  
  /** None may be altered or unavailable for releases after Windows 8.1. Instead, use these properties individually: */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileOptions
  
  /** ShowNameOnLogo may be altered or unavailable for releases after Windows 8.1. Instead, use the SecondaryTileVisualElements.ShowNameOnSquare150x150Logo property. */
  @js.native
  sealed trait showNameOnLogo
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileOptions
  
  /** ShowNameOnWideLogo may be altered or unavailable for releases after Windows 8.1. Instead, use the SecondaryTileVisualElements.ShowNameOnWide310x150Logo property. */
  @js.native
  sealed trait showNameOnWideLogo
    extends winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileOptions
  
  /* 3 */ val copyOnDeployment: copyOnDeployment with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val showNameOnLogo: showNameOnLogo with scala.Double = js.native
  /* 2 */ val showNameOnWideLogo: showNameOnWideLogo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileOptions with scala.Double] = js.native
}

