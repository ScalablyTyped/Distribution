package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLImageElement
import typings.themeUiComponents.boxMod.BoxOwnProps
import typings.themeUiComponents.themeUiComponentsStrings.img
import typings.themeUiComponents.typesMod.Assign
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Image", "Image")
  @js.native
  val Image: ForwardRef[HTMLImageElement, ImageProps] = js.native
  
  type ImageProps = Assign[ComponentPropsWithRef[img], BoxOwnProps]
}
