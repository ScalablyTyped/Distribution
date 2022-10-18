package typings.tsToolbelt.anon

import typings.tsToolbelt.outObjectRequiredMod.RequiredDeep
import typings.tsToolbelt.outObjectRequiredMod.RequiredFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepRequiredDeep[O /* <: js.Object */] extends StObject {
  
  var deep: RequiredDeep[O]
  
  var flat: RequiredFlat[O]
}
object DeepRequiredDeep {
  
  inline def apply[O /* <: js.Object */](deep: RequiredDeep[O], flat: RequiredFlat[O]): DeepRequiredDeep[O] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepRequiredDeep[O]]
  }
  
  extension [Self <: DeepRequiredDeep[?], O /* <: js.Object */](x: Self & DeepRequiredDeep[O]) {
    
    inline def setDeep(value: RequiredDeep[O]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: RequiredFlat[O]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
