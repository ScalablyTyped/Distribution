package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.CompilationSettings
import typings.typescriptServices.TypeScript.IPreProcessedFileInfo
import typings.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreServices extends StObject {
  
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
  implicit class CoreServicesMutableBuilder[Self <: CoreServices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectGarbage(value: () => Unit): Self = StObject.set(x, "collectGarbage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDumpMemory(value: () => String): Self = StObject.set(x, "dumpMemory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultCompilationSettings(value: () => CompilationSettings): Self = StObject.set(x, "getDefaultCompilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMemoryInfo(value: () => js.Array[_]): Self = StObject.set(x, "getMemoryInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => IPreProcessedFileInfo): Self = StObject.set(x, "getPreProcessedFileInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHost(value: ICoreServicesHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
