package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.Services.IClassifierHost
import typings.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.ClassifierShim")
@js.native
class ClassifierShim protected ()
  extends typings.typescriptServices.TypeScript.Services.ClassifierShim {
  def this(factory: IShimFactory, host: IClassifierHost) = this()
  /* CompleteClass */
  override var classifier: typings.typescriptServices.TypeScript.Services.Classifier = js.native
  /* CompleteClass */
  override var factory: js.Any = js.native
  /* CompleteClass */
  override var host: IClassifierHost = js.native
  /* CompleteClass */
  override def dispose(dummy: js.Any): Unit = js.native
  /* CompleteClass */
  override def getClassificationsForLine(text: String, lexState: typings.typescriptServices.TypeScript.Services.EndOfLineState): String = js.native
}

