package typings.three

import typings.std.ArrayLike
import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancedBufferAttributeMod {
  
  object BufferGeometryUtils {
    
    @JSImport("three/src/core/InstancedBufferAttribute", "BufferGeometryUtils.computeTangents")
    @js.native
    def computeTangents(geometry: BufferGeometry): Null = js.native
    
    @JSImport("three/src/core/InstancedBufferAttribute", "BufferGeometryUtils.mergeBufferAttributes")
    @js.native
    def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = js.native
    
    @JSImport("three/src/core/InstancedBufferAttribute", "BufferGeometryUtils.mergeBufferGeometries")
    @js.native
    def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = js.native
  }
  
  object GeometryUtils {
    
    @JSImport("three/src/core/InstancedBufferAttribute", "GeometryUtils.center")
    @js.native
    def center(geometry: js.Any): js.Any = js.native
    
    @JSImport("three/src/core/InstancedBufferAttribute", "GeometryUtils.merge")
    @js.native
    def merge(geometry1: js.Any, geometry2: js.Any): js.Any = js.native
    @JSImport("three/src/core/InstancedBufferAttribute", "GeometryUtils.merge")
    @js.native
    def merge(geometry1: js.Any, geometry2: js.Any, materialIndexOffset: js.Any): js.Any = js.native
  }
  
  @JSImport("three/src/core/InstancedBufferAttribute", "InstancedBufferAttribute")
  @js.native
  class InstancedBufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(
      array: ArrayLike[Double],
      itemSize: Double,
      normalized: js.UndefOr[scala.Nothing],
      meshPerAttribute: Double
    ) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean, meshPerAttribute: Double) = this()
    
    /**
    	 * @default 1
    	 */
    var meshPerAttribute: Double = js.native
  }
}
