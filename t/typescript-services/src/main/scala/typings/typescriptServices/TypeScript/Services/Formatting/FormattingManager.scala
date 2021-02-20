package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.TextEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattingManager extends StObject {
  
  def formatDocument(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  
  def formatOnClosingCurlyBrace(caretPosition: Double): js.Array[TextEdit] = js.native
  
  def formatOnEnter(caretPosition: Double): js.Array[TextEdit] = js.native
  
  def formatOnPaste(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  
  def formatOnSemicolon(caretPosition: Double): js.Array[TextEdit] = js.native
  
  def formatSelection(minChar: Double, limChar: Double): js.Array[TextEdit] = js.native
  
  /* private */ def formatSpan(span: js.Any, formattingRequestKind: js.Any): js.Any = js.native
  
  var options: js.Any = js.native
  
  var rulesProvider: js.Any = js.native
  
  var snapshot: js.Any = js.native
  
  var syntaxTree: js.Any = js.native
}
object FormattingManager {
  
  @scala.inline
  def apply(
    formatDocument: (Double, Double) => js.Array[TextEdit],
    formatOnClosingCurlyBrace: Double => js.Array[TextEdit],
    formatOnEnter: Double => js.Array[TextEdit],
    formatOnPaste: (Double, Double) => js.Array[TextEdit],
    formatOnSemicolon: Double => js.Array[TextEdit],
    formatSelection: (Double, Double) => js.Array[TextEdit],
    formatSpan: (js.Any, js.Any) => js.Any,
    options: js.Any,
    rulesProvider: js.Any,
    snapshot: js.Any,
    syntaxTree: js.Any
  ): FormattingManager = {
    val __obj = js.Dynamic.literal(formatDocument = js.Any.fromFunction2(formatDocument), formatOnClosingCurlyBrace = js.Any.fromFunction1(formatOnClosingCurlyBrace), formatOnEnter = js.Any.fromFunction1(formatOnEnter), formatOnPaste = js.Any.fromFunction2(formatOnPaste), formatOnSemicolon = js.Any.fromFunction1(formatOnSemicolon), formatSelection = js.Any.fromFunction2(formatSelection), formatSpan = js.Any.fromFunction2(formatSpan), options = options.asInstanceOf[js.Any], rulesProvider = rulesProvider.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], syntaxTree = syntaxTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingManager]
  }
  
  @scala.inline
  implicit class FormattingManagerMutableBuilder[Self <: FormattingManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatDocument(value: (Double, Double) => js.Array[TextEdit]): Self = StObject.set(x, "formatDocument", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatOnClosingCurlyBrace(value: Double => js.Array[TextEdit]): Self = StObject.set(x, "formatOnClosingCurlyBrace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatOnEnter(value: Double => js.Array[TextEdit]): Self = StObject.set(x, "formatOnEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatOnPaste(value: (Double, Double) => js.Array[TextEdit]): Self = StObject.set(x, "formatOnPaste", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatOnSemicolon(value: Double => js.Array[TextEdit]): Self = StObject.set(x, "formatOnSemicolon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatSelection(value: (Double, Double) => js.Array[TextEdit]): Self = StObject.set(x, "formatSelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatSpan(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "formatSpan", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesProvider(value: js.Any): Self = StObject.set(x, "rulesProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: js.Any): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxTree(value: js.Any): Self = StObject.set(x, "syntaxTree", value.asInstanceOf[js.Any])
  }
}
