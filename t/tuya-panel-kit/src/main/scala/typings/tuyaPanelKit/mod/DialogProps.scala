package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typings.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typings.tuyaPanelKit.tuyaPanelKitStrings.PushDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typings.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogProps extends StObject {
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var motionConfig: js.UndefOr[
    MotionFadeProps | MotionPullUpProps | MotionScaleFadeInProps | MotionScalePullDownProps | MotionPushDownProps
  ] = js.undefined
  
  var motionType: js.UndefOr[none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown | PushDown] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var subTitle: js.UndefOr[String] = js.undefined
  
  var subTitleStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var title: String
  
  var titleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object DialogProps {
  
  @scala.inline
  def apply(title: String): DialogProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  
  @scala.inline
  implicit class DialogPropsMutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setMotionConfig(
      value: MotionFadeProps | MotionPullUpProps | MotionScaleFadeInProps | MotionScalePullDownProps | MotionPushDownProps
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    @scala.inline
    def setMotionType(value: none_ | ScaleFadeIn | Fade | PullUp | ScalePullDown | PushDown): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "subTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleStyleNull: Self = StObject.set(x, "subTitleStyle", null)
    
    @scala.inline
    def setSubTitleStyleUndefined: Self = StObject.set(x, "subTitleStyle", js.undefined)
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
  }
}
