package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparklineChartMod {
  
  @JSImport("wix-style-react/dist/es/src/SparklineChart", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SparklineChartProps, js.Object, js.Any]
  
  type SparklineChart = PureComponent[SparklineChartProps, js.Object, js.Any]
  
  trait SparklineChartProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var data: js.Array[chartData]
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var getTooltipContent: js.UndefOr[js.Function1[/* index */ Double, ReactNode]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var highlightedStartingIndex: js.UndefOr[Double] = js.undefined
    
    var onHover: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SparklineChartProps {
    
    @scala.inline
    def apply(data: js.Array[chartData]): SparklineChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SparklineChartProps]
    }
    
    @scala.inline
    implicit class SparklineChartPropsMutableBuilder[Self <: SparklineChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[chartData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: chartData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setGetTooltipContent(value: /* index */ Double => ReactNode): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTooltipContentUndefined: Self = StObject.set(x, "getTooltipContent", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHighlightedStartingIndex(value: Double): Self = StObject.set(x, "highlightedStartingIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedStartingIndexUndefined: Self = StObject.set(x, "highlightedStartingIndex", js.undefined)
      
      @scala.inline
      def setOnHover(value: /* index */ Double => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait chartData extends StObject {
    
    var label: Date
    
    var value: Double
  }
  object chartData {
    
    @scala.inline
    def apply(label: Date, value: Double): chartData = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[chartData]
    }
    
    @scala.inline
    implicit class chartDataMutableBuilder[Self <: chartData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: Date): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
