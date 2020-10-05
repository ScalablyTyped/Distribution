package typings.three

import typings.std.ArrayLike
import typings.three.interleavedBufferMod.InterleavedBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/core/InstancedInterleavedBuffer", JSImport.Namespace)
@js.native
object instancedInterleavedBufferMod extends js.Object {
  @js.native
  class InstancedInterleavedBuffer protected () extends InterleavedBuffer {
    def this(array: ArrayLike[Double], stride: Double) = this()
    def this(array: ArrayLike[Double], stride: Double, meshPerAttribute: Double) = this()
    var meshPerAttribute: Double = js.native
  }
  
}

