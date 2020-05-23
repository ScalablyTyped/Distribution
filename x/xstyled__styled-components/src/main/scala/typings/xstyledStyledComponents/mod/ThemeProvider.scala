package typings.xstyledStyledComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.styledComponents.styledComponentsMod.AnyIfEmpty
import typings.styledComponents.styledComponentsMod.DefaultTheme
import typings.styledComponents.styledComponentsMod.ThemeProviderComponent
import typings.styledComponents.styledComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xstyled/styled-components", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends typings.styledComponents.styledComponentsMod.ThemeProvider {
  def this(props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) = this()
  def this(
    props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]],
    context: js.Any
  ) = this()
}

@JSImport("@xstyled/styled-components", "ThemeProvider")
@js.native
object ThemeProvider extends TopLevel[ThemeProviderComponent[AnyIfEmpty[DefaultTheme], AnyIfEmpty[DefaultTheme]]]

