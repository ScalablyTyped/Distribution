package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.icon
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitTextProps extends StObject {
  
  var letterWidth: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var svgMap: js.UndefOr[js.Object] = js.undefined
  
  var symbolWidth: js.UndefOr[Double] = js.undefined
  
  var symbols: js.UndefOr[js.Array[String]] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitColor: js.UndefOr[String] = js.undefined
  
  var unitPaddingLeft: js.UndefOr[Double] = js.undefined
  
  var unitPaddingTop: js.UndefOr[Double] = js.undefined
  
  var unitSize: js.UndefOr[Double] = js.undefined
  
  var unitType: js.UndefOr[icon | text] = js.undefined
  
  var useART: js.UndefOr[Boolean] = js.undefined
  
  var value: String | Double
  
  var valueColor: js.UndefOr[String] = js.undefined
  
  var valueColors: js.UndefOr[js.Array[String]] = js.undefined
  
  var valueSize: js.UndefOr[Double] = js.undefined
}
object UnitTextProps {
  
  inline def apply(value: String | Double): UnitTextProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitTextProps]
  }
  
  extension [Self <: UnitTextProps](x: Self) {
    
    inline def setLetterWidth(value: Double): Self = StObject.set(x, "letterWidth", value.asInstanceOf[js.Any])
    
    inline def setLetterWidthUndefined: Self = StObject.set(x, "letterWidth", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSvgMap(value: js.Object): Self = StObject.set(x, "svgMap", value.asInstanceOf[js.Any])
    
    inline def setSvgMapUndefined: Self = StObject.set(x, "svgMap", js.undefined)
    
    inline def setSymbolWidth(value: Double): Self = StObject.set(x, "symbolWidth", value.asInstanceOf[js.Any])
    
    inline def setSymbolWidthUndefined: Self = StObject.set(x, "symbolWidth", js.undefined)
    
    inline def setSymbols(value: js.Array[String]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    inline def setSymbolsVarargs(value: String*): Self = StObject.set(x, "symbols", js.Array(value :_*))
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitColor(value: String): Self = StObject.set(x, "unitColor", value.asInstanceOf[js.Any])
    
    inline def setUnitColorUndefined: Self = StObject.set(x, "unitColor", js.undefined)
    
    inline def setUnitPaddingLeft(value: Double): Self = StObject.set(x, "unitPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def setUnitPaddingLeftUndefined: Self = StObject.set(x, "unitPaddingLeft", js.undefined)
    
    inline def setUnitPaddingTop(value: Double): Self = StObject.set(x, "unitPaddingTop", value.asInstanceOf[js.Any])
    
    inline def setUnitPaddingTopUndefined: Self = StObject.set(x, "unitPaddingTop", js.undefined)
    
    inline def setUnitSize(value: Double): Self = StObject.set(x, "unitSize", value.asInstanceOf[js.Any])
    
    inline def setUnitSizeUndefined: Self = StObject.set(x, "unitSize", js.undefined)
    
    inline def setUnitType(value: icon | text): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    inline def setUnitTypeUndefined: Self = StObject.set(x, "unitType", js.undefined)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueColor(value: String): Self = StObject.set(x, "valueColor", value.asInstanceOf[js.Any])
    
    inline def setValueColorUndefined: Self = StObject.set(x, "valueColor", js.undefined)
    
    inline def setValueColors(value: js.Array[String]): Self = StObject.set(x, "valueColors", value.asInstanceOf[js.Any])
    
    inline def setValueColorsUndefined: Self = StObject.set(x, "valueColors", js.undefined)
    
    inline def setValueColorsVarargs(value: String*): Self = StObject.set(x, "valueColors", js.Array(value :_*))
    
    inline def setValueSize(value: Double): Self = StObject.set(x, "valueSize", value.asInstanceOf[js.Any])
    
    inline def setValueSizeUndefined: Self = StObject.set(x, "valueSize", js.undefined)
  }
}
