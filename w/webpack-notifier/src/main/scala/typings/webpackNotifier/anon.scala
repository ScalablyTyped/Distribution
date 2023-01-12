package typings.webpackNotifier

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: String
    
    var msg: String
    
    var status: String
  }
  object Message {
    
    inline def apply(message: String, msg: String, status: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in 'success' | 'warning' | 'error' ]: string} */
  trait keyinsuccesswarningerrors extends StObject {
    
    var error: String
    
    var success: String
    
    var warning: String
  }
  object keyinsuccesswarningerrors {
    
    inline def apply(error: String, success: String, warning: String): keyinsuccesswarningerrors = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinsuccesswarningerrors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: keyinsuccesswarningerrors] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
