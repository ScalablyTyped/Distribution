package typings.themeUiComponents

import typings.emotionReact.emotionReactMod.jsx.JSX.Element
import typings.std.HTMLButtonElement
import typings.themeUiComponents.anon.Size
import typings.themeUiComponents.iconButtonMod.IconButtonProps
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuButtonMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/MenuButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/components/dist/declarations/src/MenuButton", "MenuButton")
  @js.native
  val MenuButton: ForwardRef[HTMLButtonElement, MenuButtonProps] = js.native
  
  inline def MenuIcon(hasSize: Size): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuIcon")(hasSize.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type MenuButtonProps = IconButtonProps
}
