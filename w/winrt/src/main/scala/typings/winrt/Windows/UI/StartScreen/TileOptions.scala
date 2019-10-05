package typings.winrt.Windows.UI.StartScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileOptions extends js.Object

@JSGlobal("Windows.UI.StartScreen.TileOptions")
@js.native
object TileOptions extends js.Object {
  @js.native
  sealed trait copyOnDeployment extends TileOptions
  
  @js.native
  sealed trait none extends TileOptions
  
  @js.native
  sealed trait showNameOnLogo extends TileOptions
  
  @js.native
  sealed trait showNameOnWideLogo extends TileOptions
  
  /* 3 */ val copyOnDeployment: typings.winrt.Windows.UI.StartScreen.TileOptions.copyOnDeployment with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.UI.StartScreen.TileOptions.none with Double = js.native
  /* 1 */ val showNameOnLogo: typings.winrt.Windows.UI.StartScreen.TileOptions.showNameOnLogo with Double = js.native
  /* 2 */ val showNameOnWideLogo: typings.winrt.Windows.UI.StartScreen.TileOptions.showNameOnWideLogo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileOptions with Double] = js.native
}

