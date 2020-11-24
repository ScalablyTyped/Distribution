package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueNiceDates.sharedMod.DateLocale
import typings.vueNiceDates.sharedMod.Modifiers
import typings.vueNiceDates.sharedMod.ModifiersClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<vue-nice-dates.vue-nice-dates/shared.DatePickerProps, 'isFocus'> */
@js.native
trait OmitDatePickerPropsisFocu extends js.Object {
  
  var date: String = js.native
  
  var enableGridSwitch: Boolean = js.native
  
  var format: String = js.native
  
  var initialDate: js.UndefOr[typings.std.Date] = js.native
  
  var locale: DateLocale = js.native
  
  var maximumDate: js.UndefOr[typings.std.Date | Null] = js.native
  
  var minimumDate: js.UndefOr[typings.std.Date | Null] = js.native
  
  var modifiers: Modifiers = js.native
  
  var modifiersClassNames: ModifiersClassNames = js.native
  
  var validator: StringDictionary[js.Function1[/* date */ typings.std.Date, Boolean]] = js.native
}
object OmitDatePickerPropsisFocu {
  
  @scala.inline
  def apply(
    date: String,
    enableGridSwitch: Boolean,
    format: String,
    locale: DateLocale,
    modifiers: Modifiers,
    modifiersClassNames: ModifiersClassNames,
    validator: StringDictionary[js.Function1[/* date */ typings.std.Date, Boolean]]
  ): OmitDatePickerPropsisFocu = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDatePickerPropsisFocu]
  }
  
  @scala.inline
  implicit class OmitDatePickerPropsisFocuOps[Self <: OmitDatePickerPropsisFocu] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGridSwitch(value: Boolean): Self = this.set("enableGridSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: DateLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiers(value: Modifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersClassNames(value: ModifiersClassNames): Self = this.set("modifiersClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidator(value: StringDictionary[js.Function1[/* date */ typings.std.Date, Boolean]]): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDate(value: typings.std.Date): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDate: Self = this.set("initialDate", js.undefined)
    
    @scala.inline
    def setMaximumDate(value: typings.std.Date): Self = this.set("maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumDate: Self = this.set("maximumDate", js.undefined)
    
    @scala.inline
    def setMaximumDateNull: Self = this.set("maximumDate", null)
    
    @scala.inline
    def setMinimumDate(value: typings.std.Date): Self = this.set("minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumDate: Self = this.set("minimumDate", js.undefined)
    
    @scala.inline
    def setMinimumDateNull: Self = this.set("minimumDate", null)
  }
}
