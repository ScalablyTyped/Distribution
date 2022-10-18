package typings.yjs.anon

import typings.yjs.distSrcStructsGCMod.GC
import typings.yjs.distSrcStructsItemMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I extends StObject {
  
  var i: Double
  
  var refs: js.Array[Item | GC]
}
object I {
  
  inline def apply(i: Double, refs: js.Array[Item | GC]): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  
  extension [Self <: I](x: Self) {
    
    inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setRefs(value: js.Array[Item | GC]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRefsVarargs(value: (Item | GC)*): Self = StObject.set(x, "refs", js.Array(value*))
  }
}
