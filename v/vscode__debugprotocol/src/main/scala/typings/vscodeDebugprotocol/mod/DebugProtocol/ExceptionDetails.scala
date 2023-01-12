package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Detailed information about an exception that has occurred. */
trait ExceptionDetails extends StObject {
  
  /** An expression that can be evaluated in the current scope to obtain the exception object. */
  var evaluateName: js.UndefOr[String] = js.undefined
  
  /** Fully-qualified type name of the exception object. */
  var fullTypeName: js.UndefOr[String] = js.undefined
  
  /** Details of the exception contained by this exception, if any. */
  var innerException: js.UndefOr[js.Array[ExceptionDetails]] = js.undefined
  
  /** Message contained in the exception. */
  var message: js.UndefOr[String] = js.undefined
  
  /** Stack trace at the time the exception was thrown. */
  var stackTrace: js.UndefOr[String] = js.undefined
  
  /** Short type name of the exception object. */
  var typeName: js.UndefOr[String] = js.undefined
}
object ExceptionDetails {
  
  inline def apply(): ExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExceptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExceptionDetails] (val x: Self) extends AnyVal {
    
    inline def setEvaluateName(value: String): Self = StObject.set(x, "evaluateName", value.asInstanceOf[js.Any])
    
    inline def setEvaluateNameUndefined: Self = StObject.set(x, "evaluateName", js.undefined)
    
    inline def setFullTypeName(value: String): Self = StObject.set(x, "fullTypeName", value.asInstanceOf[js.Any])
    
    inline def setFullTypeNameUndefined: Self = StObject.set(x, "fullTypeName", js.undefined)
    
    inline def setInnerException(value: js.Array[ExceptionDetails]): Self = StObject.set(x, "innerException", value.asInstanceOf[js.Any])
    
    inline def setInnerExceptionUndefined: Self = StObject.set(x, "innerException", js.undefined)
    
    inline def setInnerExceptionVarargs(value: ExceptionDetails*): Self = StObject.set(x, "innerException", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
