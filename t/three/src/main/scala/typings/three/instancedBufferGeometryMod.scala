package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancedBufferGeometryMod {
  
  @JSImport("three/src/core/InstancedBufferGeometry", "InstancedBufferGeometry")
  @js.native
  open class InstancedBufferGeometry () extends BufferGeometry {
    
    /**
      * @default Infinity
      */
    var instanceCount: Double = js.native
    
    var isInstancedBufferGeometry: Boolean = js.native
  }
}
