package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.Es6Config
  - typings.swcWasm.mod.CommonJsConfig
  - typings.swcWasm.mod.UmdConfig
  - typings.swcWasm.mod.AmdConfig
  - typings.swcWasm.mod.NodeNextConfig
*/
trait ModuleConfig extends StObject
object ModuleConfig {
  
  inline def AmdConfig(): typings.swcWasm.mod.AmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("amd")
    __obj.asInstanceOf[typings.swcWasm.mod.AmdConfig]
  }
  
  inline def CommonJsConfig(): typings.swcWasm.mod.CommonJsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commonjs")
    __obj.asInstanceOf[typings.swcWasm.mod.CommonJsConfig]
  }
  
  inline def Es6Config(): typings.swcWasm.mod.Es6Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("es6")
    __obj.asInstanceOf[typings.swcWasm.mod.Es6Config]
  }
  
  inline def NodeNextConfig(): typings.swcWasm.mod.NodeNextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nodenext")
    __obj.asInstanceOf[typings.swcWasm.mod.NodeNextConfig]
  }
  
  inline def UmdConfig(): typings.swcWasm.mod.UmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("umd")
    __obj.asInstanceOf[typings.swcWasm.mod.UmdConfig]
  }
}
