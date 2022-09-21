package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLInputElement
import typings.themeUiComponents.boxMod.BoxOwnProps
import typings.themeUiComponents.themeUiComponentsStrings.input
import typings.themeUiComponents.typesMod.Assign
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Checkbox", "Checkbox")
  @js.native
  val Checkbox: ForwardRef[HTMLInputElement, CheckboxProps] = js.native
  
  type CheckboxProps = Assign[ComponentPropsWithRef[input], BoxOwnProps]
}
