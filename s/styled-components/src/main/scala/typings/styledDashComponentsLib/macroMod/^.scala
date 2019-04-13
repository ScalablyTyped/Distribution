package typings
package styledDashComponentsLib.macroMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/macro", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ThemeConsumer: (reactLib.reactMod.Consumer[
    styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ]) with (js.Function1[
    /* props */ reactLib.reactMod.ConsumerProps[
      styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ], 
    reactLib.reactMod.ReactElement[_] | scala.Null
  ]) = js.native
  val ThemeContext: reactLib.reactMod.Context[
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

