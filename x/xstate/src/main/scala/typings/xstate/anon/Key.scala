package typings.xstate.anon

import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var parent: StateNode[Any, Any, Any, Any, Any, Any]
}
object Key {
  
  inline def apply(key: String, parent: StateNode[Any, Any, Any, Any, Any, Any]): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setParent(value: StateNode[Any, Any, Any, Any, Any, Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
