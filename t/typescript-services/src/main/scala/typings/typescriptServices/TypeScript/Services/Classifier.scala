package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classifier extends StObject {
  
  /* private */ def addResult(text: Any, offset: Any, result: Any, length: Any, kind: Any): Any
  
  /* private */ var characterWindow: Any
  
  /* private */ def classFromKind(kind: Any): Any
  
  /* private */ var diagnostics: Any
  
  def getClassificationsForLine(text: String, lexState: EndOfLineState): ClassificationResult
  
  var host: IClassifierHost
  
  /* private */ def processToken(text: Any, offset: Any, token: Any, result: Any): Any
  
  /* private */ def processTriviaList(text: Any, offset: Any, triviaList: Any, result: Any): Any
  
  /* private */ var scanner: Any
}
object Classifier {
  
  inline def apply(
    addResult: (Any, Any, Any, Any, Any) => Any,
    characterWindow: Any,
    classFromKind: Any => Any,
    diagnostics: Any,
    getClassificationsForLine: (String, EndOfLineState) => ClassificationResult,
    host: IClassifierHost,
    processToken: (Any, Any, Any, Any) => Any,
    processTriviaList: (Any, Any, Any, Any) => Any,
    scanner: Any
  ): Classifier = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction5(addResult), characterWindow = characterWindow.asInstanceOf[js.Any], classFromKind = js.Any.fromFunction1(classFromKind), diagnostics = diagnostics.asInstanceOf[js.Any], getClassificationsForLine = js.Any.fromFunction2(getClassificationsForLine), host = host.asInstanceOf[js.Any], processToken = js.Any.fromFunction4(processToken), processTriviaList = js.Any.fromFunction4(processTriviaList), scanner = scanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
  
  extension [Self <: Classifier](x: Self) {
    
    inline def setAddResult(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "addResult", js.Any.fromFunction5(value))
    
    inline def setCharacterWindow(value: Any): Self = StObject.set(x, "characterWindow", value.asInstanceOf[js.Any])
    
    inline def setClassFromKind(value: Any => Any): Self = StObject.set(x, "classFromKind", js.Any.fromFunction1(value))
    
    inline def setDiagnostics(value: Any): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setGetClassificationsForLine(value: (String, EndOfLineState) => ClassificationResult): Self = StObject.set(x, "getClassificationsForLine", js.Any.fromFunction2(value))
    
    inline def setHost(value: IClassifierHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setProcessToken(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "processToken", js.Any.fromFunction4(value))
    
    inline def setProcessTriviaList(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "processTriviaList", js.Any.fromFunction4(value))
    
    inline def setScanner(value: Any): Self = StObject.set(x, "scanner", value.asInstanceOf[js.Any])
  }
}
