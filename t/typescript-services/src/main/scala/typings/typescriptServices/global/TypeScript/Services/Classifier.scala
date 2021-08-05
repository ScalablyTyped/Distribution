package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.Services.IClassifierHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.Classifier")
@js.native
class Classifier protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.Classifier {
  def this(host: IClassifierHost) = this()
  
  /* private */ /* CompleteClass */
  override def addResult(text: js.Any, offset: js.Any, result: js.Any, length: js.Any, kind: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var characterWindow: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def classFromKind(kind: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var diagnostics: js.Any = js.native
  
  /* CompleteClass */
  override def getClassificationsForLine(text: String, lexState: typings.typescriptServices.TypeScript.Services.EndOfLineState): typings.typescriptServices.TypeScript.Services.ClassificationResult = js.native
  
  /* CompleteClass */
  var host: IClassifierHost = js.native
  
  /* private */ /* CompleteClass */
  override def processToken(text: js.Any, offset: js.Any, token: js.Any, result: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def processTriviaList(text: js.Any, offset: js.Any, triviaList: js.Any, result: js.Any): js.Any = js.native
  
  /* private */ /* CompleteClass */
  var scanner: js.Any = js.native
}
