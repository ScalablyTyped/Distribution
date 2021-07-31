package typings.styledComponents

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.std.TemplateStringsArray
import typings.styledComponents.styledComponentsMod.AnyIfEmpty
import typings.styledComponents.styledComponentsMod.CSSKeyframes
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.DefaultTheme
import typings.styledComponents.styledComponentsMod.GlobalStyleComponent
import typings.styledComponents.styledComponentsMod.Interpolation
import typings.styledComponents.styledComponentsMod.InterpolationFunction
import typings.styledComponents.styledComponentsMod.Keyframes_
import typings.styledComponents.styledComponentsMod.SimpleInterpolation
import typings.styledComponents.styledComponentsMod.StyleSheetManagerProps
import typings.styledComponents.styledComponentsMod.StyledInterface
import typings.styledComponents.styledComponentsMod.ThemeProviderComponent
import typings.styledComponents.styledComponentsMod.ThemeProviderProps
import typings.styledComponents.styledComponentsMod.ThemedCssFunction
import typings.styledComponents.styledComponentsMod.ThemedStyledProps
import typings.styledComponents.styledComponentsMod.WithThemeFnInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macroMod {
  
  @JSImport("styled-components/macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/macro", JSImport.Default)
  @js.native
  val default: StyledInterface = js.native
  
  @JSImport("styled-components/macro", "ServerStyleSheet")
  @js.native
  class ServerStyleSheet ()
    extends typings.styledComponents.styledComponentsMod.ServerStyleSheet
  
  @JSImport("styled-components/macro", "StyleSheetManager")
  @js.native
  class StyleSheetManager protected ()
    extends typings.styledComponents.styledComponentsMod.StyleSheetManager {
    def this(props: StyleSheetManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StyleSheetManagerProps, context: js.Any) = this()
  }
  
  @JSImport("styled-components/macro", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[AnyIfEmpty[DefaultTheme]] = js.native
  
  @JSImport("styled-components/macro", "ThemeContext")
  @js.native
  val ThemeContext: Context[AnyIfEmpty[DefaultTheme]] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("styled-components/macro", "ThemeProvider")
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
  @JSImport("styled-components/macro", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderComponent[AnyIfEmpty[DefaultTheme], AnyIfEmpty[DefaultTheme]] = js.native
  
  @scala.inline
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGlobalStyle")(first.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[GlobalStyleComponent[P, DefaultTheme]]
  @scala.inline
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGlobalStyle")(first.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[GlobalStyleComponent[P, DefaultTheme]]
  @scala.inline
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): GlobalStyleComponent[P, DefaultTheme] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGlobalStyle")(first.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[GlobalStyleComponent[P, DefaultTheme]]
  
  @JSImport("styled-components/macro", "css")
  @js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  
  @scala.inline
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean]
  
  @scala.inline
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes_ = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(strings.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[Keyframes_]
  @scala.inline
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes_ = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(strings.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[Keyframes_]
  
  @scala.inline
  def useTheme(): DefaultTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[DefaultTheme]
  
  @JSImport("styled-components/macro", "withTheme")
  @js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
}
