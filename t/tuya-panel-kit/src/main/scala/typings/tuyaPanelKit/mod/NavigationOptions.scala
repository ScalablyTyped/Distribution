package typings.tuyaPanelKit.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Uri
import typings.tuyaPanelKit.themeMod.LinearGradientBackground
import typings.tuyaPanelKit.themeMod.RadialGradientBackground
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions extends StObject {
  
  /**
    * 自定义面板背景
    * @label `number` 渲染本地图片
    * @label `string` 渲染颜色
    * @label `{ uri: string }` 渲染网络图片
    * @label `RadialGradientBackground` 渲染径向渐变
    * @label `LinearGradientBackground` 渲染线性渐变
    *
    */
  var background: js.UndefOr[
    Double | String | Uri | RadialGradientBackground | (LinearGradientBackground & LinearGradientBackgroundOffset)
  ] = js.undefined
  
  /**
    * 自定义面板背景样式
    */
  var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * 是否启用首页手势返回 app 列表页面
    * @defaultValueValue true
    */
  var enablePopGesture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否允许手势
    */
  var gesture: js.UndefOr[Boolean] = js.undefined
  
  var hideTopbar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @desc 蓝牙离线提示是否覆盖整个面板(除头部栏外)
    * @defaultValueValue true
    */
  var isBleOfflineOverlay: js.UndefOr[Boolean] = js.undefined
  
  var params: js.UndefOr[js.Object] = js.undefined
  
  /**
    * 自定义渲染状态栏
    */
  var renderStatusBar: js.UndefOr[js.Function0[Element]] = js.undefined
  
  /**
    * 自定义渲染头部栏
    */
  var renderTopBar: js.UndefOr[js.Function0[Element]] = js.undefined
  
  /**
    * 控制是否显示离线遮罩
    * @defaultValueValue true
    */
  var showOfflineView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 容器样式
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * 自定义头部栏标题
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * 自定义头部栏样式
    */
  var topbarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * 自定义头部栏文字样式
    */
  var topbarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object NavigationOptions {
  
  inline def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  
  extension [Self <: NavigationOptions](x: Self) {
    
    inline def setBackground(
      value: Double | String | Uri | RadialGradientBackground | (LinearGradientBackground & LinearGradientBackgroundOffset)
    ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStyleNull: Self = StObject.set(x, "backgroundStyle", null)
    
    inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setEnablePopGesture(value: Boolean): Self = StObject.set(x, "enablePopGesture", value.asInstanceOf[js.Any])
    
    inline def setEnablePopGestureUndefined: Self = StObject.set(x, "enablePopGesture", js.undefined)
    
    inline def setGesture(value: Boolean): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
    
    inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
    
    inline def setHideTopbar(value: Boolean): Self = StObject.set(x, "hideTopbar", value.asInstanceOf[js.Any])
    
    inline def setHideTopbarUndefined: Self = StObject.set(x, "hideTopbar", js.undefined)
    
    inline def setIsBleOfflineOverlay(value: Boolean): Self = StObject.set(x, "isBleOfflineOverlay", value.asInstanceOf[js.Any])
    
    inline def setIsBleOfflineOverlayUndefined: Self = StObject.set(x, "isBleOfflineOverlay", js.undefined)
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRenderStatusBar(value: () => Element): Self = StObject.set(x, "renderStatusBar", js.Any.fromFunction0(value))
    
    inline def setRenderStatusBarUndefined: Self = StObject.set(x, "renderStatusBar", js.undefined)
    
    inline def setRenderTopBar(value: () => Element): Self = StObject.set(x, "renderTopBar", js.Any.fromFunction0(value))
    
    inline def setRenderTopBarUndefined: Self = StObject.set(x, "renderTopBar", js.undefined)
    
    inline def setShowOfflineView(value: Boolean): Self = StObject.set(x, "showOfflineView", value.asInstanceOf[js.Any])
    
    inline def setShowOfflineViewUndefined: Self = StObject.set(x, "showOfflineView", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopbarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "topbarStyle", value.asInstanceOf[js.Any])
    
    inline def setTopbarStyleNull: Self = StObject.set(x, "topbarStyle", null)
    
    inline def setTopbarStyleUndefined: Self = StObject.set(x, "topbarStyle", js.undefined)
    
    inline def setTopbarTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "topbarTextStyle", value.asInstanceOf[js.Any])
    
    inline def setTopbarTextStyleNull: Self = StObject.set(x, "topbarTextStyle", null)
    
    inline def setTopbarTextStyleUndefined: Self = StObject.set(x, "topbarTextStyle", js.undefined)
  }
}
