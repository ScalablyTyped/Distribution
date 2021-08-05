package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lang extends StObject {
  
  var lang: String
  
  var timeout: Double
  
  var withCredentials: Boolean
}
object Lang {
  
  inline def apply(lang: String, timeout: Double, withCredentials: Boolean): Lang = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
  
  extension [Self <: Lang](x: Self) {
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
  }
}
