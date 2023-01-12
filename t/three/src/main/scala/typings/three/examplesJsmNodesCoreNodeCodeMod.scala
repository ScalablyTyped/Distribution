package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeCodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeCode", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeCode {
    def this(name: String, `type`: String) = this()
    def this(name: String, `type`: String, code: String) = this()
    
    /* CompleteClass */
    var isNodeCode: `true` = js.native
  }
  
  trait NodeCode extends StObject {
    
    var isNodeCode: `true`
  }
  object NodeCode {
    
    inline def apply(): NodeCode = {
      val __obj = js.Dynamic.literal(isNodeCode = true)
      __obj.asInstanceOf[NodeCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeCode] (val x: Self) extends AnyVal {
      
      inline def setIsNodeCode(value: `true`): Self = StObject.set(x, "isNodeCode", value.asInstanceOf[js.Any])
    }
  }
}
