package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLHeadingElement
import typings.themeUiComponents.boxMod.BoxOwnProps
import typings.themeUiComponents.themeUiComponentsStrings.h2
import typings.themeUiComponents.typesMod.Assign
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Heading", "Heading")
  @js.native
  val Heading: ForwardRef[HTMLHeadingElement, HeadingProps] = js.native
  
  type HeadingProps = Assign[ComponentPropsWithRef[h2], BoxOwnProps]
}
