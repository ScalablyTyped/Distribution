package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLLabelElement
import typings.themeUiComponents.boxMod.BoxOwnProps
import typings.themeUiComponents.themeUiComponentsStrings.label
import typings.themeUiComponents.typesMod.Assign
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Label", "Label")
  @js.native
  val Label: ForwardRef[HTMLLabelElement, LabelProps] = js.native
  
  type LabelProps = Assign[ComponentPropsWithRef[label], BoxOwnProps]
}
