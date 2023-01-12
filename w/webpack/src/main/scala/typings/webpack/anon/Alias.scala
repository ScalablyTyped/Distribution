package typings.webpack.anon

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  /**
  				 * New request.
  				 */
  var alias: String | `false` | js.Array[String]
  
  /**
  				 * Request to be redirected.
  				 */
  var name: String
  
  /**
  				 * Redirect only exact matching request.
  				 */
  var onlyModule: js.UndefOr[Boolean] = js.undefined
}
object Alias {
  
  inline def apply(alias: String | `false` | js.Array[String], name: String): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String | `false` | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnlyModule(value: Boolean): Self = StObject.set(x, "onlyModule", value.asInstanceOf[js.Any])
    
    inline def setOnlyModuleUndefined: Self = StObject.set(x, "onlyModule", js.undefined)
  }
}
