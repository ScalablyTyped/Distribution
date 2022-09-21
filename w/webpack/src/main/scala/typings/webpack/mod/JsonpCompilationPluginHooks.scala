package typings.webpack.mod

import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonpCompilationPluginHooks extends StObject {
  
  var linkPrefetch: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]
  
  var linkPreload: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]
}
object JsonpCompilationPluginHooks {
  
  inline def apply(
    linkPrefetch: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions],
    linkPreload: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]
  ): JsonpCompilationPluginHooks = {
    val __obj = js.Dynamic.literal(linkPrefetch = linkPrefetch.asInstanceOf[js.Any], linkPreload = linkPreload.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonpCompilationPluginHooks]
  }
  
  extension [Self <: JsonpCompilationPluginHooks](x: Self) {
    
    inline def setLinkPrefetch(value: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]): Self = StObject.set(x, "linkPrefetch", value.asInstanceOf[js.Any])
    
    inline def setLinkPreload(value: SyncWaterfallHook[js.Tuple2[String, Chunk], UnsetAdditionalOptions]): Self = StObject.set(x, "linkPreload", value.asInstanceOf[js.Any])
  }
}
