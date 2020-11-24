package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classifier extends js.Object {
  
  /* private */ def addResult(text: js.Any, offset: js.Any, result: js.Any, length: js.Any, kind: js.Any): js.Any = js.native
  
  var characterWindow: js.Any = js.native
  
  /* private */ def classFromKind(kind: js.Any): js.Any = js.native
  
  var diagnostics: js.Any = js.native
  
  def getClassificationsForLine(text: String, lexState: EndOfLineState): ClassificationResult = js.native
  
  var host: IClassifierHost = js.native
  
  /* private */ def processToken(text: js.Any, offset: js.Any, token: js.Any, result: js.Any): js.Any = js.native
  
  /* private */ def processTriviaList(text: js.Any, offset: js.Any, triviaList: js.Any, result: js.Any): js.Any = js.native
  
  var scanner: js.Any = js.native
}
object Classifier {
  
  @scala.inline
  def apply(
    addResult: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    characterWindow: js.Any,
    classFromKind: js.Any => js.Any,
    diagnostics: js.Any,
    getClassificationsForLine: (String, EndOfLineState) => ClassificationResult,
    host: IClassifierHost,
    processToken: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    processTriviaList: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    scanner: js.Any
  ): Classifier = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction5(addResult), characterWindow = characterWindow.asInstanceOf[js.Any], classFromKind = js.Any.fromFunction1(classFromKind), diagnostics = diagnostics.asInstanceOf[js.Any], getClassificationsForLine = js.Any.fromFunction2(getClassificationsForLine), host = host.asInstanceOf[js.Any], processToken = js.Any.fromFunction4(processToken), processTriviaList = js.Any.fromFunction4(processTriviaList), scanner = scanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
  
  @scala.inline
  implicit class ClassifierOps[Self <: Classifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddResult(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("addResult", js.Any.fromFunction5(value))
    
    @scala.inline
    def setCharacterWindow(value: js.Any): Self = this.set("characterWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassFromKind(value: js.Any => js.Any): Self = this.set("classFromKind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiagnostics(value: js.Any): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClassificationsForLine(value: (String, EndOfLineState) => ClassificationResult): Self = this.set("getClassificationsForLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHost(value: IClassifierHost): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessToken(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("processToken", js.Any.fromFunction4(value))
    
    @scala.inline
    def setProcessTriviaList(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("processTriviaList", js.Any.fromFunction4(value))
    
    @scala.inline
    def setScanner(value: js.Any): Self = this.set("scanner", value.asInstanceOf[js.Any])
  }
}
