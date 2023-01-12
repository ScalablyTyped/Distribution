package typings.styledComponents

import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.TemplateStringsArray
import typings.styledComponents.anon.IsCss
import typings.styledComponents.anon.TypeofStyleSheet
import typings.styledComponents.nativeDistModelsServerStyleSheetMod.default
import typings.styledComponents.nativeDistModelsStyleSheetManagerMod.Props
import typings.styledComponents.nativeDistModelsThemeProviderMod.DefaultTheme
import typings.styledComponents.nativeDistSheetSheetMod.GlobalStylesAllocationMap
import typings.styledComponents.nativeDistSheetSheetMod.NamesAllocationMap
import typings.styledComponents.nativeDistSheetSheetMod.SheetConstructorArgs
import typings.styledComponents.nativeDistTypesMod.AnyComponent
import typings.styledComponents.nativeDistTypesMod.ExecutionContext
import typings.styledComponents.nativeDistTypesMod.ExtensibleObject
import typings.styledComponents.nativeDistTypesMod.IStyledComponent
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.Keyframes
import typings.styledComponents.nativeDistTypesMod.StyleFunction
import typings.styledComponents.nativeDistTypesMod.StyledObject
import typings.styledComponents.nativeDistTypesMod.Styles
import typings.styledComponents.styledComponentsBooleans.`false`
import typings.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistBaseMod {
  
  @JSImport("styled-components/native/dist/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/native/dist/base", "ServerStyleSheet")
  @js.native
  open class ServerStyleSheet () extends default
  
  @JSImport("styled-components/native/dist/base", "StyleSheetConsumer")
  @js.native
  val StyleSheetConsumer: Consumer[Unit | typings.styledComponents.nativeDistSheetMod.default] = js.native
  
  @JSImport("styled-components/native/dist/base", "StyleSheetContext")
  @js.native
  val StyleSheetContext: Context[Unit | typings.styledComponents.nativeDistSheetMod.default] = js.native
  
  inline def StyleSheetManager(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleSheetManager")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("styled-components/native/dist/base", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/native/dist/base", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  inline def ThemeProvider(props: typings.styledComponents.nativeDistModelsThemeProviderMod.Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object __PRIVATE__ {
    
    @JSImport("styled-components/native/dist/base", "__PRIVATE__")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("styled-components/native/dist/base", "__PRIVATE__.StyleSheet")
    @js.native
    open class StyleSheet ()
      extends typings.styledComponents.nativeDistSheetMod.default {
      def this(options: SheetConstructorArgs) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: Unit, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
    }
    @JSImport("styled-components/native/dist/base", "__PRIVATE__.StyleSheet")
    @js.native
    def StyleSheet: TypeofStyleSheet = js.native
    inline def StyleSheet_=(x: TypeofStyleSheet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheet")(x.asInstanceOf[js.Any])
    
    @JSImport("styled-components/native/dist/base", "__PRIVATE__.mainSheet")
    @js.native
    def mainSheet: typings.styledComponents.nativeDistSheetMod.default = js.native
    inline def mainSheet_=(x: typings.styledComponents.nativeDistSheetMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainSheet")(x.asInstanceOf[js.Any])
  }
  
  inline def createGlobalStyle[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): NamedExoticComponent[ExtensibleObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobalStyle")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NamedExoticComponent[ExtensibleObject]]
  
  inline def css[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ]]
  
  inline def isStyledComponent(target: Any): /* is styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> */ Boolean]
  
  inline def keyframes[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typings.styledComponents.nativeDistModelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.styledComponents.nativeDistModelsKeyframesMod.default]
  
  inline def useTheme(): js.UndefOr[DefaultTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[DefaultTheme]]
  
  @JSImport("styled-components/native/dist/base", "version")
  @js.native
  val version: String = js.native
  
  inline def withTheme[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'type' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'type' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'type' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'type' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any)]
  
  object global {
    
    trait Window extends StObject {
      
      var `__styled-components-init__`: js.UndefOr[Double] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def `set__styled-components-init__`(value: Double): Self = StObject.set(x, "__styled-components-init__", value.asInstanceOf[js.Any])
        
        inline def `set__styled-components-init__Undefined`: Self = StObject.set(x, "__styled-components-init__", js.undefined)
      }
    }
  }
}
