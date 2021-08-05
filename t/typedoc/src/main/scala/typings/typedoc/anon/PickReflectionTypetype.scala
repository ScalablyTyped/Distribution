package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.ReflectionType, 'type'> */
trait PickReflectionTypetype extends StObject {
  
  var `type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)
}
object PickReflectionTypetype {
  
  inline def apply(`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): PickReflectionTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickReflectionTypetype]
  }
  
  extension [Self <: PickReflectionTypetype](x: Self) {
    
    inline def setType(value: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
