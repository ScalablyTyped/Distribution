package typings.three.srcCoreInstancedBufferAttributeMod

import typings.std.ArrayLike
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InstancedBufferAttribute", "InstancedBufferAttribute")
@js.native
class InstancedBufferAttribute protected () extends BufferAttribute {
  def this(array: ArrayLike[Double], itemSize: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean, meshPerAttribute: Double) = this()
  var meshPerAttribute: Double = js.native
}

