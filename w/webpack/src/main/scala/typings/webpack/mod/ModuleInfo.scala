package typings.webpack.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webpack.mod.ConcatenatedModuleInfo
  - typings.webpack.mod.ExternalModuleInfo
*/
trait ModuleInfo extends StObject
object ModuleInfo {
  
  inline def ConcatenatedModuleInfo(exportMap: Map[String, String], index: Double, module: Module, rawExportMap: Map[String, String]): typings.webpack.mod.ConcatenatedModuleInfo = {
    val __obj = js.Dynamic.literal(exportMap = exportMap.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], rawExportMap = rawExportMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webpack.mod.ConcatenatedModuleInfo]
  }
  
  inline def ExternalModuleInfo(index: Double, module: Module): typings.webpack.mod.ExternalModuleInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webpack.mod.ExternalModuleInfo]
  }
}
