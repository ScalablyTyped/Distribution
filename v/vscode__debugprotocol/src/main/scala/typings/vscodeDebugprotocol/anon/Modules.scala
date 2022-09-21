package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modules extends StObject {
  
  /** All modules or range of modules. */
  var modules: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Module]
  
  /** The total number of modules available. */
  var totalModules: js.UndefOr[Double] = js.undefined
}
object Modules {
  
  inline def apply(modules: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Module]): Modules = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modules]
  }
  
  extension [Self <: Modules](x: Self) {
    
    inline def setModules(value: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Module]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: typings.vscodeDebugprotocol.mod.DebugProtocol.Module*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setTotalModules(value: Double): Self = StObject.set(x, "totalModules", value.asInstanceOf[js.Any])
    
    inline def setTotalModulesUndefined: Self = StObject.set(x, "totalModules", js.undefined)
  }
}
