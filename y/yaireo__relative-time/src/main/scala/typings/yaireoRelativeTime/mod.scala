package typings.yaireoRelativeTime

import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@yaireo/relative-time", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RelativeTime {
    def this(settings: Settings) = this()
  }
  
  @js.native
  trait RelativeTime extends StObject {
    
    def from(d1: js.Date): String = js.native
    def from(d1: js.Date, d2: js.Date): String = js.native
  }
  
  trait Settings extends StObject {
    
    /**
      * @default browser locale
      * @example 'es'
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * @default { numeric: 'auto' }
      */
    var options: js.UndefOr[DateTimeFormatOptions] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOptions(value: DateTimeFormatOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
