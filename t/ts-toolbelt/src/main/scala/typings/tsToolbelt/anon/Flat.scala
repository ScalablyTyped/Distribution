package typings.tsToolbelt.anon

import typings.tsToolbelt.outListInternalMod.Key
import typings.tsToolbelt.outListNonNullableMod.NonNullableDeep
import typings.tsToolbelt.outListNonNullableMod.NonNullableFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flat[O /* <: js.Object */, K /* <: Key */] extends StObject {
  
  var deep: NonNullableDeep[O, K]
  
  var flat: NonNullableFlat[O, K]
}
object Flat {
  
  inline def apply[O /* <: js.Object */, K /* <: Key */](deep: NonNullableDeep[O, K], flat: NonNullableFlat[O, K]): Flat[O, K] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flat[O, K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Flat[?, ?], O /* <: js.Object */, K /* <: Key */] (val x: Self & (Flat[O, K])) extends AnyVal {
    
    inline def setDeep(value: NonNullableDeep[O, K]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: NonNullableFlat[O, K]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
