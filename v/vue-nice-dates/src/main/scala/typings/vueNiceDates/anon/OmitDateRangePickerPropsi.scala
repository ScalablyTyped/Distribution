package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueNiceDates.sharedMod.DateLocale
import typings.vueNiceDates.sharedMod.Modifiers
import typings.vueNiceDates.sharedMod.ModifiersClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<vue-nice-dates.vue-nice-dates/shared.DateRangePickerProps, 'isFocus'> */
trait OmitDateRangePickerPropsi extends StObject {
  
  var enableGridSwitch: Boolean
  
  var endDate: String
  
  var focusName: String
  
  var format: String
  
  var initialDate: js.UndefOr[js.Date] = js.undefined
  
  var locale: DateLocale
  
  var maximumDate: js.UndefOr[js.Date | Null] = js.undefined
  
  var minimumDate: js.UndefOr[js.Date | Null] = js.undefined
  
  var modifiers: Modifiers
  
  var modifiersClassNames: ModifiersClassNames
  
  var startDate: String
  
  var validator: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
}
object OmitDateRangePickerPropsi {
  
  inline def apply(
    enableGridSwitch: Boolean,
    endDate: String,
    focusName: String,
    format: String,
    locale: DateLocale,
    modifiers: Modifiers,
    modifiersClassNames: ModifiersClassNames,
    startDate: String,
    validator: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
  ): OmitDateRangePickerPropsi = {
    val __obj = js.Dynamic.literal(enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], focusName = focusName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDateRangePickerPropsi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitDateRangePickerPropsi] (val x: Self) extends AnyVal {
    
    inline def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setFocusName(value: String): Self = StObject.set(x, "focusName", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    inline def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
    
    inline def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
    
    inline def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
    
    inline def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
    
    inline def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
    
    inline def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
    
    inline def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
  }
}
