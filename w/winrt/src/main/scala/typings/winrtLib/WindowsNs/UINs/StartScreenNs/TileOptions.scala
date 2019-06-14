package typings
package winrtLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileOptions extends js.Object

@JSGlobal("Windows.UI.StartScreen.TileOptions")
@js.native
object TileOptions extends js.Object {
  @js.native
  sealed trait copyOnDeployment
    extends winrtLib.WindowsNs.UINs.StartScreenNs.TileOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.StartScreenNs.TileOptions
  
  @js.native
  sealed trait showNameOnLogo
    extends winrtLib.WindowsNs.UINs.StartScreenNs.TileOptions
  
  @js.native
  sealed trait showNameOnWideLogo
    extends winrtLib.WindowsNs.UINs.StartScreenNs.TileOptions
  
  /* 3 */ val copyOnDeployment: copyOnDeployment with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val showNameOnLogo: showNameOnLogo with scala.Double = js.native
  /* 2 */ val showNameOnWideLogo: showNameOnWideLogo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.StartScreenNs.TileOptions with scala.Double] = js.native
}

