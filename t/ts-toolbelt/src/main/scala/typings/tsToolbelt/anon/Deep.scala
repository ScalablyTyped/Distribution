package typings.tsToolbelt.anon

import typings.tsToolbelt.outAnyComputeMod.ComputeDeep
import typings.tsToolbelt.outAnyComputeMod.ComputeFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deep[A /* <: Any */] extends StObject {
  
  var deep: ComputeDeep[A, scala.Nothing]
  
  var flat: ComputeFlat[A]
}
object Deep {
  
  inline def apply[A /* <: Any */](deep: ComputeDeep[A, scala.Nothing], flat: ComputeFlat[A]): Deep[A] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deep[A]]
  }
  
  extension [Self <: Deep[?], A /* <: Any */](x: Self & Deep[A]) {
    
    inline def setDeep(value: ComputeDeep[A, scala.Nothing]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: ComputeFlat[A]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
