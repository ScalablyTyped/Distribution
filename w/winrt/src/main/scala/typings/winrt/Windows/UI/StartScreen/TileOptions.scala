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
  
}

