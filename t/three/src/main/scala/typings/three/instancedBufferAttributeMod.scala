package typings.three

import typings.std.ArrayLike
import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instancedBufferAttributeMod {
  
  object BufferGeometryUtils {
    
    @JSImport("three/src/core/InstancedBufferAttribute", "BufferGeometryUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def computeTangents(geometry: BufferGeometry): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTangents")(geometry.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @scala.inline
    def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[BufferAttribute]
    
    @scala.inline
    def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry]
  }
  
  object GeometryUtils {
    
    @JSImport("three/src/core/InstancedBufferAttribute", "GeometryUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def center(geometry: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(geometry.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def merge(geometry1: js.Any, geometry2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometry1.asInstanceOf[js.Any], geometry2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def merge(geometry1: js.Any, geometry2: js.Any, materialIndexOffset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometry1.asInstanceOf[js.Any], geometry2.asInstanceOf[js.Any], materialIndexOffset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("three/src/core/InstancedBufferAttribute", "InstancedBufferAttribute")
  @js.native
  class InstancedBufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean, meshPerAttribute: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Unit, meshPerAttribute: Double) = this()
    
    /**
    	 * @default 1
    	 */
    var meshPerAttribute: Double = js.native
  }
}
