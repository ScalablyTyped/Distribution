package typings.winrt.Windows.UI.StartScreen

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.StartScreen.TileOptions.copyOnDeployment
import typings.winrt.Windows.UI.StartScreen.TileOptions.none
import typings.winrt.Windows.UI.StartScreen.TileOptions.showNameOnLogo
import typings.winrt.Windows.UI.StartScreen.TileOptions.showNameOnWideLogo
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

