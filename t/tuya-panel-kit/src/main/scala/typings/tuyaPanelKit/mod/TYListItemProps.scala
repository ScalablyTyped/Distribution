package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.TouchableOpacityProps
import typings.tuyaPanelKit.anon.BoardBg
import typings.tuyaPanelKit.anon.Content
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
  
  var Action: js.UndefOr[js.Any] = js.undefined
  
  var Icon: js.UndefOr[js.Any] = js.undefined
  
  var actionDisabled: js.UndefOr[Boolean] = js.undefined
  
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  var arrow: js.UndefOr[Boolean] = js.undefined
  
  var arrowColor: js.UndefOr[String] = js.undefined
  
  var arrowUseIcon: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  @JSName("disabled")
  var disabled_TYListItemProps: js.UndefOr[Boolean] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.undefined
  
  var imageFollowIconColor: js.UndefOr[Boolean] = js.undefined
  
  var needUpdate: js.UndefOr[Boolean] = js.undefined
  
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var styles: js.UndefOr[Content] = js.undefined
  
  var subTitle: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[BoardBg] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var useART: js.UndefOr[Boolean] = js.undefined
}
object TYListItemProps {
  
  @scala.inline
  def apply(): TYListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYListItemProps]
  }
  
  @scala.inline
  implicit class TYListItemPropsMutableBuilder[Self <: TYListItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDisabled(value: Boolean): Self = StObject.set(x, "actionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDisabledUndefined: Self = StObject.set(x, "actionDisabled", js.undefined)
    
    @scala.inline
    def setActionType(value: auto | image | iconfont | text): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setArrowUseIcon(value: Boolean): Self = StObject.set(x, "arrowUseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUseIconUndefined: Self = StObject.set(x, "arrowUseIcon", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setIconType(value: auto | image | iconfont | text): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    @scala.inline
    def setImageFollowIconColor(value: Boolean): Self = StObject.set(x, "imageFollowIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFollowIconColorUndefined: Self = StObject.set(x, "imageFollowIconColor", js.undefined)
    
    @scala.inline
    def setNeedUpdate(value: Boolean): Self = StObject.set(x, "needUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedUpdateUndefined: Self = StObject.set(x, "needUpdate", js.undefined)
    
    @scala.inline
    def setOnActionPress(value: () => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnActionPressUndefined: Self = StObject.set(x, "onActionPress", js.undefined)
    
    @scala.inline
    def setStyles(value: Content): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTheme(value: BoardBg): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
  }
}
