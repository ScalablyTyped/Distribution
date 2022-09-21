package typings.themeUiComponents

import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.Omit
import typings.themeUiComponents.iconButtonMod.IconButtonProps
import typings.themeUiComponents.themeUiComponentsStrings.children
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Close", "Close")
  @js.native
  val Close: ForwardRef[HTMLButtonElement, CloseProps] = js.native
  
  @JSImport("@theme-ui/components/dist/declarations/src/Close", "CloseIcon")
  @js.native
  val CloseIcon: Element = js.native
  
  type CloseProps = Omit[IconButtonProps, children]
}
