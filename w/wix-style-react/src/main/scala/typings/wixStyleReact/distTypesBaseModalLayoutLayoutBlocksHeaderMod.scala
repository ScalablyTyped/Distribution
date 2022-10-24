package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.wixStyleReact.anon.PartialHeaderProps
import typings.wixStyleReact.anon.WeakValidationMapHeaderPr
import typings.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksHeaderModalHeadingMod.headingAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksHeaderMod {
  
  /* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header.HeaderProps> & {  Title :react.react.FunctionComponent<{}>} */
  object Header {
    
    inline def apply(props: HeaderProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: HeaderProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header", "Header.Title")
    @js.native
    def Title: FunctionComponent[js.Object] = js.native
    inline def Title_=(x: FunctionComponent[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header", "Header.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header", "Header.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialHeaderProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header", "Header.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header", "Header.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapHeaderPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapHeaderPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait HeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var showHeaderDivider: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var titleAppearance: js.UndefOr[headingAppearance] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    extension [Self <: HeaderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setShowHeaderDivider(value: Boolean): Self = StObject.set(x, "showHeaderDivider", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderDividerUndefined: Self = StObject.set(x, "showHeaderDivider", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAppearance(value: headingAppearance): Self = StObject.set(x, "titleAppearance", value.asInstanceOf[js.Any])
      
      inline def setTitleAppearanceUndefined: Self = StObject.set(x, "titleAppearance", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
