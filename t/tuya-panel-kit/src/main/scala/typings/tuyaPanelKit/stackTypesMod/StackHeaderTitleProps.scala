package typings.tuyaPanelKit.stackTypesMod

import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackHeaderTitleProps extends StObject {
  
  /**
    * Whether title font should scale to respect Text Size accessibility settings.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Content of the title element. Usually the title string.
    */
  var children: js.UndefOr[String] = js.undefined
  
  /**
    * Callback to trigger when the size of the title element changes.
    */
  def onLayout(e: LayoutChangeEvent): Unit
  
  /**
    * Style object for the title element.
    */
  var style: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.undefined
  
  /**
    * Tint color for the header.
    */
  var tintColor: js.UndefOr[String] = js.undefined
}
object StackHeaderTitleProps {
  
  inline def apply(onLayout: LayoutChangeEvent => Unit): StackHeaderTitleProps = {
    val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout))
    __obj.asInstanceOf[StackHeaderTitleProps]
  }
  
  extension [Self <: StackHeaderTitleProps](x: Self) {
    
    inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnLayout(value: LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
  }
}
