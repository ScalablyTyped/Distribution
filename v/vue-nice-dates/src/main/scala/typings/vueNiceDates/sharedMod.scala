package typings.vueNiceDates

import org.scalablytyped.runtime.StringDictionary
import typings.dateFns.mod.Locale
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  type DateLocale = Locale
  
  @js.native
  trait DatePickerProps extends StObject {
    
    var date: String = js.native
    
    var enableGridSwitch: Boolean = js.native
    
    var format: String = js.native
    
    var initialDate: js.UndefOr[Date] = js.native
    
    var isFocus: Boolean = js.native
    
    var locale: DateLocale = js.native
    
    var maximumDate: Date | Null = js.native
    
    var minimumDate: Date | Null = js.native
    
    var modifiers: Modifiers = js.native
    
    var modifiersClassNames: ModifiersClassNames = js.native
    
    var validator: StringDictionary[js.Function1[/* date */ Date, Boolean]] = js.native
  }
  object DatePickerProps {
    
    @scala.inline
    def apply(
      date: String,
      enableGridSwitch: Boolean,
      format: String,
      isFocus: Boolean,
      locale: DateLocale,
      modifiers: Modifiers,
      modifiersClassNames: ModifiersClassNames,
      validator: StringDictionary[js.Function1[/* date */ Date, Boolean]]
    ): DatePickerProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDate(value: Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      @scala.inline
      def setIsFocus(value: Boolean): Self = StObject.set(x, "isFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDate(value: Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
      
      @scala.inline
      def setMinimumDate(value: Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
      
      @scala.inline
      def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(value: StringDictionary[js.Function1[/* date */ Date, Boolean]]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DateRangePickerProps extends StObject {
    
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
    implicit class DateRangePickerPropsMutableBuilder[Self <: DateRangePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusName(value: String): Self = StObject.set(x, "focusName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDate(value: Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
      
      @scala.inline
      def setIsFocus(value: Boolean): Self = StObject.set(x, "isFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDate(value: Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
      
      @scala.inline
      def setMinimumDate(value: Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
      
      @scala.inline
      def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(value: StringDictionary[js.Function1[/* date */ Date, Boolean]]): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
  
  type Modifiers = StringDictionary[js.Function2[/* date */ Date, /* type */ String, Boolean]]
  
  type ModifiersClassNames = StringDictionary[String]
}
