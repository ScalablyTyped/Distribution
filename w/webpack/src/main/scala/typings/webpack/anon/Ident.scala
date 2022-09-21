package typings.webpack.anon

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod._RuleSetUse
import typings.webpack.mod._RuleSetUseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ident
  extends StObject
     with _RuleSetUse
     with _RuleSetUseItem {
  
  /**
  			 * Unique loader options identifier.
  			 */
  var ident: js.UndefOr[String] = js.undefined
  
  /**
  			 * Loader name.
  			 */
  var loader: js.UndefOr[String] = js.undefined
  
  /**
  			 * Loader options.
  			 */
  var options: js.UndefOr[String | StringDictionary[Any]] = js.undefined
}
object Ident {
  
  inline def apply(): Ident = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ident]
  }
  
  extension [Self <: Ident](x: Self) {
    
    inline def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    inline def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
    
    inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setOptions(value: String | StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
