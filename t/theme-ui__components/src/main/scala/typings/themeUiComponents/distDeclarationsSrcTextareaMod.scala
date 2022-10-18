package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLTextAreaElement
import typings.themeUiComponents.distDeclarationsSrcBoxMod.BoxOwnProps
import typings.themeUiComponents.distDeclarationsSrcTypesMod.Assign
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import typings.themeUiComponents.themeUiComponentsStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTextareaMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Textarea", "Textarea")
  @js.native
  val Textarea: ForwardRef[HTMLTextAreaElement, TextareaProps] = js.native
  
  type TextareaProps = Assign[ComponentPropsWithRef[textarea], BoxOwnProps]
}
