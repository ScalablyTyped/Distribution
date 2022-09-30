package typings.swcWasm.mod

import typings.swcWasm.swcWasmStrings.nodenext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeNextConfig
  extends StObject
     with BaseModuleConfig
     with ModuleConfig {
  
  var `type`: nodenext
}
object NodeNextConfig {
  
  inline def apply(): NodeNextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nodenext")
    __obj.asInstanceOf[NodeNextConfig]
  }
  
  extension [Self <: NodeNextConfig](x: Self) {
    
    inline def setType(value: nodenext): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
