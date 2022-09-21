package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogCancelProps extends StObject {
  
  /**
    * @language zh-CN
    * @description 测试标志
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Test flag
    * @defaultValue ''
    */
  var cancelAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 取消文字
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Cancellation text
    * @defaultValue null
    */
  var cancelText: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 取消文字样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Cancellation text style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 取消点击回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of clicking the cancel button
    * @defaultValue () => {}
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DialogCancelProps {
  
  inline def apply(): DialogCancelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogCancelProps]
  }
  
  extension [Self <: DialogCancelProps](x: Self) {
    
    inline def setCancelAccessibilityLabel(value: String): Self = StObject.set(x, "cancelAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelAccessibilityLabelUndefined: Self = StObject.set(x, "cancelAccessibilityLabel", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "cancelTextStyle", value.asInstanceOf[js.Any])
    
    inline def setCancelTextStyleNull: Self = StObject.set(x, "cancelTextStyle", null)
    
    inline def setCancelTextStyleUndefined: Self = StObject.set(x, "cancelTextStyle", js.undefined)
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
  }
}
