package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.left
import typings.tuyaPanelKit.tuyaPanelKitStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof tuya-panel-kit.tuya-panel-kit.PickerViewProps, 'children'> ]: tuya-panel-kit.tuya-panel-kit.PickerViewProps[P]} */ trait TimerPickerProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "TimerPicker"
    */
  /**
    * @language en-US
    * @description  Test identification
    * @defaultValue "TimerPicker"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 上午字段
    * @defaultValue 'AM'
    */
  /**
    * @language en-US
    * @description AM Text
    * @defaultValue 'AM'
    */
  var amText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker 是否支持手势
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Does picker support gestures
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 结束时间，minutes(0 - 1440)
    * @defaultValue 840
    */
  /**
    * @language en-US
    * @description End time, minutes (0 - 1440)
    * @defaultValue 840
    */
  var endTime: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否为 12 小时制
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is it 12 hours
    * @defaultValue true
    */
  var is12Hours: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 时间段更改回调
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Time period change callback
    * @defaultValue null
    */
  var onTimerChange: js.UndefOr[js.Function2[/* startTime */ Double, /* endTime */ Double, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker 字体颜色
    * @defaultValue "#333"
    */
  /**
    * @language en-US
    * @description The color of the picker font.
    * @defaultValue "#333"
    */
  var pickerFontColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 下午字段
    * @defaultValue 'PM'
    */
  /**
    * @language en-US
    * @description PM 字段
    * @defaultValue 'PM'
    */
  var pmText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 前缀位置（即 AM / PM 位置）
    * @defaultValue 'right'
    */
  /**
    * @language en-US
    * @description Prefix position (i.e. AM / PM position)
    * @defaultValue 'right'
    */
  var prefixPosition: js.UndefOr[js.Array[String] | left | right] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否只需要一个 picker
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is only one picker needed
    * @defaultValue false
    */
  var singlePicker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 开始时间，minutes(0 - 1440)
    * @defaultValue 480
    */
  /**
    * @language en-US
    * @description Start time, minutes (0 - 1440)
    * @defaultValue 480
    */
  var startTime: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 前缀字符
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Prefix character
    * @defaultValue undefined
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object TimerPickerProps {
  
  inline def apply(): TimerPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimerPickerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimerPickerProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAmText(value: String): Self = StObject.set(x, "amText", value.asInstanceOf[js.Any])
    
    inline def setAmTextUndefined: Self = StObject.set(x, "amText", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setIs12Hours(value: Boolean): Self = StObject.set(x, "is12Hours", value.asInstanceOf[js.Any])
    
    inline def setIs12HoursUndefined: Self = StObject.set(x, "is12Hours", js.undefined)
    
    inline def setOnTimerChange(value: (/* startTime */ Double, /* endTime */ Double) => Unit): Self = StObject.set(x, "onTimerChange", js.Any.fromFunction2(value))
    
    inline def setOnTimerChangeUndefined: Self = StObject.set(x, "onTimerChange", js.undefined)
    
    inline def setPickerFontColor(value: String): Self = StObject.set(x, "pickerFontColor", value.asInstanceOf[js.Any])
    
    inline def setPickerFontColorUndefined: Self = StObject.set(x, "pickerFontColor", js.undefined)
    
    inline def setPmText(value: String): Self = StObject.set(x, "pmText", value.asInstanceOf[js.Any])
    
    inline def setPmTextUndefined: Self = StObject.set(x, "pmText", js.undefined)
    
    inline def setPrefixPosition(value: js.Array[String] | left | right): Self = StObject.set(x, "prefixPosition", value.asInstanceOf[js.Any])
    
    inline def setPrefixPositionUndefined: Self = StObject.set(x, "prefixPosition", js.undefined)
    
    inline def setPrefixPositionVarargs(value: String*): Self = StObject.set(x, "prefixPosition", js.Array(value*))
    
    inline def setSinglePicker(value: Boolean): Self = StObject.set(x, "singlePicker", value.asInstanceOf[js.Any])
    
    inline def setSinglePickerUndefined: Self = StObject.set(x, "singlePicker", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
