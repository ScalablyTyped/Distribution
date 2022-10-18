package typings.three

import typings.std.ArrayLike
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreInstancedBufferAttributeMod {
  
  object BufferGeometryUtils {
    
    @JSImport("three/src/core/InstancedBufferAttribute", "BufferGeometryUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def computeTangents(geometry: BufferGeometry): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTangents")(geometry.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    inline def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[BufferAttribute]
    
    inline def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry]
  }
  
  object GeometryUtils {
    
    @JSImport("three/src/core/InstancedBufferAttribute", "GeometryUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @deprecated Use {@link Geometry#center geometry.center()} instead.
      */
    inline def center(geometry: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(geometry.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * @deprecated Use {@link Geometry#merge geometry.merge( geometry2, matrix, materialIndexOffset )} instead.
      */
    inline def merge(geometry1: Any, geometry2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometry1.asInstanceOf[js.Any], geometry2.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def merge(geometry1: Any, geometry2: Any, materialIndexOffset: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometry1.asInstanceOf[js.Any], geometry2.asInstanceOf[js.Any], materialIndexOffset.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("three/src/core/InstancedBufferAttribute", "InstancedBufferAttribute")
  @js.native
  open class InstancedBufferAttribute protected () extends BufferAttribute {
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
