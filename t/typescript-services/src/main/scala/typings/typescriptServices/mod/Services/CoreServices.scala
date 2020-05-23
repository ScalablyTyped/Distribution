package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.CompilationSettings
import typings.typescriptServices.TypeScript.IPreProcessedFileInfo
import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.Services.ICoreServicesHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CoreServices")
@js.native
class CoreServices protected ()
  extends typings.typescriptServices.TypeScript.Services.CoreServices {
  def this(host: ICoreServicesHost) = this()
  /* CompleteClass */
  override var host: ICoreServicesHost = js.native
  /* CompleteClass */
  override def collectGarbage(): Unit = js.native
  /* CompleteClass */
  override def dumpMemory(): String = js.native
  /* CompleteClass */
  override def getDefaultCompilationSettings(): CompilationSettings = js.native
  /* CompleteClass */
  override def getMemoryInfo(): js.Array[_] = js.native
  /* CompleteClass */
  override def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
}

