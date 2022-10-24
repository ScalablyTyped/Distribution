package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Event
import typings.wixStyleReact.anon.ItemItems
import typings.wixStyleReact.distTypesTableListItemMod.TableListItemColumn
import typings.wixStyleReact.distTypesTableListItemMod.TableListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNestableListMod {
  
  @JSImport("wix-style-react/dist/types/NestableList", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[NestableListProps, js.Object, Any]
  
  @js.native
  trait Action extends StObject {
    
    var label: String = js.native
    
    def onClick(e: Event): Unit = js.native
    def onClick(e: Event, item: NestableListItem): Unit = js.native
    
    var prefixIcon: js.UndefOr[ReactNode] = js.native
  }
  
  type NestableList = PureComponent[NestableListProps, js.Object, Any]
  
  trait NestableListItem
    extends StObject
       with TableListItemProps {
    
    var actions: js.UndefOr[js.Array[Action]] = js.undefined
    
    var actionsDataHook: js.UndefOr[String] = js.undefined
    
    var addItemLabel: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[js.Array[NestableListItem]] = js.undefined
    
    var id: String | Double
    
    var isCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object NestableListItem {
    
    inline def apply(id: String | Double, options: js.Array[TableListItemColumn]): NestableListItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestableListItem]
    }
    
    extension [Self <: NestableListItem](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsDataHook(value: String): Self = StObject.set(x, "actionsDataHook", value.asInstanceOf[js.Any])
      
      inline def setActionsDataHookUndefined: Self = StObject.set(x, "actionsDataHook", js.undefined)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAddItemLabel(value: String): Self = StObject.set(x, "addItemLabel", value.asInstanceOf[js.Any])
      
      inline def setAddItemLabelUndefined: Self = StObject.set(x, "addItemLabel", js.undefined)
      
      inline def setChildren(value: js.Array[NestableListItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: NestableListItem*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
    }
  }
  
  trait NestableListProps extends StObject {
    
    var actions: js.UndefOr[js.Array[Action]] = js.undefined
    
    var addItemLabel: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[NestableListItem]
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var onAddItem: js.UndefOr[js.Function1[/* item */ NestableListItem, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* data */ ItemItems, Unit]] = js.undefined
    
    var preventChangeDepth: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var withBottomBorder: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object NestableListProps {
    
    inline def apply(items: js.Array[NestableListItem]): NestableListProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestableListProps]
    }
    
    extension [Self <: NestableListProps](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAddItemLabel(value: String): Self = StObject.set(x, "addItemLabel", value.asInstanceOf[js.Any])
      
      inline def setAddItemLabelUndefined: Self = StObject.set(x, "addItemLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[NestableListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: NestableListItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setOnAddItem(value: /* item */ NestableListItem => Unit): Self = StObject.set(x, "onAddItem", js.Any.fromFunction1(value))
      
      inline def setOnAddItemUndefined: Self = StObject.set(x, "onAddItem", js.undefined)
      
      inline def setOnChange(value: /* data */ ItemItems => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPreventChangeDepth(value: Boolean): Self = StObject.set(x, "preventChangeDepth", value.asInstanceOf[js.Any])
      
      inline def setPreventChangeDepthUndefined: Self = StObject.set(x, "preventChangeDepth", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setWithBottomBorder(value: Boolean): Self = StObject.set(x, "withBottomBorder", value.asInstanceOf[js.Any])
      
      inline def setWithBottomBorderUndefined: Self = StObject.set(x, "withBottomBorder", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
