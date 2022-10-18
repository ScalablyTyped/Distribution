package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesUtilsRotateUVNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/RotateUVNode", JSImport.Default)
  @js.native
  open class default protected () extends RotateUVNode {
    def this(
      uvNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      rotationNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
    def this(
      uvNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      rotationNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      centerNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait RotateUVNode
    extends typings.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var centerNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var rotationNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var uvNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
