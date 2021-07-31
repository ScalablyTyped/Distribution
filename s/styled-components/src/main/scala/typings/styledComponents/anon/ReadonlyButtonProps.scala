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
  
  @scala.inline
  def apply(onPress: /* ev */ NativeSyntheticEvent[NativeTouchEvent] => Unit, title: String): ReadonlyButtonProps = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyButtonProps]
  }
  
  @scala.inline
  implicit class ReadonlyButtonPropsMutableBuilder[Self <: ReadonlyButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* ev */ NativeSyntheticEvent[NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
