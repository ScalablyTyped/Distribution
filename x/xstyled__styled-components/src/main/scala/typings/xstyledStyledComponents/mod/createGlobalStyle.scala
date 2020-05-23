package typings.xstyledStyledComponents.mod

import typings.std.TemplateStringsArray
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.DefaultTheme
import typings.styledComponents.styledComponentsMod.GlobalStyleComponent
import typings.styledComponents.styledComponentsMod.Interpolation
import typings.styledComponents.styledComponentsMod.InterpolationFunction
import typings.styledComponents.styledComponentsMod.ThemedStyledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xstyled/styled-components", "createGlobalStyle")
@js.native
object createGlobalStyle extends js.Object {
  def apply[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = js.native
  def apply[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = js.native
  def apply[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): GlobalStyleComponent[P, DefaultTheme] = js.native
}

