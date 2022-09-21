package typings.validateNpmPackageLicense

import typings.validateNpmPackageLicense.validateNpmPackageLicenseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(license: String): Result = ^.asInstanceOf[js.Dynamic].apply(license.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("validate-npm-package-license", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Result extends StObject {
    
    var inFile: js.UndefOr[String] = js.undefined
    
    var spdx: js.UndefOr[`true`] = js.undefined
    
    var unlicensed: js.UndefOr[`true`] = js.undefined
    
    var validForNewPackages: Boolean
    
    var validForOldPackages: Boolean
    
    var warnings: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Result {
    
    inline def apply(validForNewPackages: Boolean, validForOldPackages: Boolean): Result = {
      val __obj = js.Dynamic.literal(validForNewPackages = validForNewPackages.asInstanceOf[js.Any], validForOldPackages = validForOldPackages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setInFile(value: String): Self = StObject.set(x, "inFile", value.asInstanceOf[js.Any])
      
      inline def setInFileUndefined: Self = StObject.set(x, "inFile", js.undefined)
      
      inline def setSpdx(value: `true`): Self = StObject.set(x, "spdx", value.asInstanceOf[js.Any])
      
      inline def setSpdxUndefined: Self = StObject.set(x, "spdx", js.undefined)
      
      inline def setUnlicensed(value: `true`): Self = StObject.set(x, "unlicensed", value.asInstanceOf[js.Any])
      
      inline def setUnlicensedUndefined: Self = StObject.set(x, "unlicensed", js.undefined)
      
      inline def setValidForNewPackages(value: Boolean): Self = StObject.set(x, "validForNewPackages", value.asInstanceOf[js.Any])
      
      inline def setValidForOldPackages(value: Boolean): Self = StObject.set(x, "validForOldPackages", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
