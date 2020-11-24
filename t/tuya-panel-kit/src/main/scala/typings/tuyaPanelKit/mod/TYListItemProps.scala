package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.TouchableOpacityProps
import typings.tuyaPanelKit.anon.BoardBg
import typings.tuyaPanelKit.anon.Content
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.iconfont
import typings.tuyaPanelKit.tuyaPanelKitStrings.image
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TYListItemProps extends TouchableOpacityProps {
  
  var Action: js.UndefOr[js.Any] = js.native
  
  var Icon: js.UndefOr[js.Any] = js.native
  
  var actionDisabled: js.UndefOr[Boolean] = js.native
  
  var actionType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var arrow: js.UndefOr[Boolean] = js.native
  
  var arrowColor: js.UndefOr[String] = js.native
  
  var arrowUseIcon: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  @JSName("disabled")
  var disabled_TYListItemProps: js.UndefOr[Boolean] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var iconType: js.UndefOr[auto | image | iconfont | text] = js.native
  
  var imageFollowIconColor: js.UndefOr[Boolean] = js.native
  
  var needUpdate: js.UndefOr[Boolean] = js.native
  
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var styles: js.UndefOr[Content] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[BoardBg] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
}
object TYListItemProps {
  
  @scala.inline
  def apply(): TYListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYListItemProps]
  }
  
  @scala.inline
  implicit class TYListItemPropsOps[Self <: TYListItemProps] (val x: Self) extends AnyVal {
    
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
    def setAction(value: js.Any): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("Icon", js.undefined)
    
    @scala.inline
    def setActionDisabled(value: Boolean): Self = this.set("actionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionDisabled: Self = this.set("actionDisabled", js.undefined)
    
    @scala.inline
    def setActionType(value: auto | image | iconfont | text): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setArrow(value: Boolean): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setArrowColor(value: String): Self = this.set("arrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowColor: Self = this.set("arrowColor", js.undefined)
    
    @scala.inline
    def setArrowUseIcon(value: Boolean): Self = this.set("arrowUseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowUseIcon: Self = this.set("arrowUseIcon", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setIconType(value: auto | image | iconfont | text): Self = this.set("iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconType: Self = this.set("iconType", js.undefined)
    
    @scala.inline
    def setImageFollowIconColor(value: Boolean): Self = this.set("imageFollowIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFollowIconColor: Self = this.set("imageFollowIconColor", js.undefined)
    
    @scala.inline
    def setNeedUpdate(value: Boolean): Self = this.set("needUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedUpdate: Self = this.set("needUpdate", js.undefined)
    
    @scala.inline
    def setOnActionPress(value: () => Unit): Self = this.set("onActionPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnActionPress: Self = this.set("onActionPress", js.undefined)
    
    @scala.inline
    def setStyles(value: Content): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setTheme(value: BoardBg): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = this.set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseART: Self = this.set("useART", js.undefined)
  }
}
