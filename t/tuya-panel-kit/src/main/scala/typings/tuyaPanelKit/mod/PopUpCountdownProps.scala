package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Hour
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopUpCountdownProps
  extends StObject
     with PopupProps {
  
  /**
    * @language zh-CN
    * @description 值更改回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Value change callback
    * @defaultValue () => {}
    */
  var _onDataChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 倒计时弹框样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Countdown pop-up style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var countdownWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 小时picker样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Hour picker style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var hourPickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 小时文本
    * @defaultValue 'Hour'
    */
  /**
    * @language en-US
    * @description Hour text
    * @defaultValue 'Hour'
    */
  var hourText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 小时单位样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Hour unit style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var hourUnitStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最大值
    * @defaultValue 1440
    */
  /**
    * @language en-US
    * @description The maximum value of the countdown, in minutes
    * @defaultValue 1440
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最小值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description The minimum value of the countdown, in minutes
    * @defaultValue 0
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分钟 picker 样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Minute picker style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var minutePickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分钟文本
    * @defaultValue 'Minute'
    */
  /**
    * @language en-US
    * @description Minute text
    * @defaultValue 'Minute'
    */
  var minuteText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分钟单位样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Minute unit style
    * @types <a target="_blank" href="https://reactnative.dev/docs/text-style-props">StyleProp<TextStyle></a>
    * @defaultValue null
    */
  var minuteUnitStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 值更改回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Value change callback
    * @defaultValue () => {}
    */
  var onValueChange: js.UndefOr[js.Function1[/* data */ js.UndefOr[Hour], Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否只显示分钟
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to show only minutes
    * @defaultValue false
    */
  var onlyone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker字体颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description picker font color
    * @defaultValue null
    */
  var pickerFontColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description picker单位颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Picker unit color
    * @defaultValue null
    */
  var pickerUnitColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 步长
    * @defaultValue 1
    */
  /**
    * @language en-US
    * @description Step length of the countdown
    * @defaultValue 1
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 倒计时具体值
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Value
    * @defaultValue undefined
    */
  var value: Double
}
object PopUpCountdownProps {
  
  inline def apply(value: Double): PopUpCountdownProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopUpCountdownProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopUpCountdownProps] (val x: Self) extends AnyVal {
    
    inline def setCountdownWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "countdownWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setCountdownWrapperStyleNull: Self = StObject.set(x, "countdownWrapperStyle", null)
    
    inline def setCountdownWrapperStyleUndefined: Self = StObject.set(x, "countdownWrapperStyle", js.undefined)
    
    inline def setHourPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "hourPickerStyle", value.asInstanceOf[js.Any])
    
    inline def setHourPickerStyleNull: Self = StObject.set(x, "hourPickerStyle", null)
    
    inline def setHourPickerStyleUndefined: Self = StObject.set(x, "hourPickerStyle", js.undefined)
    
    inline def setHourText(value: String): Self = StObject.set(x, "hourText", value.asInstanceOf[js.Any])
    
    inline def setHourTextUndefined: Self = StObject.set(x, "hourText", js.undefined)
    
    inline def setHourUnitStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "hourUnitStyle", value.asInstanceOf[js.Any])
    
    inline def setHourUnitStyleNull: Self = StObject.set(x, "hourUnitStyle", null)
    
    inline def setHourUnitStyleUndefined: Self = StObject.set(x, "hourUnitStyle", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinutePickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "minutePickerStyle", value.asInstanceOf[js.Any])
    
    inline def setMinutePickerStyleNull: Self = StObject.set(x, "minutePickerStyle", null)
    
    inline def setMinutePickerStyleUndefined: Self = StObject.set(x, "minutePickerStyle", js.undefined)
    
    inline def setMinuteText(value: String): Self = StObject.set(x, "minuteText", value.asInstanceOf[js.Any])
    
    inline def setMinuteTextUndefined: Self = StObject.set(x, "minuteText", js.undefined)
    
    inline def setMinuteUnitStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "minuteUnitStyle", value.asInstanceOf[js.Any])
    
    inline def setMinuteUnitStyleNull: Self = StObject.set(x, "minuteUnitStyle", null)
    
    inline def setMinuteUnitStyleUndefined: Self = StObject.set(x, "minuteUnitStyle", js.undefined)
    
    inline def setOnValueChange(value: /* data */ js.UndefOr[Hour] => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setOnlyone(value: Boolean): Self = StObject.set(x, "onlyone", value.asInstanceOf[js.Any])
    
    inline def setOnlyoneUndefined: Self = StObject.set(x, "onlyone", js.undefined)
    
    inline def setPickerFontColor(value: String): Self = StObject.set(x, "pickerFontColor", value.asInstanceOf[js.Any])
    
    inline def setPickerFontColorUndefined: Self = StObject.set(x, "pickerFontColor", js.undefined)
    
    inline def setPickerUnitColor(value: String): Self = StObject.set(x, "pickerUnitColor", value.asInstanceOf[js.Any])
    
    inline def setPickerUnitColorUndefined: Self = StObject.set(x, "pickerUnitColor", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_onDataChange(value: /* date */ js.Date => Unit): Self = StObject.set(x, "_onDataChange", js.Any.fromFunction1(value))
    
    inline def set_onDataChangeUndefined: Self = StObject.set(x, "_onDataChange", js.undefined)
  }
}
