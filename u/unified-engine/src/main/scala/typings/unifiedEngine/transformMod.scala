package typings.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("unified-engine/lib/file-pipeline/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform(context: Context, file: VFile, next: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(context.asInstanceOf[js.Any], file.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = typings.trough.mod.Callback
  
  type Context = typings.unifiedEngine.filePipelineMod.Context
  
  type VFile = typings.vfile.mod.VFile
}
