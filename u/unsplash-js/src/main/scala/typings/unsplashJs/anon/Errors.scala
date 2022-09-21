package typings.unsplashJs.anon

import typings.unsplashJs.errorsMod.ErrorSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: typings.unsplashJs.errorsMod.Errors
  
  var source: ErrorSource
}
object Errors {
  
  inline def apply(errors: typings.unsplashJs.errorsMod.Errors, source: ErrorSource): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: typings.unsplashJs.errorsMod.Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ErrorSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
