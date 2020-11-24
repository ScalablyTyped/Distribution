package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.Date
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
  implicit class PopUpCountdownPropsOps[Self <: PopUpCountdownProps] (val x: Self) extends AnyVal {
    
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onDataChange(value: /* date */ Date => Unit): Self = this.set("_onDataChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def delete_onDataChange: Self = this.set("_onDataChange", js.undefined)
    
    @scala.inline
    def setCountdownWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("countdownWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountdownWrapperStyle: Self = this.set("countdownWrapperStyle", js.undefined)
    
    @scala.inline
    def setCountdownWrapperStyleNull: Self = this.set("countdownWrapperStyle", null)
    
    @scala.inline
    def setHourPickerStyle(value: StyleProp[ViewStyle]): Self = this.set("hourPickerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourPickerStyle: Self = this.set("hourPickerStyle", js.undefined)
    
    @scala.inline
    def setHourPickerStyleNull: Self = this.set("hourPickerStyle", null)
    
    @scala.inline
    def setHourText(value: String): Self = this.set("hourText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourText: Self = this.set("hourText", js.undefined)
    
    @scala.inline
    def setHourUnitStyle(value: StyleProp[TextStyle]): Self = this.set("hourUnitStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourUnitStyle: Self = this.set("hourUnitStyle", js.undefined)
    
    @scala.inline
    def setHourUnitStyleNull: Self = this.set("hourUnitStyle", null)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinutePickerStyle(value: StyleProp[ViewStyle]): Self = this.set("minutePickerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutePickerStyle: Self = this.set("minutePickerStyle", js.undefined)
    
    @scala.inline
    def setMinutePickerStyleNull: Self = this.set("minutePickerStyle", null)
    
    @scala.inline
    def setMinuteText(value: String): Self = this.set("minuteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteText: Self = this.set("minuteText", js.undefined)
    
    @scala.inline
    def setMinuteUnitStyle(value: StyleProp[TextStyle]): Self = this.set("minuteUnitStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteUnitStyle: Self = this.set("minuteUnitStyle", js.undefined)
    
    @scala.inline
    def setMinuteUnitStyleNull: Self = this.set("minuteUnitStyle", null)
    
    @scala.inline
    def setOnValueChange(value: /* data */ js.UndefOr[valueChangeProps] => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setOnlyone(value: Boolean): Self = this.set("onlyone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyone: Self = this.set("onlyone", js.undefined)
    
    @scala.inline
    def setPickerFontColor(value: String): Self = this.set("pickerFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerFontColor: Self = this.set("pickerFontColor", js.undefined)
    
    @scala.inline
    def setPickerUnitColor(value: String): Self = this.set("pickerUnitColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerUnitColor: Self = this.set("pickerUnitColor", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
