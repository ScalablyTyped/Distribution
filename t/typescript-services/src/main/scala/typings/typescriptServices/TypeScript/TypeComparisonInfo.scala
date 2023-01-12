package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeComparisonInfo extends StObject {
  
  def addMessage(message: String): Unit
  
  var flags: TypeRelationshipFlags
  
  /* private */ var indent: Any
  
  /* private */ def indentString(): Any
  
  var message: String
  
  var onlyCaptureFirstError: Boolean
  
  var stringConstantVal: AST
}
object TypeComparisonInfo {
  
  inline def apply(
    addMessage: String => Unit,
    flags: TypeRelationshipFlags,
    indent: Any,
    indentString: () => Any,
    message: String,
    onlyCaptureFirstError: Boolean,
    stringConstantVal: AST
  ): TypeComparisonInfo = {
    val __obj = js.Dynamic.literal(addMessage = js.Any.fromFunction1(addMessage), flags = flags.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], indentString = js.Any.fromFunction0(indentString), message = message.asInstanceOf[js.Any], onlyCaptureFirstError = onlyCaptureFirstError.asInstanceOf[js.Any], stringConstantVal = stringConstantVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeComparisonInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeComparisonInfo] (val x: Self) extends AnyVal {
    
    inline def setAddMessage(value: String => Unit): Self = StObject.set(x, "addMessage", js.Any.fromFunction1(value))
    
    inline def setFlags(value: TypeRelationshipFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: Any): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentString(value: () => Any): Self = StObject.set(x, "indentString", js.Any.fromFunction0(value))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOnlyCaptureFirstError(value: Boolean): Self = StObject.set(x, "onlyCaptureFirstError", value.asInstanceOf[js.Any])
    
    inline def setStringConstantVal(value: AST): Self = StObject.set(x, "stringConstantVal", value.asInstanceOf[js.Any])
  }
}
