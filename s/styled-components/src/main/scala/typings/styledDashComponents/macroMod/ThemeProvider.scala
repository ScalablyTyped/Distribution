package typings.styledDashComponents.macroMod

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typings.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typings.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/macro", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends Component[
      ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]], 
      ComponentState, 
      js.Any
    ] {
  def this(props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) = this()
  def this(
    props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]],
    context: js.Any
  ) = this()
}

