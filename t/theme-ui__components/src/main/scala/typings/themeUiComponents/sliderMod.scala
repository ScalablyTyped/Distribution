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

object sliderMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Slider", "Slider")
  @js.native
  val Slider: ForwardRef[HTMLInputElement, SliderProps] = js.native
  
  type SliderProps = Assign[ComponentPropsWithRef[input], BoxOwnProps]
}
