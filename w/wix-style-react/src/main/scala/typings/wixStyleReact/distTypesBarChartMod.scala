package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarChartMod {
  
  @JSImport("wix-style-react/dist/types/BarChart", JSImport.Default)
  @js.native
  open class default () extends Component[BarChartProps, BarChartState, Any]
  
  type BarChart = Component[BarChartProps, BarChartState, Any]
  
  trait BarChartItem extends StObject {
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var descriptionInfo: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var labelShort: js.UndefOr[ReactNode] = js.undefined
    
    var onDescriptionInfoShown: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var value: Double
  }
  object BarChartItem {
    
    inline def apply(value: Double): BarChartItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartItem]
    }
    
    extension [Self <: BarChartItem](x: Self) {
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionInfo(value: ReactNode): Self = StObject.set(x, "descriptionInfo", value.asInstanceOf[js.Any])
      
      inline def setDescriptionInfoUndefined: Self = StObject.set(x, "descriptionInfo", js.undefined)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelShort(value: ReactNode): Self = StObject.set(x, "labelShort", value.asInstanceOf[js.Any])
      
      inline def setLabelShortUndefined: Self = StObject.set(x, "labelShort", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnDescriptionInfoShown(value: () => Unit): Self = StObject.set(x, "onDescriptionInfoShown", js.Any.fromFunction0(value))
      
      inline def setOnDescriptionInfoShownUndefined: Self = StObject.set(x, "onDescriptionInfoShown", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BarChartProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[BarChartItem]
    
    var onDescriptionInfoShown: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object BarChartProps {
    
    inline def apply(items: js.Array[BarChartItem]): BarChartProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartProps]
    }
    
    extension [Self <: BarChartProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[BarChartItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: BarChartItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnDescriptionInfoShown(value: () => Unit): Self = StObject.set(x, "onDescriptionInfoShown", js.Any.fromFunction0(value))
      
      inline def setOnDescriptionInfoShownUndefined: Self = StObject.set(x, "onDescriptionInfoShown", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait BarChartState extends StObject {
    
    var width: Double
  }
  object BarChartState {
    
    inline def apply(width: Double): BarChartState = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartState]
    }
    
    extension [Self <: BarChartState](x: Self) {
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
