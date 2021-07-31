package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funnelChartMod {
  
  @JSImport("wix-style-react/dist/es/src/FunnelChart", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FunnelChartProps, js.Object, js.Any]
  
  type FunnelChart = PureComponent[FunnelChartProps, js.Object, js.Any]
  
  trait FunnelChartItem extends StObject {
    
    var label: String
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object FunnelChartItem {
    
    @scala.inline
    def apply(label: String): FunnelChartItem = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelChartItem]
    }
    
    @scala.inline
    implicit class FunnelChartItemMutableBuilder[Self <: FunnelChartItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FunnelChartProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.Array[FunnelChartItem]
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var differenceBadgeTooltipContent: js.UndefOr[js.Function1[/* hasCurrentIndexDifference */ percentageDifferenceCbData, String]] = js.undefined
    
    var hideDifferenceBadge: js.UndefOr[Boolean] = js.undefined
    
    var onDifferenceBadgeTooltipShow: js.UndefOr[js.Function1[/* hasCurrentIndexDifference */ percentageDifferenceCbData, Unit]] = js.undefined
  }
  object FunnelChartProps {
    
    @scala.inline
    def apply(data: js.Array[FunnelChartItem]): FunnelChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelChartProps]
    }
    
    @scala.inline
    implicit class FunnelChartPropsMutableBuilder[Self <: FunnelChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[FunnelChartItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: FunnelChartItem*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDifferenceBadgeTooltipContent(value: /* hasCurrentIndexDifference */ percentageDifferenceCbData => String): Self = StObject.set(x, "differenceBadgeTooltipContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDifferenceBadgeTooltipContentUndefined: Self = StObject.set(x, "differenceBadgeTooltipContent", js.undefined)
      
      @scala.inline
      def setHideDifferenceBadge(value: Boolean): Self = StObject.set(x, "hideDifferenceBadge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDifferenceBadgeUndefined: Self = StObject.set(x, "hideDifferenceBadge", js.undefined)
      
      @scala.inline
      def setOnDifferenceBadgeTooltipShow(value: /* hasCurrentIndexDifference */ percentageDifferenceCbData => Unit): Self = StObject.set(x, "onDifferenceBadgeTooltipShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDifferenceBadgeTooltipShowUndefined: Self = StObject.set(x, "onDifferenceBadgeTooltipShow", js.undefined)
    }
  }
  
  trait percentageDifferenceCbData extends StObject {
    
    var currentIndex: Double
    
    var difference: String
  }
  object percentageDifferenceCbData {
    
    @scala.inline
    def apply(currentIndex: Double, difference: String): percentageDifferenceCbData = {
      val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any])
      __obj.asInstanceOf[percentageDifferenceCbData]
    }
    
    @scala.inline
    implicit class percentageDifferenceCbDataMutableBuilder[Self <: percentageDifferenceCbData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDifference(value: String): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    }
  }
}
