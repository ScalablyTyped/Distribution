package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ThemeConsumer: (js.Function1[
    /* props */ reactLib.reactMod.ReactNs.ConsumerProps[
      styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
  ]) | (reactLib.reactMod.ReactNs.Consumer[
    styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ]) = js.native
  val ThemeContext: reactLib.reactMod.ReactNs.Context[
    styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ] = js.native
  val ThemeProvider: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderComponent[
    styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme], 
    styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ] = js.native
  val css: styledDashComponentsLib.styledDashComponentsMod.ThemedCssFunction[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  val default: styledDashComponentsLib.styledDashComponentsMod.StyledInterface = js.native
  val withTheme: styledDashComponentsLib.styledDashComponentsMod.WithThemeFnInterface[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: stdLib.TemplateStringsArray,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.GlobalStyleComponent[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: styledDashComponentsLib.styledDashComponentsMod.CSSObject,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.GlobalStyleComponent[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: styledDashComponentsLib.styledDashComponentsMod.InterpolationFunction[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ],
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.GlobalStyleComponent[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean = js.native
  def keyframes(
    strings: stdLib.TemplateStringsArray,
    interpolations: styledDashComponentsLib.styledDashComponentsMod.SimpleInterpolation*
  ): styledDashComponentsLib.styledDashComponentsMod.Keyframes = js.native
  def keyframes(
    strings: styledDashComponentsLib.styledDashComponentsMod.CSSKeyframes,
    interpolations: styledDashComponentsLib.styledDashComponentsMod.SimpleInterpolation*
  ): styledDashComponentsLib.styledDashComponentsMod.Keyframes = js.native
}

