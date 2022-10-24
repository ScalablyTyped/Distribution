package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarChartMod {
  
  @JSImport("wix-style-react/dist/types/RadarChart", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[RadarChartProps, js.Object, Any]
  
  trait DataPoint extends StObject {
    
    var color: String
    
    var label: String
    
    var tooltipContent: Element
    
    var value: Double
  }
  object DataPoint {
    
    inline def apply(color: String, label: String, tooltipContent: Element, value: Double): DataPoint = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tooltipContent = tooltipContent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPoint]
    }
    
    extension [Self <: DataPoint](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTooltipContent(value: Element): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RadarChart = PureComponent[RadarChartProps, js.Object, Any]
  
  trait RadarChartProps extends StObject {
    
    var data: js.UndefOr[js.Array[DataPoint]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hoverIndex: js.UndefOr[Null | Double] = js.undefined
    
    var labelDistance: js.UndefOr[Double] = js.undefined
    
    var onDataPointHover: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var scale: js.UndefOr[js.Array[ScalePoint]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object RadarChartProps {
    
    inline def apply(): RadarChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadarChartProps]
    }
    
    extension [Self <: RadarChartProps](x: Self) {
      
      inline def setData(value: js.Array[DataPoint]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: DataPoint*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHoverIndex(value: Double): Self = StObject.set(x, "hoverIndex", value.asInstanceOf[js.Any])
      
      inline def setHoverIndexNull: Self = StObject.set(x, "hoverIndex", null)
      
      inline def setHoverIndexUndefined: Self = StObject.set(x, "hoverIndex", js.undefined)
      
      inline def setLabelDistance(value: Double): Self = StObject.set(x, "labelDistance", value.asInstanceOf[js.Any])
      
      inline def setLabelDistanceUndefined: Self = StObject.set(x, "labelDistance", js.undefined)
      
      inline def setOnDataPointHover(value: () => Unit): Self = StObject.set(x, "onDataPointHover", js.Any.fromFunction0(value))
      
      inline def setOnDataPointHoverUndefined: Self = StObject.set(x, "onDataPointHover", js.undefined)
      
      inline def setScale(value: js.Array[ScalePoint]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleVarargs(value: ScalePoint*): Self = StObject.set(x, "scale", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScalePoint extends StObject {
    
    var label: String
    
    var value: Double
  }
  object ScalePoint {
    
    inline def apply(label: String, value: Double): ScalePoint = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalePoint]
    }
    
    extension [Self <: ScalePoint](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
