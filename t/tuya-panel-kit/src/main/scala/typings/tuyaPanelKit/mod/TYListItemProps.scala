package typings.tuyaPanelKit.mod

import typings.reactNative.mod.TouchableOpacityProps
import typings.tuyaPanelKit.anon.CellBg
import typings.tuyaPanelKit.anon.Container
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.iconfont
import typings.tuyaPanelKit.tuyaPanelKitStrings.image
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TYListItemProps
  extends StObject
     with TouchableOpacityProps {
  
  /**
    * @language zh-CN
    * @description 右侧 Action 具体值，当类型为 string时，默认使用 TYText
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Specific value of action on the right. When the type is string, TYText is used by default
    * @defaultValue null
    */
  var Action: js.UndefOr[Any] = js.undefined
  
  /**
    * @language zh-CN
    * @description 左侧 Icon 具体值，当类型为 string时，默认使用 IconFont
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon specific value on the left. When the type is string, Iconfont is used by default
    * @defaultValue null
    */
  var Icon: js.UndefOr[Any] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否禁用 `Action` 点击事件
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Disable 'action' click events
    * @defaultValue false
    */
  var actionDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 右侧 Action 类型
    * @defaultValue 'auto'
    */
  /**
    * @language en-US
    * @description Right action type
    * @defaultValue 'auto'
    */
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表项右边区域是否显示 arrow 标签
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is the arrow label displayed in the right area of the list item
    * @defaultValue false
    */
  var arrow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description arrow 图标颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Arrow icon color
    * @defaultValue null
    */
  var arrowColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description arrow 是否使用 IconFont 渲染
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Does arrow render with iconfont
    * @defaultValue false
    */
  var arrowUseIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon Color
    * @defaultValue null
    */
  var iconColor: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标尺寸
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon size
    * @defaultValue null
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 左侧 Icon 类型
    * @defaultValue 'auto'
    */
  /**
    * @language en-US
    * @description Icon type on the left
    * @defaultValue 'auto'
    */
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图片的 tintColor 是否跟随 iconColor
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Does the tintColor of the image follow iconColor
    * @defaultValue true
    */
  var imageFollowIconColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否需要重新渲染
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Do I need to render again
    * @defaultValue true
    */
  var needUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表项右边区域的触发回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Trigger callback in the area to the right of the list item
    * @defaultValue () => {}
    */
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表项的所有样式
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description All styles for list items
    * @defaultValue {}
    */
  var styles: js.UndefOr[Container] = js.undefined
  
  /**
    * @language zh-CN
    * @description 副标题
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description SubTitle
    * @defaultValue null
    */
  var subTitle: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue {}
    */
  var theme: js.UndefOr[CellBg] = js.undefined
  
  /**
    * @language zh-CN
    * @description 标题
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Title
    * @defaultValue null
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 ART 实现版本
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is art used to implement the version
    * @defaultValue false
    */
  var useART: js.UndefOr[Boolean] = js.undefined
}
object TYListItemProps {
  
  inline def apply(): TYListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYListItemProps]
  }
  
  extension [Self <: TYListItemProps](x: Self) {
    
    inline def setAction(value: Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionDisabled(value: Boolean): Self = StObject.set(x, "actionDisabled", value.asInstanceOf[js.Any])
    
    inline def setActionDisabledUndefined: Self = StObject.set(x, "actionDisabled", js.undefined)
    
    inline def setActionType(value: auto | image | iconfont | text): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
    
    inline def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setArrowUseIcon(value: Boolean): Self = StObject.set(x, "arrowUseIcon", value.asInstanceOf[js.Any])
    
    inline def setArrowUseIconUndefined: Self = StObject.set(x, "arrowUseIcon", js.undefined)
    
    inline def setIcon(value: Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setIconType(value: auto | image | iconfont | text): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setImageFollowIconColor(value: Boolean): Self = StObject.set(x, "imageFollowIconColor", value.asInstanceOf[js.Any])
    
    inline def setImageFollowIconColorUndefined: Self = StObject.set(x, "imageFollowIconColor", js.undefined)
    
    inline def setNeedUpdate(value: Boolean): Self = StObject.set(x, "needUpdate", value.asInstanceOf[js.Any])
    
    inline def setNeedUpdateUndefined: Self = StObject.set(x, "needUpdate", js.undefined)
    
    inline def setOnActionPress(value: () => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction0(value))
    
    inline def setOnActionPressUndefined: Self = StObject.set(x, "onActionPress", js.undefined)
    
    inline def setStyles(value: Container): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTheme(value: CellBg): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
  }
}
