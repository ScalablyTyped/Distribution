package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.UnknownType, 'type'> */
trait PickUnknownTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)
}
object PickUnknownTypetype {
  
  inline def apply(`type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)): PickUnknownTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickUnknownTypetype]
  }
  
  extension [Self <: PickUnknownTypetype](x: Self) {
    
    inline def setType(value: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
