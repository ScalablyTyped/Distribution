package typings.vueNiceDates.sharedMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePickerProps extends js.Object {
  
  var enableGridSwitch: Boolean = js.native
  
  var endDate: String = js.native
  
  var focusName: String = js.native
  
  var format: String = js.native
  
  var initialDate: js.UndefOr[Date] = js.native
  
  var isFocus: Boolean = js.native
  
  var locale: DateLocale = js.native
  
  var maximumDate: Date | Null = js.native
  
  var minimumDate: Date | Null = js.native
  
  var modifiers: Modifiers = js.native
  
  var modifiersClassNames: ModifiersClassNames = js.native
  
  var startDate: String = js.native
  
  var validator: StringDictionary[js.Function1[/* date */ Date, Boolean]] = js.native
}
object DateRangePickerProps {
  
  @scala.inline
  def apply(
    enableGridSwitch: Boolean,
    endDate: String,
    focusName: String,
    format: String,
    isFocus: Boolean,
    locale: DateLocale,
    modifiers: Modifiers,
    modifiersClassNames: ModifiersClassNames,
    startDate: String,
    validator: StringDictionary[js.Function1[/* date */ Date, Boolean]]
  ): DateRangePickerProps = {
    val __obj = js.Dynamic.literal(enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], focusName = focusName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangePickerProps]
  }
  
  @scala.inline
  implicit class DateRangePickerPropsOps[Self <: DateRangePickerProps] (val x: Self) extends AnyVal {
    
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
    def setEnableGridSwitch(value: Boolean): Self = this.set("enableGridSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusName(value: String): Self = this.set("focusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocus(value: Boolean): Self = this.set("isFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: DateLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiers(value: Modifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersClassNames(value: ModifiersClassNames): Self = this.set("modifiersClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidator(value: StringDictionary[js.Function1[/* date */ Date, Boolean]]): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDate(value: Date): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDate: Self = this.set("initialDate", js.undefined)
    
    @scala.inline
    def setMaximumDate(value: Date): Self = this.set("maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDateNull: Self = this.set("maximumDate", null)
    
    @scala.inline
    def setMinimumDate(value: Date): Self = this.set("minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDateNull: Self = this.set("minimumDate", null)
  }
}
