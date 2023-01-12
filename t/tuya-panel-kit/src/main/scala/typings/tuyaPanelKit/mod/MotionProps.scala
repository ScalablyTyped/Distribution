package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 动画配置参数
    * @defaultValue { duration: 300, delay: 0, isInteraction: true, useNativeDriver: true }
    */
  /**
    * @language en-US
    * @description Animation configuration parameters
    * @defaultValue { duration: 300, delay: 0, isInteraction: true, useNativeDriver: true }
    */
  var animationConfig: js.UndefOr[Delay] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义内容
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Custom content
    * @defaultValue undefined
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画隐藏时长
    * @defaultValue 300
    */
  /**
    * @language en-US
    * @description Animation hide duration
    * @defaultValue 300
    */
  var hideDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画隐藏回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Animation hide callback
    * @defaultValue () => {}
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画显示回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Animation display callback
    * @defaultValue () => {}
    */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示内容
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Display content?
    * @defaultValue undefined
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画显示时长
    * @defaultValue 300
    */
  /**
    * @language en-US
    * @description Animation display duration
    * @defaultValue 300
    */
  var showDuration: js.UndefOr[Double] = js.undefined
  
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
}
object MotionProps {
  
  inline def apply(): MotionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionProps] (val x: Self) extends AnyVal {
    
    inline def setAnimationConfig(value: Delay): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    inline def setHideDurationUndefined: Self = StObject.set(x, "hideDuration", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    inline def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
