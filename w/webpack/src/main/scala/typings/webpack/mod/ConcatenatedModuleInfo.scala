package typings.webpack.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatenatedModuleInfo
  extends StObject
     with ModuleInfo {
  
  /**
  	 * mapping from export name to symbol
  	 */
  var exportMap: Map[String, String]
  
  var index: Double
  
  var module: Module
  
  var namespaceExportSymbol: js.UndefOr[String] = js.undefined
  
  /**
  	 * mapping from export name to symbol
  	 */
  var rawExportMap: Map[String, String]
}
object ConcatenatedModuleInfo {
  
  inline def apply(exportMap: Map[String, String], index: Double, module: Module, rawExportMap: Map[String, String]): ConcatenatedModuleInfo = {
    val __obj = js.Dynamic.literal(exportMap = exportMap.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], rawExportMap = rawExportMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenatedModuleInfo]
  }
  
  extension [Self <: ConcatenatedModuleInfo](x: Self) {
    
    inline def setExportMap(value: Map[String, String]): Self = StObject.set(x, "exportMap", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setNamespaceExportSymbol(value: String): Self = StObject.set(x, "namespaceExportSymbol", value.asInstanceOf[js.Any])
    
    inline def setNamespaceExportSymbolUndefined: Self = StObject.set(x, "namespaceExportSymbol", js.undefined)
    
    inline def setRawExportMap(value: Map[String, String]): Self = StObject.set(x, "rawExportMap", value.asInstanceOf[js.Any])
  }
}
