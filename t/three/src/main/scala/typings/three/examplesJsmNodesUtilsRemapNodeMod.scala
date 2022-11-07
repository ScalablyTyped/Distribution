package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesUtilsRemapNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/RemapNode", JSImport.Default)
  @js.native
  open class default protected () extends RemapNode {
    def this(
      node: typings.three.examplesJsmNodesCoreNodeMod.default,
      inLowNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      inHighNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      outLowNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      outHighNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait RemapNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var doClamp: Boolean = js.native
    
    var inHighNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var inLowNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var node: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var outHighNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var outLowNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
