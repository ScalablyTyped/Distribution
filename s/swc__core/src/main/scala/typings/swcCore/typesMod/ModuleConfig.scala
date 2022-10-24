package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.Es6Config
  - typings.swcCore.typesMod.CommonJsConfig
  - typings.swcCore.typesMod.UmdConfig
  - typings.swcCore.typesMod.AmdConfig
  - typings.swcCore.typesMod.NodeNextConfig
  - typings.swcCore.typesMod.SystemjsConfig
*/
trait ModuleConfig extends StObject
object ModuleConfig {
  
  inline def AmdConfig(): typings.swcCore.typesMod.AmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("amd")
    __obj.asInstanceOf[typings.swcCore.typesMod.AmdConfig]
  }
  
  inline def CommonJsConfig(): typings.swcCore.typesMod.CommonJsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commonjs")
    __obj.asInstanceOf[typings.swcCore.typesMod.CommonJsConfig]
  }
  
  inline def Es6Config(): typings.swcCore.typesMod.Es6Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("es6")
    __obj.asInstanceOf[typings.swcCore.typesMod.Es6Config]
  }
  
  inline def NodeNextConfig(): typings.swcCore.typesMod.NodeNextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nodenext")
    __obj.asInstanceOf[typings.swcCore.typesMod.NodeNextConfig]
  }
  
  inline def SystemjsConfig(): typings.swcCore.typesMod.SystemjsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("systemjs")
    __obj.asInstanceOf[typings.swcCore.typesMod.SystemjsConfig]
  }
  
  inline def UmdConfig(): typings.swcCore.typesMod.UmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("umd")
    __obj.asInstanceOf[typings.swcCore.typesMod.UmdConfig]
  }
}
