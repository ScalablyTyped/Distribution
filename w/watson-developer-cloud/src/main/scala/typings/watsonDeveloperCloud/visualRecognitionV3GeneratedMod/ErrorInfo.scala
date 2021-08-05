package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
trait ErrorInfo extends StObject {
  
  /** HTTP status code. */
  var code: Double
  
  /** Human-readable error description. For example, `File size limit exceeded`. */
  var description: String
  
  /** Codified error string. For example, `limit_exceeded`. */
  var error_id: String
}
object ErrorInfo {
  
  inline def apply(code: Double, description: String, error_id: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], error_id = error_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
  
  extension [Self <: ErrorInfo](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setError_id(value: String): Self = StObject.set(x, "error_id", value.asInstanceOf[js.Any])
  }
}
