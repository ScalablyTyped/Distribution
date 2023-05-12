package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportsData extends StObject {
  
  var exports: js.Array[String]
  
  var hasImports: Boolean
  
  var jsxLoader: js.UndefOr[Boolean] = js.undefined
}
object ExportsData {
  
  inline def apply(exports: js.Array[String], hasImports: Boolean): ExportsData = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], hasImports = hasImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportsData] (val x: Self) extends AnyVal {
    
    inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setHasImports(value: Boolean): Self = StObject.set(x, "hasImports", value.asInstanceOf[js.Any])
    
    inline def setJsxLoader(value: Boolean): Self = StObject.set(x, "jsxLoader", value.asInstanceOf[js.Any])
    
    inline def setJsxLoaderUndefined: Self = StObject.set(x, "jsxLoader", js.undefined)
  }
}
