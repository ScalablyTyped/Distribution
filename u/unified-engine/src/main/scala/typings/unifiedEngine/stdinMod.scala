package typings.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stdinMod {
  
  @JSImport("unified-engine/lib/file-set-pipeline/stdin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stdin(context: Context, settings: Settings, next: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stdin")(context.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = typings.trough.mod.Callback
  
  trait Context extends StObject {
    
    var files: js.Array[String | VFile]
  }
  object Context {
    
    inline def apply(files: js.Array[String | VFile]): Context = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setFiles(value: js.Array[String | VFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: (String | VFile)*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  type Settings = typings.unifiedEngine.fileSetPipelineMod.Settings
  
  type VFile = typings.vfile.mod.VFile
}
