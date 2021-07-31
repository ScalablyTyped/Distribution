package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.ItemsArray
import typings.wixStyleReact.tableListItemMod.TableListItemColumn
import typings.wixStyleReact.tableListItemMod.TableListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledNestableListMod {
  
  @JSImport("wix-style-react/dist/es/src/StyledNestableList", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[StyledNestableListProps, js.Object, js.Any]
  
  type StyledNestableList = PureComponent[StyledNestableListProps, js.Object, js.Any]
  
  trait StyledNestableListItem
    extends StObject
       with TableListItemProps {
    
    var addItemLabel: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[js.Array[StyledNestableListItem]] = js.undefined
    
    var id: String | Double
    
    var isCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object StyledNestableListItem {
    
    @scala.inline
    def apply(id: String | Double, options: js.Array[TableListItemColumn]): StyledNestableListItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledNestableListItem]
    }
    
    @scala.inline
    implicit class StyledNestableListItemMutableBuilder[Self <: StyledNestableListItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddItemLabel(value: String): Self = StObject.set(x, "addItemLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddItemLabelUndefined: Self = StObject.set(x, "addItemLabel", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[StyledNestableListItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: StyledNestableListItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
    }
  }
  
  trait StyledNestableListProps extends StObject {
    
    var addItemLabel: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[StyledNestableListItem]
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var onAddItem: js.UndefOr[js.Function1[/* item */ StyledNestableListItem, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* data */ ItemsArray, Unit]] = js.undefined
    
    var preventChangeDepth: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object StyledNestableListProps {
    
    @scala.inline
    def apply(items: js.Array[StyledNestableListItem]): StyledNestableListProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledNestableListProps]
    }
    
    @scala.inline
    implicit class StyledNestableListPropsMutableBuilder[Self <: StyledNestableListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddItemLabel(value: String): Self = StObject.set(x, "addItemLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddItemLabelUndefined: Self = StObject.set(x, "addItemLabel", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[StyledNestableListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: StyledNestableListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setOnAddItem(value: /* item */ StyledNestableListItem => Unit): Self = StObject.set(x, "onAddItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddItemUndefined: Self = StObject.set(x, "onAddItem", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* data */ ItemsArray => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPreventChangeDepth(value: Boolean): Self = StObject.set(x, "preventChangeDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventChangeDepthUndefined: Self = StObject.set(x, "preventChangeDepth", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
}
