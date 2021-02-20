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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions extends StObject {
  
  /**
    * @desc 自定义面板背景
    * number: 渲染本地图片
    * string: 渲染颜色
    * { uri: string }: 渲染网络图片
    * RadialGradientBackground: 渲染径向渐变
    * LinearGradientBackground: 渲染线性渐变
    *
    */
  var background: js.UndefOr[
    Double | String | Uri | RadialGradientBackground | (LinearGradientBackground with LinearGradientBackgroundOffset)
  ] = js.native
  
  /**
    * @desc 自定义面板背景样式
    */
  var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * @desc 是否启用首页手势返回 app 列表页面
    * @default true
    */
  var enablePopGesture: js.UndefOr[Boolean] = js.native
  
  var gesture: js.UndefOr[Boolean] = js.native
  
  var hideTopbar: js.UndefOr[Boolean] = js.native
  
  /**
    * @desc 蓝牙离线提示是否覆盖整个面板(除头部栏外)
    * @default true
    */
  var isBleOfflineOverlay: js.UndefOr[Boolean] = js.native
  
  /**
    * @desc 自定义渲染状态栏
    */
  var renderStatusBar: js.UndefOr[js.Function0[Element]] = js.native
  
  /**
    * @desc 自定义渲染头部栏
    */
  var renderTopBar: js.UndefOr[js.Function0[Element]] = js.native
  
  /**
    * @desc 控制是否显示离线遮罩
    * @default true
    */
  var showOfflineView: js.UndefOr[Boolean] = js.native
  
  /**
    * @desc 自定义头部栏标题
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * @desc 自定义头部栏样式
    */
  var topbarStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * @desc 自定义头部栏文字样式
    */
  var topbarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object NavigationOptions {
  
  @scala.inline
  def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  
  @scala.inline
  implicit class NavigationOptionsMutableBuilder[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(
      value: Double | String | Uri | RadialGradientBackground | (LinearGradientBackground with LinearGradientBackgroundOffset)
    ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundStyleNull: Self = StObject.set(x, "backgroundStyle", null)
    
    @scala.inline
    def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setEnablePopGesture(value: Boolean): Self = StObject.set(x, "enablePopGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePopGestureUndefined: Self = StObject.set(x, "enablePopGesture", js.undefined)
    
    @scala.inline
    def setGesture(value: Boolean): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
    
    @scala.inline
    def setHideTopbar(value: Boolean): Self = StObject.set(x, "hideTopbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTopbarUndefined: Self = StObject.set(x, "hideTopbar", js.undefined)
    
    @scala.inline
    def setIsBleOfflineOverlay(value: Boolean): Self = StObject.set(x, "isBleOfflineOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBleOfflineOverlayUndefined: Self = StObject.set(x, "isBleOfflineOverlay", js.undefined)
    
    @scala.inline
    def setRenderStatusBar(value: () => Element): Self = StObject.set(x, "renderStatusBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderStatusBarUndefined: Self = StObject.set(x, "renderStatusBar", js.undefined)
    
    @scala.inline
    def setRenderTopBar(value: () => Element): Self = StObject.set(x, "renderTopBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderTopBarUndefined: Self = StObject.set(x, "renderTopBar", js.undefined)
    
    @scala.inline
    def setShowOfflineView(value: Boolean): Self = StObject.set(x, "showOfflineView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOfflineViewUndefined: Self = StObject.set(x, "showOfflineView", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTopbarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "topbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopbarStyleNull: Self = StObject.set(x, "topbarStyle", null)
    
    @scala.inline
    def setTopbarStyleUndefined: Self = StObject.set(x, "topbarStyle", js.undefined)
    
    @scala.inline
    def setTopbarTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "topbarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopbarTextStyleNull: Self = StObject.set(x, "topbarTextStyle", null)
    
    @scala.inline
    def setTopbarTextStyleUndefined: Self = StObject.set(x, "topbarTextStyle", js.undefined)
  }
}
