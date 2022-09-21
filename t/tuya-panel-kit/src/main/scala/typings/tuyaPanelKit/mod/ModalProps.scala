package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalProps
  extends StObject
     with typings.reactNative.mod.ModalProps {
  
  /**
    * @language zh-CN
    * @description 当前的 idx
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description current idx
    * @defaultValue undefined
    */
  var activeIdx: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description modal默认出现的位置
    * @defaultValue 'bottom'
    */
  /**
    * @language en-US
    * @description The default position of the mask
    * @defaultValue 'bottom'
    */
  var alignContainer: js.UndefOr[top | center | bottom] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否有遮罩层
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether there is a mask layer
    * @defaultValue true
    */
  var mask: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 遮罩层样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Style of the mask layer
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description modal 弹出内容的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Content style of modal pop-up
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var modalChildStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 点击遮罩回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of clicking mask
    * @defaultValue () => {}
    */
  var onMaskPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否只显示最后一个弹出的 modal
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to show only the last pop-up modal
    * @defaultValue true
    */
  var onlyLastModalVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否弹出键盘自适应
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to pop up the keyboard adaptive
    * @defaultValue false
    */
  var useKeyboardView: js.UndefOr[Boolean] = js.undefined
}
object ModalProps {
  
  inline def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  
  extension [Self <: ModalProps](x: Self) {
    
    inline def setActiveIdx(value: Double): Self = StObject.set(x, "activeIdx", value.asInstanceOf[js.Any])
    
    inline def setActiveIdxUndefined: Self = StObject.set(x, "activeIdx", js.undefined)
    
    inline def setAlignContainer(value: top | center | bottom): Self = StObject.set(x, "alignContainer", value.asInstanceOf[js.Any])
    
    inline def setAlignContainerUndefined: Self = StObject.set(x, "alignContainer", js.undefined)
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
    
    inline def setMaskStyleNull: Self = StObject.set(x, "maskStyle", null)
    
    inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setModalChildStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "modalChildStyle", value.asInstanceOf[js.Any])
    
    inline def setModalChildStyleNull: Self = StObject.set(x, "modalChildStyle", null)
    
    inline def setModalChildStyleUndefined: Self = StObject.set(x, "modalChildStyle", js.undefined)
    
    inline def setOnMaskPress(value: () => Unit): Self = StObject.set(x, "onMaskPress", js.Any.fromFunction0(value))
    
    inline def setOnMaskPressUndefined: Self = StObject.set(x, "onMaskPress", js.undefined)
    
    inline def setOnlyLastModalVisible(value: Boolean): Self = StObject.set(x, "onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    inline def setOnlyLastModalVisibleUndefined: Self = StObject.set(x, "onlyLastModalVisible", js.undefined)
    
    inline def setUseKeyboardView(value: Boolean): Self = StObject.set(x, "useKeyboardView", value.asInstanceOf[js.Any])
    
    inline def setUseKeyboardViewUndefined: Self = StObject.set(x, "useKeyboardView", js.undefined)
  }
}
