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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TipsProps extends StObject {
  
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
  implicit class TipsPropsMutableBuilder[Self <: TipsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setCornerPosition(value: topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight): Self = StObject.set(x, "cornerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerPositionUndefined: Self = StObject.set(x, "cornerPosition", js.undefined)
    
    @scala.inline
    def setMotionConfig(
      value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    @scala.inline
    def setMotionType(value: Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCorner(value: Boolean): Self = StObject.set(x, "showCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCornerUndefined: Self = StObject.set(x, "showCorner", js.undefined)
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTipStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tipStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipStyleNull: Self = StObject.set(x, "tipStyle", null)
    
    @scala.inline
    def setTipStyleUndefined: Self = StObject.set(x, "tipStyle", js.undefined)
    
    @scala.inline
    def setWithModal(value: Boolean): Self = StObject.set(x, "withModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithModalUndefined: Self = StObject.set(x, "withModal", js.undefined)
  }
}
