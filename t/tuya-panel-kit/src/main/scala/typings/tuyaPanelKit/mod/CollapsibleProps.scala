package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 子元素对齐方式
    * @defaultValue 'top'
    */
  /**
    * @language en-US
    * @description Alignment of child elements
    * @defaultValue 'top'
    */
  var align: js.UndefOr[top | center | bottom] = js.undefined
  
  /**
    * @language zh-CN
    * @description 嵌套子元素
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Nested sub elements
    * @defaultValue null
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否折叠
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is it folded
    * @defaultValue true
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 需要折叠的高度
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Height to be folded
    * @defaultValue 0
    */
  var collapsedHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 折叠动画时长
    * @defaultValue 300
    */
  /**
    * @language en-US
    * @description How long does the animation take to collapse
    * @defaultValue 300
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画缓动函数
    * @defaultValue 'EaseOutCubic'
    */
  /**
    * @language en-US
    * @description Animation function
    * @defaultValue 'EaseOutCubic'
    */
  var easing: js.UndefOr[String | js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 变更回调函数
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Change callback function
    * @defaultValue () => {}
    */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 容器样式
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
object CollapsibleProps {
  
  inline def apply(): CollapsibleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapsibleProps] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedHeight(value: Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
    
    inline def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String | js.Function0[Unit]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction0(value: () => Unit): Self = StObject.set(x, "easing", js.Any.fromFunction0(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
