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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TipsProps extends StObject {
  
  var bgColor: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var cornerPosition: js.UndefOr[topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight] = js.undefined
  
  var motionConfig: js.UndefOr[
    MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
  ] = js.undefined
  
  var motionType: js.UndefOr[Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var showCorner: js.UndefOr[Boolean] = js.undefined
  
  var tipStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var withModal: js.UndefOr[Boolean] = js.undefined
}
object TipsProps {
  
  inline def apply(): TipsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TipsProps]
  }
  
  extension [Self <: TipsProps](x: Self) {
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setCornerPosition(value: topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight): Self = StObject.set(x, "cornerPosition", value.asInstanceOf[js.Any])
    
    inline def setCornerPositionUndefined: Self = StObject.set(x, "cornerPosition", js.undefined)
    
    inline def setMotionConfig(
      value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setMotionType(value: Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown): Self = StObject.set(x, "motionType", value.asInstanceOf[js.Any])
    
    inline def setMotionTypeUndefined: Self = StObject.set(x, "motionType", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowCorner(value: Boolean): Self = StObject.set(x, "showCorner", value.asInstanceOf[js.Any])
    
    inline def setShowCornerUndefined: Self = StObject.set(x, "showCorner", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTipStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tipStyle", value.asInstanceOf[js.Any])
    
    inline def setTipStyleNull: Self = StObject.set(x, "tipStyle", null)
    
    inline def setTipStyleUndefined: Self = StObject.set(x, "tipStyle", js.undefined)
    
    inline def setWithModal(value: Boolean): Self = StObject.set(x, "withModal", value.asInstanceOf[js.Any])
    
    inline def setWithModalUndefined: Self = StObject.set(x, "withModal", js.undefined)
  }
}
