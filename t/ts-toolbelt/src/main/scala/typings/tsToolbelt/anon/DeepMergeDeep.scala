package typings.tsToolbelt.anon

import typings.tsToolbelt.outObjectMergeMod.MergeDeep
import typings.tsToolbelt.outObjectMergeMod.MergeFlat
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeepMergeDeep[?, ?, ?, ?], O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill /* <: Any */] (val x: Self & (DeepMergeDeep[O, O1, ignore, fill])) extends AnyVal {
    
    inline def setDeep(value: MergeDeep[O, O1, ignore, fill]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: MergeFlat[O, O1, ignore, fill]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
