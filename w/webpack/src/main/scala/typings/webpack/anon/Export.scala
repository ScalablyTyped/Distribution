package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Export extends StObject {
  
  var `export`: js.UndefOr[js.Array[String]] = js.undefined
  
  var module: typings.webpack.mod.Module
}
object Export {
  
  inline def apply(module: typings.webpack.mod.Module): Export = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Export]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Export] (val x: Self) extends AnyVal {
    
    inline def setExport(value: js.Array[String]): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExportVarargs(value: String*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setModule(value: typings.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
