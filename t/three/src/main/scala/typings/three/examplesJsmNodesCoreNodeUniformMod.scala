package typings.three

import typings.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeUniformMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeUniform", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeUniform {
    def this(name: String, `type`: String, node: typings.three.examplesJsmNodesCoreInputNodeMod.default) = this()
    def this(
      name: String,
      `type`: String,
      node: typings.three.examplesJsmNodesCoreInputNodeMod.default,
      needsUpdate: Boolean
    ) = this()
    
    /* CompleteClass */
    var isNodeUniform: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var needsUpdate: Boolean = js.native
    
    /* CompleteClass */
    var node: typings.three.examplesJsmNodesCoreInputNodeMod.default = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var value: NodeValueOption = js.native
  }
  
  trait NodeUniform extends StObject {
    
    var isNodeUniform: `true`
    
    var name: String
    
    var needsUpdate: Boolean
    
    var node: typings.three.examplesJsmNodesCoreInputNodeMod.default
    
    var `type`: String
    
    var value: NodeValueOption
  }
  object NodeUniform {
    
    inline def apply(
      name: String,
      needsUpdate: Boolean,
      node: typings.three.examplesJsmNodesCoreInputNodeMod.default,
      `type`: String,
      value: NodeValueOption
    ): NodeUniform = {
      val __obj = js.Dynamic.literal(isNodeUniform = true, name = name.asInstanceOf[js.Any], needsUpdate = needsUpdate.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeUniform]
    }
    
    extension [Self <: NodeUniform](x: Self) {
      
      inline def setIsNodeUniform(value: `true`): Self = StObject.set(x, "isNodeUniform", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
      
      inline def setNode(value: typings.three.examplesJsmNodesCoreInputNodeMod.default): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: NodeValueOption): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
