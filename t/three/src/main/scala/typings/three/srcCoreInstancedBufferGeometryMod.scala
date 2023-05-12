package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreInstancedBufferGeometryMod {
  
  @JSImport("three/src/core/InstancedBufferGeometry", "InstancedBufferGeometry")
  @js.native
  /**
    * Create a new instance of {@link InstancedBufferGeometry}
    */
  open class InstancedBufferGeometry () extends BufferGeometry[NormalBufferAttributes] {
    
    /**
      * Copies the given {@link InstancedBufferGeometry} to this instance.
      * @param source
      * @override
      */
    def copy(source: InstancedBufferGeometry): this.type = js.native
    
    /**
      *
      * @defaultValue `Infinity`
      */
    var instanceCount: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link InstancedBufferGeometry}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isInstancedBufferGeometry: `true` = js.native
    
    /**
      * @defaultValue `InstancedBufferGeometry`
      */
    @JSName("type")
    var type_InstancedBufferGeometry: String = js.native
  }
}
