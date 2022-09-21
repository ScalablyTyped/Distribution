package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderProgressProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "SliderProgress"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "SliderProgress"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 限制可触摸的区域
    * @defaultValue 4
    */
  /**
    * @language en-US
    * @description Restrict the touchable area
    * @defaultValue 4
    */
  var activeBase: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 激活状态的颜色
    * @defaultValue '#5E719F'
    */
  /**
    * @language en-US
    * @description color of active state
    * @defaultValue '#5E719F'
    */
  var activeColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 禁用
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description disabled
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否允许点击更改值
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to allow clicking to change the value
    * @defaultValue true
    */
  var ifAllowClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 未激活状态的颜色
    * @defaultValue 'rgba(94,113,159,0.2)'
    */
  /**
    * @language en-US
    * @description color of inactive state
    * @defaultValue 'rgba(94,113,159,0.2)'
    */
  var inactiveColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最大值
    * @defaultValue 100
    */
  /**
    * @language en-US
    * @description max value
    * @defaultValue 100
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 最小值
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description min value
    * @defaultValue 0
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 完成的回调函数
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description callback function of complete
    * @defaultValue () => {}
    */
  var onComplete: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 值改变的回调函数
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description callback function of value change
    * @defaultValue () => {}
    */
  var onValueChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内容样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Container Style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑块宽度
    * @defaultValue 4
    */
  /**
    * @language en-US
    * @description width of thumb
    * @defaultValue 4
    */
  var thumbWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 值
    * @defaultValue 10
    */
  /**
    * @language en-US
    * @description value
    * @defaultValue 10
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object SliderProgressProps {
  
  inline def apply(): SliderProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProgressProps]
  }
  
  extension [Self <: SliderProgressProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setActiveBase(value: Double): Self = StObject.set(x, "activeBase", value.asInstanceOf[js.Any])
    
    inline def setActiveBaseUndefined: Self = StObject.set(x, "activeBase", js.undefined)
    
    inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIfAllowClick(value: Boolean): Self = StObject.set(x, "ifAllowClick", value.asInstanceOf[js.Any])
    
    inline def setIfAllowClickUndefined: Self = StObject.set(x, "ifAllowClick", js.undefined)
    
    inline def setInactiveColor(value: String): Self = StObject.set(x, "inactiveColor", value.asInstanceOf[js.Any])
    
    inline def setInactiveColorUndefined: Self = StObject.set(x, "inactiveColor", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOnComplete(value: /* repeated */ Any => Any): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnValueChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setThumbWidth(value: Double): Self = StObject.set(x, "thumbWidth", value.asInstanceOf[js.Any])
    
    inline def setThumbWidthUndefined: Self = StObject.set(x, "thumbWidth", js.undefined)
    
    inline def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
