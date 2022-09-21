package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xAppJwtPongMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait xAppJwtPong extends StObject {
    
    var app_name: String
    
    var app_uuidv4: String
    
    var exp: Double
    
    var iat: Double
    
    var ott_uuidv4: String
    
    var pong: Boolean
  }
  object xAppJwtPong {
    
    inline def apply(app_name: String, app_uuidv4: String, exp: Double, iat: Double, ott_uuidv4: String, pong: Boolean): xAppJwtPong = {
      val __obj = js.Dynamic.literal(app_name = app_name.asInstanceOf[js.Any], app_uuidv4 = app_uuidv4.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], ott_uuidv4 = ott_uuidv4.asInstanceOf[js.Any], pong = pong.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppJwtPong]
    }
    
    extension [Self <: xAppJwtPong](x: Self) {
      
      inline def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
      
      inline def setApp_uuidv4(value: String): Self = StObject.set(x, "app_uuidv4", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setOtt_uuidv4(value: String): Self = StObject.set(x, "ott_uuidv4", value.asInstanceOf[js.Any])
      
      inline def setPong(value: Boolean): Self = StObject.set(x, "pong", value.asInstanceOf[js.Any])
    }
  }
}
