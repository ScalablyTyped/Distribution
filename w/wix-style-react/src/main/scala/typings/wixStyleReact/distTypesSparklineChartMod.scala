package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSparklineChartMod {
  
  @JSImport("wix-style-react/dist/types/SparklineChart", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SparklineChartProps, js.Object, Any]
  
  type SparklineChart = PureComponent[SparklineChartProps, js.Object, Any]
  
  trait SparklineChartProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var data: js.Array[chartData]
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var getTooltipContent: js.UndefOr[js.Function1[/* index */ Double, ReactNode]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var highlightedEndingIndex: js.UndefOr[Double] = js.undefined
    
    var highlightedStartingIndex: js.UndefOr[Double] = js.undefined
    
    var onHover: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SparklineChartProps {
    
    inline def apply(data: js.Array[chartData]): SparklineChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SparklineChartProps]
    }
    
    extension [Self <: SparklineChartProps](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setData(value: js.Array[chartData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDataVarargs(value: chartData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGetTooltipContent(value: /* index */ Double => ReactNode): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction1(value))
      
      inline def setGetTooltipContentUndefined: Self = StObject.set(x, "getTooltipContent", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHighlightedEndingIndex(value: Double): Self = StObject.set(x, "highlightedEndingIndex", value.asInstanceOf[js.Any])
      
      inline def setHighlightedEndingIndexUndefined: Self = StObject.set(x, "highlightedEndingIndex", js.undefined)
      
      inline def setHighlightedStartingIndex(value: Double): Self = StObject.set(x, "highlightedStartingIndex", value.asInstanceOf[js.Any])
      
      inline def setHighlightedStartingIndexUndefined: Self = StObject.set(x, "highlightedStartingIndex", js.undefined)
      
      inline def setOnHover(value: /* index */ Double => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait chartData extends StObject {
    
    var label: js.Date
    
    var value: Double
  }
  object chartData {
    
    inline def apply(label: js.Date, value: Double): chartData = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[chartData]
    }
    
    extension [Self <: chartData](x: Self) {
      
      inline def setLabel(value: js.Date): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
