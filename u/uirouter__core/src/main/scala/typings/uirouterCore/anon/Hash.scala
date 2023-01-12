package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: Any
  
  var path: Any
  
  var search: Any
  
  var url: String
}
object Hash {
  
  inline def apply(hash: Any, path: Any, search: Any, url: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    inline def setHash(value: Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
