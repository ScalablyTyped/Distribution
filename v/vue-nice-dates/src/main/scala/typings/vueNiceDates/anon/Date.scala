package typings.vueNiceDates.anon

import typings.vueNiceDates.sharedMod.DateLocale
import typings.vueNiceDates.sharedMod.Modifiers
import typings.vueNiceDates.sharedMod.ModifiersClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: typings.std.Date | String
  
  var enableGridSwitch: Boolean
  
  var initialDate: js.UndefOr[typings.std.Date] = js.undefined
  
  var locale: DateLocale
  
  var maximumDate: typings.std.Date | Null
  
  var minimumDate: typings.std.Date | Null
  
  var modifiers: Modifiers
  
  var modifiersClassNames: ModifiersClassNames
}
object Date {
  
  inline def apply(
    date: typings.std.Date | String,
    enableGridSwitch: Boolean,
    locale: DateLocale,
    modifiers: Modifiers,
    modifiersClassNames: ModifiersClassNames
  ): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], enableGridSwitch = enableGridSwitch.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], maximumDate = null, minimumDate = null)
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setDate(value: typings.std.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEnableGridSwitch(value: Boolean): Self = StObject.set(x, "enableGridSwitch", value.asInstanceOf[js.Any])
    
    inline def setInitialDate(value: typings.std.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    inline def setLocale(value: DateLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaximumDate(value: typings.std.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
    
    inline def setMaximumDateNull: Self = StObject.set(x, "maximumDate", null)
    
    inline def setMinimumDate(value: typings.std.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
    
    inline def setMinimumDateNull: Self = StObject.set(x, "minimumDate", null)
    
    inline def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
  }
}
