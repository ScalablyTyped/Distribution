package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.CompilationSettings
import typings.typescriptServices.TypeScript.IPreProcessedFileInfo
import typings.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreServices extends StObject {
  
  def collectGarbage(): Unit
  
  def dumpMemory(): String
  
  def getDefaultCompilationSettings(): CompilationSettings
  
  def getMemoryInfo(): js.Array[js.Any]
  
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo
  
  var host: ICoreServicesHost
}
object CoreServices {
  
  inline def apply(
    collectGarbage: () => Unit,
    dumpMemory: () => String,
    getDefaultCompilationSettings: () => CompilationSettings,
    getMemoryInfo: () => js.Array[js.Any],
    getPreProcessedFileInfo: (String, IScriptSnapshot) => IPreProcessedFileInfo,
    host: ICoreServicesHost
  ): CoreServices = {
    val __obj = js.Dynamic.literal(collectGarbage = js.Any.fromFunction0(collectGarbage), dumpMemory = js.Any.fromFunction0(dumpMemory), getDefaultCompilationSettings = js.Any.fromFunction0(getDefaultCompilationSettings), getMemoryInfo = js.Any.fromFunction0(getMemoryInfo), getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServices]
  }
  
  extension [Self <: CoreServices](x: Self) {
    
    inline def setCollectGarbage(value: () => Unit): Self = StObject.set(x, "collectGarbage", js.Any.fromFunction0(value))
    
    inline def setDumpMemory(value: () => String): Self = StObject.set(x, "dumpMemory", js.Any.fromFunction0(value))
    
    inline def setGetDefaultCompilationSettings(value: () => CompilationSettings): Self = StObject.set(x, "getDefaultCompilationSettings", js.Any.fromFunction0(value))
    
    inline def setGetMemoryInfo(value: () => js.Array[js.Any]): Self = StObject.set(x, "getMemoryInfo", js.Any.fromFunction0(value))
    
    inline def setGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => IPreProcessedFileInfo): Self = StObject.set(x, "getPreProcessedFileInfo", js.Any.fromFunction2(value))
    
    inline def setHost(value: ICoreServicesHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
