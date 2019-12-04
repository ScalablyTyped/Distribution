package typings.styledDashComponents

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Consumer
import typings.react.reactMod.Context
import typings.std.TemplateStringsArray
import typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typings.styledDashComponents.styledDashComponentsMod.CSSKeyframes
import typings.styledDashComponents.styledDashComponentsMod.CSSObject
import typings.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typings.styledDashComponents.styledDashComponentsMod.GlobalStyleComponent
import typings.styledDashComponents.styledDashComponentsMod.Interpolation
import typings.styledDashComponents.styledDashComponentsMod.InterpolationFunction
import typings.styledDashComponents.styledDashComponentsMod.Keyframes
import typings.styledDashComponents.styledDashComponentsMod.SimpleInterpolation
import typings.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps
import typings.styledDashComponents.styledDashComponentsMod.StyledInterface
import typings.styledDashComponents.styledDashComponentsMod.ThemeProviderComponent
import typings.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import typings.styledDashComponents.styledDashComponentsMod.ThemedCssFunction
import typings.styledDashComponents.styledDashComponentsMod.ThemedStyledProps
import typings.styledDashComponents.styledDashComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/macro", JSImport.Namespace)
@js.native
object macroMod extends js.Object {
  @js.native
  class ServerStyleSheet ()
    extends typings.styledDashComponents.styledDashComponentsMod.ServerStyleSheet
  
  @js.native
  class StyleSheetManager ()
    extends Component[StyleSheetManagerProps, js.Object, js.Any]
  
  @js.native
  class ThemeProvider protected ()
    extends Component[
          ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]], 
          ComponentState, 
          js.Any
        ] {
    def this(props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) = this()
    def this(
      props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]],
      context: js.Any
    ) = this()
  }
  
  val ThemeConsumer: Consumer[AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeContext: Context[AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeProvider: ThemeProviderComponent[AnyIfEmpty[DefaultTheme], AnyIfEmpty[DefaultTheme]] = js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  val default: StyledInterface = js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): GlobalStyleComponent[P, DefaultTheme] = js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = js.native
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
}

