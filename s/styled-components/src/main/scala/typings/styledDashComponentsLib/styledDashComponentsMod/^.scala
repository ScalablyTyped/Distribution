package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ThemeConsumer: (js.Function1[
    /* props */ reactLib.reactMod.ReactNs.ConsumerProps[styledDashComponentsLib.AnyIfEmpty[DefaultTheme]], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
  ]) | reactLib.reactMod.ReactNs.Consumer[styledDashComponentsLib.AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeContext: reactLib.reactMod.ReactNs.Context[styledDashComponentsLib.AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeProvider: ThemeProviderComponent[
    styledDashComponentsLib.AnyIfEmpty[DefaultTheme], 
    styledDashComponentsLib.AnyIfEmpty[DefaultTheme]
  ] = js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  val default: StyledInterface = js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: stdLib.TemplateStringsArray,
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): GlobalStyleComponent[P, DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): GlobalStyleComponent[P, DefaultTheme] = js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean = js.native
  def keyframes(strings: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
}

