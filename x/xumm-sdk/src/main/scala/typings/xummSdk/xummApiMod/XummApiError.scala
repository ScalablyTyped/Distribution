package typings.xummSdk.xummApiMod

import typings.xummSdk.anon.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummApiError extends StObject {
  
  var error: Reference
}
object XummApiError {
  
  inline def apply(error: Reference): XummApiError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummApiError]
  }
  
  extension [Self <: XummApiError](x: Self) {
    
    inline def setError(value: Reference): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
