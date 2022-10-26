package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.FunctionComponentHeaderPr
import typings.wixStyleReact.anon.PartialHeaderProps
import typings.wixStyleReact.anon.WeakValidationMapHeaderPr
import typings.wixStyleReact.anon.`1`
import typings.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksContentMod.ContentProps
import typings.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksFooterMod.FooterProps
import typings.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksFootnoteMod.FootnoteProps
import typings.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksHeaderMod.HeaderProps
import typings.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksIllustrationMod.IllustrationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[BaseModalLayoutProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Content")
    @js.native
    def Content: FunctionComponent[ContentProps] = js.native
    inline def Content_=(x: FunctionComponent[ContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Footer")
    @js.native
    def Footer: FunctionComponent[FooterProps] = js.native
    inline def Footer_=(x: FunctionComponent[FooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Footnote")
    @js.native
    def Footnote: FunctionComponent[FootnoteProps] = js.native
    inline def Footnote_=(x: FunctionComponent[FootnoteProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footnote")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Header")
    @js.native
    def Header: FunctionComponentHeaderPr = js.native
    inline def Header_=(x: FunctionComponentHeaderPr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Illustration")
    @js.native
    def Illustration: FunctionComponent[IllustrationProps] = js.native
    inline def Illustration_=(x: FunctionComponent[IllustrationProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Illustration")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", "Content")
  @js.native
  val Content: FunctionComponent[ContentProps] = js.native
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", "Footer")
  @js.native
  val Footer: FunctionComponent[FooterProps] = js.native
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", "Footnote")
  @js.native
  val Footnote: FunctionComponent[FootnoteProps] = js.native
  
  /* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header.HeaderProps> & {  Title :react.react.FunctionComponent<{  children :react.react.ReactNode | undefined}>} */
  object Header {
    
    inline def apply(props: HeaderProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: HeaderProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.Title")
    @js.native
    def Title: FunctionComponent[`1`] = js.native
    inline def Title_=(x: FunctionComponent[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialHeaderProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapHeaderPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapHeaderPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", "Illustration")
  @js.native
  val Illustration: FunctionComponent[IllustrationProps] = js.native
  
  type BaseModalLayout = PureComponent[BaseModalLayoutProps, js.Object, Any]
  
  trait BaseModalLayoutProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onHelpButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var theme: js.UndefOr[ModalTheme] = js.undefined
  }
  object BaseModalLayoutProps {
    
    inline def apply(): BaseModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModalLayoutProps]
    }
    
    extension [Self <: BaseModalLayoutProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnCloseButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setOnHelpButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onHelpButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnHelpButtonClickUndefined: Self = StObject.set(x, "onHelpButtonClick", js.undefined)
      
      inline def setTheme(value: ModalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.destructive
  */
  trait ModalTheme extends StObject
  object ModalTheme {
    
    inline def destructive: typings.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
}
