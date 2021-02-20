package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopUpCountdownProps extends PopupProps {
  
  var _onDataChange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  
  var countdownWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var hourPickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var hourText: js.UndefOr[String] = js.native
  
  var hourUnitStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var minutePickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var minuteText: js.UndefOr[String] = js.native
  
  var minuteUnitStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* data */ js.UndefOr[valueChangeProps], Unit]] = js.native
  
  var onlyone: js.UndefOr[Boolean] = js.native
  
  var pickerFontColor: js.UndefOr[String] = js.native
  
  var pickerUnitColor: js.UndefOr[String] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var value: Double = js.native
}
object PopUpCountdownProps {
  
  @scala.inline
  def apply(value: Double): PopUpCountdownProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopUpCountdownProps]
  }
  
  @scala.inline
  implicit class PopUpCountdownPropsMutableBuilder[Self <: PopUpCountdownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountdownWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "countdownWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountdownWrapperStyleNull: Self = StObject.set(x, "countdownWrapperStyle", null)
    
    @scala.inline
    def setCountdownWrapperStyleUndefined: Self = StObject.set(x, "countdownWrapperStyle", js.undefined)
    
    @scala.inline
    def setHourPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "hourPickerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourPickerStyleNull: Self = StObject.set(x, "hourPickerStyle", null)
    
    @scala.inline
    def setHourPickerStyleUndefined: Self = StObject.set(x, "hourPickerStyle", js.undefined)
    
    @scala.inline
    def setHourText(value: String): Self = StObject.set(x, "hourText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourTextUndefined: Self = StObject.set(x, "hourText", js.undefined)
    
    @scala.inline
    def setHourUnitStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "hourUnitStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUnitStyleNull: Self = StObject.set(x, "hourUnitStyle", null)
    
    @scala.inline
    def setHourUnitStyleUndefined: Self = StObject.set(x, "hourUnitStyle", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinutePickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "minutePickerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutePickerStyleNull: Self = StObject.set(x, "minutePickerStyle", null)
    
    @scala.inline
    def setMinutePickerStyleUndefined: Self = StObject.set(x, "minutePickerStyle", js.undefined)
    
    @scala.inline
    def setMinuteText(value: String): Self = StObject.set(x, "minuteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteTextUndefined: Self = StObject.set(x, "minuteText", js.undefined)
    
    @scala.inline
    def setMinuteUnitStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "minuteUnitStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteUnitStyleNull: Self = StObject.set(x, "minuteUnitStyle", null)
    
    @scala.inline
    def setMinuteUnitStyleUndefined: Self = StObject.set(x, "minuteUnitStyle", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* data */ js.UndefOr[valueChangeProps] => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setOnlyone(value: Boolean): Self = StObject.set(x, "onlyone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyoneUndefined: Self = StObject.set(x, "onlyone", js.undefined)
    
    @scala.inline
    def setPickerFontColor(value: String): Self = StObject.set(x, "pickerFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerFontColorUndefined: Self = StObject.set(x, "pickerFontColor", js.undefined)
    
    @scala.inline
    def setPickerUnitColor(value: String): Self = StObject.set(x, "pickerUnitColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerUnitColorUndefined: Self = StObject.set(x, "pickerUnitColor", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onDataChange(value: /* date */ Date => Unit): Self = StObject.set(x, "_onDataChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_onDataChangeUndefined: Self = StObject.set(x, "_onDataChange", js.undefined)
  }
}
