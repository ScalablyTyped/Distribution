package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends js.Object {
  
  var container: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var content: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentCenter: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentLeft: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentRight: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var subTitle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var title: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object Content {
  
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: StyleProp[ViewStyle]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setContent(value: StyleProp[ViewStyle]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setContentCenter(value: StyleProp[ViewStyle]): Self = this.set("contentCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCenter: Self = this.set("contentCenter", js.undefined)
    
    @scala.inline
    def setContentCenterNull: Self = this.set("contentCenter", null)
    
    @scala.inline
    def setContentLeft(value: StyleProp[ViewStyle]): Self = this.set("contentLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLeft: Self = this.set("contentLeft", js.undefined)
    
    @scala.inline
    def setContentLeftNull: Self = this.set("contentLeft", null)
    
    @scala.inline
    def setContentRight(value: StyleProp[ViewStyle]): Self = this.set("contentRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRight: Self = this.set("contentRight", js.undefined)
    
    @scala.inline
    def setContentRightNull: Self = this.set("contentRight", null)
    
    @scala.inline
    def setSubTitle(value: StyleProp[TextStyle]): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setSubTitleNull: Self = this.set("subTitle", null)
    
    @scala.inline
    def setTitle(value: StyleProp[TextStyle]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
}
