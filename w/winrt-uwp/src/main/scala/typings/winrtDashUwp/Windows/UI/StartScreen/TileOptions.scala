package typings.winrtDashUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileOptions with Double] = js.native
  /* 3 */ @js.native
  object copyOnDeployment extends TopLevel[copyOnDeployment with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object showNameOnLogo extends TopLevel[showNameOnLogo with Double]
  
  /* 2 */ @js.native
  object showNameOnWideLogo extends TopLevel[showNameOnWideLogo with Double]
  
}

