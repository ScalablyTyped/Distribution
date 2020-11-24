package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.CompilationSettings
import typings.typescriptServices.TypeScript.IPreProcessedFileInfo
import typings.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreServices extends js.Object {
  
  def collectGarbage(): Unit = js.native
  
  def dumpMemory(): String = js.native
  
  def getDefaultCompilationSettings(): CompilationSettings = js.native
  
  def getMemoryInfo(): js.Array[_] = js.native
  
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  
  var host: ICoreServicesHost = js.native
}
object CoreServices {
  
  @scala.inline
  def apply(
    collectGarbage: () => Unit,
    dumpMemory: () => String,
    getDefaultCompilationSettings: () => CompilationSettings,
    getMemoryInfo: () => js.Array[_],
    getPreProcessedFileInfo: (String, IScriptSnapshot) => IPreProcessedFileInfo,
    host: ICoreServicesHost
  ): CoreServices = {
    val __obj = js.Dynamic.literal(collectGarbage = js.Any.fromFunction0(collectGarbage), dumpMemory = js.Any.fromFunction0(dumpMemory), getDefaultCompilationSettings = js.Any.fromFunction0(getDefaultCompilationSettings), getMemoryInfo = js.Any.fromFunction0(getMemoryInfo), getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServices]
  }
  
  @scala.inline
  implicit class CoreServicesOps[Self <: CoreServices] (val x: Self) extends AnyVal {
    
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
    def setCollectGarbage(value: () => Unit): Self = this.set("collectGarbage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDumpMemory(value: () => String): Self = this.set("dumpMemory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultCompilationSettings(value: () => CompilationSettings): Self = this.set("getDefaultCompilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMemoryInfo(value: () => js.Array[_]): Self = this.set("getMemoryInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => IPreProcessedFileInfo): Self = this.set("getPreProcessedFileInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHost(value: ICoreServicesHost): Self = this.set("host", value.asInstanceOf[js.Any])
  }
}
