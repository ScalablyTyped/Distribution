package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesGpgpuComputeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/gpgpu/ComputeNode", JSImport.Default)
  @js.native
  open class default protected () extends ComputeNode {
    def this(computeNode: typings.three.examplesJsmNodesCoreNodeMod.default, count: Double) = this()
    def this(
      computeNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      count: Double,
      workgroupSize: js.Array[Double]
    ) = this()
  }
  
  @js.native
  trait ComputeNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var count: Double = js.native
    
    var dispatchCount: Double = js.native
    
    var isComputeNode: `true` = js.native
    
    var workgroupSize: js.Array[Double] = js.native
  }
}
