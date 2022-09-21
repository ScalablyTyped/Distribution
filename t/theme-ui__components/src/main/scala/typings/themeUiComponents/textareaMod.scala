package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLTextAreaElement
import typings.themeUiComponents.boxMod.BoxOwnProps
import typings.themeUiComponents.themeUiComponentsStrings.textarea
import typings.themeUiComponents.typesMod.Assign
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Textarea", "Textarea")
  @js.native
  val Textarea: ForwardRef[HTMLTextAreaElement, TextareaProps] = js.native
  
  type TextareaProps = Assign[ComponentPropsWithRef[textarea], BoxOwnProps]
}
