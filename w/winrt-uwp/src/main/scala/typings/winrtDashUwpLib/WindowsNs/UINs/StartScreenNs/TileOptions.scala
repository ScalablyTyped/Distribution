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
  
  val copyOnDeployment: copyOnDeployment with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val showNameOnLogo: showNameOnLogo with java.lang.String = js.native
  val showNameOnWideLogo: showNameOnWideLogo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.StartScreenNs.TileOptions with java.lang.String] = js.native
}

