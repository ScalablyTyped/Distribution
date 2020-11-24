package typings.tuyaPanelKit.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Uri
import typings.tuyaPanelKit.themeMod.LinearGradientBackground
import typings.tuyaPanelKit.themeMod.RadialGradientBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions extends js.Object {
  
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
  implicit class NavigationOptionsOps[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    
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
    def setBackground(
      value: Double | String | Uri | RadialGradientBackground | (LinearGradientBackground with LinearGradientBackgroundOffset)
    ): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundStyle(value: StyleProp[ViewStyle]): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundStyle: Self = this.set("backgroundStyle", js.undefined)
    
    @scala.inline
    def setBackgroundStyleNull: Self = this.set("backgroundStyle", null)
    
    @scala.inline
    def setEnablePopGesture(value: Boolean): Self = this.set("enablePopGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePopGesture: Self = this.set("enablePopGesture", js.undefined)
    
    @scala.inline
    def setGesture(value: Boolean): Self = this.set("gesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGesture: Self = this.set("gesture", js.undefined)
    
    @scala.inline
    def setHideTopbar(value: Boolean): Self = this.set("hideTopbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTopbar: Self = this.set("hideTopbar", js.undefined)
    
    @scala.inline
    def setIsBleOfflineOverlay(value: Boolean): Self = this.set("isBleOfflineOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBleOfflineOverlay: Self = this.set("isBleOfflineOverlay", js.undefined)
    
    @scala.inline
    def setRenderStatusBar(value: () => Element): Self = this.set("renderStatusBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderStatusBar: Self = this.set("renderStatusBar", js.undefined)
    
    @scala.inline
    def setRenderTopBar(value: () => Element): Self = this.set("renderTopBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderTopBar: Self = this.set("renderTopBar", js.undefined)
    
    @scala.inline
    def setShowOfflineView(value: Boolean): Self = this.set("showOfflineView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOfflineView: Self = this.set("showOfflineView", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTopbarStyle(value: StyleProp[ViewStyle]): Self = this.set("topbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopbarStyle: Self = this.set("topbarStyle", js.undefined)
    
    @scala.inline
    def setTopbarStyleNull: Self = this.set("topbarStyle", null)
    
    @scala.inline
    def setTopbarTextStyle(value: StyleProp[TextStyle]): Self = this.set("topbarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopbarTextStyle: Self = this.set("topbarTextStyle", js.undefined)
    
    @scala.inline
    def setTopbarTextStyleNull: Self = this.set("topbarTextStyle", null)
  }
}
