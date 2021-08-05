package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marketingPageLayoutContentMod {
  
  @JSImport("wix-style-react/dist/es/src/MarketingPageLayoutContent", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[MarketingPageLayoutContentProps, js.Object, js.Any]
  
  type MarketingPageLayoutContent = PureComponent[MarketingPageLayoutContentProps, js.Object, js.Any]
  
  trait MarketingPageLayoutContentProps extends StObject {
    
    var actions: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var overline: js.UndefOr[ReactNode] = js.undefined
    
    var size: js.UndefOr[MarketingPageLayoutContentSize] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object MarketingPageLayoutContentProps {
    
    inline def apply(): MarketingPageLayoutContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarketingPageLayoutContentProps]
    }
    
    extension [Self <: MarketingPageLayoutContentProps](x: Self) {
      
      inline def setActions(value: ReactNode): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOverline(value: ReactNode): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      inline def setOverlineUndefined: Self = StObject.set(x, "overline", js.undefined)
      
      inline def setSize(value: MarketingPageLayoutContentSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait MarketingPageLayoutContentSize extends StObject
  object MarketingPageLayoutContentSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
  }
}
