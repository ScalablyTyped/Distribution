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
import typings.styledComponents.anon.Address
import typings.styledComponents.anon.IsCss
import typings.styledComponents.anon.TypeofStyleSheetRegisterId
import typings.styledComponents.anon.`528`
import typings.styledComponents.primitivesDistModelsStyleSheetManagerMod.Props
import typings.styledComponents.primitivesDistModelsThemeProviderMod.DefaultTheme
import typings.styledComponents.primitivesDistSheetSheetMod.GlobalStylesAllocationMap
import typings.styledComponents.primitivesDistSheetSheetMod.NamesAllocationMap
import typings.styledComponents.primitivesDistSheetSheetMod.SheetConstructorArgs
import typings.styledComponents.primitivesDistTypesMod.AnyComponent
import typings.styledComponents.primitivesDistTypesMod.ExecutionContext
import typings.styledComponents.primitivesDistTypesMod.ExtensibleObject
import typings.styledComponents.primitivesDistTypesMod.Interpolation
import typings.styledComponents.primitivesDistTypesMod.Styles
import typings.styledComponents.primitivesDistTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistMod {
  
  @JSImport("styled-components/primitives/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/primitives/dist", JSImport.Default)
  @js.native
  val default: (js.Function1[/* tag */ WebTarget, `528`[WebTarget]]) & Address = js.native
  
  @JSImport("styled-components/primitives/dist", "ServerStyleSheet")
  @js.native
  open class ServerStyleSheet ()
    extends typings.styledComponents.primitivesDistBaseMod.ServerStyleSheet
  
  @JSImport("styled-components/primitives/dist", "StyleSheetConsumer")
  @js.native
  val StyleSheetConsumer: Consumer[Unit | typings.styledComponents.primitivesDistSheetMod.default] = js.native
  
  @JSImport("styled-components/primitives/dist", "StyleSheetContext")
  @js.native
  val StyleSheetContext: Context[Unit | typings.styledComponents.primitivesDistSheetMod.default] = js.native
  
  inline def StyleSheetManager(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleSheetManager")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("styled-components/primitives/dist", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/primitives/dist", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  inline def ThemeProvider(props: typings.styledComponents.primitivesDistModelsThemeProviderMod.Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object __PRIVATE__ {
    
    @JSImport("styled-components/primitives/dist", "__PRIVATE__")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("styled-components/primitives/dist", "__PRIVATE__.StyleSheet")
    @js.native
    open class StyleSheet ()
      extends typings.styledComponents.primitivesDistSheetMod.default {
      def this(options: SheetConstructorArgs) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: Unit, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
    }
    @JSImport("styled-components/primitives/dist", "__PRIVATE__.StyleSheet")
    @js.native
    def StyleSheet: TypeofStyleSheetRegisterId = js.native
    inline def StyleSheet_=(x: TypeofStyleSheetRegisterId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheet")(x.asInstanceOf[js.Any])
    
    @JSImport("styled-components/primitives/dist", "__PRIVATE__.mainSheet")
    @js.native
    def mainSheet: typings.styledComponents.primitivesDistSheetMod.default = js.native
    inline def mainSheet_=(x: typings.styledComponents.primitivesDistSheetMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainSheet")(x.asInstanceOf[js.Any])
  }
  
  inline def createGlobalStyle[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): NamedExoticComponent[ExtensibleObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobalStyle")(List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NamedExoticComponent[ExtensibleObject]]
  
  inline def css[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): TemplateStringsArray | (Interpolation[Props] & IsCss) = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateStringsArray | (Interpolation[Props] & IsCss)]
  
  inline def isStyledComponent(target: Any): /* is styled-components.styled-components/primitives/dist/types.IStyledComponent<any, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components/primitives/dist/types.IStyledComponent<any, unknown> */ Boolean]
  
  inline def keyframes[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typings.styledComponents.primitivesDistModelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.styledComponents.primitivesDistModelsKeyframesMod.default]
  
  inline def useTheme(): js.UndefOr[DefaultTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[DefaultTheme]]
  
  @JSImport("styled-components/primitives/dist", "version")
  @js.native
  val version: String = js.native
  
  inline def withTheme[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & typings.styledComponents.styledComponentsStrings.withTheme & TopLevel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & typings.styledComponents.styledComponentsStrings.withTheme & TopLevel[T]]
}
