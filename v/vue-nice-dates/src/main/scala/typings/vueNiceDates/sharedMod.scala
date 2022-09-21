package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import typings.dateFns.mod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  type DateLocale = Locale
  
  trait DatePickerProps extends StObject {
    
    var date: String
    
    var enableGridSwitch: Boolean
    
    var format: String
    
    var initialDate: js.UndefOr[js.Date] = js.undefined
    
    var isFocus: Boolean
    
    var locale: DateLocale
    
    var maximumDate: js.Date | Null
    
    var minimumDate: js.Date | Null
    
    var modifiers: Modifiers
    
    var modifiersClassNames: ModifiersClassNames
    
    var validator: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
  }
  object DatePickerProps {
    
    inline def apply(
      date: String,
      enableGridSwitch: Boolean,
      format: String,
      isFocus: Boolean,
      locale: DateLocale,
      modifiers: Modifiers,
      modifiersClassNames: ModifiersClassNames,
      validator: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
    ): DatePickerProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any], maximumDate = null, minimumDate = null)
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      inline def setIsFocus(value: Boolean): Self = StObject.set(x, "isFocus", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      inline def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
      
      inline def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      inline def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
      
      inline def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
      
      inline def setValidator(value: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateRangePickerProps extends StObject {
    
    var enableGridSwitch: Boolean
    
    var endDate: String
    
    var focusName: String
    
    var format: String
    
    var initialDate: js.UndefOr[js.Date] = js.undefined
    
    var isFocus: Boolean
    
    var locale: DateLocale
    
    var maximumDate: js.Date | Null
    
    var minimumDate: js.Date | Null
    
    var modifiers: Modifiers
    
    var modifiersClassNames: ModifiersClassNames
    
    var startDate: String
    
    var validator: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
  }
  object DateRangePickerProps {
    
    inline def apply(
      enableGridSwitch: Boolean,
      endDate: String,
      focusName: String,
      format: String,
      isFocus: Boolean,
      locale: DateLocale,
      modifiers: Modifiers,
      modifiersClassNames: ModifiersClassNames,
      startDate: String,
      validator: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]
    ): DateRangePickerProps = {
      val __obj = js.Dynamic.literal(enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], focusName = focusName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any], maximumDate = null, minimumDate = null)
      __obj.asInstanceOf[DateRangePickerProps]
    }
    
    extension [Self <: DateRangePickerProps](x: Self) {
      
      inline def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setFocusName(value: String): Self = StObject.set(x, "focusName", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      inline def setIsFocus(value: Boolean): Self = StObject.set(x, "isFocus", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      inline def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
      
      inline def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      inline def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
      
      inline def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setValidator(value: StringDictionary[js.Function1[/* date */ js.Date, Boolean]]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
  
  type Modifiers = StringDictionary[js.Function2[/* date */ js.Date, /* type */ String, Boolean]]
  
  type ModifiersClassNames = StringDictionary[String]
}
