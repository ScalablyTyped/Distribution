package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageSectionMod {
  
  @JSImport("wix-style-react/dist/types/PageSection", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PageSectionProps, js.Object, Any]
  
  type PageSection = PureComponent[PageSectionProps, js.Object, Any]
  
  trait PageSectionProps extends StObject {
    
    var actionsBar: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var showDivider: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: ReactNode
  }
  object PageSectionProps {
    
    inline def apply(): PageSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSectionProps]
    }
    
    extension [Self <: PageSectionProps](x: Self) {
      
      inline def setActionsBar(value: ReactNode): Self = StObject.set(x, "actionsBar", value.asInstanceOf[js.Any])
      
      inline def setActionsBarUndefined: Self = StObject.set(x, "actionsBar", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
      
      inline def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
