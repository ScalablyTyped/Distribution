package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeoutProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标识
    * @defaultValue "Swipeout"
    */
  /**
    * @language en-US
    * @description Test identification
    * @defaultValue "Swipeout"
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否自动关闭
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Auto close
    * @defaultValue undefined
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 背景颜色
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description BackgroundColor
    * @defaultValue undefined
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 侧滑之后出现按钮的宽度
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Width of the button that appears after swipeout.
    * @defaultValue undefined
    */
  var buttonWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 当 close 从 false 变为 true 时，会隐藏所有侧滑操作按钮。反过来 true 变为 false 无任何变化。
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description When close changes from false to true, all sideslip operation buttons are hidden. Conversely, true changes to false without any change.
    * @defaultValue undefined
    */
  var close: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否禁用 Swipeout 所提供的侧滑操作
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to disable the swipeout operation.
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 往左滑出现的按钮
    * @types <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/master/types/tuya-panel-kit/index.d.ts#L2536'>SwipeoutAction[]</a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Swipeout buttons on the left.
    * @types <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/master/types/tuya-panel-kit/index.d.ts#L2536'>SwipeoutAction[]</a>
    * @defaultValue undefined
    */
  var left: js.UndefOr[js.Array[SwipeoutAction]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 任意一侧按钮全隐藏的回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Callback for full display of buttons on either side
    * @defaultValue undefined
    */
  var onClose: js.UndefOr[
    js.Function2[/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 任意一侧按钮全显示的回调
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Callback for full display of buttons on either side
    * @defaultValue undefined
    */
  var onOpen: js.UndefOr[
    js.Function2[/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  /**
    * @language zh-CN
    * @description 往右滑出现的按钮
    * @types <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/3a07a00d4e5e3400adeee9c4857b5799d41e53d7/types/tuya-panel-kit/index.d.ts#L6245'>SwipeoutAction[]</a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Swipeout buttons on the right.
    * @types <a target='_blank' href='https://github.com/tuya/DefinitelyTyped/blob/3a07a00d4e5e3400adeee9c4857b5799d41e53d7/types/tuya-panel-kit/index.d.ts#L6245'>SwipeoutAction[]</a>
    * @defaultValue undefined
    */
  var right: js.UndefOr[js.Array[SwipeoutAction]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 行 ID
    * @defaultValue -1
    */
  /**
    * @language en-US
    * @description Row ID
    * @defaultValue -1
    */
  var rowID: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 滑动回调函数
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Sliding callback function
    * @defaultValue undefined
    */
  var scroll: js.UndefOr[js.Function1[/* value */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分区 Id
    * @defaultValue -1
    */
  /**
    * @language en-US
    * @description Section ID
    * @defaultValue -1
    */
  var sectionID: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 侧滑的距离
    * @defaultValue 50
    */
  /**
    * @language en-US
    * @description Side slip distance
    * @defaultValue 50
    */
  var sensitivity: js.UndefOr[Double] = js.undefined
  
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
}
object SwipeoutProps {
  
  inline def apply(): SwipeoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwipeoutProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setButtonWidth(value: Double): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
    
    inline def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
    
    inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLeft(value: js.Array[SwipeoutAction]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLeftVarargs(value: SwipeoutAction*): Self = StObject.set(x, "left", js.Array(value*))
    
    inline def setOnClose(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setRight(value: js.Array[SwipeoutAction]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRightVarargs(value: SwipeoutAction*): Self = StObject.set(x, "right", js.Array(value*))
    
    inline def setRowID(value: Double): Self = StObject.set(x, "rowID", value.asInstanceOf[js.Any])
    
    inline def setRowIDUndefined: Self = StObject.set(x, "rowID", js.undefined)
    
    inline def setScroll(value: /* value */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSectionID(value: Double): Self = StObject.set(x, "sectionID", value.asInstanceOf[js.Any])
    
    inline def setSectionIDUndefined: Self = StObject.set(x, "sectionID", js.undefined)
    
    inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
