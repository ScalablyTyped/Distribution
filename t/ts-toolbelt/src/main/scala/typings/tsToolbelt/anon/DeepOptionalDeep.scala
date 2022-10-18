package typings.tsToolbelt.anon

import typings.tsToolbelt.outObjectOptionalMod.OptionalDeep
import typings.tsToolbelt.outObjectOptionalMod.OptionalFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepOptionalDeep[O /* <: js.Object */] extends StObject {
  
  var deep: OptionalDeep[O]
  
  var flat: OptionalFlat[O]
}
object DeepOptionalDeep {
  
  inline def apply[O /* <: js.Object */](deep: OptionalDeep[O], flat: OptionalFlat[O]): DeepOptionalDeep[O] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepOptionalDeep[O]]
  }
  
  extension [Self <: DeepOptionalDeep[?], O /* <: js.Object */](x: Self & DeepOptionalDeep[O]) {
    
    inline def setDeep(value: OptionalDeep[O]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: OptionalFlat[O]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
