package typings.three

import typings.three.nodesMod.Node
import typings.three.nodesMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightingContextNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/LightingContextNode", JSImport.Default)
  @js.native
  open class default protected () extends LightingContextNode {
    def this(node: typings.three.nodeMod.default) = this()
    def this(node: typings.three.nodeMod.default, lightingModelNode: LightingModelNode) = this()
  }
  
  @js.native
  trait LightingContextNode
    extends typings.three.contextNodeMod.default {
    
    var lightingModelNode: LightingModelNode | Null = js.native
  }
  
  trait LightingModelNode extends StObject {
    
    var ambientOcclusion: js.UndefOr[ShaderNode[js.Object, Node]] = js.undefined
    
    var indirectDiffuse: js.UndefOr[ShaderNode[js.Object, Node]] = js.undefined
    
    var indirectSpecular: js.UndefOr[ShaderNode[js.Object, Node]] = js.undefined
  }
  object LightingModelNode {
    
    inline def apply(): LightingModelNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LightingModelNode]
    }
    
    extension [Self <: LightingModelNode](x: Self) {
      
      inline def setAmbientOcclusion(value: ShaderNode[js.Object, Node]): Self = StObject.set(x, "ambientOcclusion", value.asInstanceOf[js.Any])
      
      inline def setAmbientOcclusionUndefined: Self = StObject.set(x, "ambientOcclusion", js.undefined)
      
      inline def setIndirectDiffuse(value: ShaderNode[js.Object, Node]): Self = StObject.set(x, "indirectDiffuse", value.asInstanceOf[js.Any])
      
      inline def setIndirectDiffuseUndefined: Self = StObject.set(x, "indirectDiffuse", js.undefined)
      
      inline def setIndirectSpecular(value: ShaderNode[js.Object, Node]): Self = StObject.set(x, "indirectSpecular", value.asInstanceOf[js.Any])
      
      inline def setIndirectSpecularUndefined: Self = StObject.set(x, "indirectSpecular", js.undefined)
    }
  }
}
