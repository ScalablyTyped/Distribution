package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.IndexedAccessType, 'type'> & typedoc.typedoc/dist/lib/serialization/schema.Type */
trait PickIndexedAccessTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)
}
object PickIndexedAccessTypetype {
  
  inline def apply(`type`: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)): PickIndexedAccessTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIndexedAccessTypetype]
  }
  
  extension [Self <: PickIndexedAccessTypetype](x: Self) {
    
    inline def setType(value: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
