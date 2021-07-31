package typings.wixStyleReact

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.wixStyleReactStrings.center
import typings.wixStyleReact.wixStyleReactStrings.end
import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.start
import typings.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticsWidgetMod {
  
  @JSImport("wix-style-react/dist/es/src/StatisticsWidget", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[StatisticsWidgetProps, js.Object, js.Any]
  
  type StatisticsWidget = PureComponent[StatisticsWidgetProps, js.Object, js.Any]
  
  trait StatisticsWidgetItem extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var descriptionInfo: js.UndefOr[String] = js.undefined
    
    var invertedPercentage: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[
          /* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    var percentage: js.UndefOr[Double] = js.undefined
    
    var value: String
    
    var valueInShort: js.UndefOr[String] = js.undefined
  }
  object StatisticsWidgetItem {
    
    @scala.inline
    def apply(value: String): StatisticsWidgetItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatisticsWidgetItem]
    }
    
    @scala.inline
    implicit class StatisticsWidgetItemMutableBuilder[Self <: StatisticsWidgetItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionInfo(value: String): Self = StObject.set(x, "descriptionInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionInfoUndefined: Self = StObject.set(x, "descriptionInfo", js.undefined)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setInvertedPercentage(value: Boolean): Self = StObject.set(x, "invertedPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedPercentageUndefined: Self = StObject.set(x, "invertedPercentage", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: /* event */ (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement] => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueInShort(value: String): Self = StObject.set(x, "valueInShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueInShortUndefined: Self = StObject.set(x, "valueInShort", js.undefined)
    }
  }
  
  trait StatisticsWidgetProps extends StObject {
    
    var alignItems: js.UndefOr[center | start | end] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[StatisticsWidgetItem]] = js.undefined
    
    var size: js.UndefOr[large | tiny] = js.undefined
  }
  object StatisticsWidgetProps {
    
    @scala.inline
    def apply(): StatisticsWidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticsWidgetProps]
    }
    
    @scala.inline
    implicit class StatisticsWidgetPropsMutableBuilder[Self <: StatisticsWidgetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignItems(value: center | start | end): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[StatisticsWidgetItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: StatisticsWidgetItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: large | tiny): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
