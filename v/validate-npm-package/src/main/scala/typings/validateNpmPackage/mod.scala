package typings.validateNpmPackage

import typings.validateNpmPackage.validateNpmPackageBooleans.`false`
import typings.validateNpmPackage.validateNpmPackageBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pck: js.Object): ValidNames | InvalidNames | LegacyNames = ^.asInstanceOf[js.Dynamic].apply(pck.asInstanceOf[js.Any]).asInstanceOf[ValidNames | InvalidNames | LegacyNames]
  
  @JSImport("validate-npm-package", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait InvalidNames extends StObject {
    
    var errors: js.Array[String]
    
    var validForNewPackages: `false`
    
    var validForOldPackages: `false`
  }
  object InvalidNames {
    
    inline def apply(errors: js.Array[String]): InvalidNames = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], validForNewPackages = false, validForOldPackages = false)
      __obj.asInstanceOf[InvalidNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidNames] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setValidForNewPackages(value: `false`): Self = StObject.set(x, "validForNewPackages", value.asInstanceOf[js.Any])
      
      inline def setValidForOldPackages(value: `false`): Self = StObject.set(x, "validForOldPackages", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegacyNames extends StObject {
    
    var validForNewPackages: `false`
    
    var validForOldPackages: `true`
    
    var warnings: js.Array[String]
  }
  object LegacyNames {
    
    inline def apply(warnings: js.Array[String]): LegacyNames = {
      val __obj = js.Dynamic.literal(validForNewPackages = false, validForOldPackages = true, warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegacyNames] (val x: Self) extends AnyVal {
      
      inline def setValidForNewPackages(value: `false`): Self = StObject.set(x, "validForNewPackages", value.asInstanceOf[js.Any])
      
      inline def setValidForOldPackages(value: `true`): Self = StObject.set(x, "validForOldPackages", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait ValidNames extends StObject {
    
    var validForNewPackages: `true`
    
    var validForOldPackages: `true`
  }
  object ValidNames {
    
    inline def apply(): ValidNames = {
      val __obj = js.Dynamic.literal(validForNewPackages = true, validForOldPackages = true)
      __obj.asInstanceOf[ValidNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidNames] (val x: Self) extends AnyVal {
      
      inline def setValidForNewPackages(value: `true`): Self = StObject.set(x, "validForNewPackages", value.asInstanceOf[js.Any])
      
      inline def setValidForOldPackages(value: `true`): Self = StObject.set(x, "validForOldPackages", value.asInstanceOf[js.Any])
    }
  }
}
