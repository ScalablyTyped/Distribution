package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.FunctionComponent
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
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

object distTypesBaseModalLayoutBaseModalLayoutMod {
  
  /** Private component to be used by all public modals. Represents the common internals of all modals */
  @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", JSImport.Default)
  @js.native
  open class default protected () extends BaseModalLayout {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Content")
    @js.native
    def Content: FunctionComponent[ContentProps] = js.native
    inline def Content_=(x: FunctionComponent[ContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Footer")
    @js.native
    def Footer: FunctionComponent[FooterProps] = js.native
    inline def Footer_=(x: FunctionComponent[FooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Footnote")
    @js.native
    def Footnote: FunctionComponent[FootnoteProps] = js.native
    inline def Footnote_=(x: FunctionComponent[FootnoteProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footnote")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/BaseModalLayout/LayoutBlocks.HeaderProps> & {  Title :react.react.FunctionComponent<{  children :react.react.ReactNode | undefined}>} */
    object Header {
      
      inline def apply(props: HeaderProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
      inline def apply(props: HeaderProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Header")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Header.Title")
      @js.native
      def Title: FunctionComponent[`1`] = js.native
      inline def Title_=(x: FunctionComponent[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Header.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Header.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialHeaderProps] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Header.displayName")
      @js.native
      def displayName: js.UndefOr[String] = js.native
      inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Header.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapHeaderPr] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapHeaderPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.Illustration")
    @js.native
    def Illustration: FunctionComponent[IllustrationProps] = js.native
    inline def Illustration_=(x: FunctionComponent[IllustrationProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Illustration")(x.asInstanceOf[js.Any])
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.defaultProps.theme_1")
      @js.native
      val theme1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.propTypes.onCloseButtonClick")
      @js.native
      val onCloseButtonClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.propTypes.onHelpButtonClick")
      @js.native
      val onHelpButtonClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/BaseModalLayout", "default.propTypes.theme")
      @js.native
      val theme: Requireable[String] = js.native
    }
  }
  
  /** Private component to be used by all public modals. Represents the common internals of all modals */
  @js.native
  trait BaseModalLayout extends PureComponent[Any, Any, Any]
}
