package typings.three.srcCoreBufferAttributeMod

import typings.std.ArrayBuffer
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/BufferAttribute", "Uint8ClampedBufferAttribute")
@js.native
class Uint8ClampedBufferAttribute protected () extends BufferAttribute {
  def this(array: ArrayBuffer, itemSize: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double) = this()
  def this(array: Iterable[Double], itemSize: Double) = this()
  def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
}

