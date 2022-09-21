package typings.themeUiComponents

import typings.react.mod.ComponentPropsWithRef
import typings.std.HTMLParagraphElement
import typings.themeUiComponents.boxMod.BoxOwnProps
import typings.themeUiComponents.themeUiComponentsStrings.p
import typings.themeUiComponents.typesMod.Assign
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paragraphMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Paragraph", "Paragraph")
  @js.native
  val Paragraph: ForwardRef[HTMLParagraphElement, ParagraphProps] = js.native
  
  type ParagraphProps = Assign[ComponentPropsWithRef[p], BoxOwnProps]
}
