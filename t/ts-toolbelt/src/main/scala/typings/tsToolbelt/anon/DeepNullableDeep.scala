package typings.tsToolbelt.anon

import typings.tsToolbelt.outObjectNullableMod.NullableDeep
import typings.tsToolbelt.outObjectNullableMod.NullableFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepNullableDeep[O /* <: js.Object */] extends StObject {
  
  var deep: NullableDeep[O]
  
  var flat: NullableFlat[O]
}
object DeepNullableDeep {
  
  inline def apply[O /* <: js.Object */](deep: NullableDeep[O], flat: NullableFlat[O]): DeepNullableDeep[O] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepNullableDeep[O]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeepNullableDeep[?], O /* <: js.Object */] (val x: Self & DeepNullableDeep[O]) extends AnyVal {
    
    inline def setDeep(value: NullableDeep[O]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: NullableFlat[O]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
