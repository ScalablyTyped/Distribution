package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.Services.IClassifierHost
import typings.typescriptServices.TypeScript.Services.IShimFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.ClassifierShim")
@js.native
class ClassifierShim protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.ClassifierShim {
  def this(factory: IShimFactory, host: IClassifierHost) = this()
  
  /* CompleteClass */
  var classifier: typings.typescriptServices.TypeScript.Services.Classifier = js.native
  
  /* CompleteClass */
  override def dispose(dummy: js.Any): Unit = js.native
  
  /* private */ /* CompleteClass */
  var factory: js.Any = js.native
  
  /* CompleteClass */
  override def getClassificationsForLine(text: String, lexState: typings.typescriptServices.TypeScript.Services.EndOfLineState): String = js.native
  
  /* CompleteClass */
  var host: IClassifierHost = js.native
}
