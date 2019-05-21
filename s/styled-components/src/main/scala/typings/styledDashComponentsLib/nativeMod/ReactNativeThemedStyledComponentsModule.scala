package typings
package styledDashComponentsLib.nativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ThemeConsumer: reactLib.reactMod.Consumer[T]
  var ThemeContext: reactLib.reactMod.Context[T]
  var ThemeProvider: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderComponent[T, U]
  var css: styledDashComponentsLib.styledDashComponentsMod.ThemedCssFunction[T]
  var default: ReactNativeStyledInterface[T]
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean
  ]
  var withTheme: styledDashComponentsLib.styledDashComponentsMod.WithThemeFnInterface[T]
}

object ReactNativeThemedStyledComponentsModule {
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](
    ThemeConsumer: reactLib.reactMod.Consumer[T],
    ThemeContext: reactLib.reactMod.Context[T],
    ThemeProvider: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderComponent[T, U],
    css: styledDashComponentsLib.styledDashComponentsMod.ThemedCssFunction[T],
    default: ReactNativeStyledInterface[T],
    isStyledComponent: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ scala.Boolean,
    withTheme: styledDashComponentsLib.styledDashComponentsMod.WithThemeFnInterface[T]
  ): ReactNativeThemedStyledComponentsModule[T, U] = {
    val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer, ThemeContext = ThemeContext, ThemeProvider = ThemeProvider, css = css, default = default, isStyledComponent = js.Any.fromFunction1(isStyledComponent), withTheme = withTheme)
  
    __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
  }
}

