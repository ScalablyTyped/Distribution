package typings.styledDashComponents.nativeMod

import typings.react.reactMod.Consumer
import typings.react.reactMod.Context
import typings.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typings.styledDashComponents.styledDashComponentsMod.ThemeProviderComponent
import typings.styledDashComponents.styledDashComponentsMod.ThemedCssFunction
import typings.styledDashComponents.styledDashComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ThemeConsumer: Consumer[typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeContext: Context[typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeProvider: ThemeProviderComponent[
    typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme], 
    typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
  ] = js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  val default: ReactNativeStyledInterface[DefaultTheme] = js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = js.native
}

