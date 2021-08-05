package typings.validateNpmPackage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pck: js.Object): Result = ^.asInstanceOf[js.Dynamic].apply(pck.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("validate-npm-package", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Result extends StObject {
    
    var errors: js.Array[String]
    
    var validForNewPackages: Boolean
    
    var validForOldPackages: Boolean
    
    var warnings: js.Array[String]
  }
  object Result {
    
    inline def apply(
      errors: js.Array[String],
      validForNewPackages: Boolean,
      validForOldPackages: Boolean,
      warnings: js.Array[String]
    ): Result = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], validForNewPackages = validForNewPackages.asInstanceOf[js.Any], validForOldPackages = validForOldPackages.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setValidForNewPackages(value: Boolean): Self = StObject.set(x, "validForNewPackages", value.asInstanceOf[js.Any])
      
      inline def setValidForOldPackages(value: Boolean): Self = StObject.set(x, "validForOldPackages", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
}
