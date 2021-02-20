package typings.three

import typings.three.anon.Instances
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancedBufferGeometryMod {
  
  @JSImport("three/src/core/InstancedBufferGeometry", "InstancedBufferGeometry")
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
