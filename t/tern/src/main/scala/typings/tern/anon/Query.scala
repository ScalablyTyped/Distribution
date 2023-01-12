package typings.tern.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query[Q /* <: typings.tern.libTernMod.Query */] extends StObject {
  
  var query: js.UndefOr[Q] = js.undefined
}
object Query {
  
  inline def apply[Q /* <: typings.tern.libTernMod.Query */](): Query[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query[Q]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query[?], Q /* <: typings.tern.libTernMod.Query */] (val x: Self & Query[Q]) extends AnyVal {
    
    inline def setQuery(value: Q): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
