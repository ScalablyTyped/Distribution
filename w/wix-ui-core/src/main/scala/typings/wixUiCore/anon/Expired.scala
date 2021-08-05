package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expired extends StObject {
  
  var expired: Boolean
  
  var rendered: Boolean
  
  var resetted: Boolean
  
  var verifiedToken: String
}
object Expired {
  
  inline def apply(expired: Boolean, rendered: Boolean, resetted: Boolean, verifiedToken: String): Expired = {
    val __obj = js.Dynamic.literal(expired = expired.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], resetted = resetted.asInstanceOf[js.Any], verifiedToken = verifiedToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expired]
  }
  
  extension [Self <: Expired](x: Self) {
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setResetted(value: Boolean): Self = StObject.set(x, "resetted", value.asInstanceOf[js.Any])
    
    inline def setVerifiedToken(value: String): Self = StObject.set(x, "verifiedToken", value.asInstanceOf[js.Any])
  }
}
