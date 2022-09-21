package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.CompilationSettings
import typings.typescriptServices.TypeScript.IPreProcessedFileInfo
import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.Services.ICoreServicesHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.CoreServices")
@js.native
open class CoreServices protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.CoreServices {
  def this(host: ICoreServicesHost) = this()
  
  /* CompleteClass */
  override def collectGarbage(): Unit = js.native
  
  /* CompleteClass */
  override def dumpMemory(): String = js.native
  
  /* CompleteClass */
  override def getDefaultCompilationSettings(): CompilationSettings = js.native
  
  /* CompleteClass */
  override def getMemoryInfo(): js.Array[Any] = js.native
  
  /* CompleteClass */
  override def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  
  /* CompleteClass */
  var host: ICoreServicesHost = js.native
}
