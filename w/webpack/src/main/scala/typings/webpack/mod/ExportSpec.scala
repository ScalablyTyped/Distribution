package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSpec extends StObject {
  
  /**
  	 * can the export be renamed (defaults to true)
  	 */
  var canMangle: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * when reexported: from which export
  	 */
  var `export`: js.UndefOr[Null | js.Array[String]] = js.undefined
  
  /**
  	 * nested exports
  	 */
  var exports: js.UndefOr[js.Array[String | ExportSpec]] = js.undefined
  
  /**
  	 * when reexported: from which module
  	 */
  var from: js.UndefOr[ModuleGraphConnection] = js.undefined
  
  /**
  	 * export is not visible, because another export blends over it
  	 */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * the name of the export
  	 */
  var name: String
  
  /**
  	 * when reexported: with which priority
  	 */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
  	 * is the export a terminal binding that should be checked for export star conflicts
  	 */
  var terminalBinding: js.UndefOr[Boolean] = js.undefined
}
object ExportSpec {
  
  inline def apply(name: String): ExportSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpec]
  }
  
  extension [Self <: ExportSpec](x: Self) {
    
    inline def setCanMangle(value: Boolean): Self = StObject.set(x, "canMangle", value.asInstanceOf[js.Any])
    
    inline def setCanMangleUndefined: Self = StObject.set(x, "canMangle", js.undefined)
    
    inline def setExport(value: js.Array[String]): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportNull: Self = StObject.set(x, "export", null)
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExportVarargs(value: String*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setExports(value: js.Array[String | ExportSpec]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: (String | ExportSpec)*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setFrom(value: ModuleGraphConnection): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTerminalBinding(value: Boolean): Self = StObject.set(x, "terminalBinding", value.asInstanceOf[js.Any])
    
    inline def setTerminalBindingUndefined: Self = StObject.set(x, "terminalBinding", js.undefined)
  }
}
