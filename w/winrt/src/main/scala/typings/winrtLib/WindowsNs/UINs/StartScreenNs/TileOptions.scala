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
  
  val copyOnDeployment: copyOnDeployment with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val showNameOnLogo: showNameOnLogo with java.lang.String = js.native
  val showNameOnWideLogo: showNameOnWideLogo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.StartScreenNs.TileOptions with java.lang.String] = js.native
}

