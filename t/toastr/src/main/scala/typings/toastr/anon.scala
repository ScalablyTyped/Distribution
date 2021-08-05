package typings.toastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    /**
      * Icon to use on error toasts.
      * @default toast-error
      */
    var error: String
    
    /**
      * Icon to use on info toasts.
      * @default toast-info
      */
    var info: String
    
    /**
      * Icon to use on success toasts.
      * @default toast-success
      */
    var success: String
    
    /**
      * Icon to use on warning toasts.
      * @default toast-warning
      */
    var warning: String
  }
  object Error {
    
    inline def apply(error: String, info: String, success: String, warning: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait Force extends StObject {
    
    var force: Boolean
  }
  object Force {
    
    inline def apply(force: Boolean): Force = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Force]
    }
    
    extension [Self <: Force](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
}
