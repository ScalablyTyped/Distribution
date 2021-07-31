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

object tabsMod {
  
  @JSImport("wix-style-react/dist/es/src/Tabs", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[TabsProps, js.Object, js.Any]
  
  trait Item extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var id: String | Double
    
    var title: ReactNode
  }
  object Item {
    
    @scala.inline
    def apply(id: String | Double): Item = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type Tabs = PureComponent[TabsProps, js.Object, js.Any]
  
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
    
    @scala.inline
    def apply(items: js.Array[Item]): TabsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveId(value: String | Double): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setHasDivider(value: Boolean): Self = StObject.set(x, "hasDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDividerUndefined: Self = StObject.set(x, "hasDivider", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* item */ Item => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSideContent(value: ReactNode): Self = StObject.set(x, "sideContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideContentUndefined: Self = StObject.set(x, "sideContent", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: _empty | compact | compactSide | uniformSide | uniformFull): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
