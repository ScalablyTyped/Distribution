package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typings.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typings.tuyaPanelKit.tuyaPanelKitStrings.PushDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottomCenter
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottomLeft
import typings.tuyaPanelKit.tuyaPanelKitStrings.bottomRight
import typings.tuyaPanelKit.tuyaPanelKitStrings.topCenter
import typings.tuyaPanelKit.tuyaPanelKitStrings.topLeft
import typings.tuyaPanelKit.tuyaPanelKitStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TipsProps extends js.Object {
  
  var bgColor: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var cornerPosition: js.UndefOr[topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight] = js.native
  
  var motionConfig: js.UndefOr[
    MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
  ] = js.native
  
  var motionType: js.UndefOr[Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var showCorner: js.UndefOr[Boolean] = js.native
  
  var tipStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var withModal: js.UndefOr[Boolean] = js.native
}
object TipsProps {
  
  @scala.inline
  def apply(): TipsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TipsProps]
  }
  
  @scala.inline
  implicit class TipsPropsOps[Self <: TipsProps] (val x: Self) extends AnyVal {
    
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
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setContentStyleNull: Self = this.set("contentStyle", null)
    
    @scala.inline
    def setCornerPosition(value: topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight): Self = this.set("cornerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerPosition: Self = this.set("cornerPosition", js.undefined)
    
    @scala.inline
    def setMotionConfig(
      value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
    ): Self = this.set("motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionConfig: Self = this.set("motionConfig", js.undefined)
    
    @scala.inline
    def setMotionType(value: Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown): Self = this.set("motionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionType: Self = this.set("motionType", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowCorner(value: Boolean): Self = this.set("showCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCorner: Self = this.set("showCorner", js.undefined)
    
    @scala.inline
    def setTipStyle(value: StyleProp[ViewStyle]): Self = this.set("tipStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipStyle: Self = this.set("tipStyle", js.undefined)
    
    @scala.inline
    def setTipStyleNull: Self = this.set("tipStyle", null)
    
    @scala.inline
    def setWithModal(value: Boolean): Self = this.set("withModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithModal: Self = this.set("withModal", js.undefined)
  }
}
