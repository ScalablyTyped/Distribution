package typings.styledComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.TemplateStringsArray
import typings.styledComponents.anon.Animate
import typings.styledComponents.anon.IsCss
import typings.styledComponents.anon.TypeofStyleSheetInstantiableRegisterId
import typings.styledComponents.anon.`706`
import typings.styledComponents.distDistSheetSheetMod.GlobalStylesAllocationMap
import typings.styledComponents.distDistSheetSheetMod.NamesAllocationMap
import typings.styledComponents.distDistSheetSheetMod.SheetConstructorArgs
import typings.styledComponents.distDistTypesMod.AnyComponent
import typings.styledComponents.distDistTypesMod.ExecutionContext
import typings.styledComponents.distDistTypesMod.ExtensibleObject
import typings.styledComponents.distDistTypesMod.Interpolation
import typings.styledComponents.distDistTypesMod.Styles
import typings.styledComponents.distDistTypesMod.WebTarget
import typings.styledComponents.distModelsStyleSheetManagerMod.Props
import typings.styledComponents.distModelsThemeProviderMod.DefaultTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistMod {
  
  @JSImport("styled-components/primitives/dist/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/primitives/dist/dist", JSImport.Default)
  @js.native
  val default: (js.Function1[/* tag */ WebTarget, `706`[WebTarget]]) & Animate = js.native
  
  @JSImport("styled-components/primitives/dist/dist", "ServerStyleSheet")
  @js.native
  open class ServerStyleSheet ()
    extends typings.styledComponents.distDistBaseMod.ServerStyleSheet
  
  @JSImport("styled-components/primitives/dist/dist", "StyleSheetConsumer")
  @js.native
  val StyleSheetConsumer: Consumer[Unit | typings.styledComponents.distDistSheetMod.default] = js.native
  
  @JSImport("styled-components/primitives/dist/dist", "StyleSheetContext")
  @js.native
  val StyleSheetContext: Context[Unit | typings.styledComponents.distDistSheetMod.default] = js.native
  
  inline def StyleSheetManager(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleSheetManager")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("styled-components/primitives/dist/dist", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/primitives/dist/dist", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  inline def ThemeProvider(props: typings.styledComponents.distModelsThemeProviderMod.Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object __PRIVATE__ {
    
    @JSImport("styled-components/primitives/dist/dist", "__PRIVATE__")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("styled-components/primitives/dist/dist", "__PRIVATE__.StyleSheet")
    @js.native
    open class StyleSheet ()
      extends typings.styledComponents.distDistSheetMod.default {
      def this(options: SheetConstructorArgs) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: Unit, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
    }
    @JSImport("styled-components/primitives/dist/dist", "__PRIVATE__.StyleSheet")
    @js.native
    def StyleSheet: TypeofStyleSheetInstantiableRegisterId = js.native
    inline def StyleSheet_=(x: TypeofStyleSheetInstantiableRegisterId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheet")(x.asInstanceOf[js.Any])
    
    @JSImport("styled-components/primitives/dist/dist", "__PRIVATE__.mainSheet")
    @js.native
    def mainSheet: typings.styledComponents.distDistSheetMod.default = js.native
    inline def mainSheet_=(x: typings.styledComponents.distDistSheetMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainSheet")(x.asInstanceOf[js.Any])
  }
  
  inline def createGlobalStyle[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): NamedExoticComponent[ExtensibleObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobalStyle")(List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NamedExoticComponent[ExtensibleObject]]
  
  inline def css[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): TemplateStringsArray | (Interpolation[Props] & IsCss) = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateStringsArray | (Interpolation[Props] & IsCss)]
  
  inline def isStyledComponent(target: Any): /* is styled-components.styled-components/primitives/dist/dist/types.IStyledComponent<any, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components/primitives/dist/dist/types.IStyledComponent<any, unknown> */ Boolean]
  
  inline def keyframes[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typings.styledComponents.distDistModelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.styledComponents.distDistModelsKeyframesMod.default]
  
  inline def useTheme(): js.UndefOr[DefaultTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[DefaultTheme]]
  
  @JSImport("styled-components/primitives/dist/dist", "version")
  @js.native
  val version: String = js.native
  
  inline def withTheme[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & typings.styledComponents.styledComponentsStrings.withTheme & TopLevel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & typings.styledComponents.styledComponentsStrings.withTheme & TopLevel[T]]
}
