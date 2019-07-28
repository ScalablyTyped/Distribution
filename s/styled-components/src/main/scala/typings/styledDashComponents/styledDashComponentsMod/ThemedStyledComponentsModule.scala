package typings.styledDashComponents.styledDashComponentsMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.reactMod.Consumer
import typings.react.reactMod.Context
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ServerStyleSheet: Instantiable0[typings.styledDashComponents.styledDashComponentsMod.ServerStyleSheet] = js.native
  var StyleSheetManager: Instantiable0[typings.styledDashComponents.styledDashComponentsMod.StyleSheetManager] = js.native
  var ThemeConsumer: Consumer[T] = js.native
  var ThemeContext: Context[T] = js.native
  var ThemeProvider: ThemeProviderComponent[T, U] = js.native
  var css: ThemedCssFunction[T] = js.native
  var default: ThemedStyledInterface[T] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
  ] = js.native
  var withTheme: WithThemeFnInterface[T] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): GlobalStyleComponent[P, T] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, T]],
    interpolations: (Interpolation[ThemedStyledProps[P, T]])*
  ): GlobalStyleComponent[P, T] = js.native
  // unfortunately keyframes can't interpolate props from the theme
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
}

