package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ModalBaseProps
import typings.reactNative.mod.ModalPropsAndroid
import typings.reactNative.mod.ModalPropsIOS
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.fade_
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import typings.tuyaPanelKit.tuyaPanelKitStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps
  extends ViewProps
     with ModalBaseProps
     with ModalPropsIOS
     with ModalPropsAndroid {
  
  var activeIdx: js.UndefOr[Double] = js.native
  
  var alignContainer: js.UndefOr[top | center | bottom] = js.native
  
  @JSName("animationType")
  var animationType_ModalProps: js.UndefOr[fade_ | none_] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var modalChildStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onMaskPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onlyLastModalVisible: js.UndefOr[Boolean] = js.native
  
  var useKeyboardView: js.UndefOr[Boolean] = js.native
}
object ModalProps {
  
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveIdx(value: Double): Self = this.set("activeIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIdx: Self = this.set("activeIdx", js.undefined)
    
    @scala.inline
    def setAlignContainer(value: top | center | bottom): Self = this.set("alignContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignContainer: Self = this.set("alignContainer", js.undefined)
    
    @scala.inline
    def setAnimationType(value: fade_ | none_): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskStyle(value: StyleProp[ViewStyle]): Self = this.set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskStyle: Self = this.set("maskStyle", js.undefined)
    
    @scala.inline
    def setMaskStyleNull: Self = this.set("maskStyle", null)
    
    @scala.inline
    def setModalChildStyle(value: StyleProp[ViewStyle]): Self = this.set("modalChildStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalChildStyle: Self = this.set("modalChildStyle", js.undefined)
    
    @scala.inline
    def setModalChildStyleNull: Self = this.set("modalChildStyle", null)
    
    @scala.inline
    def setOnMaskPress(value: () => Unit): Self = this.set("onMaskPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMaskPress: Self = this.set("onMaskPress", js.undefined)
    
    @scala.inline
    def setOnlyLastModalVisible(value: Boolean): Self = this.set("onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyLastModalVisible: Self = this.set("onlyLastModalVisible", js.undefined)
    
    @scala.inline
    def setUseKeyboardView(value: Boolean): Self = this.set("useKeyboardView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseKeyboardView: Self = this.set("useKeyboardView", js.undefined)
  }
}
