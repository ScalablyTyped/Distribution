package typings.xmlrpc

import typings.std.Date
import typings.xmlrpc.mod.HeadersProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Expires extends StObject {
    
    var expires: Date
    
    var secure: Boolean
  }
  object Expires {
    
    inline def apply(expires: Date, secure: Boolean): Expires = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expires]
    }
    
    extension [Self <: Expires](x: Self) {
      
      inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pass extends StObject {
    
    var pass: String
    
    var user: String
  }
  object Pass {
    
    inline def apply(pass: String, user: String): Pass = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pass]
    }
    
    extension [Self <: Pass](x: Self) {
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait Processors extends StObject {
    
    var processors: js.Array[HeadersProcessor]
  }
  object Processors {
    
    inline def apply(processors: js.Array[HeadersProcessor]): Processors = {
      val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Processors]
    }
    
    extension [Self <: Processors](x: Self) {
      
      inline def setProcessors(value: js.Array[HeadersProcessor]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
      
      inline def setProcessorsVarargs(value: HeadersProcessor*): Self = StObject.set(x, "processors", js.Array(value :_*))
    }
  }
}
