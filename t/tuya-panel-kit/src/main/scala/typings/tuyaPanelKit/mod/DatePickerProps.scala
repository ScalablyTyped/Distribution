package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Am
import typings.tuyaPanelKit.tuyaPanelKitStrings.date
import typings.tuyaPanelKit.tuyaPanelKitStrings.datetime
import typings.tuyaPanelKit.tuyaPanelKitStrings.month
import typings.tuyaPanelKit.tuyaPanelKitStrings.time
import typings.tuyaPanelKit.tuyaPanelKitStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof tuya-panel-kit.tuya-panel-kit.PickerViewProps, 'mode'> ]: tuya-panel-kit.tuya-panel-kit.PickerViewProps[P]} */ trait DatePickerProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue 'DatePicker'
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue 'DatePicker'
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当前选中的值，设置了该属性即为受控组件
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The currently selected value determines that this attribute is the controlled component
    * @defaultValue undefined
    */
  var date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * @language zh-CN
    * @description 年 月 日 排序规则，若不提供则默认为年月日
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The sorting rule of year, month and day options. It is year/month/day by default
    * @defaultValue null
    */
  var dateSortKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 默认选中的值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description The value selected by default
    * @defaultValue undefined
    */
  var defaultDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * @language zh-CN
    * @description AM / PM 是否位于小时及分钟之前
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Am / PM before hours and minutes
    * @defaultValue false
    */
  var isAmpmFirst: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 月、日、时、分，是否补0显示
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Month, day, hour, minute, whether to add 0 display
    * @defaultValue true
    */
  var isPlusZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 小时及分钟项是否位于年月日之前
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Specify whether the hour and minute options are before year, month, and day.
    * @defaultValue false
    */
  var isTimeFirst: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 多语言设置
    * @defaultValue 'en'
    */
  /**
    * @language en-US
    * @description Multilingual Settings
    * @defaultValue 'en'
    */
  var locale: js.UndefOr[String | Am] = js.undefined
  
  /**
    * @language zh-CN
    * @description 选择 picker 是否可循环
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Select whether picker loops.
    * @defaultValue false
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置最大可选择的值
    * @defaultValue new Date(2030, 11, 31, 23, 59, 59)
    */
  /**
    * @language en-US
    * @description Set the maximum selectable value
    * @defaultValue new Date(2030, 11, 31, 23, 59, 59)
    */
  var maxDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * @language zh-CN
    * @description 设置最小可选择的值
    * @defaultValue new Date(2000, 0, 1, 0, 0, 0)
    */
  /**
    * @language en-US
    * @description Set the minimum selectable value
    * @defaultValue new Date(2000, 0, 1, 0, 0, 0)
    */
  var minDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * @language zh-CN
    * @description The selection type of the selector
    * @defaultValue 'date'
    */
  /**
    * @language en-US
    * @description The selection type of the selector
    * @defaultValue 'date'
    */
  var mode: js.UndefOr[datetime | date | time | month | year] = js.undefined
  
  /**
    * @language zh-CN
    * @description 某一项被选中时执行此回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Perform this callback when an item is selected. It is called with the following parameters.
    * @defaultValue () => {}
    */
  var onDateChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Date], Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 某一项被选中时执行此回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Perform this callback when an item is selected. It is called with the following parameters.
    * @defaultValue () => {}
    */
  var onValueChange: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[String | Double], /* index */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker 里字体颜色
    * @defaultValue '#333'
    */
  /**
    * @language en-US
    * @description Font color in picker
    * @defaultValue '#333'
    */
  var pickerFontColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否为12小时制
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Specify whether it is 12-hour system.
    * @defaultValue false
    */
  var use12Hours: js.UndefOr[Boolean] = js.undefined
}
object DatePickerProps {
  
  inline def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  
  extension [Self <: DatePickerProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateSortKeys(value: js.Array[String]): Self = StObject.set(x, "dateSortKeys", value.asInstanceOf[js.Any])
    
    inline def setDateSortKeysUndefined: Self = StObject.set(x, "dateSortKeys", js.undefined)
    
    inline def setDateSortKeysVarargs(value: String*): Self = StObject.set(x, "dateSortKeys", js.Array(value*))
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    inline def setIsAmpmFirst(value: Boolean): Self = StObject.set(x, "isAmpmFirst", value.asInstanceOf[js.Any])
    
    inline def setIsAmpmFirstUndefined: Self = StObject.set(x, "isAmpmFirst", js.undefined)
    
    inline def setIsPlusZero(value: Boolean): Self = StObject.set(x, "isPlusZero", value.asInstanceOf[js.Any])
    
    inline def setIsPlusZeroUndefined: Self = StObject.set(x, "isPlusZero", js.undefined)
    
    inline def setIsTimeFirst(value: Boolean): Self = StObject.set(x, "isTimeFirst", value.asInstanceOf[js.Any])
    
    inline def setIsTimeFirstUndefined: Self = StObject.set(x, "isTimeFirst", js.undefined)
    
    inline def setLocale(value: String | Am): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMode(value: datetime | date | time | month | year): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnDateChange(value: /* value */ js.UndefOr[js.Date] => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
    
    inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
    
    inline def setOnValueChange(value: (/* value */ js.UndefOr[String | Double], /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setPickerFontColor(value: String): Self = StObject.set(x, "pickerFontColor", value.asInstanceOf[js.Any])
    
    inline def setPickerFontColorUndefined: Self = StObject.set(x, "pickerFontColor", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
    
    inline def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
  }
}
