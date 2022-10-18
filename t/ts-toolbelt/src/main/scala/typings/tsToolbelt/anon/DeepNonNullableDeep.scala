package typings.tsToolbelt.anon

import typings.tsToolbelt.outObjectNonNullableMod.NonNullableDeep
import typings.tsToolbelt.outObjectNonNullableMod.NonNullableFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepNonNullableDeep[O /* <: js.Object */] extends StObject {
  
  var deep: NonNullableDeep[O]
  
  var flat: NonNullableFlat[O]
}
object DeepNonNullableDeep {
  
  inline def apply[O /* <: js.Object */](deep: NonNullableDeep[O], flat: NonNullableFlat[O]): DeepNonNullableDeep[O] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepNonNullableDeep[O]]
  }
  
  extension [Self <: DeepNonNullableDeep[?], O /* <: js.Object */](x: Self & DeepNonNullableDeep[O]) {
    
    inline def setDeep(value: NonNullableDeep[O]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: NonNullableFlat[O]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
