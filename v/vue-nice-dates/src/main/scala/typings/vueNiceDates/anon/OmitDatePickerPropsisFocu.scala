package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueNiceDates.sharedMod.DateLocale
import typings.vueNiceDates.sharedMod.Modifiers
import typings.vueNiceDates.sharedMod.ModifiersClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<vue-nice-dates.vue-nice-dates/shared.DatePickerProps, 'isFocus'> */
trait OmitDatePickerPropsisFocu extends StObject {
  
  var date: String
  
  var enableGridSwitch: Boolean
  
  var format: String
  
  var initialDate: js.UndefOr[typings.std.Date] = js.undefined
  
  var locale: DateLocale
  
  var maximumDate: js.UndefOr[typings.std.Date | Null] = js.undefined
  
  var minimumDate: js.UndefOr[typings.std.Date | Null] = js.undefined
  
  var modifiers: Modifiers
  
  var modifiersClassNames: ModifiersClassNames
  
  var validator: StringDictionary[js.Function1[/* date */ typings.std.Date, Boolean]]
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
  implicit class OmitDatePickerPropsisFocuMutableBuilder[Self <: OmitDatePickerPropsisFocu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDate(value: typings.std.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    @scala.inline
    def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDate(value: typings.std.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
    
    @scala.inline
    def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
    
    @scala.inline
    def setMinimumDate(value: typings.std.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
    
    @scala.inline
    def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
    
    @scala.inline
    def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidator(value: StringDictionary[js.Function1[/* date */ typings.std.Date, Boolean]]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
  }
}
