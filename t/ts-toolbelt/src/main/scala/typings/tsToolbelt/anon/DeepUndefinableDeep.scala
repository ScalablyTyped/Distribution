package typings.tsToolbelt.anon

import typings.tsToolbelt.outObjectUndefinableMod.UndefinableDeep
import typings.tsToolbelt.outObjectUndefinableMod.UndefinableFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepUndefinableDeep[O /* <: js.Object */] extends StObject {
  
  var deep: UndefinableDeep[O]
  
  var flat: UndefinableFlat[O]
}
object DeepUndefinableDeep {
  
  inline def apply[O /* <: js.Object */](deep: UndefinableDeep[O], flat: UndefinableFlat[O]): DeepUndefinableDeep[O] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepUndefinableDeep[O]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeepUndefinableDeep[?], O /* <: js.Object */] (val x: Self & DeepUndefinableDeep[O]) extends AnyVal {
    
    inline def setDeep(value: UndefinableDeep[O]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: UndefinableFlat[O]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
