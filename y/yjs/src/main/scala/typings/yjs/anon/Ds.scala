package typings.yjs.anon

import typings.yjs.distSrcStructsGCMod.GC
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcStructsSkipMod.Skip
import typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ds extends StObject {
  
  var ds: DeleteSet
  
  var structs: js.Array[GC | Item | Skip]
}
object Ds {
  
  inline def apply(ds: DeleteSet, structs: js.Array[GC | Item | Skip]): Ds = {
    val __obj = js.Dynamic.literal(ds = ds.asInstanceOf[js.Any], structs = structs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ds]
  }
  
  extension [Self <: Ds](x: Self) {
    
    inline def setDs(value: DeleteSet): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
    
    inline def setStructs(value: js.Array[GC | Item | Skip]): Self = StObject.set(x, "structs", value.asInstanceOf[js.Any])
    
    inline def setStructsVarargs(value: (GC | Item | Skip)*): Self = StObject.set(x, "structs", js.Array(value*))
  }
}
