package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupDropdownProps extends js.Object {
  
  var corner: js.UndefOr[Boolean] = js.native
  
  var cornerColor: js.UndefOr[String] = js.native
  
  var cornerDirection: js.UndefOr[String] = js.native
  
  var cornerDirectionValue: js.UndefOr[String] = js.native
  
  var cornerSize: js.UndefOr[String] = js.native
  
  var cornerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var customCornerSize: js.UndefOr[String] = js.native
  
  var data: js.Array[Title] = js.native
  
  var listStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], Unit]] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var touchViewStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object PopupDropdownProps {
  
  @scala.inline
  def apply(data: js.Array[Title]): PopupDropdownProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDropdownProps]
  }
  
  @scala.inline
  implicit class PopupDropdownPropsOps[Self <: PopupDropdownProps] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: Title*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Title]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorner(value: Boolean): Self = this.set("corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorner: Self = this.set("corner", js.undefined)
    
    @scala.inline
    def setCornerColor(value: String): Self = this.set("cornerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerColor: Self = this.set("cornerColor", js.undefined)
    
    @scala.inline
    def setCornerDirection(value: String): Self = this.set("cornerDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerDirection: Self = this.set("cornerDirection", js.undefined)
    
    @scala.inline
    def setCornerDirectionValue(value: String): Self = this.set("cornerDirectionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerDirectionValue: Self = this.set("cornerDirectionValue", js.undefined)
    
    @scala.inline
    def setCornerSize(value: String): Self = this.set("cornerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerSize: Self = this.set("cornerSize", js.undefined)
    
    @scala.inline
    def setCornerStyle(value: StyleProp[ViewStyle]): Self = this.set("cornerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerStyle: Self = this.set("cornerStyle", js.undefined)
    
    @scala.inline
    def setCornerStyleNull: Self = this.set("cornerStyle", null)
    
    @scala.inline
    def setCustomCornerSize(value: String): Self = this.set("customCornerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCornerSize: Self = this.set("customCornerSize", js.undefined)
    
    @scala.inline
    def setListStyle(value: StyleProp[ViewStyle]): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    
    @scala.inline
    def setListStyleNull: Self = this.set("listStyle", null)
    
    @scala.inline
    def setOnSelect(value: /* value */ js.UndefOr[Double | String] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
    
    @scala.inline
    def setTouchViewStyle(value: StyleProp[ViewStyle]): Self = this.set("touchViewStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchViewStyle: Self = this.set("touchViewStyle", js.undefined)
    
    @scala.inline
    def setTouchViewStyleNull: Self = this.set("touchViewStyle", null)
  }
}
