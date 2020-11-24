package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typings.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typings.tuyaPanelKit.tuyaPanelKitStrings.PushDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogProps extends js.Object {
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var motionConfig: js.UndefOr[
    MotionFadeProps | MotionPullUpProps | MotionScaleFadeInProps | MotionScalePullDownProps | MotionPushDownProps
  ] = js.native
  
  var motionType: js.UndefOr[none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown | PushDown] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var subTitleStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var title: String = js.native
  
  var titleNumberOfLines: js.UndefOr[Double] = js.native
  
  var titleStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object DialogProps {
  
  @scala.inline
  def apply(title: String): DialogProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  
  @scala.inline
  implicit class DialogPropsOps[Self <: DialogProps] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setContentStyleNull: Self = this.set("contentStyle", null)
    
    @scala.inline
    def setMotionConfig(
      value: MotionFadeProps | MotionPullUpProps | MotionScaleFadeInProps | MotionScalePullDownProps | MotionPushDownProps
    ): Self = this.set("motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionConfig: Self = this.set("motionConfig", js.undefined)
    
    @scala.inline
    def setMotionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown | PushDown): Self = this.set("motionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionType: Self = this.set("motionType", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setSubTitleStyle(value: StyleProp[ViewStyle]): Self = this.set("subTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitleStyle: Self = this.set("subTitleStyle", js.undefined)
    
    @scala.inline
    def setSubTitleStyleNull: Self = this.set("subTitleStyle", null)
    
    @scala.inline
    def setTitleNumberOfLines(value: Double): Self = this.set("titleNumberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleNumberOfLines: Self = this.set("titleNumberOfLines", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[ViewStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
  }
}
