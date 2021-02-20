package typings.validateNpmPackage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("validate-npm-package", JSImport.Namespace)
  @js.native
  def apply(pck: js.Object): Result = js.native
  
  @js.native
  trait Result extends StObject {
    
    var errors: js.Array[String] = js.native
    
    var validForNewPackages: Boolean = js.native
    
    var validForOldPackages: Boolean = js.native
    
    var warnings: js.Array[String] = js.native
  }
  object Result {
    
    @scala.inline
    def apply(
      errors: js.Array[String],
      validForNewPackages: Boolean,
      validForOldPackages: Boolean,
      warnings: js.Array[String]
    ): Result = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], validForNewPackages = validForNewPackages.asInstanceOf[js.Any], validForOldPackages = validForOldPackages.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setValidForNewPackages(value: Boolean): Self = StObject.set(x, "validForNewPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidForOldPackages(value: Boolean): Self = StObject.set(x, "validForOldPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
}
