package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sources extends StObject {
  
  /** Set of loaded sources. */
  var sources: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Source]
}
object Sources {
  
  inline def apply(sources: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Source]): Sources = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sources]
  }
  
  extension [Self <: Sources](x: Self) {
    
    inline def setSources(value: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: typings.vscodeDebugprotocol.mod.DebugProtocol.Source*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
