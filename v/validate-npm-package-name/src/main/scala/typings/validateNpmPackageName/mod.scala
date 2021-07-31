package typings.validateNpmPackageName

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(name: String): Result = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("validate-npm-package-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("validate-npm-package-name", "scopedPackagePattern")
  @js.native
  def scopedPackagePattern: RegExp = js.native
  @scala.inline
  def scopedPackagePattern_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scopedPackagePattern")(x.asInstanceOf[js.Any])
  
  trait Result extends StObject {
    
    var errors: js.UndefOr[js.Array[String]] = js.undefined
    
    var validForNewPackages: Boolean
    
    var validForOldPackages: Boolean
    
    var warnings: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Result {
    
    @scala.inline
    def apply(validForNewPackages: Boolean, validForOldPackages: Boolean): Result = {
      val __obj = js.Dynamic.literal(validForNewPackages = validForNewPackages.asInstanceOf[js.Any], validForOldPackages = validForOldPackages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setValidForNewPackages(value: Boolean): Self = StObject.set(x, "validForNewPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidForOldPackages(value: Boolean): Self = StObject.set(x, "validForOldPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      @scala.inline
      def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
}
