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

@js.native
trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ThemeConsumer: Consumer[T] = js.native
  var ThemeContext: Context[T] = js.native
  var ThemeProvider: ThemeProviderComponent[T, U] = js.native
  var css: ThemedCssFunction[T] = js.native
  var default: ReactNativeStyledInterface[T] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
  ] = js.native
  var withTheme: WithThemeFnInterface[T] = js.native
  def useTheme(): T = js.native
}

object ReactNativeThemedStyledComponentsModule {
  @scala.inline
  def apply[/* <: js.Object */ T, /* <: js.Object */ U](
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
  @scala.inline
  implicit class ReactNativeThemedStyledComponentsModuleOps[Self <: ReactNativeThemedStyledComponentsModule[_, _], /* <: js.Object */ T, /* <: js.Object */ U] (val x: Self with (ReactNativeThemedStyledComponentsModule[T, U])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setThemeConsumer(value: Consumer[T]): Self = this.set("ThemeConsumer", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeContext(value: Context[T]): Self = this.set("ThemeContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeProvider(value: ThemeProviderComponent[T, U]): Self = this.set("ThemeProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setCss(value: ThemedCssFunction[T]): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: ReactNativeStyledInterface[T]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStyledComponent(
      value: /* target */ js.Any => /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
    ): Self = this.set("isStyledComponent", js.Any.fromFunction1(value))
    @scala.inline
    def setUseTheme(value: () => T): Self = this.set("useTheme", js.Any.fromFunction0(value))
    @scala.inline
    def setWithTheme(
      value: /* component */ ComponentType[js.Any] => ForwardRefExoticComponent[
          WithOptionalTheme[
            ComponentPropsWithRef[ComponentType[js.Any]], 
            typings.styledComponents.styledComponentsMod.AnyIfEmpty[T]
          ]
        ]
    ): Self = this.set("withTheme", js.Any.fromFunction1(value))
  }
  
}

