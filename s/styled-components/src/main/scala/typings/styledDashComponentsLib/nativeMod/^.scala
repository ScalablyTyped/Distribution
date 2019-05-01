package typings
package styledDashComponentsLib.nativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ThemeConsumer: reactLib.reactMod.Consumer[
    styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ] = js.native
  val ThemeContext: reactLib.reactMod.Context[
    styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ] = js.native
  val ThemeProvider: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderComponent[
    styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme], 
    styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ] = js.native
  val css: styledDashComponentsLib.styledDashComponentsMod.ThemedCssFunction[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  val default: ReactNativeStyledInterface[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  val withTheme: styledDashComponentsLib.styledDashComponentsMod.WithThemeFnInterface[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean = js.native
}

