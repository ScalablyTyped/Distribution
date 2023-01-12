package typings.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileSetPipelineLogMod {
  
  @JSImport("unified-engine/lib/file-set-pipeline/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def log(context: Context, settings: Settings): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(context.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  type Configuration = typings.unifiedEngine.libFileSetPipelineMod.Configuration
  
  trait Context extends StObject {
    
    var configuration: js.UndefOr[typings.unifiedEngine.libConfigurationMod.Configuration] = js.undefined
    
    var files: js.Array[VFile]
  }
  object Context {
    
    inline def apply(files: js.Array[VFile]): Context = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setConfiguration(value: typings.unifiedEngine.libConfigurationMod.Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setFiles(value: js.Array[VFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: VFile*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  type Settings = typings.unifiedEngine.libFileSetPipelineMod.Settings
  
  type VFile = typings.vfile.mod.VFile
  
  type VFileReporter = typings.unifiedEngine.libMod.VFileReporter
}
