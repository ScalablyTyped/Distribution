package typings.tuyaPanelKit

import org.scalablytyped.runtime.Shortcut
import typings.tuyaPanelKit.nativeTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultThemeMod extends Shortcut {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/theming/DefaultTheme", JSImport.Default)
  @js.native
  val default: Theme = js.native
  
  type _To = Theme
  
  /* This means you don't have to write `default`, but can instead just say `defaultThemeMod.foo` */
  override def _to: Theme = default
}
