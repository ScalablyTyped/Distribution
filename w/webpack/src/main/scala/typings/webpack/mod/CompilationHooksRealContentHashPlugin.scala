package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationHooksRealContentHashPlugin extends StObject {
  
  var updateHash: SyncBailHook[js.Tuple2[js.Array[Buffer], String], String, UnsetAdditionalOptions]
}
object CompilationHooksRealContentHashPlugin {
  
  inline def apply(updateHash: SyncBailHook[js.Tuple2[js.Array[Buffer], String], String, UnsetAdditionalOptions]): CompilationHooksRealContentHashPlugin = {
    val __obj = js.Dynamic.literal(updateHash = updateHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationHooksRealContentHashPlugin]
  }
  
  extension [Self <: CompilationHooksRealContentHashPlugin](x: Self) {
    
    inline def setUpdateHash(value: SyncBailHook[js.Tuple2[js.Array[Buffer], String], String, UnsetAdditionalOptions]): Self = StObject.set(x, "updateHash", value.asInstanceOf[js.Any])
  }
}
