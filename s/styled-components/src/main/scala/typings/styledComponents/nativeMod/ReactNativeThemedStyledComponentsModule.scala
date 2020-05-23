package typings.styledComponents.nativeMod

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.styledComponents.styledComponentsMod.ThemeProviderComponent
import typings.styledComponents.styledComponentsMod.ThemedCssFunction
import typings.styledComponents.styledComponentsMod.WithOptionalTheme
import typings.styledComponents.styledComponentsMod.WithThemeFnInterface
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
  def useTheme(): T
}

object ReactNativeThemedStyledComponentsModule {
  @scala.inline
  def apply[T, U](
    ThemeConsumer: Consumer[T],
    ThemeContext: Context[T],
    ThemeProvider: ThemeProviderComponent[T, U],
    css: ThemedCssFunction[T],
    default: ReactNativeStyledInterface[T],
    isStyledComponent: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean,
    useTheme: () => T,
    withTheme: /* component */ ComponentType[js.Any] => ForwardRefExoticComponent[
      WithOptionalTheme[
        ComponentPropsWithRef[ComponentType[js.Any]], 
        typings.styledComponents.styledComponentsMod.AnyIfEmpty[T]
      ]
    ]
  ): ReactNativeThemedStyledComponentsModule[T, U] = {
    val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeContext = ThemeContext.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], isStyledComponent = js.Any.fromFunction1(isStyledComponent), useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
  }
}

