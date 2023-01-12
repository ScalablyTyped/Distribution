package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.TextEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattingManager extends StObject {
  
  def formatDocument(minChar: Double, limChar: Double): js.Array[TextEdit]
  
  def formatOnClosingCurlyBrace(caretPosition: Double): js.Array[TextEdit]
  
  def formatOnEnter(caretPosition: Double): js.Array[TextEdit]
  
  def formatOnPaste(minChar: Double, limChar: Double): js.Array[TextEdit]
  
  def formatOnSemicolon(caretPosition: Double): js.Array[TextEdit]
  
  def formatSelection(minChar: Double, limChar: Double): js.Array[TextEdit]
  
  /* private */ def formatSpan(span: Any, formattingRequestKind: Any): Any
  
  /* private */ var options: Any
  
  /* private */ var rulesProvider: Any
  
  /* private */ var snapshot: Any
  
  /* private */ var syntaxTree: Any
}
object FormattingManager {
  
  inline def apply(
    formatDocument: (Double, Double) => js.Array[TextEdit],
    formatOnClosingCurlyBrace: Double => js.Array[TextEdit],
    formatOnEnter: Double => js.Array[TextEdit],
    formatOnPaste: (Double, Double) => js.Array[TextEdit],
    formatOnSemicolon: Double => js.Array[TextEdit],
    formatSelection: (Double, Double) => js.Array[TextEdit],
    formatSpan: (Any, Any) => Any,
    options: Any,
    rulesProvider: Any,
    snapshot: Any,
    syntaxTree: Any
  ): FormattingManager = {
    val __obj = js.Dynamic.literal(formatDocument = js.Any.fromFunction2(formatDocument), formatOnClosingCurlyBrace = js.Any.fromFunction1(formatOnClosingCurlyBrace), formatOnEnter = js.Any.fromFunction1(formatOnEnter), formatOnPaste = js.Any.fromFunction2(formatOnPaste), formatOnSemicolon = js.Any.fromFunction1(formatOnSemicolon), formatSelection = js.Any.fromFunction2(formatSelection), formatSpan = js.Any.fromFunction2(formatSpan), options = options.asInstanceOf[js.Any], rulesProvider = rulesProvider.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], syntaxTree = syntaxTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormattingManager] (val x: Self) extends AnyVal {
    
    inline def setFormatDocument(value: (Double, Double) => js.Array[TextEdit]): Self = StObject.set(x, "formatDocument", js.Any.fromFunction2(value))
    
    inline def setFormatOnClosingCurlyBrace(value: Double => js.Array[TextEdit]): Self = StObject.set(x, "formatOnClosingCurlyBrace", js.Any.fromFunction1(value))
    
    inline def setFormatOnEnter(value: Double => js.Array[TextEdit]): Self = StObject.set(x, "formatOnEnter", js.Any.fromFunction1(value))
    
    inline def setFormatOnPaste(value: (Double, Double) => js.Array[TextEdit]): Self = StObject.set(x, "formatOnPaste", js.Any.fromFunction2(value))
    
    inline def setFormatOnSemicolon(value: Double => js.Array[TextEdit]): Self = StObject.set(x, "formatOnSemicolon", js.Any.fromFunction1(value))
    
    inline def setFormatSelection(value: (Double, Double) => js.Array[TextEdit]): Self = StObject.set(x, "formatSelection", js.Any.fromFunction2(value))
    
    inline def setFormatSpan(value: (Any, Any) => Any): Self = StObject.set(x, "formatSpan", js.Any.fromFunction2(value))
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRulesProvider(value: Any): Self = StObject.set(x, "rulesProvider", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Any): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSyntaxTree(value: Any): Self = StObject.set(x, "syntaxTree", value.asInstanceOf[js.Any])
  }
}
