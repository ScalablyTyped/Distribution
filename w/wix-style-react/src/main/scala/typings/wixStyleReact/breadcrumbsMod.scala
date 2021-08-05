package typings.wixStyleReact

import typings.csstype.mod.MaxWidthProperty
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("wix-style-react/dist/es/src/Breadcrumbs", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[BreadcrumbsProps, js.Object, js.Any]
  
  type Breadcrumbs = PureComponent[BreadcrumbsProps, js.Object, js.Any]
  
  trait BreadcrumbsItem extends StObject {
    
    var customElement: js.UndefOr[js.Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String | Double
    
    var link: js.UndefOr[String] = js.undefined
    
    var value: ReactNode
  }
  object BreadcrumbsItem {
    
    inline def apply(id: String | Double): BreadcrumbsItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsItem]
    }
    
    extension [Self <: BreadcrumbsItem](x: Self) {
      
      inline def setCustomElement(value: js.Any): Self = StObject.set(x, "customElement", value.asInstanceOf[js.Any])
      
      inline def setCustomElementUndefined: Self = StObject.set(x, "customElement", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait BreadcrumbsProps extends StObject {
    
    var activeId: js.UndefOr[String | Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var itemMaxWidth: js.UndefOr[MaxWidthProperty[String | Double]] = js.undefined
    
    var items: js.Array[BreadcrumbsItem]
    
    var onClick: js.UndefOr[js.Function1[/* item */ BreadcrumbsItem, js.Any]] = js.undefined
    
    var size: js.UndefOr[BreadcrumbsSize] = js.undefined
    
    var theme: js.UndefOr[BreadcrumbsTheme] = js.undefined
  }
  object BreadcrumbsProps {
    
    inline def apply(items: js.Array[BreadcrumbsItem]): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    extension [Self <: BreadcrumbsProps](x: Self) {
      
      inline def setActiveId(value: String | Double): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItemMaxWidth(value: MaxWidthProperty[String | Double]): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
      
      inline def setItems(value: js.Array[BreadcrumbsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: BreadcrumbsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setOnClick(value: /* item */ BreadcrumbsItem => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSize(value: BreadcrumbsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: BreadcrumbsTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait BreadcrumbsSize extends StObject
  object BreadcrumbsSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.onWhiteBackground
    - typings.wixStyleReact.wixStyleReactStrings.onGrayBackground
    - typings.wixStyleReact.wixStyleReactStrings.onDarkBackground
  */
  trait BreadcrumbsTheme extends StObject
  object BreadcrumbsTheme {
    
    inline def onDarkBackground: typings.wixStyleReact.wixStyleReactStrings.onDarkBackground = "onDarkBackground".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.onDarkBackground]
    
    inline def onGrayBackground: typings.wixStyleReact.wixStyleReactStrings.onGrayBackground = "onGrayBackground".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.onGrayBackground]
    
    inline def onWhiteBackground: typings.wixStyleReact.wixStyleReactStrings.onWhiteBackground = "onWhiteBackground".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.onWhiteBackground]
  }
}
