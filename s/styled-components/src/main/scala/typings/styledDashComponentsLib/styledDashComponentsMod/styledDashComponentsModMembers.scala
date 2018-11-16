package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", JSImport.Namespace)
@js.native
object styledDashComponentsModMembers extends js.Object {
  val ThemeConsumer: (js.Function1[
    /* props */ reactLib.reactMod.ReactNs.ConsumerProps[js.Any], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
  ]) | reactLib.reactMod.ReactNs.Consumer[js.Any] = js.native
  val ThemeContext: reactLib.reactMod.ReactNs.Context[js.Any] = js.native
  val ThemeProvider: ThemeProviderComponent[DefaultTheme] = js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  val default: StyledInterface = js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  def createGlobalStyle(cssObject: CSSObject): GlobalStyleComponent[js.Object, DefaultTheme] = js.native
  def createGlobalStyle[P](func: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]]): GlobalStyleComponent[P, DefaultTheme] = js.native
  def createGlobalStyle[P](
    strings: stdLib.TemplateStringsArray,
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): GlobalStyleComponent[P, DefaultTheme] = js.native
  def isStyledComponent(target: js.Any): /* is StyledComponent */scala.Boolean = js.native
  def keyframes(cssObject: CSSObject): Keyframes = js.native
  def keyframes(strings: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
}

