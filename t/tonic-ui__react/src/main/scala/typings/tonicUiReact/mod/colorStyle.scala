package typings.tonicUiReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorStyle {
  
  @JSImport("@tonic-ui/react", "colorStyle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tonic-ui/react", "colorStyle.dark")
  @js.native
  def dark: ThemeColorStyle = js.native
  inline def dark_=(x: ThemeColorStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
  
  @JSImport("@tonic-ui/react", "colorStyle.light")
  @js.native
  def light: ThemeColorStyle = js.native
  inline def light_=(x: ThemeColorStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
}
