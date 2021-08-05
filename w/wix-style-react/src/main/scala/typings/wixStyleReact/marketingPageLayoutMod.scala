package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marketingPageLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/MarketingPageLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[MarketingPageLayoutProps, js.Object, js.Any]
  
  type MarketingPageLayout = PureComponent[MarketingPageLayoutProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait MarketingPageLayoutHorizontalSize extends StObject
  object MarketingPageLayoutHorizontalSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
  }
  
  trait MarketingPageLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var horizontalSize: js.UndefOr[MarketingPageLayoutHorizontalSize] = js.undefined
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    var removeImageHorizontalPadding: js.UndefOr[Boolean] = js.undefined
    
    var removeImageVerticalPadding: js.UndefOr[Boolean] = js.undefined
    
    var verticalSize: js.UndefOr[MarketingPageLayoutVerticalSize] = js.undefined
  }
  object MarketingPageLayoutProps {
    
    inline def apply(): MarketingPageLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarketingPageLayoutProps]
    }
    
    extension [Self <: MarketingPageLayoutProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHorizontalSize(value: MarketingPageLayoutHorizontalSize): Self = StObject.set(x, "horizontalSize", value.asInstanceOf[js.Any])
      
      inline def setHorizontalSizeUndefined: Self = StObject.set(x, "horizontalSize", js.undefined)
      
      inline def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setRemoveImageHorizontalPadding(value: Boolean): Self = StObject.set(x, "removeImageHorizontalPadding", value.asInstanceOf[js.Any])
      
      inline def setRemoveImageHorizontalPaddingUndefined: Self = StObject.set(x, "removeImageHorizontalPadding", js.undefined)
      
      inline def setRemoveImageVerticalPadding(value: Boolean): Self = StObject.set(x, "removeImageVerticalPadding", value.asInstanceOf[js.Any])
      
      inline def setRemoveImageVerticalPaddingUndefined: Self = StObject.set(x, "removeImageVerticalPadding", js.undefined)
      
      inline def setVerticalSize(value: MarketingPageLayoutVerticalSize): Self = StObject.set(x, "verticalSize", value.asInstanceOf[js.Any])
      
      inline def setVerticalSizeUndefined: Self = StObject.set(x, "verticalSize", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait MarketingPageLayoutVerticalSize extends StObject
  object MarketingPageLayoutVerticalSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
  }
}
