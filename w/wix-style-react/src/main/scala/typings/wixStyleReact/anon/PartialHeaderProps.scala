package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksHeaderModalHeadingMod.headingAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header.HeaderProps> */
trait PartialHeaderProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var showHeaderDivider: js.UndefOr[Boolean] = js.undefined
  
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
  
  var titleAppearance: js.UndefOr[headingAppearance] = js.undefined
}
object PartialHeaderProps {
  
  inline def apply(): PartialHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHeaderProps]
  }
  
  extension [Self <: PartialHeaderProps](x: Self) {
    
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
