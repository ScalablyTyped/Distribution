package typings.tern.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[Q /* <: typings.tern.libTernMod.Query */] extends StObject {
  
  var query: js.UndefOr[Q] = js.undefined
}
object `0` {
  
  inline def apply[Q /* <: typings.tern.libTernMod.Query */](): `0`[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[Q]]
  }
  
  extension [Self <: `0`[?], Q /* <: typings.tern.libTernMod.Query */](x: Self & `0`[Q]) {
    
    inline def setQuery(value: Q): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
