package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLHeadingElement
import typings.themeUiComponents.distDeclarationsSrcBoxMod.BoxOwnProps
import typings.themeUiComponents.distDeclarationsSrcTypesMod.Assign
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import typings.themeUiComponents.themeUiComponentsStrings.h2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcHeadingMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Heading", "Heading")
  @js.native
  val Heading: ForwardRef[HTMLHeadingElement, HeadingProps] = js.native
  
  type HeadingProps = Assign[ComponentPropsWithRef[h2], BoxOwnProps]
}
