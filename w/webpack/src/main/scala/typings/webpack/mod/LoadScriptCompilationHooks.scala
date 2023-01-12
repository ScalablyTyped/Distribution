package typings.webpack.mod

import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadScriptCompilationHooks extends StObject {
  
  var createScript: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]
}
object LoadScriptCompilationHooks {
  
  inline def apply(createScript: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]): LoadScriptCompilationHooks = {
    val __obj = js.Dynamic.literal(createScript = createScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadScriptCompilationHooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadScriptCompilationHooks] (val x: Self) extends AnyVal {
    
    inline def setCreateScript(value: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]): Self = StObject.set(x, "createScript", value.asInstanceOf[js.Any])
  }
}
