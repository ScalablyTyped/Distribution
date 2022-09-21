package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.icon
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitTextProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 自定义文字的宽度
    * @defaultValue 0.55
    */
  /**
    * @language en-US
    * @description Custom text width
    * @defaultValue 0.55
    */
  var letterWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 字体尺寸大小
    * @defaultValue 82
    */
  /**
    * @language en-US
    * @description Font size
    * @defaultValue 82
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内容样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 额外的 svg 路径映射表，用于拓展内部的 svg path 或覆盖内部的 svg path
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Additional SVG path mapping table is used to expand the internal SVG path or cover the internal SVG path
    * @defaultValue {}
    */
  var svgMap: js.UndefOr[js.Object] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义符号的宽度（如.,:等）
    * @defaultValue 0.35
    */
  /**
    * @language en-US
    * @description Custom symbol width (e.g.,,: etc.)
    * @defaultValue 0.35
    */
  var symbolWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 被认作为 symbol 的字符串，并结合 symbolWidth 使用
    * @defaultValue ['.', ':', ',']
    */
  /**
    * @language en-US
    * @description String recognized as symbol and used in combination with symbol width
    * @defaultValue ['.', ':', ',']
    */
  var symbols: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Unit
    * @defaultValue ''
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位的颜色
    * @defaultValue "white"
    */
  /**
    * @language en-US
    * @description The color of the unit
    * @defaultValue "white"
    */
  var unitColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位的左边距
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The left margin of the unit
    * @defaultValue 0
    */
  var unitPaddingLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位的上边距
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The top margin of the unit
    * @defaultValue 0
    */
  var unitPaddingTop: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位的尺寸大小
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Size of unit
    * @defaultValue null
    */
  var unitSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位的类型
    * @defaultValue 'icon'
    */
  /**
    * @language en-US
    * @description Type of unit
    * @defaultValue 'icon'
    */
  var unitType: js.UndefOr[icon | text] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 ART 形式展示
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to use ART format display
    * @defaultValue false
    */
  var useART: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 具体值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Value
    * @defaultValue undefined
    */
  var value: String | Double
  
  /**
    * @language zh-CN
    * @description 具体值的颜色
    * @defaultValue "white"
    */
  /**
    * @language en-US
    * @description The color of the specific value
    * @defaultValue "white"
    */
  var valueColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 定制每个值的颜色
    * @defaultValue []
    */
  /**
    * @language en-US
    * @description Customize the color of each value
    * @defaultValue []
    */
  var valueColors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 具体值的尺寸大小
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Size of specific value
    * @defaultValue null
    */
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
    
    inline def setSymbolsVarargs(value: String*): Self = StObject.set(x, "symbols", js.Array(value*))
    
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
    
    inline def setValueColorsVarargs(value: String*): Self = StObject.set(x, "valueColors", js.Array(value*))
    
    inline def setValueSize(value: Double): Self = StObject.set(x, "valueSize", value.asInstanceOf[js.Any])
    
    inline def setValueSizeUndefined: Self = StObject.set(x, "valueSize", js.undefined)
  }
}
