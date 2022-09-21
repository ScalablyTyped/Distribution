package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowCredentials extends StObject {
  
  var allowCredentials: js.UndefOr[Boolean] = js.undefined
  
  var confirmationRequired: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object AllowCredentials {
  
  inline def apply(): AllowCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowCredentials]
  }
  
  extension [Self <: AllowCredentials](x: Self) {
    
    inline def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    inline def setConfirmationRequired(value: Boolean): Self = StObject.set(x, "confirmationRequired", value.asInstanceOf[js.Any])
    
    inline def setConfirmationRequiredUndefined: Self = StObject.set(x, "confirmationRequired", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
