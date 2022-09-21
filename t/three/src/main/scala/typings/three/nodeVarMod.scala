package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeVarMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeVar", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeVar {
    def this(name: String, `type`: String) = this()
    
    /* CompleteClass */
    var isNodeVar: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  trait NodeVar extends StObject {
    
    var isNodeVar: `true`
    
    var name: String
    
    var `type`: String
  }
  object NodeVar {
    
    inline def apply(name: String, `type`: String): NodeVar = {
      val __obj = js.Dynamic.literal(isNodeVar = true, name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeVar]
    }
    
    extension [Self <: NodeVar](x: Self) {
      
      inline def setIsNodeVar(value: `true`): Self = StObject.set(x, "isNodeVar", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
