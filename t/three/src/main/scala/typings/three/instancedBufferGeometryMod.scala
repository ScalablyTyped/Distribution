package typings.three

import typings.three.anon.Instances
import typings.three.bufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/InstancedBufferGeometry", JSImport.Namespace)
@js.native
object instancedBufferGeometryMod extends js.Object {
  
  @js.native
  class InstancedBufferGeometry () extends BufferGeometry {
    
    @JSName("groups")
    var groups_InstancedBufferGeometry: js.Array[Instances] = js.native
    
    /**
    	 * @default Infinity
    	 */
    var instanceCount: Double = js.native
  }
}
