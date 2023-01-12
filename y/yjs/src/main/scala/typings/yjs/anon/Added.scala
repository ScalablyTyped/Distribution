package typings.yjs.anon

import typings.std.Map
import typings.std.Set
import typings.yjs.distSrcStructsItemMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Added extends StObject {
  
  var added: Set[Item]
  
  var deleted: Set[Item]
  
  var delta: js.Array[Insert]
  
  var keys: Map[String, OldValue]
}
object Added {
  
  inline def apply(added: Set[Item], deleted: Set[Item], delta: js.Array[Insert], keys: Map[String, OldValue]): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: Set[Item]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Set[Item]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: js.Array[Insert]): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaVarargs(value: Insert*): Self = StObject.set(x, "delta", js.Array(value*))
    
    inline def setKeys(value: Map[String, OldValue]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
