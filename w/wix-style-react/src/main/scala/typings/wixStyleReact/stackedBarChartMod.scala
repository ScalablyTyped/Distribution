package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackedBarChartMod {
  
  @JSImport("wix-style-react/dist/es/src/StackedBarChart", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[StackedBarChartProps, js.Object, js.Any]
  
  type StackedBarChart = PureComponent[StackedBarChartProps, js.Object, js.Any]
  
  trait StackedBarChartProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Array[item]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Bottom] = js.undefined
    
    var tooltipTemplate: js.UndefOr[js.Function1[/* item */ item, ReactNode]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var yAxisTickFormat: js.UndefOr[js.Function2[/* rawValue */ String, /* parsedValue */ String, String]] = js.undefined
  }
  object StackedBarChartProps {
    
    @scala.inline
    def apply(): StackedBarChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedBarChartProps]
    }
    
    @scala.inline
    implicit class StackedBarChartPropsMutableBuilder[Self <: StackedBarChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[item]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: item*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setTooltipTemplate(value: /* item */ item => ReactNode): Self = StObject.set(x, "tooltipTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setYAxisTickFormat(value: (/* rawValue */ String, /* parsedValue */ String) => String): Self = StObject.set(x, "yAxisTickFormat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setYAxisTickFormatUndefined: Self = StObject.set(x, "yAxisTickFormat", js.undefined)
    }
  }
  
  trait item extends StObject {
    
    var label: String
    
    var values: js.Array[Double]
  }
  object item {
    
    @scala.inline
    def apply(label: String, values: js.Array[Double]): item = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[item]
    }
    
    @scala.inline
    implicit class itemMutableBuilder[Self <: item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
