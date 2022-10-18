package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLButtonElement
import typings.themeUiComponents.distDeclarationsSrcBoxMod.BoxOwnProps
import typings.themeUiComponents.distDeclarationsSrcTypesMod.Assign
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import typings.themeUiComponents.themeUiComponentsStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcButtonMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Button", "Button")
  @js.native
  val Button: ForwardRef[HTMLButtonElement, ButtonProps] = js.native
  
  type ButtonProps = Assign[ComponentPropsWithRef[button], BoxOwnProps]
}
