package typings.three

import typings.std.ArrayLike
import typings.three.anon.Buffer
import typings.three.anon.Count
import typings.three.constantsMod.Usage
import typings.three.interleavedBufferAttributeMod.InterleavedBufferAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/InterleavedBuffer", JSImport.Namespace)
@js.native
object interleavedBufferMod extends js.Object {
  @js.native
  class InterleavedBuffer protected () extends js.Object {
    def this(array: ArrayLike[Double], stride: Double) = this()
    var array: ArrayLike[Double] = js.native
    var count: Double = js.native
    var length: Double = js.native
    var needsUpdate: Boolean = js.native
    var stride: Double = js.native
    var updateRange: Count = js.native
    var usage: Usage = js.native
    var uuid: String = js.native
    var version: Double = js.native
    def clone(data: js.Object): this.type = js.native
    def copy(source: InterleavedBuffer): this.type = js.native
    def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): InterleavedBuffer = js.native
    def set(value: ArrayLike[Double], index: Double): InterleavedBuffer = js.native
    def setUsage(usage: Usage): InterleavedBuffer = js.native
    def toJSON(data: js.Object): Buffer = js.native
  }
  
}

