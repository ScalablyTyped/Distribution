package typings.styledDashComponents.nativeMod

import typings.react.reactMod.Consumer
import typings.react.reactMod.Context
import typings.styledDashComponents.styledDashComponentsMod.ThemeProviderComponent
import typings.styledDashComponents.styledDashComponentsMod.ThemedCssFunction
import typings.styledDashComponents.styledDashComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ThemeConsumer: Consumer[T]
  var ThemeContext: Context[T]
  var ThemeProvider: ThemeProviderComponent[T, U]
  var css: ThemedCssFunction[T]
  var default: ReactNativeStyledInterface[T]
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
  ]
  var withTheme: WithThemeFnInterface[T]
}

object ReactNativeThemedStyledComponentsModule {
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](
    ThemeConsumer: Consumer[T],
    ThemeContext: Context[T],
    ThemeProvider: ThemeProviderComponent[T, U],
    css: ThemedCssFunction[T],
    default: ReactNativeStyledInterface[T],
    isStyledComponent: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean,
    withTheme: WithThemeFnInterface[T]
  ): ReactNativeThemedStyledComponentsModule[T, U] = {
    val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer, ThemeContext = ThemeContext, ThemeProvider = ThemeProvider, css = css, default = default, isStyledComponent = js.Any.fromFunction1(isStyledComponent), withTheme = withTheme)
  
    __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
  }
}

