package typings.validateNpmPackageName

import typings.validateNpmPackageName.validateNpmPackageNameBooleans.`false`
import typings.validateNpmPackageName.validateNpmPackageNameBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(name: String): ValidNames | InvalidNames | LegacyNames = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[ValidNames | InvalidNames | LegacyNames]
  
  @JSImport("validate-npm-package-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait InvalidNames
    extends StObject
       with Results {
    
    @JSName("errors")
    var errors_InvalidNames: js.Array[String]
    
    @JSName("validForNewPackages")
    var validForNewPackages_InvalidNames: `false`
    
    @JSName("validForOldPackages")
    var validForOldPackages_InvalidNames: `false`
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
  
  trait LegacyNames
    extends StObject
       with Results {
    
    @JSName("validForNewPackages")
    var validForNewPackages_LegacyNames: `false`
    
    @JSName("validForOldPackages")
    var validForOldPackages_LegacyNames: `true`
    
    @JSName("warnings")
    var warnings_LegacyNames: js.Array[String]
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
  
  trait Results extends StObject {
    
    var errors: js.UndefOr[js.Array[String]] = js.undefined
    
    var validForNewPackages: Boolean
    
    var validForOldPackages: Boolean
    
    var warnings: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Results {
    
    inline def apply(validForNewPackages: Boolean, validForOldPackages: Boolean): Results = {
      val __obj = js.Dynamic.literal(validForNewPackages = validForNewPackages.asInstanceOf[js.Any], validForOldPackages = validForOldPackages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setValidForNewPackages(value: Boolean): Self = StObject.set(x, "validForNewPackages", value.asInstanceOf[js.Any])
      
      inline def setValidForOldPackages(value: Boolean): Self = StObject.set(x, "validForOldPackages", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait ValidNames
    extends StObject
       with Results {
    
    @JSName("validForNewPackages")
    var validForNewPackages_ValidNames: `true`
    
    @JSName("validForOldPackages")
    var validForOldPackages_ValidNames: `true`
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
