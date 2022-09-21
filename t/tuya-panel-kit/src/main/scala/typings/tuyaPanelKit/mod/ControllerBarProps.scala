package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.alpha
import typings.tuyaPanelKit.tuyaPanelKitStrings.large
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.primary
import typings.tuyaPanelKit.tuyaPanelKitStrings.pure
import typings.tuyaPanelKit.tuyaPanelKitStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControllerBarProps
  extends StObject
     with ViewProps {
  
  /**
    * @language zh-CN
    * @description 背景颜色
    * @defaultValue '#fff'
    */
  /**
    * @language en-US
    * @description Background color
    * @defaultValue '#fff'
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 背景的透明类型
    * @defaultValue 'pure'
    */
  /**
    * @language en-US
    * @description Transparent type of background
    * @defaultValue 'pure'
    */
  var backgroundType: js.UndefOr[alpha | pure] = js.undefined
  
  /**
    * @language zh-CN
    * @description 底部栏内的按钮
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Buttons in the controllerBar
    * @defaultValue undefined
    */
  var button: js.Array[ButtonProps]
  
  /**
    * @language zh-CN
    * @description 底部是否有边框
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether there is a border at the bottom
    * @defaultValue false
    */
  var hasBottomBorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮大小
    * @defaultValue 'normal'
    */
  /**
    * @language en-US
    * @description The size of the button
    * @defaultValue 'normal'
    */
  var size: js.UndefOr[large | normal | small | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮是否跟随父容器拉伸
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Does the size of the button follow the stretch of the parent container
    * @defaultValue true
    */
  var stretch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 按钮背景类型
    * @defaultValue 'normal'
    */
  /**
    * @language en-US
    * @description The background type of the button
    * @defaultValue 'normal'
    */
  var `type`: js.UndefOr[primary | normal] = js.undefined
  
  /**
    * @language zh-CN
    * @description 包裹按钮的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description The style of the parcel button
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue {}
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ControllerBarProps {
  
  inline def apply(button: js.Array[ButtonProps]): ControllerBarProps = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerBarProps]
  }
  
  extension [Self <: ControllerBarProps](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundType(value: alpha | pure): Self = StObject.set(x, "backgroundType", value.asInstanceOf[js.Any])
    
    inline def setBackgroundTypeUndefined: Self = StObject.set(x, "backgroundType", js.undefined)
    
    inline def setButton(value: js.Array[ButtonProps]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonVarargs(value: ButtonProps*): Self = StObject.set(x, "button", js.Array(value*))
    
    inline def setHasBottomBorder(value: Boolean): Self = StObject.set(x, "hasBottomBorder", value.asInstanceOf[js.Any])
    
    inline def setHasBottomBorderUndefined: Self = StObject.set(x, "hasBottomBorder", js.undefined)
    
    inline def setSize(value: large | normal | small | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setType(value: primary | normal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
