package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsLocale extends StObject {
  
  /**
    * You can store as many languages as you like, creating an object inside the langs object with a property of the locale code for that language. A list of locale codes can be found here.
    *
    * At present there are three parts of the table that can be localized, the column headers, the header filter placeholder text and the pagination buttons. To localize the pagination buttons, create a pagination property inside your language object and give it the properties outlined below.
    *
    * If you wish you can also localize column titles by adding a columns property to your language object. You should store a property of the field name of the column you wish to change, with a value of its title. Any fields that match this will use this title instead of the one provided by the column definition array.
    */
  var langs: js.UndefOr[Any] = js.undefined
  
  /** You can set the current local in one of two ways. If you want to set it when the table is created, simply include the locale option in your Tabulator constructor. You can either pass in a string matching one of the language options you have defined, or pass in the boolean true which will cause Tabulator to auto-detect the browsers language settings from the navigator.language object. */
  var locale: js.UndefOr[Boolean | String] = js.undefined
  
  /** When a localization event has occurred , the localized callback will triggered, passing the current locale code and language object: */
  var localized: js.UndefOr[js.Function2[/* locale */ String, /* lang */ Any, Unit]] = js.undefined
}
object OptionsLocale {
  
  inline def apply(): OptionsLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsLocale]
  }
  
  extension [Self <: OptionsLocale](x: Self) {
    
    inline def setLangs(value: Any): Self = StObject.set(x, "langs", value.asInstanceOf[js.Any])
    
    inline def setLangsUndefined: Self = StObject.set(x, "langs", js.undefined)
    
    inline def setLocale(value: Boolean | String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocalized(value: (/* locale */ String, /* lang */ Any) => Unit): Self = StObject.set(x, "localized", js.Any.fromFunction2(value))
    
    inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
  }
}
