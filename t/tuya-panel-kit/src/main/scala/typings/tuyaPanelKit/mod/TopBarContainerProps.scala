package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.themeMod.BackgroundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopBarContainerProps extends StObject {
  
  /**
    * @language zh-CN
    * @description TopBar.Container容器的背景， 可为颜色或者渐变，渐变的格式可参考LinearGradient 或 RadialGradient
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/aa5f210a2f10112b55b3faf9457e312badebce86/types/tuya-panel-kit/theme.d.ts#L145">BackgroundProps</a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The background of the top toolbar container, which can be a solid color or a gradient color.
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/aa5f210a2f10112b55b3faf9457e312badebce86/types/tuya-panel-kit/theme.d.ts#L145">BackgroundProps</a>
    * @defaultValue null
    */
  var background: js.UndefOr[BackgroundProps] = js.undefined
  
  /**
    * @language zh-CN
    * @description TopBar.Container容器主体的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The style of the container content of the top toolbar.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description TopBar.Container 的容器样式 内部处理了IOS、IPhoneX及安卓端三种StatusBar的情况，如果不需要StatusBar可以自行定义样式。
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The container style of the top toolbar internally handles the three StatusBar situations of iOS versions below and above iPhoneX, and Android. You can also define your own style.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object TopBarContainerProps {
  
  inline def apply(): TopBarContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBarContainerProps]
  }
  
  extension [Self <: TopBarContainerProps](x: Self) {
    
    inline def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
