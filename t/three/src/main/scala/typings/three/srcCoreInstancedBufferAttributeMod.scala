package typings.three

import typings.std.ArrayLike
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreInstancedBufferAttributeMod {
  
  @JSImport("three/src/core/InstancedBufferAttribute", "InstancedBufferAttribute")
  @js.native
  open class InstancedBufferAttribute protected () extends BufferAttribute {
    /**
      * Create a new instance of {@link THREE.InstancedBufferAttribute | InstancedBufferAttribute}
      * @param array
      * @param itemSize
      * @param normalized
      * @param meshPerAttribute
      */
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean, meshPerAttribute: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Unit, meshPerAttribute: Double) = this()
    
    /**
      * Defines how often a value of this buffer attribute should be repeated.
      * A value of one means that each value of the instanced attribute is used for a single instance.
      * A value of two means that each value is used for two consecutive instances (and so on).
      * @defaultValue `1`
      */
    var meshPerAttribute: Double = js.native
  }
}
