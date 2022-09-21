package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLAnchorElement
import typings.themeUiComponents.boxMod.BoxOwnProps
import typings.themeUiComponents.themeUiComponentsStrings.a
import typings.themeUiComponents.typesMod.Assign
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Link", "Link")
  @js.native
  val Link: ForwardRef[HTMLAnchorElement, LinkProps] = js.native
  
  type LinkProps = Assign[ComponentPropsWithRef[a], BoxOwnProps]
}
