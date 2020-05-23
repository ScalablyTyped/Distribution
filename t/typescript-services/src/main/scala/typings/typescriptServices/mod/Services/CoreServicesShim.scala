package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.Services.ICoreServicesHost
import typings.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CoreServicesShim")
@js.native
class CoreServicesShim protected ()
  extends typings.typescriptServices.TypeScript.Services.CoreServicesShim {
  def this(factory: IShimFactory, host: ICoreServicesHost) = this()
  /* CompleteClass */
  override var factory: js.Any = js.native
  /* CompleteClass */
  override var host: ICoreServicesHost = js.native
  /* CompleteClass */
  override var logger: ILogger = js.native
  /* CompleteClass */
  override var services: typings.typescriptServices.TypeScript.Services.CoreServices = js.native
  /* CompleteClass */
  override def dispose(dummy: js.Any): Unit = js.native
  /* CompleteClass */
  override def dumpMemory(dummy: js.Any): String = js.native
  /* CompleteClass */
  /* private */ override def forwardJSONCall(actionDescription: js.Any, action: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getDefaultCompilationSettings(): String = js.native
  /* CompleteClass */
  override def getMemoryInfo(dummy: js.Any): String = js.native
  /* CompleteClass */
  override def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): String = js.native
}

