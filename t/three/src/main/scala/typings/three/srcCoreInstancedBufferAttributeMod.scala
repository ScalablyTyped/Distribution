package typings.three

import typings.std.ArrayLike
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InstancedBufferAttribute", JSImport.Namespace)
@js.native
object srcCoreInstancedBufferAttributeMod extends js.Object {
  @js.native
  class InstancedBufferAttribute protected () extends BufferAttribute {
    def this(array: ArrayLike[Double], itemSize: Double) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
    def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean, meshPerAttribute: Double) = this()
    var meshPerAttribute: Double = js.native
  }
  
  @js.native
  object BufferGeometryUtils extends js.Object {
    def computeTangents(geometry: BufferGeometry): Null = js.native
    def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = js.native
    def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = js.native
  }
  
  @js.native
  object GeometryUtils extends js.Object {
    def center(geometry: js.Any): js.Any = js.native
    def merge(geometry1: js.Any, geometry2: js.Any): js.Any = js.native
    def merge(geometry1: js.Any, geometry2: js.Any, materialIndexOffset: js.Any): js.Any = js.native
  }
  
}

