package typings.webpack.anon

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildMeta extends StObject {
  
  /**
  		 * Meta information about the module.
  		 */
  var buildMeta: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  		 * Information about the provided exports of the module.
  		 */
  var exports: js.UndefOr[`true` | js.Array[String]] = js.undefined
  
  /**
  		 * Module ID.
  		 */
  var id: String | Double
}
object BuildMeta {
  
  inline def apply(id: String | Double): BuildMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildMeta]
  }
  
  extension [Self <: BuildMeta](x: Self) {
    
    inline def setBuildMeta(value: StringDictionary[Any]): Self = StObject.set(x, "buildMeta", value.asInstanceOf[js.Any])
    
    inline def setBuildMetaUndefined: Self = StObject.set(x, "buildMeta", js.undefined)
    
    inline def setExports(value: `true` | js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
