package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAreaChartMod {
  
  @JSImport("wix-style-react/dist/types/AreaChart", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AreaChartProps, js.Object, Any]
  
  type AreaChart = PureComponent[AreaChartProps, js.Object, Any]
  
  trait AreaChartProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.Array[IDatasetItem]
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var maxYTicksLimit: js.UndefOr[Double] = js.undefined
    
    var onTooltipShow: js.UndefOr[js.Function1[/* item */ IDatasetItem, Unit]] = js.undefined
    
    var tooltipContent: js.UndefOr[
        js.Function2[/* item */ IDatasetItem, /* index */ Double, String | js.Array[String]]
      ] = js.undefined
  }
  object AreaChartProps {
    
    inline def apply(data: js.Array[IDatasetItem]): AreaChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AreaChartProps]
    }
    
    extension [Self <: AreaChartProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: js.Array[IDatasetItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDataVarargs(value: IDatasetItem*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setMaxYTicksLimit(value: Double): Self = StObject.set(x, "maxYTicksLimit", value.asInstanceOf[js.Any])
      
      inline def setMaxYTicksLimitUndefined: Self = StObject.set(x, "maxYTicksLimit", js.undefined)
      
      inline def setOnTooltipShow(value: /* item */ IDatasetItem => Unit): Self = StObject.set(x, "onTooltipShow", js.Any.fromFunction1(value))
      
      inline def setOnTooltipShowUndefined: Self = StObject.set(x, "onTooltipShow", js.undefined)
      
      inline def setTooltipContent(value: (/* item */ IDatasetItem, /* index */ Double) => String | js.Array[String]): Self = StObject.set(x, "tooltipContent", js.Any.fromFunction2(value))
      
      inline def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
    }
  }
  
  trait IDatasetItem extends StObject {
    
    var label: String
    
    var value: Double
  }
  object IDatasetItem {
    
    inline def apply(label: String, value: Double): IDatasetItem = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatasetItem]
    }
    
    extension [Self <: IDatasetItem](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
