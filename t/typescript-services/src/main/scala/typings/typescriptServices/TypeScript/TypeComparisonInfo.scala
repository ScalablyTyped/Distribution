package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeComparisonInfo extends StObject {
  
  def addMessage(message: String): Unit = js.native
  
  var flags: TypeRelationshipFlags = js.native
  
  var indent: js.Any = js.native
  
  /* private */ def indentString(): js.Any = js.native
  
  var message: String = js.native
  
  var onlyCaptureFirstError: Boolean = js.native
  
  var stringConstantVal: AST = js.native
}
object TypeComparisonInfo {
  
  @scala.inline
  def apply(
    addMessage: String => Unit,
    flags: TypeRelationshipFlags,
    indent: js.Any,
    indentString: () => js.Any,
    message: String,
    onlyCaptureFirstError: Boolean,
    stringConstantVal: AST
  ): TypeComparisonInfo = {
    val __obj = js.Dynamic.literal(addMessage = js.Any.fromFunction1(addMessage), flags = flags.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], indentString = js.Any.fromFunction0(indentString), message = message.asInstanceOf[js.Any], onlyCaptureFirstError = onlyCaptureFirstError.asInstanceOf[js.Any], stringConstantVal = stringConstantVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeComparisonInfo]
  }
  
  @scala.inline
  implicit class TypeComparisonInfoMutableBuilder[Self <: TypeComparisonInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMessage(value: String => Unit): Self = StObject.set(x, "addMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlags(value: TypeRelationshipFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: js.Any): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentString(value: () => js.Any): Self = StObject.set(x, "indentString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyCaptureFirstError(value: Boolean): Self = StObject.set(x, "onlyCaptureFirstError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringConstantVal(value: AST): Self = StObject.set(x, "stringConstantVal", value.asInstanceOf[js.Any])
  }
}
