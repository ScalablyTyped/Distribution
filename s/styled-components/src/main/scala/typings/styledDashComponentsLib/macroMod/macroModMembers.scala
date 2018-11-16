package typings
package styledDashComponentsLib.macroMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/macro", JSImport.Namespace)
@js.native
object macroModMembers extends js.Object {
  val ThemeConsumer: (js.Function1[
    /* props */ reactLib.reactMod.ReactNs.ConsumerProps[js.Any], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
  ]) | reactLib.reactMod.ReactNs.Consumer[js.Any] = js.native
  val ThemeContext: reactLib.reactMod.ReactNs.Context[js.Any] = js.native
  val ThemeProvider: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderComponent[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  val css: styledDashComponentsLib.styledDashComponentsMod.ThemedCssFunction[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  val default: styledDashComponentsLib.styledDashComponentsMod.StyledInterface = js.native
  val withTheme: styledDashComponentsLib.styledDashComponentsMod.WithThemeFnInterface[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def createGlobalStyle(cssObject: styledDashComponentsLib.styledDashComponentsMod.CSSObject): styledDashComponentsLib.styledDashComponentsMod.GlobalStyleComponent[js.Object, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def createGlobalStyle[P](
    func: styledDashComponentsLib.styledDashComponentsMod.InterpolationFunction[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ]
  ): styledDashComponentsLib.styledDashComponentsMod.GlobalStyleComponent[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def createGlobalStyle[P](
    strings: stdLib.TemplateStringsArray,
    interpolations: (styledDashComponentsLib.styledDashComponentsMod.Interpolation[
      styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ])*
  ): styledDashComponentsLib.styledDashComponentsMod.GlobalStyleComponent[P, styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def isStyledComponent(target: js.Any): /* is StyledComponent */scala.Boolean = js.native
  def keyframes(cssObject: styledDashComponentsLib.styledDashComponentsMod.CSSObject): styledDashComponentsLib.styledDashComponentsMod.Keyframes = js.native
  def keyframes(
    strings: stdLib.TemplateStringsArray,
    interpolations: styledDashComponentsLib.styledDashComponentsMod.SimpleInterpolation*
  ): styledDashComponentsLib.styledDashComponentsMod.Keyframes = js.native
}

