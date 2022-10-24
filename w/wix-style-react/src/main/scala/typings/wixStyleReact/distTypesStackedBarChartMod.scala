package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.LeftRight
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStackedBarChartMod {
  
  @JSImport("wix-style-react/dist/types/StackedBarChart", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[StackedBarChartProps, js.Object, Any]
  
  type StackedBarChart = PureComponent[StackedBarChartProps, js.Object, Any]
  
  trait StackedBarChartProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Array[item]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[LeftRight] = js.undefined
    
    var tooltipCommonProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var tooltipTemplate: js.UndefOr[js.Function1[/* item */ item, ReactNode]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var yAxisTickFormat: js.UndefOr[js.Function2[/* rawValue */ String, /* parsedValue */ String, String]] = js.undefined
  }
  object StackedBarChartProps {
    
    inline def apply(): StackedBarChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedBarChartProps]
    }
    
    extension [Self <: StackedBarChartProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: js.Array[item]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: item*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: LeftRight): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setTooltipCommonProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipCommonProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipCommonPropsUndefined: Self = StObject.set(x, "tooltipCommonProps", js.undefined)
      
      inline def setTooltipTemplate(value: /* item */ item => ReactNode): Self = StObject.set(x, "tooltipTemplate", js.Any.fromFunction1(value))
      
      inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setYAxisTickFormat(value: (/* rawValue */ String, /* parsedValue */ String) => String): Self = StObject.set(x, "yAxisTickFormat", js.Any.fromFunction2(value))
      
      inline def setYAxisTickFormatUndefined: Self = StObject.set(x, "yAxisTickFormat", js.undefined)
    }
  }
  
  trait item extends StObject {
    
    var label: String
    
    var values: js.Array[Double]
  }
  object item {
    
    inline def apply(label: String, values: js.Array[Double]): item = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[item]
    }
    
    extension [Self <: item](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
