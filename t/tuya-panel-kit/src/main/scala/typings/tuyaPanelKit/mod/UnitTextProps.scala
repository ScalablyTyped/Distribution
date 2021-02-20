package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.icon
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitTextProps extends StObject {
  
  var letterWidth: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var svgMap: js.UndefOr[js.Object] = js.native
  
  var symbolWidth: js.UndefOr[Double] = js.native
  
  var symbols: js.UndefOr[js.Array[String]] = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var unitColor: js.UndefOr[String] = js.native
  
  var unitPaddingLeft: js.UndefOr[Double] = js.native
  
  var unitPaddingTop: js.UndefOr[Double] = js.native
  
  var unitSize: js.UndefOr[Double] = js.native
  
  var unitType: js.UndefOr[icon | text] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
  
  var value: String | Double = js.native
  
  var valueColor: js.UndefOr[String] = js.native
  
  var valueColors: js.UndefOr[js.Array[String]] = js.native
  
  var valueSize: js.UndefOr[Double] = js.native
}
object UnitTextProps {
  
  @scala.inline
  def apply(value: String | Double): UnitTextProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitTextProps]
  }
  
  @scala.inline
  implicit class UnitTextPropsMutableBuilder[Self <: UnitTextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLetterWidth(value: Double): Self = StObject.set(x, "letterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterWidthUndefined: Self = StObject.set(x, "letterWidth", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSvgMap(value: js.Object): Self = StObject.set(x, "svgMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgMapUndefined: Self = StObject.set(x, "svgMap", js.undefined)
    
    @scala.inline
    def setSymbolWidth(value: Double): Self = StObject.set(x, "symbolWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolWidthUndefined: Self = StObject.set(x, "symbolWidth", js.undefined)
    
    @scala.inline
    def setSymbols(value: js.Array[String]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    @scala.inline
    def setSymbolsVarargs(value: String*): Self = StObject.set(x, "symbols", js.Array(value :_*))
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitColor(value: String): Self = StObject.set(x, "unitColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitColorUndefined: Self = StObject.set(x, "unitColor", js.undefined)
    
    @scala.inline
    def setUnitPaddingLeft(value: Double): Self = StObject.set(x, "unitPaddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPaddingLeftUndefined: Self = StObject.set(x, "unitPaddingLeft", js.undefined)
    
    @scala.inline
    def setUnitPaddingTop(value: Double): Self = StObject.set(x, "unitPaddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPaddingTopUndefined: Self = StObject.set(x, "unitPaddingTop", js.undefined)
    
    @scala.inline
    def setUnitSize(value: Double): Self = StObject.set(x, "unitSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitSizeUndefined: Self = StObject.set(x, "unitSize", js.undefined)
    
    @scala.inline
    def setUnitType(value: icon | text): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitTypeUndefined: Self = StObject.set(x, "unitType", js.undefined)
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueColor(value: String): Self = StObject.set(x, "valueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueColorUndefined: Self = StObject.set(x, "valueColor", js.undefined)
    
    @scala.inline
    def setValueColors(value: js.Array[String]): Self = StObject.set(x, "valueColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueColorsUndefined: Self = StObject.set(x, "valueColors", js.undefined)
    
    @scala.inline
    def setValueColorsVarargs(value: String*): Self = StObject.set(x, "valueColors", js.Array(value :_*))
    
    @scala.inline
    def setValueSize(value: Double): Self = StObject.set(x, "valueSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSizeUndefined: Self = StObject.set(x, "valueSize", js.undefined)
  }
}
