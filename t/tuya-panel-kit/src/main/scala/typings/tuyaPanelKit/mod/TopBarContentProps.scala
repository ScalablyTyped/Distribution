package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.left
import typings.tuyaPanelKit.tuyaPanelKitStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopBarContentProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var position: js.UndefOr[left | center | right] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var subTitle: js.UndefOr[String] = js.undefined
  
  var subTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object TopBarContentProps {
  
  @scala.inline
  def apply(): TopBarContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBarContentProps]
  }
  
  @scala.inline
  implicit class TopBarContentPropsMutableBuilder[Self <: TopBarContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setPosition(value: left | center | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleStyleNull: Self = StObject.set(x, "subTitleStyle", null)
    
    @scala.inline
    def setSubTitleStyleUndefined: Self = StObject.set(x, "subTitleStyle", js.undefined)
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
