package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEvents extends StObject {
  
  var pointerEvents: String
  
  var tree: js.Array[this.type]
}
object PointerEvents {
  
  inline def apply(pointerEvents: String, tree: js.Array[PointerEvents]): PointerEvents = {
    val __obj = js.Dynamic.literal(pointerEvents = pointerEvents.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvents]
  }
  
  extension [Self <: PointerEvents](x: Self) {
    
    inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setTree(value: js.Array[PointerEvents]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeVarargs(value: PointerEvents*): Self = StObject.set(x, "tree", js.Array(value*))
  }
}
