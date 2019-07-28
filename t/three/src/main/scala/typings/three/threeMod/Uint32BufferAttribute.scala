package typings.three.threeMod

import typings.std.ArrayBuffer
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Uint32BufferAttribute")
@js.native
class Uint32BufferAttribute protected ()
  extends typings.three.srcCoreBufferAttributeMod.Uint32BufferAttribute {
  def this(array: ArrayBuffer, itemSize: Double) = this()
  def this(array: ArrayLike[Double], itemSize: Double) = this()
  def this(array: Iterable[Double], itemSize: Double) = this()
  def this(array: ArrayBuffer, itemSize: Double, normalized: Boolean) = this()
  def this(array: ArrayLike[Double], itemSize: Double, normalized: Boolean) = this()
  def this(array: Iterable[Double], itemSize: Double, normalized: Boolean) = this()
}

