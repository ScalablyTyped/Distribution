package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.IClassifierHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Classifier")
@js.native
class Classifier protected ()
  extends typings.typescriptServices.TypeScript.Services.Classifier {
  def this(host: IClassifierHost) = this()
  /* CompleteClass */
  override var characterWindow: js.Any = js.native
  /* CompleteClass */
  override var diagnostics: js.Any = js.native
  /* CompleteClass */
  override var host: IClassifierHost = js.native
  /* CompleteClass */
  override var scanner: js.Any = js.native
  /* CompleteClass */
  /* private */ override def addResult(text: js.Any, offset: js.Any, result: js.Any, length: js.Any, kind: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def classFromKind(kind: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getClassificationsForLine(text: String, lexState: typings.typescriptServices.TypeScript.Services.EndOfLineState): typings.typescriptServices.TypeScript.Services.ClassificationResult = js.native
  /* CompleteClass */
  /* private */ override def processToken(text: js.Any, offset: js.Any, token: js.Any, result: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def processTriviaList(text: js.Any, offset: js.Any, triviaList: js.Any, result: js.Any): js.Any = js.native
}

