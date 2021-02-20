package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupDropdownProps extends StObject {
  
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
  implicit class PopupDropdownPropsMutableBuilder[Self <: PopupDropdownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorner(value: Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerColor(value: String): Self = StObject.set(x, "cornerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerColorUndefined: Self = StObject.set(x, "cornerColor", js.undefined)
    
    @scala.inline
    def setCornerDirection(value: String): Self = StObject.set(x, "cornerDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerDirectionUndefined: Self = StObject.set(x, "cornerDirection", js.undefined)
    
    @scala.inline
    def setCornerDirectionValue(value: String): Self = StObject.set(x, "cornerDirectionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerDirectionValueUndefined: Self = StObject.set(x, "cornerDirectionValue", js.undefined)
    
    @scala.inline
    def setCornerSize(value: String): Self = StObject.set(x, "cornerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerSizeUndefined: Self = StObject.set(x, "cornerSize", js.undefined)
    
    @scala.inline
    def setCornerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cornerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerStyleNull: Self = StObject.set(x, "cornerStyle", null)
    
    @scala.inline
    def setCornerStyleUndefined: Self = StObject.set(x, "cornerStyle", js.undefined)
    
    @scala.inline
    def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
    
    @scala.inline
    def setCustomCornerSize(value: String): Self = StObject.set(x, "customCornerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCornerSizeUndefined: Self = StObject.set(x, "customCornerSize", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[Title]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Title*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setListStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStyleNull: Self = StObject.set(x, "listStyle", null)
    
    @scala.inline
    def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* value */ js.UndefOr[Double | String] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTouchViewStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "touchViewStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchViewStyleNull: Self = StObject.set(x, "touchViewStyle", null)
    
    @scala.inline
    def setTouchViewStyleUndefined: Self = StObject.set(x, "touchViewStyle", js.undefined)
  }
}
