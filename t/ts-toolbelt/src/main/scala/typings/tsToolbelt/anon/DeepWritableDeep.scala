package typings.tsToolbelt.anon

import typings.tsToolbelt.outObjectWritableMod.WritableDeep
import typings.tsToolbelt.outObjectWritableMod.WritableFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepWritableDeep[O /* <: js.Object */] extends StObject {
  
  var deep: WritableDeep[O]
  
  var flat: WritableFlat[O]
}
object DeepWritableDeep {
  
  inline def apply[O /* <: js.Object */](deep: WritableDeep[O], flat: WritableFlat[O]): DeepWritableDeep[O] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepWritableDeep[O]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeepWritableDeep[?], O /* <: js.Object */] (val x: Self & DeepWritableDeep[O]) extends AnyVal {
    
    inline def setDeep(value: WritableDeep[O]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: WritableFlat[O]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
