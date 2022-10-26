package typings.wixStyleReact

import typings.react.mod.FunctionComponent
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

object distTypesBaseModalLayoutLayoutBlocksMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Content")
  @js.native
  val Content: FunctionComponent[ContentProps] = js.native
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Footer")
  @js.native
  val Footer: FunctionComponent[FooterProps] = js.native
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Footnote")
  @js.native
  val Footnote: FunctionComponent[FootnoteProps] = js.native
  
  /* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header.HeaderProps> & {  Title :react.react.FunctionComponent<{  children :react.react.ReactNode | undefined}>} */
  object Header {
    
    inline def apply(props: HeaderProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: HeaderProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.Title")
    @js.native
    def Title: FunctionComponent[`1`] = js.native
    inline def Title_=(x: FunctionComponent[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialHeaderProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapHeaderPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapHeaderPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Illustration")
  @js.native
  val Illustration: FunctionComponent[IllustrationProps] = js.native
}
