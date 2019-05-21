package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ServerStyleSheet: org.scalablytyped.runtime.Instantiable0[ServerStyleSheet] = js.native
  var StyleSheetManager: org.scalablytyped.runtime.Instantiable0[StyleSheetManager] = js.native
  var ThemeConsumer: reactLib.reactMod.Consumer[T] = js.native
  var ThemeContext: reactLib.reactMod.Context[T] = js.native
  var ThemeProvider: ThemeProviderComponent[T, U] = js.native
  var css: ThemedCssFunction[T] = js.native
  var default: ThemedStyledInterface[T] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean
  ] = js.native
  var withTheme: WithThemeFnInterface[T] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: stdLib.TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, T]],
    interpolations: (Interpolation[ThemedStyledProps[P, T]])*
  ): GlobalStyleComponent[P, T] = js.native
  // unfortunately keyframes can't interpolate props from the theme
  def keyframes(strings: stdLib.TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
}

