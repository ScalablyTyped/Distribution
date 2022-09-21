package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeVaryMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeVary", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeVary {
    def this(name: String, `type`: String) = this()
    
    /* CompleteClass */
    var isNodeVary: Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  trait NodeVary extends StObject {
    
    var isNodeVary: Boolean
    
    var name: String
    
    var `type`: String
  }
  object NodeVary {
    
    inline def apply(isNodeVary: Boolean, name: String, `type`: String): NodeVary = {
      val __obj = js.Dynamic.literal(isNodeVary = isNodeVary.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeVary]
    }
    
    extension [Self <: NodeVary](x: Self) {
      
      inline def setIsNodeVary(value: Boolean): Self = StObject.set(x, "isNodeVary", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
