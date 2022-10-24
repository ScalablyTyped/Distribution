package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeStyle extends StObject {
  
  var locale: Any
  
  var timeStyle: Any
  
  var value: Any
}
object TimeStyle {
  
  inline def apply(locale: Any, timeStyle: Any, value: Any): TimeStyle = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], timeStyle = timeStyle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStyle]
  }
  
  extension [Self <: TimeStyle](x: Self) {
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setTimeStyle(value: Any): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
