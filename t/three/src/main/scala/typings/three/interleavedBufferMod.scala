package typings.three

import typings.std.ArrayLike
import typings.three.interleavedBufferAttributeMod.InterleavedBufferAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InterleavedBuffer", JSImport.Namespace)
@js.native
object interleavedBufferMod extends js.Object {
  @js.native
  class InterleavedBuffer protected () extends js.Object {
    def this(array: ArrayLike[Double], stride: Double) = this()
    var array: ArrayLike[Double] = js.native
    var count: Double = js.native
    var dynamic: Boolean = js.native
    var length: Double = js.native
    var needsUpdate: Boolean = js.native
    var stride: Double = js.native
    var updateRange: AnonCount = js.native
    var version: Double = js.native
    def copy(source: InterleavedBuffer): this.type = js.native
    def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): InterleavedBuffer = js.native
    def set(value: ArrayLike[Double], index: Double): InterleavedBuffer = js.native
    def setDynamic(dynamic: Boolean): InterleavedBuffer = js.native
  }
  
}

