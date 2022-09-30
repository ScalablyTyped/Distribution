package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenTransitions extends StObject {
  
  var childrenTransitions: Any
  
  var nodesShouldEnter: Boolean
  
  var nodesWillEnter: Boolean
  
  var nodesWillExit: Boolean
}
object ChildrenTransitions {
  
  inline def apply(
    childrenTransitions: Any,
    nodesShouldEnter: Boolean,
    nodesWillEnter: Boolean,
    nodesWillExit: Boolean
  ): ChildrenTransitions = {
    val __obj = js.Dynamic.literal(childrenTransitions = childrenTransitions.asInstanceOf[js.Any], nodesShouldEnter = nodesShouldEnter.asInstanceOf[js.Any], nodesWillEnter = nodesWillEnter.asInstanceOf[js.Any], nodesWillExit = nodesWillExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenTransitions]
  }
  
  extension [Self <: ChildrenTransitions](x: Self) {
    
    inline def setChildrenTransitions(value: Any): Self = StObject.set(x, "childrenTransitions", value.asInstanceOf[js.Any])
    
    inline def setNodesShouldEnter(value: Boolean): Self = StObject.set(x, "nodesShouldEnter", value.asInstanceOf[js.Any])
    
    inline def setNodesWillEnter(value: Boolean): Self = StObject.set(x, "nodesWillEnter", value.asInstanceOf[js.Any])
    
    inline def setNodesWillExit(value: Boolean): Self = StObject.set(x, "nodesWillExit", value.asInstanceOf[js.Any])
  }
}
