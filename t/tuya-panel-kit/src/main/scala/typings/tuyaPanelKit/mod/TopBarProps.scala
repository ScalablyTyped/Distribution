package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Color
import typings.tuyaPanelKit.themeMod.BackgroundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopBarProps
  extends StObject
     with TopBarContentProps {
  
  /**
    * @language zh-CN
    * @description TopBar的右工具栏配置
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2740">TopBarActionProps[]</a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The right toolbar configuration of TopBar.
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2740">TopBarActionProps[]</a>
    * @defaultValue null
    */
  var actions: js.UndefOr[js.Array[TopBarActionProps]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 顶部工具栏容器的背景，可以是纯色或渐变色。
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
    * @description 顶部工具栏的容器内容的样式
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The style of the container content of the top toolbar.
    * @defaultValue null
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description TopBar的左工具栏配置。如果它为空，它将呈现iOS和Android的默认返回按钮。
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2740">TopBarActionProps[]</a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The left toolbar configuration of TopBar. If it is null, it will render the default return buttons for iOS and Android.
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/299b2dd5a2ac708ca9464aba3685300acb7c865c/types/tuya-panel-kit/index.d.ts#L2740">TopBarActionProps[]</a>
    * @defaultValue null
    */
  var leftActions: js.UndefOr[js.Array[TopBarActionProps]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 返回按钮的回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of back
    * @defaultValue () => {}
    */
  var onBack: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 头部栏主题
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description TopBar theme
    * @defaultValue null
    */
  var theme: js.UndefOr[Color] = js.undefined
}
object TopBarProps {
  
  inline def apply(): TopBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBarProps]
  }
  
  extension [Self <: TopBarProps](x: Self) {
    
    inline def setActions(value: js.Array[TopBarActionProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: TopBarActionProps*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setLeftActions(value: js.Array[TopBarActionProps]): Self = StObject.set(x, "leftActions", value.asInstanceOf[js.Any])
    
    inline def setLeftActionsUndefined: Self = StObject.set(x, "leftActions", js.undefined)
    
    inline def setLeftActionsVarargs(value: TopBarActionProps*): Self = StObject.set(x, "leftActions", js.Array(value*))
    
    inline def setOnBack(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
    
    inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
    
    inline def setTheme(value: Color): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
