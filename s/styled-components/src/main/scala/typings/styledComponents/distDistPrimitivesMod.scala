package typings.styledComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.TemplateStringsArray
import typings.styledComponents.anon.IsCss
import typings.styledComponents.anon.Touchable
import typings.styledComponents.anon.`707`
import typings.styledComponents.distDistTypesMod.AnyComponent
import typings.styledComponents.distDistTypesMod.ExecutionContext
import typings.styledComponents.distDistTypesMod.Interpolation
import typings.styledComponents.distDistTypesMod.NativeTarget
import typings.styledComponents.distDistTypesMod.Styles
import typings.styledComponents.distModelsThemeProviderMod.DefaultTheme
import typings.styledComponents.distModelsThemeProviderMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistPrimitivesMod {
  
  @JSImport("styled-components/primitives/dist/dist/primitives", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/primitives/dist/dist/primitives", JSImport.Default)
  @js.native
  val default: (js.Function1[/* tag */ NativeTarget, `707`[NativeTarget]]) & Touchable = js.native
  
  @JSImport("styled-components/primitives/dist/dist/primitives", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/primitives/dist/dist/primitives", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  inline def ThemeProvider(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def css[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): TemplateStringsArray | (Interpolation[Props] & IsCss) = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateStringsArray | (Interpolation[Props] & IsCss)]
  
  inline def isStyledComponent(target: Any): /* is styled-components.styled-components/primitives/dist/dist/types.IStyledComponent<any, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components/primitives/dist/dist/types.IStyledComponent<any, unknown> */ Boolean]
  
  inline def useTheme(): js.UndefOr[DefaultTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[DefaultTheme]]
  
  inline def withTheme[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & typings.styledComponents.styledComponentsStrings.withTheme & TopLevel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & typings.styledComponents.styledComponentsStrings.withTheme & TopLevel[T]]
}
