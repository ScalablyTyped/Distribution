package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.Reflection, 'id'> */
trait ReflectionPointer
  extends StObject
     with __ModelToObject[js.Any] {
  
  var id: ModelToObject[Double] | Double
}
object ReflectionPointer {
  
  inline def apply(id: ModelToObject[Double] | Double): ReflectionPointer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionPointer]
  }
  
  extension [Self <: ReflectionPointer](x: Self) {
    
    inline def setId(value: ModelToObject[Double] | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "id", js.Array(value :_*))
  }
}
