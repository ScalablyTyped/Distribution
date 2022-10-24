package typings.themeUiComponents

import typings.emotionReact.mod.jsx.JSX.Element
import typings.std.HTMLButtonElement
import typings.themeUiComponents.anon.Size
import typings.themeUiComponents.distDeclarationsSrcIconButtonMod.IconButtonProps
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMenuButtonMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/MenuButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/components/dist/declarations/src/MenuButton", "MenuButton")
  @js.native
  val MenuButton: ForwardRef[HTMLButtonElement, MenuButtonProps] = js.native
  
  inline def MenuIcon(param0: Size): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuIcon")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type MenuButtonProps = IconButtonProps
}
