package typings.tsToolbelt.anon

import typings.tsToolbelt.outObjectCompulsoryMod.CompulsoryDeep
import typings.tsToolbelt.outObjectCompulsoryMod.CompulsoryFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepFlat[O /* <: js.Object */] extends StObject {
  
  var deep: CompulsoryDeep[O]
  
  var flat: CompulsoryFlat[O]
}
object DeepFlat {
  
  inline def apply[O /* <: js.Object */](deep: CompulsoryDeep[O], flat: CompulsoryFlat[O]): DeepFlat[O] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepFlat[O]]
  }
  
  extension [Self <: DeepFlat[?], O /* <: js.Object */](x: Self & DeepFlat[O]) {
    
    inline def setDeep(value: CompulsoryDeep[O]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: CompulsoryFlat[O]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
