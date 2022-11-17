package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmRenderersWebglNodesSlotNodeMod {
  
  @JSImport("three/examples/jsm/renderers/webgl/nodes/SlotNode", JSImport.Default)
  @js.native
  open class default[TNode /* <: typings.three.examplesJsmNodesCoreNodeMod.default */] protected () extends SlotNode[TNode] {
    def this(params: SlotNodeParameters[TNode]) = this()
  }
  
  @js.native
  trait SlotNode[TNode /* <: typings.three.examplesJsmNodesCoreNodeMod.default */]
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var inclusionType: "replace" = js.native
    
    var node: TNode | Null = js.native
    
    var source: Null = js.native
    
    var target: Null = js.native
  }
  
  trait SlotNodeParameters[TNode /* <: typings.three.examplesJsmNodesCoreNodeMod.default */] extends StObject {
    
    var node: js.UndefOr[TNode] = js.undefined
    
    var nodeType: js.UndefOr[String] = js.undefined
    
    var source: js.UndefOr[String | Null] = js.undefined
    
    var target: js.UndefOr[String | Null] = js.undefined
  }
  object SlotNodeParameters {
    
    inline def apply[TNode /* <: typings.three.examplesJsmNodesCoreNodeMod.default */](): SlotNodeParameters[TNode] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlotNodeParameters[TNode]]
    }
    
    extension [Self <: SlotNodeParameters[?], TNode /* <: typings.three.examplesJsmNodesCoreNodeMod.default */](x: Self & SlotNodeParameters[TNode]) {
      
      inline def setNode(value: TNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
