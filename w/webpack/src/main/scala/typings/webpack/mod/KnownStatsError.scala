package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsError extends StObject {
  
  var chunkEntry: js.UndefOr[Boolean] = js.undefined
  
  var chunkId: js.UndefOr[String | Double] = js.undefined
  
  var chunkInitial: js.UndefOr[Boolean] = js.undefined
  
  var chunkName: js.UndefOr[String] = js.undefined
  
  var details: js.UndefOr[Any] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var loc: js.UndefOr[String] = js.undefined
  
  var message: String
  
  var moduleId: js.UndefOr[String | Double] = js.undefined
  
  var moduleIdentifier: js.UndefOr[String] = js.undefined
  
  var moduleName: js.UndefOr[String] = js.undefined
  
  var moduleTrace: js.UndefOr[js.Array[StatsModuleTraceItem]] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
}
object KnownStatsError {
  
  inline def apply(message: String): KnownStatsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownStatsError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownStatsError] (val x: Self) extends AnyVal {
    
    inline def setChunkEntry(value: Boolean): Self = StObject.set(x, "chunkEntry", value.asInstanceOf[js.Any])
    
    inline def setChunkEntryUndefined: Self = StObject.set(x, "chunkEntry", js.undefined)
    
    inline def setChunkId(value: String | Double): Self = StObject.set(x, "chunkId", value.asInstanceOf[js.Any])
    
    inline def setChunkIdUndefined: Self = StObject.set(x, "chunkId", js.undefined)
    
    inline def setChunkInitial(value: Boolean): Self = StObject.set(x, "chunkInitial", value.asInstanceOf[js.Any])
    
    inline def setChunkInitialUndefined: Self = StObject.set(x, "chunkInitial", js.undefined)
    
    inline def setChunkName(value: String): Self = StObject.set(x, "chunkName", value.asInstanceOf[js.Any])
    
    inline def setChunkNameUndefined: Self = StObject.set(x, "chunkName", js.undefined)
    
    inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setLoc(value: String): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: String | Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setModuleIdentifier(value: String): Self = StObject.set(x, "moduleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setModuleIdentifierUndefined: Self = StObject.set(x, "moduleIdentifier", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setModuleTrace(value: js.Array[StatsModuleTraceItem]): Self = StObject.set(x, "moduleTrace", value.asInstanceOf[js.Any])
    
    inline def setModuleTraceUndefined: Self = StObject.set(x, "moduleTrace", js.undefined)
    
    inline def setModuleTraceVarargs(value: StatsModuleTraceItem*): Self = StObject.set(x, "moduleTrace", js.Array(value*))
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
