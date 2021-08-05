package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheTime extends StObject {
  
  var cacheTime: js.UndefOr[Double] = js.undefined
  
  var showAlert: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object CacheTime {
  
  inline def apply(): CacheTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheTime]
  }
  
  extension [Self <: CacheTime](x: Self) {
    
    inline def setCacheTime(value: Double): Self = StObject.set(x, "cacheTime", value.asInstanceOf[js.Any])
    
    inline def setCacheTimeUndefined: Self = StObject.set(x, "cacheTime", js.undefined)
    
    inline def setShowAlert(value: Boolean): Self = StObject.set(x, "showAlert", value.asInstanceOf[js.Any])
    
    inline def setShowAlertUndefined: Self = StObject.set(x, "showAlert", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
