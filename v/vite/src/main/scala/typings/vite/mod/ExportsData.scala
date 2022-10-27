package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportsData extends StObject {
  
  var exports: js.Array[String]
  
  var facade: Boolean
  
  var hasImports: Boolean
  
  var hasReExports: js.UndefOr[Boolean] = js.undefined
  
  var jsxLoader: js.UndefOr[Boolean] = js.undefined
}
object ExportsData {
  
  inline def apply(exports: js.Array[String], facade: Boolean, hasImports: Boolean): ExportsData = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], facade = facade.asInstanceOf[js.Any], hasImports = hasImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportsData]
  }
  
  extension [Self <: ExportsData](x: Self) {
    
    inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setFacade(value: Boolean): Self = StObject.set(x, "facade", value.asInstanceOf[js.Any])
    
    inline def setHasImports(value: Boolean): Self = StObject.set(x, "hasImports", value.asInstanceOf[js.Any])
    
    inline def setHasReExports(value: Boolean): Self = StObject.set(x, "hasReExports", value.asInstanceOf[js.Any])
    
    inline def setHasReExportsUndefined: Self = StObject.set(x, "hasReExports", js.undefined)
    
    inline def setJsxLoader(value: Boolean): Self = StObject.set(x, "jsxLoader", value.asInstanceOf[js.Any])
    
    inline def setJsxLoaderUndefined: Self = StObject.set(x, "jsxLoader", js.undefined)
  }
}
