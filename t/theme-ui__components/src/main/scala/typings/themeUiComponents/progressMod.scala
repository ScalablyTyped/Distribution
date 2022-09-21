package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLProgressElement
import typings.themeUiComponents.boxMod.BoxOwnProps
import typings.themeUiComponents.themeUiComponentsStrings.progress
import typings.themeUiComponents.typesMod.Assign
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Progress", "Progress")
  @js.native
  val Progress: ForwardRef[HTMLProgressElement, ProgressProps] = js.native
  
  type ProgressProps = Assign[ComponentPropsWithRef[progress], BoxOwnProps]
}
