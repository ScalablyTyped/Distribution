package typings.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  @JSImport("unified-engine/lib/file-pipeline/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(context: Context, file: VFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(context.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Context = typings.unifiedEngine.filePipelineMod.Context
  
  type VFile = typings.vfile.mod.VFile
}
