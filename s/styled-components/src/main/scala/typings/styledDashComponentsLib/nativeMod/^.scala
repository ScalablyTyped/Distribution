package typings
package styledDashComponentsLib.nativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ThemeConsumer: (js.Function1[
    /* props */ reactLib.reactMod.ReactNs.ConsumerProps[
      styledDashComponentsLib.nativeMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
  ]) | (reactLib.reactMod.ReactNs.Consumer[
    styledDashComponentsLib.nativeMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ]) = js.native
  val ThemeContext: reactLib.reactMod.ReactNs.Context[
    styledDashComponentsLib.nativeMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ] = js.native
  val ThemeProvider: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderComponent[
    styledDashComponentsLib.nativeMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme], 
    styledDashComponentsLib.nativeMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ] = js.native
  val css: styledDashComponentsLib.styledDashComponentsMod.ThemedCssFunction[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  val default: styledDashComponentsLib.nativeMod.ReactNativeStyledInterface[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  val withTheme: styledDashComponentsLib.styledDashComponentsMod.WithThemeFnInterface[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme] = js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean = js.native
}

