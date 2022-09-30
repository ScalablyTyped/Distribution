package typings.tsToolbelt.anon

import typings.tsToolbelt.objectMergeMod.MergeDeep
import typings.tsToolbelt.objectMergeMod.MergeFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepMergeDeep[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill /* <: Any */] extends StObject {
  
  var deep: MergeDeep[O, O1, ignore, fill]
  
  var flat: MergeFlat[O, O1, ignore, fill]
}
object DeepMergeDeep {
  
  inline def apply[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill /* <: Any */](deep: MergeDeep[O, O1, ignore, fill], flat: MergeFlat[O, O1, ignore, fill]): DeepMergeDeep[O, O1, ignore, fill] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepMergeDeep[O, O1, ignore, fill]]
  }
  
  extension [Self <: DeepMergeDeep[?, ?, ?, ?], O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill /* <: Any */](x: Self & (DeepMergeDeep[O, O1, ignore, fill])) {
    
    inline def setDeep(value: MergeDeep[O, O1, ignore, fill]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setDeepVarargs(value: Any*): Self = StObject.set(x, "deep", js.Array(value*))
    
    inline def setFlat(value: MergeFlat[O, O1, ignore, fill]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatVarargs(value: Any*): Self = StObject.set(x, "flat", js.Array(value*))
  }
}
