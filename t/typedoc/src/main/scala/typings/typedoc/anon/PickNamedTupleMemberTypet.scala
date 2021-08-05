package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.NamedTupleMemberType, 'type'> */
trait PickNamedTupleMemberTypet extends StObject {
  
  var `type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)
}
object PickNamedTupleMemberTypet {
  
  inline def apply(`type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)): PickNamedTupleMemberTypet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNamedTupleMemberTypet]
  }
  
  extension [Self <: PickNamedTupleMemberTypet](x: Self) {
    
    inline def setType(value: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
