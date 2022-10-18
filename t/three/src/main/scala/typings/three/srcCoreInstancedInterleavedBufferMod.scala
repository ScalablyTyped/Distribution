package typings.three

import typings.std.ArrayLike
import typings.three.srcCoreInterleavedBufferMod.InterleavedBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreInstancedInterleavedBufferMod {
  
  @JSImport("three/src/core/InstancedInterleavedBuffer", "InstancedInterleavedBuffer")
  @js.native
  open class InstancedInterleavedBuffer protected () extends InterleavedBuffer {
    def this(array: ArrayLike[Double], stride: Double) = this()
    def this(array: ArrayLike[Double], stride: Double, meshPerAttribute: Double) = this()
    
    /**
      * @default 1
      */
    var meshPerAttribute: Double = js.native
  }
}
