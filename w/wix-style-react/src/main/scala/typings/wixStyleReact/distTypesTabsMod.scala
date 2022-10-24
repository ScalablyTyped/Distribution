package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings._empty
import typings.wixStyleReact.wixStyleReactStrings.compact
import typings.wixStyleReact.wixStyleReactStrings.compactSide
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.uniformFull
import typings.wixStyleReact.wixStyleReactStrings.uniformSide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsMod {
  
  @JSImport("wix-style-react/dist/types/Tabs", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[TabsProps, js.Object, Any]
  
  trait Item extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var id: String | Double
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var title: ReactNode
  }
  object Item {
    
    inline def apply(id: String | Double): Item = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type Tabs = PureComponent[TabsProps, js.Object, Any]
  
  trait TabsProps extends StObject {
    
    var activeId: js.UndefOr[String | Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hasDivider: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[Item]
    
    var minWidth: js.UndefOr[String | Double] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    var sideContent: js.UndefOr[ReactNode] = js.undefined
    
    var size: js.UndefOr[small | medium] = js.undefined
    
    var `type`: js.UndefOr[_empty | compact | compactSide | uniformSide | uniformFull] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object TabsProps {
    
    inline def apply(items: js.Array[Item]): TabsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setActiveId(value: String | Double): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHasDivider(value: Boolean): Self = StObject.set(x, "hasDivider", value.asInstanceOf[js.Any])
      
      inline def setHasDividerUndefined: Self = StObject.set(x, "hasDivider", js.undefined)
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOnClick(value: /* item */ Item => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSideContent(value: ReactNode): Self = StObject.set(x, "sideContent", value.asInstanceOf[js.Any])
      
      inline def setSideContentUndefined: Self = StObject.set(x, "sideContent", js.undefined)
      
      inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: _empty | compact | compactSide | uniformSide | uniformFull): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
