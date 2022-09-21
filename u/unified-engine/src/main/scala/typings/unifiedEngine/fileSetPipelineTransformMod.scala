package typings.unifiedEngine

import typings.unifiedEngine.fileSetMod.FileSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSetPipelineTransformMod {
  
  @JSImport("unified-engine/lib/file-set-pipeline/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform(context: Context, settings: Settings, next: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(context.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = typings.trough.mod.Callback
  
  type Configuration = typings.unifiedEngine.fileSetPipelineMod.Configuration
  
  trait Context extends StObject {
    
    var configuration: Configuration
    
    var fileSet: FileSet
    
    var files: js.Array[VFile]
  }
  object Context {
    
    inline def apply(configuration: Configuration, fileSet: FileSet, files: js.Array[VFile]): Context = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], fileSet = fileSet.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setFileSet(value: FileSet): Self = StObject.set(x, "fileSet", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[VFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: VFile*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  type Settings = typings.unifiedEngine.fileSetPipelineMod.Settings
  
  type VFile = typings.vfile.mod.VFile
}
