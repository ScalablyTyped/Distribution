package typings.styledComponents

import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.TemplateStringsArray
import typings.styledComponents.anon.IsCss
import typings.styledComponents.anon.Text
import typings.styledComponents.anon.`175`
import typings.styledComponents.nativeDistModelsThemeProviderMod.DefaultTheme
import typings.styledComponents.nativeDistModelsThemeProviderMod.Props
import typings.styledComponents.nativeDistTypesMod.AnyComponent
import typings.styledComponents.nativeDistTypesMod.ExecutionContext
import typings.styledComponents.nativeDistTypesMod.IStyledComponent
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.Keyframes
import typings.styledComponents.nativeDistTypesMod.NativeTarget
import typings.styledComponents.nativeDistTypesMod.StyleFunction
import typings.styledComponents.nativeDistTypesMod.StyledObject
import typings.styledComponents.nativeDistTypesMod.Styles
import typings.styledComponents.styledComponentsBooleans.`false`
import typings.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistPrimitivesMod {
  
  @JSImport("styled-components/native/dist/primitives", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/native/dist/primitives", JSImport.Default)
  @js.native
  val default: (js.Function1[/* tag */ NativeTarget, `175`[NativeTarget]]) & Text = js.native
  
  @JSImport("styled-components/native/dist/primitives", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/native/dist/primitives", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  inline def ThemeProvider(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def css[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ]]
  
  inline def isStyledComponent(target: Any): /* is styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> */ Boolean]
  
  inline def useTheme(): js.UndefOr[DefaultTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[DefaultTheme]]
  
  inline def withTheme[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'type' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'type' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'type' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'type' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any)]
}
