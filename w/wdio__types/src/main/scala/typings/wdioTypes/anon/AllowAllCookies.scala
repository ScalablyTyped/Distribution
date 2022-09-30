package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowAllCookies extends StObject {
  
  var allowAllCookies: js.UndefOr[Boolean] = js.undefined
  
  var enablePopups: js.UndefOr[Boolean] = js.undefined
}
object AllowAllCookies {
  
  inline def apply(): AllowAllCookies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAllCookies]
  }
  
  extension [Self <: AllowAllCookies](x: Self) {
    
    inline def setAllowAllCookies(value: Boolean): Self = StObject.set(x, "allowAllCookies", value.asInstanceOf[js.Any])
    
    inline def setAllowAllCookiesUndefined: Self = StObject.set(x, "allowAllCookies", js.undefined)
    
    inline def setEnablePopups(value: Boolean): Self = StObject.set(x, "enablePopups", value.asInstanceOf[js.Any])
    
    inline def setEnablePopupsUndefined: Self = StObject.set(x, "enablePopups", js.undefined)
  }
}
