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

object radioMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Radio", "Radio")
  @js.native
  val Radio: ForwardRef[HTMLInputElement, RadioProps] = js.native
  
  type RadioProps = Assign[ComponentPropsWithRef[input], BoxOwnProps]
}
