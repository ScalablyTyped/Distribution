package typings.webpack.mod

import typings.std.Set
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportsSpec extends StObject {
  
  /**
  	 * can the export be renamed (defaults to true)
  	 */
  var canMangle: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * module on which the result depends on
  	 */
  var dependencies: js.UndefOr[js.Array[Module]] = js.undefined
  
  /**
  	 * when exports = true, list of unaffected exports
  	 */
  var excludeExports: js.UndefOr[Set[String]] = js.undefined
  
  /**
  	 * exported names, true for unknown exports or null for no exports
  	 */
  var exports: Null | `true` | (js.Array[String | ExportSpec])
  
  /**
  	 * when reexported: from which module
  	 */
  var from: js.UndefOr[ModuleGraphConnection] = js.undefined
  
  /**
  	 * list of maybe prior exposed, but now hidden exports
  	 */
  var hideExports: js.UndefOr[Set[String]] = js.undefined
  
  /**
  	 * when reexported: with which priority
  	 */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
  	 * are the exports terminal bindings that should be checked for export star conflicts
  	 */
  var terminalBinding: js.UndefOr[Boolean] = js.undefined
}
object ExportsSpec {
  
  inline def apply(): ExportsSpec = {
    val __obj = js.Dynamic.literal(exports = null)
    __obj.asInstanceOf[ExportsSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportsSpec] (val x: Self) extends AnyVal {
    
    inline def setCanMangle(value: Boolean): Self = StObject.set(x, "canMangle", value.asInstanceOf[js.Any])
    
    inline def setCanMangleUndefined: Self = StObject.set(x, "canMangle", js.undefined)
    
    inline def setDependencies(value: js.Array[Module]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: Module*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setExcludeExports(value: Set[String]): Self = StObject.set(x, "excludeExports", value.asInstanceOf[js.Any])
    
    inline def setExcludeExportsUndefined: Self = StObject.set(x, "excludeExports", js.undefined)
    
    inline def setExports(value: `true` | (js.Array[String | ExportSpec])): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsNull: Self = StObject.set(x, "exports", null)
    
    inline def setExportsVarargs(value: (String | ExportSpec)*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setFrom(value: ModuleGraphConnection): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHideExports(value: Set[String]): Self = StObject.set(x, "hideExports", value.asInstanceOf[js.Any])
    
    inline def setHideExportsUndefined: Self = StObject.set(x, "hideExports", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTerminalBinding(value: Boolean): Self = StObject.set(x, "terminalBinding", value.asInstanceOf[js.Any])
    
    inline def setTerminalBindingUndefined: Self = StObject.set(x, "terminalBinding", js.undefined)
  }
}
