package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `modules` request. */
trait ModulesArguments extends StObject {
  
  /** The number of modules to return. If moduleCount is not specified or 0, all modules are returned. */
  var moduleCount: js.UndefOr[Double] = js.undefined
  
  /** The index of the first module to return; if omitted modules start at 0. */
  var startModule: js.UndefOr[Double] = js.undefined
}
object ModulesArguments {
  
  inline def apply(): ModulesArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModulesArguments]
  }
  
  extension [Self <: ModulesArguments](x: Self) {
    
    inline def setModuleCount(value: Double): Self = StObject.set(x, "moduleCount", value.asInstanceOf[js.Any])
    
    inline def setModuleCountUndefined: Self = StObject.set(x, "moduleCount", js.undefined)
    
    inline def setStartModule(value: Double): Self = StObject.set(x, "startModule", value.asInstanceOf[js.Any])
    
    inline def setStartModuleUndefined: Self = StObject.set(x, "startModule", js.undefined)
  }
}
