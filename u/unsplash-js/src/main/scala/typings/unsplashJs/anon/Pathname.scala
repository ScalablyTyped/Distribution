package typings.unsplashJs.anon

import typings.unsplashJs.distHelpersUrlMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pathname extends StObject {
  
  var pathname: js.UndefOr[String] = js.undefined
  
  var query: Query
}
object Pathname {
  
  inline def apply(query: Query): Pathname = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pathname] (val x: Self) extends AnyVal {
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
