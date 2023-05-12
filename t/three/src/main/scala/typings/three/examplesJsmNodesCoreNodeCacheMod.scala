package typings.three

import typings.std.WeakMap
import typings.three.examplesJsmNodesCoreNodeBuilderMod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeCacheMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeCache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeCache {
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var nodesData: WeakMap[typings.three.examplesJsmNodesCoreNodeMod.default, NodeData] = js.native
  }
  
  trait NodeCache extends StObject {
    
    var id: Double
    
    var nodesData: WeakMap[typings.three.examplesJsmNodesCoreNodeMod.default, NodeData]
  }
  object NodeCache {
    
    inline def apply(id: Double, nodesData: WeakMap[typings.three.examplesJsmNodesCoreNodeMod.default, NodeData]): NodeCache = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodesData = nodesData.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeCache] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNodesData(value: WeakMap[typings.three.examplesJsmNodesCoreNodeMod.default, NodeData]): Self = StObject.set(x, "nodesData", value.asInstanceOf[js.Any])
    }
  }
}
