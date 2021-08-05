package typings.winstonMail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ca extends StObject {
    
    var ca: String
    
    var cert: String
    
    var key: String
  }
  object Ca {
    
    inline def apply(ca: String, cert: String, key: String): Ca = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ca]
    }
    
    extension [Self <: Ca](x: Self) {
      
      inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ciphers extends StObject {
    
    var ciphers: String
  }
  object Ciphers {
    
    inline def apply(ciphers: String): Ciphers = {
      val __obj = js.Dynamic.literal(ciphers = ciphers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ciphers]
    }
    
    extension [Self <: Ciphers](x: Self) {
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    var level: String
    
    var message: String
    
    var meta: js.Any
  }
  object Level {
    
    inline def apply(level: String, message: String, meta: js.Any): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
