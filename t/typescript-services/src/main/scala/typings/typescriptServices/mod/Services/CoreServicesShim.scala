package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.Services.ICoreServicesHost
import typings.typescriptServices.TypeScript.Services.IShimFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.CoreServicesShim")
@js.native
open class CoreServicesShim protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.CoreServicesShim {
  def this(factory: IShimFactory, host: ICoreServicesHost) = this()
  
  /* CompleteClass */
  override def dispose(dummy: Any): Unit = js.native
  
  /* CompleteClass */
  override def dumpMemory(dummy: Any): String = js.native
  
  /* private */ /* CompleteClass */
  var factory: Any = js.native
  
  /* private */ /* CompleteClass */
  override def forwardJSONCall(actionDescription: Any, action: Any): Any = js.native
  
  /* CompleteClass */
  override def getDefaultCompilationSettings(): String = js.native
  
  /* CompleteClass */
  override def getMemoryInfo(dummy: Any): String = js.native
  
  /* CompleteClass */
  override def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): String = js.native
  
  /* CompleteClass */
  var host: ICoreServicesHost = js.native
  
  /* CompleteClass */
  var logger: ILogger = js.native
  
  /* CompleteClass */
  var services: typings.typescriptServices.TypeScript.Services.CoreServices = js.native
}
