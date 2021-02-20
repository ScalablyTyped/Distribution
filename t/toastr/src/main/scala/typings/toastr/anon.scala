package typings.toastr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error extends StObject {
    
    /**
      * Icon to use on error toasts.
      * @default toast-error
      */
    var error: String = js.native
    
    /**
      * Icon to use on info toasts.
      * @default toast-info
      */
    var info: String = js.native
    
    /**
      * Icon to use on success toasts.
      * @default toast-success
      */
    var success: String = js.native
    
    /**
      * Icon to use on warning toasts.
      * @default toast-warning
      */
    var warning: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: String, info: String, success: String, warning: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Force extends StObject {
    
    var force: Boolean = js.native
  }
  object Force {
    
    @scala.inline
    def apply(force: Boolean): Force = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Force]
    }
    
    @scala.inline
    implicit class ForceMutableBuilder[Self <: Force] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
}
