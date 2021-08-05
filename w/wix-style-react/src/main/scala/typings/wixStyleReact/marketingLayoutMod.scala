package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings.center
import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marketingLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/MarketingLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[MarketingLayoutProps, js.Object, js.Any]
  
  type MarketingLayout = PureComponent[MarketingLayoutProps, js.Object, js.Any]
  
  trait MarketingLayoutProps extends StObject {
    
    var actions: js.UndefOr[ReactNode] = js.undefined
    
    var alignItems: js.UndefOr[center | stretch] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    var imageBackgroundColor: js.UndefOr[String] = js.undefined
    
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object MarketingLayoutProps {
    
    inline def apply(): MarketingLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarketingLayoutProps]
    }
    
    extension [Self <: MarketingLayoutProps](x: Self) {
      
      inline def setActions(value: ReactNode): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAlignItems(value: center | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageBackgroundColor(value: String): Self = StObject.set(x, "imageBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setImageBackgroundColorUndefined: Self = StObject.set(x, "imageBackgroundColor", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
