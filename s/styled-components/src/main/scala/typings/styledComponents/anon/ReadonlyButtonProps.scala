package typings.styledComponents.anon

import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.NativeTouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.ButtonProps> */
trait ReadonlyButtonProps extends StObject {
  
  val accessibilityLabel: js.UndefOr[String] = js.undefined
  
  val color: js.UndefOr[ColorValue] = js.undefined
  
  val disabled: js.UndefOr[Boolean] = js.undefined
  
  val onPress: js.Function1[/* ev */ NativeSyntheticEvent[NativeTouchEvent], Unit]
  
  val testID: js.UndefOr[String] = js.undefined
  
  val title: String
}
object ReadonlyButtonProps {
  
  inline def apply(onPress: /* ev */ NativeSyntheticEvent[NativeTouchEvent] => Unit, title: String): ReadonlyButtonProps = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyButtonProps]
  }
  
  extension [Self <: ReadonlyButtonProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnPress(value: /* ev */ NativeSyntheticEvent[NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
