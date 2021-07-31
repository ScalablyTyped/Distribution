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
  
  var activeIdx: js.UndefOr[Double] = js.undefined
  
  var alignContainer: js.UndefOr[top | center | bottom] = js.undefined
  
  var mask: js.UndefOr[Boolean] = js.undefined
  
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var modalChildStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onMaskPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onlyLastModalVisible: js.UndefOr[Boolean] = js.undefined
  
  var useKeyboardView: js.UndefOr[Boolean] = js.undefined
}
object ModalProps {
  
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  
  @scala.inline
  implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIdx(value: Double): Self = StObject.set(x, "activeIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIdxUndefined: Self = StObject.set(x, "activeIdx", js.undefined)
    
    @scala.inline
    def setAlignContainer(value: top | center | bottom): Self = StObject.set(x, "alignContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignContainerUndefined: Self = StObject.set(x, "alignContainer", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskStyleNull: Self = StObject.set(x, "maskStyle", null)
    
    @scala.inline
    def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setModalChildStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "modalChildStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalChildStyleNull: Self = StObject.set(x, "modalChildStyle", null)
    
    @scala.inline
    def setModalChildStyleUndefined: Self = StObject.set(x, "modalChildStyle", js.undefined)
    
    @scala.inline
    def setOnMaskPress(value: () => Unit): Self = StObject.set(x, "onMaskPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMaskPressUndefined: Self = StObject.set(x, "onMaskPress", js.undefined)
    
    @scala.inline
    def setOnlyLastModalVisible(value: Boolean): Self = StObject.set(x, "onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyLastModalVisibleUndefined: Self = StObject.set(x, "onlyLastModalVisible", js.undefined)
    
    @scala.inline
    def setUseKeyboardView(value: Boolean): Self = StObject.set(x, "useKeyboardView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseKeyboardViewUndefined: Self = StObject.set(x, "useKeyboardView", js.undefined)
  }
}
