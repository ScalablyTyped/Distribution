package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeAttributeMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeAttribute", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeAttribute {
    def this(name: String, `type`: String) = this()
    
    /* CompleteClass */
    var isNodeAttribute: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  trait NodeAttribute extends StObject {
    
    var isNodeAttribute: `true`
    
    var name: String
    
    var `type`: String
  }
  object NodeAttribute {
    
    inline def apply(name: String, `type`: String): NodeAttribute = {
      val __obj = js.Dynamic.literal(isNodeAttribute = true, name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeAttribute] (val x: Self) extends AnyVal {
      
      inline def setIsNodeAttribute(value: `true`): Self = StObject.set(x, "isNodeAttribute", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
