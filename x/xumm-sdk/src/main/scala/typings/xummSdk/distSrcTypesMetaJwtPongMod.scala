package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMetaJwtPongMod {
  
  trait JwtPong extends StObject {
    
    var app_name: String
    
    var app_uuidv4: String
    
    var aud: String
    
    var client_id: String
    
    var exp: Double
    
    var iat: Double
    
    var iss: String
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var payload_uuidv4: String
    
    var pong: Boolean
    
    var scope: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var sub: String
    
    var usertoken_uuidv4: String
  }
  object JwtPong {
    
    inline def apply(
      app_name: String,
      app_uuidv4: String,
      aud: String,
      client_id: String,
      exp: Double,
      iat: Double,
      iss: String,
      payload_uuidv4: String,
      pong: Boolean,
      sub: String,
      usertoken_uuidv4: String
    ): JwtPong = {
      val __obj = js.Dynamic.literal(app_name = app_name.asInstanceOf[js.Any], app_uuidv4 = app_uuidv4.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], pong = pong.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], usertoken_uuidv4 = usertoken_uuidv4.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtPong]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwtPong] (val x: Self) extends AnyVal {
      
      inline def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
      
      inline def setApp_uuidv4(value: String): Self = StObject.set(x, "app_uuidv4", value.asInstanceOf[js.Any])
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPayload_uuidv4(value: String): Self = StObject.set(x, "payload_uuidv4", value.asInstanceOf[js.Any])
      
      inline def setPong(value: Boolean): Self = StObject.set(x, "pong", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUsertoken_uuidv4(value: String): Self = StObject.set(x, "usertoken_uuidv4", value.asInstanceOf[js.Any])
    }
  }
}
