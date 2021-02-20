package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueNiceDates.sharedMod.DateLocale
import typings.vueNiceDates.sharedMod.Modifiers
import typings.vueNiceDates.sharedMod.ModifiersClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<vue-nice-dates.vue-nice-dates/shared.DateRangePickerProps, 'isFocus'> */
@js.native
trait OmitDateRangePickerPropsi extends StObject {
  
  var enableGridSwitch: Boolean = js.native
  
  var endDate: String = js.native
  
  var focusName: String = js.native
  
  var format: String = js.native
  
  var initialDate: js.UndefOr[typings.std.Date] = js.native
  
  var locale: DateLocale = js.native
  
  var maximumDate: js.UndefOr[typings.std.Date | Null] = js.native
  
  var minimumDate: js.UndefOr[typings.std.Date | Null] = js.native
  
  var modifiers: Modifiers = js.native
  
  var modifiersClassNames: ModifiersClassNames = js.native
  
  var startDate: String = js.native
  
  var validator: StringDictionary[js.Function1[/* date */ typings.std.Date, Boolean]] = js.native
}
object OmitDateRangePickerPropsi {
  
  @scala.inline
  def apply(
    enableGridSwitch: Boolean,
    endDate: String,
    focusName: String,
    format: String,
    locale: DateLocale,
    modifiers: Modifiers,
    modifiersClassNames: ModifiersClassNames,
    startDate: String,
    validator: StringDictionary[js.Function1[/* date */ typings.std.Date, Boolean]]
  ): OmitDateRangePickerPropsi = {
    val __obj = js.Dynamic.literal(enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], focusName = focusName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDateRangePickerPropsi]
  }
  
  @scala.inline
  implicit class OmitDateRangePickerPropsiMutableBuilder[Self <: OmitDateRangePickerPropsi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusName(value: String): Self = StObject.set(x, "focusName", value.asInstanceOf[js.Any])
    
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
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidator(value: StringDictionary[js.Function1[/* date */ typings.std.Date, Boolean]]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
  }
}
