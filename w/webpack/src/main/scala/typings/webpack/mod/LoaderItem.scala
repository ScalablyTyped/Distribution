package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderItem extends StObject {
  
  var ident: Null | String
  
  var loader: String
  
  var options: Any
  
  var `type`: Null | String
}
object LoaderItem {
  
  inline def apply(loader: String, options: Any): LoaderItem = {
    val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ident = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[LoaderItem]
  }
  
  extension [Self <: LoaderItem](x: Self) {
    
    inline def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    inline def setIdentNull: Self = StObject.set(x, "ident", null)
    
    inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
